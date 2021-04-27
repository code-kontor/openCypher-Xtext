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
package io.codekontor.opencypher.xtext.tests.tck

import org.junit.Test
import io.codekontor.opencypher.xtext.tests.AbstractCypherTest

class VarLengthAcceptance2_Test extends AbstractCypherTest {
    
    /*
    Scenario: Handling relationships that are already bound in variable length paths
    Given an empty graph
    And having executed:
      """
      CREATE (n0:Node),
             (n1:Node),
             (n2:Node),
             (n3:Node),
             (n0)-[:EDGE]->(n1),
             (n1)-[:EDGE]->(n2),
             (n2)-[:EDGE]->(n3)
      """
    */
    @Test
    def void testVarLengthAcceptance2_01() {
        test('''
        MATCH ()-[r:EDGE]-()
        MATCH p = (n)-[*0..1]-()-[r]-()-[*0..1]-(m)
        RETURN count(p) AS c
        ''')
    }

}
