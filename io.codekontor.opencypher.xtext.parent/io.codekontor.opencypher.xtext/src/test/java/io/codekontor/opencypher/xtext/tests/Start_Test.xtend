package io.codekontor.opencypher.xtext.tests

import org.junit.Test

class Start_Test extends AbstractCypherTest {

	@Test
	def void start() {
		test('''
			START n=node:nodes(name = {param_1})
			RETURN n
		''');
	}
}
