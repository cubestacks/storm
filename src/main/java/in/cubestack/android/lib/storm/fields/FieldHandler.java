package in.cubestack.android.lib.storm.fields;

import android.database.Cursor;


/**
 * A core Android SQLite ORM framrwork build for speed and raw execution.
 * Copyright (c) 2014  CubeStack. Version built for Flash Back..
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class FieldHandler {

	protected static final String SPACE = " ";
	protected static final String IS_NULL = " IS NULL";
	public static final String QUESTION_MARK = " ? " ;

	public Object getValue(Cursor cursor, int columnIndex){
		return cursor.getString(columnIndex);
	}

	public String buildSqlString(String columnName, String symbol, Object value) {
		StringBuilder sql = new StringBuilder();
		if(value == null) {
			sql.append(columnName).append(IS_NULL);
		} else {
			sql.append(columnName).append(SPACE).append(symbol).append(SPACE).append(QUESTION_MARK);
		}
		
		return sql.toString();
	}
}
