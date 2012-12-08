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

package org.lastrix.asn1s;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1InputStream extends InputStream {
	private int bytesRead = 0;
	private final InputStream is;

	public ASN1InputStream(final InputStream is) {
		this.is = is;
	}

	@Override
	public int read() throws IOException {
		final int _byte = is.read();
		if (_byte != -1) {
			bytesRead++;
		}
		return _byte;
	}

	@Override
	public int read(final byte[] buf, final int offset, final int length) throws IOException {
		final int bytesRead = is.read(buf, offset, length);
		this.bytesRead += bytesRead;
		return bytesRead;
	}

	public int getBytesRead() {
		return bytesRead;
	}

	@Override
	public long skip(final long n) throws IOException {
		final long bytesRead = is.skip(n);
		this.bytesRead += (int) bytesRead;
		return bytesRead;
	}

	@Override
	public int read(final byte[] buf) throws IOException {
		final int bytesRead = is.read(buf);
		this.bytesRead += bytesRead;
		return bytesRead;
	}

	@Override
	public void reset() throws IOException {
		is.reset();
		bytesRead = 0;
	}

	@Override
	public int available() throws IOException {
		return is.available();
	}

	@Override
	public void close() throws IOException {
		is.close();
	}

	@Override
	public void mark(final int readlimit) {
		is.mark(readlimit);
	}

	@Override
	public boolean markSupported() {
		return is.markSupported();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new UnsupportedOperationException("Cloning not allowed.");
	}

	@Override
	public String toString() {
		return String.format("%s [%d bytes read from %s ]", getClass().getSimpleName(), getBytesRead(), is);
	}

	@Override
	public boolean equals(final Object obj) {
		return obj == this;
	}
}
