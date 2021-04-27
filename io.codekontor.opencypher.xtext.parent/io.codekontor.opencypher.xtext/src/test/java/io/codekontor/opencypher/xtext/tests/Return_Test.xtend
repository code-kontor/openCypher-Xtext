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

import io.codekontor.opencypher.xtext.openCypher.Cypher
import org.junit.Assert
import org.junit.Test

class Return_Test extends AbstractCypherTest {

	@Test
	def void return_1() {
		test('''
			MATCH () RETURN *
		''');
	}

	@Test
	def void return_2() {
		test('''
			MATCH (a) RETURN a
		''');
	}

	@Test
	def void return_3() {
		test('''
			MATCH (a) RETURN a.name
		''');
	}

	@Test
	def void return_4() {
		test('''
			MATCH (a) RETURN count(a)
		''');
	}

	@Test
	def void return_5() {
		test('''
			MATCH (a) RETURN count(*)
		''');
	}

	@Test
	def void return_6() {

//		Return (return: RETURN, distinct: true)
//            ReturnBody 
//                ReturnItems (all: null)
//                    ReturnItem 
//                        FunctionInvocation (operator: null) (distinct: false)
//                            FunctionName (name: id)
//                            VariableRef (operator: null) ->Variable (name: a)
//                    ReturnItem 
//                        VariableRef (operator: null) ->Variable (name: a)
//                    ReturnItem 
//                        ExpressionNodeLabelsAndPropertyLookup (operator: null)
//                            VariableRef (operator: null) ->Variable (name: a)
//                            PropertyLookup (propertyKeyName: fqn, propertyOperator: null)
		var Cypher cypher = test('''
			MATCH (a:Artifact)-[:CONTAINS]->(p:Package)
			WHERE p.fqn CONTAINS 'licensing'
			RETURN DISTINCT id(a)
		''');

		Assert.assertTrue(CypherUtils.returnItemsContainOnlyIds(cypher));
	}
}
