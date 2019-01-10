package io.codekontor.opencypher.xtext.tests.expression

import org.eclipse.xtext.EcoreUtil2
import org.junit.Test
import io.codekontor.opencypher.xtext.openCypher.BooleanLiteral
import io.codekontor.opencypher.xtext.openCypher.Cypher
import io.codekontor.opencypher.xtext.openCypher.Expression
import io.codekontor.opencypher.xtext.openCypher.NumberLiteral
import io.codekontor.opencypher.xtext.openCypher.OrExpression
import io.codekontor.opencypher.xtext.openCypher.ParenthesizedExpression
import io.codekontor.opencypher.xtext.openCypher.Where
import io.codekontor.opencypher.xtext.openCypher.XorExpression
import io.codekontor.opencypher.xtext.tests.AbstractCypherTest

import static org.junit.Assert.*

class Expression_Test extends AbstractCypherTest {

	@Test
	def void expression_OR() {
		val Cypher cypher = test('''
			START n=Node(2) where 1 OR false OR false OR false RETURN n;
		''');
		assertEquals("(((1 OR false) OR false) OR false)", strRep(cypher));
	}

	@Test
	def void expression_XOR_1() {
		val Cypher cypher = test('''
			START n=Node(2) where 1 XOR false XOR false XOR false RETURN n;
		''');
		assertEquals("(((1 XOR false) XOR false) XOR false)", strRep(cypher));
	}

	@Test
	def void expression_XOR_2() {
		val Cypher cypher = test('''
			START n=Node(2) where 1 XOR false OR false XOR false RETURN n;
		''');
		assertEquals("((1 XOR false) OR (false XOR false))", strRep(cypher));
	}

	@Test
	def void expression_XOR_3() {
		val Cypher cypher = test('''
			START n=Node(2) where 1 XOR (false OR false) XOR false RETURN n;
		''');

		assertEquals("((1 XOR (false OR false)) XOR false)", strRep(cypher));
	}

	def String strRep(Cypher cypher) {
		val Expression exp = EcoreUtil2.eAllOfType(cypher, Where).get(0).expression;
		exp.stringRepr
	}

	def String stringRepr(Expression e) {
		switch (e) {
			OrExpression: '''(«e.left.stringRepr» OR «e.right.stringRepr»)'''
			XorExpression: '''(«e.left.stringRepr» XOR «e.right.stringRepr»)'''
			ParenthesizedExpression: '''«e.expression.stringRepr»'''
			BooleanLiteral: '''«e.value»'''
			NumberLiteral: '''«e.value»'''
		}.toString
	}
}
