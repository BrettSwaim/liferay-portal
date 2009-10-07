/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal;

/**
 * <a href="LayoutFriendlyURLException.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class LayoutFriendlyURLException extends PortalException {

	public static final int ADJACENT_SLASHES = 4;

	public static final int DOES_NOT_START_WITH_SLASH = 1;

	public static final int DUPLICATE = 6;

	public static final int ENDS_WITH_SLASH = 2;

	public static final int INVALID_CHARACTERS = 5;

	public static final int KEYWORD_CONFLICT = 7;

	public static final int POSSIBLE_DUPLICATE = 8;

	public static final int TOO_DEEP = 9;

	public static final int TOO_SHORT = 3;

	public LayoutFriendlyURLException(int type) {
		_type = type;
	}

	public String getKeywordConflict() {
		return _keywordConflict;
	}

	public int getType() {
		return _type;
	}

	public void setKeywordConflict(String keywordConflict) {
		_keywordConflict = keywordConflict;
	}

	private String _keywordConflict;
	private int _type;

}