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
package io.codekontor.opencypher.xtext.tests.expression

import io.codekontor.opencypher.xtext.tests.AbstractCypherTest
import org.junit.Test

class ListComprehensionExpression_Test extends AbstractCypherTest {

	@Test
	def void listComprehensionExpressionTest() {
		test('''
			START month = node:months('name:*')
			MATCH (month)-[:in_month]-(game)-[:scored_in]-(player)
			WITH month, player, count(game) AS games
			ORDER BY games DESC
			WITH month, 
			     [x IN COLLECT()[0..5] | x[0]] AS players,
			     [x IN COLLECT()[0..5] | x[1]] AS goals
			RETURN month.name
		''');
	}

	@Test
	def void listComprehensionExpressionTest_2() {
		test('''
			START month = node:months('name:*')
			MATCH (month)-[:in_month]-(game)-[:scored_in]-(player)
			WITH month, player, count(game) AS games
			ORDER BY games DESC
			WITH month, 
			     [x IN COLLECT([player.name, games])[0..5] | x[0]] AS players,
			     [x IN COLLECT([player.name, games])[0..5] | x[1]] AS goals
			RETURN month.name
		''');
	}
}
