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

class Delete_Test extends AbstractCypherTest{

	@Test
	def void delete() {
		test('''
			MATCH (n)-[]->(r)
			DELETE n, r
		''');
	}

	@Test
	def void detachDelete() {
		test('''
			MATCH (n)-[]->(r)
			DETACH DELETE n, r
		''');
	}

	@Test
	def void matchDetachDelete() {
		test('''
			MATCH (n) DETACH DELETE n
		''');
	}
}
