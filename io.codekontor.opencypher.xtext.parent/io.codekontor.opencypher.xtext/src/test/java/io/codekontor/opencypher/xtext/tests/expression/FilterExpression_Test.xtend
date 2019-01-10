package io.codekontor.opencypher.xtext.tests.expression

import io.codekontor.opencypher.xtext.tests.AbstractCypherTest
import org.junit.Test

class FilterExpression_Test extends AbstractCypherTest {

	@Test
	def void filter_0() {
		test('''
			MATCH (a)
			WHERE a.name='Eskil'
			RETURN a.array, filter(x IN a.array WHERE size(x)= 3)
		''');
	}

	@Test
	def void all_0() {
		test('''
			MATCH (a)
			WHERE a.name='Eskil'
			RETURN a.array, all(x IN a.array WHERE size(x)= 3)
		''');
	}

	@Test
	def void any_0() {
		test('''
			MATCH (a)
			WHERE a.name='Eskil'
			RETURN a.array, any(x IN a.array WHERE size(x)= 3)
		''');
	}

	@Test
	def void none_0() {
		test('''
			MATCH (a)
			WHERE a.name='Eskil'
			RETURN a.array, none(x IN a.array WHERE size(x)= 3)
		''');
	}

	@Test
	def void single_0() {
		test('''
			MATCH (a)
			WHERE a.name='Eskil'
			RETURN a.array, single(x IN a.array WHERE size(x)= 3)
		''');
	}

	@Test
	def void extract_0() {
		test('''
			MATCH p=(a)-->(b)-->(c)
			WHERE a.name='Alice' AND b.name='Bob' AND c.name='Daniel'
			RETURN extract(n IN nodes(p)| n.age) AS extracted
		''');
	}
	
		@Test
	def void reduce_0() {
		test('''
			MATCH p=(a)-->(b)-->(c)
			WHERE a.name='Alice' AND b.name='Bob' AND c.name='Daniel'
			RETURN reduce(totalAge = 0, n IN nodes(p)| totalAge + n.age) AS reduction
		''');
	}
}
