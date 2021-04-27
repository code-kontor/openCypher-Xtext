/*
 * openCypher Xtext - Slizaa Static Software Analysis Tools
 * Copyright © ${year} Code-Kontor GmbH and others (slizaa@codekontor.io)
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Code-Kontor GmbH - initial API and implementation
 */
package io.codekontor.opencypher.xtext.conversion

import com.google.common.base.Joiner
import com.google.inject.Inject
import java.util.Set
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractValueConverter
import org.eclipse.xtext.nodemodel.INode

class SYMBOLIC_NAME_XValueConverter extends AbstractValueConverter<String> {

	@Inject
	OpenCypherIDEscapeHelper helper

	override toString(String value) throws ValueConverterException {
		val invalidChars = helper.collectInvalidCharacters(value)
		if (invalidChars === null) {
			helper.toEscapedString(value)
		} else {
			throw new ValueConverterException(getInvalidCharactersMessage(value, invalidChars), null, null)
		}
	}

	// Copied from org.eclipse.xtext.conversion.impl.AbstractIDValueConverter#getInvalidCharactersMessage
	protected def getInvalidCharactersMessage(String value, Set<Character> invalidChars) {
		val chars = Joiner.on(", ").join(invalidChars.map[from|"'" + from + "' (0x" + Integer.toHexString(from) + ")"])
		"ID '" + value + "' contains invalid characters: " + chars
	}

	override toValue(String string, INode node) throws ValueConverterException {
		helper.toValue(string)
	}

}
