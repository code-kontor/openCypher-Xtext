package io.codekontor.opencypher.xtext.tests.tck

import org.junit.Test
import io.codekontor.opencypher.xtext.tests.AbstractCypherTest

class WhereAcceptance_Test extends AbstractCypherTest {
    
    /*
    Scenario: NOT and false
    Given an empty graph
    And having executed:
      """
      CREATE ({name: 'a'})
      """
    */
    @Test
    def void testWhereAcceptance_01() {
        test('''
        MATCH (n)
        WHERE NOT(n.name = 'apa' AND false)
        RETURN n
        ''')
    }

}
