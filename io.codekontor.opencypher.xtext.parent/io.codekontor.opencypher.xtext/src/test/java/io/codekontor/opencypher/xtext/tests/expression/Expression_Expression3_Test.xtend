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

import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.junit.Test
import io.codekontor.opencypher.xtext.openCypher.Cypher
import io.codekontor.opencypher.xtext.openCypher.Return
import io.codekontor.opencypher.xtext.tests.AbstractCypherTest

class Expression_Expression3_Test extends AbstractCypherTest {

	@Test
	def void index_1() {
		val Cypher cypher = test('''
			MATCH (startDate)<-[:NEXT*0..]-(day) 
			RETURN range(0,10)[3]
		''');

		val List<Return> returns = EcoreUtil2.getAllContentsOfType(cypher, Return);
		for (ret : returns) {
			println(ret)
			println(EcoreUtil2.getRootContainer(ret))
			println(EcoreUtil2.getNextSibling(ret));
		}
	}
	
		@Test
	def void index_2() {
		val Cypher cypher = test('''
			MATCH (startDate)<-[:NEXT*0..]-(day)
			where startDate.time > 10 
			return startDate
		''');

		val List<Return> returns = EcoreUtil2.getAllContentsOfType(cypher, Return);
		for (ret : returns) {
			println(ret)
			println(EcoreUtil2.getRootContainer(ret))
//			 println(EcoreUtil2.getPreviousSibling());
		}
	}

}
