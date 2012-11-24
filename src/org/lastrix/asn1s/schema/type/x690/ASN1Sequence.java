/******************************************************************************
 * Copyright (C) 2010-2012 Lastrix                                            *
 * This file is part of ASN1S.                                                *
 *                                                                            *
 * ASN1S is free software: you can redistribute it and/or modify              *
 * it under the terms of the GNU General Public License as published by       *
 * the Free Software Foundation, either version 2 of the License, or          *
 * (at your option) any later version.                                        *
 *                                                                            *
 * ASN1S is distributed in the hope that it will be useful,                   *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the               *
 * GNU General Public License for more details.                               *
 *                                                                            *
 * You should have received a copy of the GNU General Public License          *
 * along with ASN1S. If not, see <http://www.gnu.org/licenses/>.              *
 ******************************************************************************/

package org.lastrix.asn1s.schema.type.x690;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1OptionalComponentSkippedException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.ASN1UnresolvedType;
import org.lastrix.asn1s.schema.type.ASN1UserType;
import org.lastrix.asn1s.util.Utils;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to handle sequences and sequences of values.
 * This class uses definite length form (buffers elements before writing them into output stream)
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Sequence extends ASN1Type implements ASN1X690Type {
	private final Logger logger = Logger.getLogger(ASN1Sequence.class);

	private final ASN1Type[] componentType;
	private final boolean    sequenceOf;
	public final static ASN1Tag TAG = new ASN1Tag(16, TagClass.UNIVERSAL, true);

	public ASN1Sequence(final ASN1Type[] componentType, final boolean sequenceOf) {
		this.componentType = componentType;
		this.sequenceOf = sequenceOf;
		this.name = "SEQUENCE@" + hashCode();
		this.tag = TAG;
		this.typeId = getName();
		valid();
	}

	@Override
	public String toString() {
		if (sequenceOf) {
			return "SEQUENCE OF " + componentType[0];
		}
		return "SEQUENCE OF " + Arrays.toString(componentType);
	}

	@Override
	public void write(final Object value, final OutputStream os, boolean header) throws IOException, ASN1Exception {

		if (header) {
			//write header
			os.write(TAG.asBytes());
		}

		ByteArrayOutputStream bos = new ByteArrayOutputStream(128);
		if (sequenceOf) {
			// SEQUENCE OF
			final List list = (List) value;
			for (Object lo : list) {
				componentType[0].write(lo, bos, true);
			}
		} else {
			// SEQUENCE
			for (ASN1Type t : componentType) {
				t.write(value, bos, true);
			}
		}
		final byte[] data = bos.toByteArray();

		//store size
		if (header) {
			os.write(ASN1Length.asBytes(data.length));
		}

		//and now we can save our data.
		os.write(data);
	}

	@Override
	public Object read(Object value, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (value == null) {
			value = new ArrayList();
		}
		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(is);
		if (sequenceOf) {
			final List list;
			if (value instanceof List) {
				list = (List) value;
			} else {
				throw new IllegalArgumentException("ASN1SequenceOf does not allow any objects if it not implement java.util.List.");
			}

			//read all data
			if (length == ASN1Length.FORM_INDEFINITE) {
				throw new ASN1ProtocolException("SequenceOf doesn't support indefinite form");
			}
			final ByteArrayOutputStream bos = new ByteArrayOutputStream(length);
			Utils.transfer(is, bos, length);
			final byte[] data = bos.toByteArray();
			final ByteArrayInputStream bis = new ByteArrayInputStream(data);
			while (bis.available() > 0) {
				list.add(componentType[0].read(bis));
			}
			return list;
		} else {
			if (value == null) {
				throw new NullPointerException();
			}
			//read first header, so we won't sent null
			ASN1Tag itemTag = null;
			for (ASN1Type t : componentType) {
				// read header, if it is null for any reason
				if (itemTag == null) {
					itemTag = ASN1Tag.readTag(is);
				}
				//now try to load field value into our o.
				try {
					t.read(value, is, itemTag, true);
				} catch (ASN1OptionalComponentSkippedException e) {
					//type reader told that we can not read such component but it is optional, so simply skip it
					continue;
				}
				//set it to null, so next iteration would reread it.
				itemTag = null;
			}

			//check for indefinite form.
			if (length == ASN1Length.FORM_INDEFINITE) {
				final byte[] eocTest = new byte[]{0x7F, 0x7F};
				is.read(eocTest);

				if (eocTest[0] != eocTest[1] || eocTest[0] != 0x00) {
					throw new ASN1ProtocolException("Indefinite encoding without EOC marker at end");
				}
			}
			return value;
		}
	}

	@Override
	public void onInstall(final ASN1Module module, final boolean register) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException(getTypeId());
		}

		setModule(module);

		registerComponentTypeListenters(module, register);

		for (int i = 0; i < componentType.length; i++) {
			final ASN1Type type = componentType[i];
			if (type instanceof ASN1UnresolvedType) {
				final ASN1Type t = module.resolveType((ASN1UnresolvedType) type);
				if (t == null) {
					final int index = i;
					module.addPropertyChangeListener(
					                                ASN1Module.TYPE_INSTALLED, new PropertyChangeListener() {
						@Override
						public void propertyChange(final PropertyChangeEvent evt) {
							if (evt.getNewValue() instanceof ASN1Type) {
								final ASN1Type _type = (ASN1Type) evt.getNewValue();
								if (_type.getName().equals(type.getName()) &&
								    (((ASN1UnresolvedType) type).getModuleName() == null
								     || _type.getModule().getModuleId().equals(((ASN1UnresolvedType) type).getModuleName()))) {
									module.removePropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
									componentType[index] = _type;
									try {
										doInstall(module, componentType[index]);
									} catch (ASN1Exception e) {
										logger.error("Exception:", e);
									}
								}
							}
						}
					}
					                                );
				} else {
					componentType[i] = t;
					doInstall(module, componentType[i]);
				}
			} else {
				//now we should add self to index base
				doInstall(module, componentType[i]);
			}
		}
	}

	private void registerComponentTypeListenters(final ASN1Module module, final boolean register) {
		final PropertyChangeListener pcl = new PropertyChangeListener() {
			@Override
			public void propertyChange(final PropertyChangeEvent evt) {
				if (Boolean.TRUE.equals(evt.getNewValue())) {
					for (ASN1Type type : componentType) {
						if (!type.isValid()) {
							return;
						}
					}
					for (ASN1Type type : componentType) {
						type.removePropertyChangeListener(VALID, this);
					}

					if (register) {
						module.install(ASN1Sequence.this);
					}
					valid();
				}
			}
		};

		for (ASN1Type t : componentType) {
			t.addPropertyChangeListener(VALID, pcl);
		}
	}

	private void doInstall(final ASN1Module module, final ASN1Type type) throws ASN1Exception {
		if (!(type instanceof ASN1UserType) && (type.getModule() == null)) {
			type.onInstall(module, false);
		}
	}

	@Override
	public String getTypeString(final String prefix) {
		final StringBuilder sb = new StringBuilder();
		if (sequenceOf) {
			sb.append("Sequence of ");
			sb.append(componentType[0].getTypeId());
		} else {
			sb.append("Sequence:\n");
			for (ASN1Type t : componentType) {
				sb.append(t.getTypeString(prefix + "\t"));
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	@Override
	public void toASN1(final StringBuilder sb) {
		sb.append("SEQUENCE ");
		if (sequenceOf) {
			sb.append("OF ");
			sb.append(componentType[0].getTypeId());
			sb.append(";");
		} else {
			sb.append("{\n");
			for (int i = 0; i < componentType.length; i++) {
				sb.append("      ");
				componentType[i].toASN1(sb);
				if (i + 1 < componentType.length) {
					sb.append(",");
				}
				sb.append("\n");
			}
			sb.append("}");
		}
	}
}
