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

class Constraint_Test extends AbstractCypherTest {

	@Test
	def void createUniquenessConstraint() {
		test('''
			CREATE CONSTRAINT ON (book:Book) ASSERT book.isbn IS UNIQUE
		''');
	}

	@Test
	def void dropUniquenessConstraint() {
		test('''
			DROP CONSTRAINT ON (book:Book) ASSERT book.isbn IS UNIQUE
		''');
	}

	@Test
	def void createIndex() {
		test('''
			CREATE INDEX ON :Person(name)
		''');
	}

	@Test
	def void dropIndex() {
		test('''
			DROP INDEX ON :Person(name)
		''');
	}

	@Test
	def void createNodePropertyExistenceConstraint() {
		test('''
			CREATE CONSTRAINT ON (book:Book) ASSERT exists(book.isbn)
		''');
	}

	@Test
	def void dropNodePropertyExistenceConstraint() {
		test('''
			DROP CONSTRAINT ON (book:Book) ASSERT exists(book.isbn)
		''');
	}

	@Test
	def void createRelationshipPropertyExistenceConstraints() {
		test('''
			CREATE CONSTRAINT ON ()-[like:LIKED]-() ASSERT exists(like.day)
		''');
	}

	@Test
	def void dropRelationshipPropertyExistenceConstraints() {
		test('''
			DROP CONSTRAINT ON ()-[like:LIKED]-() ASSERT exists(like.day)
		''');
	}
}
