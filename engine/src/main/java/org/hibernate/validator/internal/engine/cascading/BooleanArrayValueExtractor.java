/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.internal.engine.cascading;

import javax.validation.valueextraction.ExtractedValue;
import javax.validation.valueextraction.ValueExtractor;

class BooleanArrayValueExtractor implements ValueExtractor<boolean @ExtractedValue[]> {

	static final BooleanArrayValueExtractor INSTANCE = new BooleanArrayValueExtractor();

	private BooleanArrayValueExtractor() {
	}

	@Override
	public void extractValues(boolean[] originalValue, ValueReceiver receiver) {
		for ( int i = 0; i < originalValue.length; i++ ) {
			receiver.indexedValue( "<iterable element>", i, originalValue[i] );
		}
	}
}
