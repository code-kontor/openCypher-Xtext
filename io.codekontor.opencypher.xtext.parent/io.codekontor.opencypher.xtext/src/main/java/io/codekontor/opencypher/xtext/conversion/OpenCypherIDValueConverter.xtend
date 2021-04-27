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

import com.google.inject.Inject
import org.eclipse.xtext.conversion.impl.IgnoreCaseIDValueConverter
import org.eclipse.xtext.nodemodel.INode

class OpenCypherIDValueConverter extends IgnoreCaseIDValueConverter {

	@Inject
	OpenCypherIDEscapeHelper helper

	override toValue(String string, INode node) {
		helper.toValue(string)
	}

	override protected assertValidValue(String value) {
		// In Neo4j Cypher (as of 3.3.1) `` (empty string) is a valid ID.
		// Omit call to super.assertValidValue, which would throw a ValueConverterException on empty values.
	}

	override protected mustEscape(String value) {
		helper.mustEscape(value)
	}

	override protected toEscapedString(String value) {
		helper.toEscapedString(value)
	}

	override protected collectInvalidCharacters(String value) {
		helper.collectInvalidCharacters(value)
	}

}
