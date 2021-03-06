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
import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage

class CypherOptions_Test extends AbstractCypherTest {

	@Test
	def void wrongVersionNumber_Hex() {
		testAssertError('''
			CYPHER 0x765234
			MATCH p =(p1)-[*]->(p2)
		''', OpenCypherPackage.eINSTANCE.getVersionNumber(), 'invalidVersionNumber', 7, 8,
			'Version number must have the following format: (digit)+\'.\'(digit)+');
	}

	@Test
	def void wrongVersionNumber_OCT() {
		testAssertError('''
			CYPHER 045678
			MATCH p =(p1)-[*]->(p2)
		''', OpenCypherPackage.eINSTANCE.getVersionNumber(), 'invalidVersionNumber', 7, 6,
			'Version number must have the following format: (digit)+\'.\'(digit)+');
	}

	@Test
	def void wrongVersionNumber_DEC() {
		testAssertError('''
			CYPHER 10546
			MATCH p =(p1)-[*]->(p2)
		''', OpenCypherPackage.eINSTANCE.getVersionNumber(), 'invalidVersionNumber', 7, 5,
			'Version number must have the following format: (digit)+\'.\'(digit)+');
	}

	@Test
	def void wrongVersionNumber_Exponent() {
		testAssertError('''
			CYPHER 3.28e2
			MATCH p =(p1)-[*]->(p2)
		''', OpenCypherPackage.eINSTANCE.getVersionNumber(), 'invalidVersionNumber', 7, 6,
			'Version number must have the following format: (digit)+\'.\'(digit)+');
	}

	@Test
	def void rightVersionNumber() {
		test('''
			CYPHER 1.5
			MATCH p =(p1)-[*]->(p2) RETURN p
		''');
	}

	@Test
	def void configurationOptions_1() {
		test('''
			CYPHER 1.5 hola=hallo
			MATCH p =(p1)-[*]->(p2) RETURN p
		''');
	}

	@Test
	def void configurationOptions_2() {
		test('''
			CYPHER 1.5 neo4j=rules hola=hallo
			MATCH p =(p1)-[*]->(p2) RETURN p
		''');
	}

	@Test
	def void simple_1() {
		test('''
			CYPHER 1.0
			EXPLAIN PROFILE MATCH (n) RETURN n
		''');
	}

	@Test
	def void simple_2() {
		test('''
			PROFILE MATCH (n) RETURN n
		''');
	}

	@Test
	def void simple_3() {
		test('''
			EXPLAIN CYPHER test=hurz test=spest MATCH (n) RETURN n
		''');
	}

	@Test
	def void simple_4() {
		test('''
			EXPLAIN CYPHER test=hurz MATCH (n) RETURN n
		''');
	}

	@Test
	def void simple_5() {
		test('''
			EXPLAIN CYPHER 23.24 test=hurz MATCH (n) RETURN n
		''');
	}

	@Test
	def void simple_6() {
		test('''
			EXPLAIN CYPHER 23.24 test=hurz CYPHER 23.25 test=hurz MATCH (n) RETURN n
		''');
	}

	@Test
	def void simple_7() {
		test('''
			MATCH (matchedNode:Type:FILE)-[a?:DEPENDS_ON|:LOVES]-(other:FILE) where matchedNode='HONZIPONZIE' RETURN matchedNode
		''');
	}
}
