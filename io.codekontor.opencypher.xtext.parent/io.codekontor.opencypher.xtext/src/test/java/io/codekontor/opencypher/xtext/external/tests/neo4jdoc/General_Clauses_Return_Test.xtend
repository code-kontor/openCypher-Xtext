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
package io.codekontor.opencypher.xtext.external.tests.neo4jdoc

import org.junit.Ignore
import org.junit.Test
import io.codekontor.opencypher.xtext.tests.AbstractCypherTest

class General_Clauses_Return_Test extends AbstractCypherTest {

	@Test
	def void example_ReturnNodes() {
		test('''
			MATCH (n { name: 'B' })
			RETURN n
		''');
	}

	@Test
	def void example_ReturnRelationships() {
		test('''
			MATCH (n { name: 'A' })-[r:KNOWS]->(c)
			RETURN r
		''');
	}

	@Test
	def void example_ReturnProperty() {
		test('''
			MATCH (n { name: 'A' })
			RETURN n.name
		''');
	}

	@Test
	def void example_ReturnAllElements() {
		test('''
			MATCH p=(a { name: 'A' })-[r]->(b)
			RETURN *
		''');
	}

	@Test
	@Ignore
	def void example_IdentifierWithUncommonCharacters() {
		test('''
			MATCH (`This isn't a common identifier`)
			WHERE `This isn't a common identifier`.name='A'
			RETURN `This isn't a common identifier`.happy	
		''');
	}

	@Test
	def void example_ColumnAlias() {
		test('''
			MATCH (a { name: 'A' })
			RETURN a.age AS SomethingTotallyDifferent	
		''');
	}

	@Test
	def void example_OptionalProperties() {
		test('''
			MATCH (n)
			RETURN n.age
		''');
	}

	@Test
	def void example_OtherExpressions() {
		test('''
			MATCH (a { name: 'A' })
			RETURN a.age > 30, 'I\'m a literal',(a)-->()
		''');
	}

	@Test
	def void example_UniqueResults() {
		test('''
			MATCH (a { name: 'A' })-->(b)
			RETURN DISTINCT b
		''');
	}
}
