package io.codekontor.opencypher.xtext.tests

import org.junit.Test

class Backtick_Test extends AbstractCypherTest {

	@Test
	def void backtick_1() {
		test('''
			MATCH (`person_a`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`person_a`)-[:KNOWS]->(`person_c`)
			RETURN `person_a`, `person_c`
		''');
	}

	@Test
	def void backtick_2() {
		test('''
			MATCH (`person_a`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`person_a`)-[:KNOWS]->(`person_c`)
			RETURN person_a, person_c
		''');
	}

	@Test
	def void backtick_3() {
		test('''
			MATCH (`person a`:Person {test:'Jim'})-[:KNOWS]->(`person b`)-[:KNOWS]->(`person c`),
			(`person a`)-[:KNOWS]->(`person c`)
			RETURN `person a`, `person c`
		''');
	}
	
	@Test
	def void backtick_4() {
		test('''
			MATCH (`with space`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`with space`)-[:KNOWS]->(`person_c`)
			RETURN `with space`, `person_c`
		''');
	}
	
	@Test
	def void backtick_5() {
		test('''
			MATCH (`with german umlaut ä`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`with german umlaut ä`)-[:KNOWS]->(`person_c`)
			RETURN `with german umlaut ä`, `person_c`
		''');
	}
}
