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
package io.codekontor.opencypher.xtext.tests

import org.junit.Test

class PatternComprehension_Test extends AbstractCypherTest {

	@Test
	def void patternComprehensionTest() {
		test('''
			MATCH (a:Person { name: 'Charlie Sheen' })
			RETURN [(a)-->(b) WHERE b:Movie | b.year] AS years
		''');
	}

}
