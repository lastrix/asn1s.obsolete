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

package org.lastrix.asn1s.schema.type;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.schema.ASN1Module;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author lastrix
 * @version 1.0
 */
class InstallPropertyChangeListener implements PropertyChangeListener {
	private final static Logger logger = Logger.getLogger(InstallPropertyChangeListener.class);
	private final ASN1UnresolvedType watchType;
	private final ASN1Module         module;
	private       ASN1Type           asn1Type;

	public InstallPropertyChangeListener(
	                                    final ASN1Type asn1Type,
	                                    final ASN1UnresolvedType watchType,
	                                    final ASN1Module module
	                                    ) {
		this.asn1Type = asn1Type;
		this.watchType = watchType;
		this.module = module;
		module.addPropertyChangeListener(
		                                ASN1Module.TYPE_INSTALLED, this
		                                );
	}

	@Override
	public void propertyChange(final PropertyChangeEvent evt) {
		if (evt.getNewValue() instanceof ASN1Type) {
			final ASN1Type newType = (ASN1Type) evt.getNewValue();
			if (asn1Type instanceof ASN1ConstrainedType) {
				logger.warn("New type " + newType);
			}
			if (newType.getName().equals(watchType.getName()) &&
			    (watchType.getModuleName() == null
			     || newType.getModule().getName().equals(watchType.getModuleName()))) {
				module.removePropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
				asn1Type.typeResolved(watchType, newType);
			}
		}
	}
}
