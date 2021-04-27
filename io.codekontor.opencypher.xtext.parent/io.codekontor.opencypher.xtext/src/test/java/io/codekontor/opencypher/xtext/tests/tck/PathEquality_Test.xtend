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

class PathEquality_Test extends AbstractCypherTest {
    
    /*
    Scenario: Direction of traversed relationship is not significant for path equality, simple
    Given an empty graph
    And having executed:
      """
      CREATE (n:A)-[:LOOP]->(n)
      """
    */
    @Test
    def void testPathEquality_01() {
        test('''
        MATCH p1 = (:A)-->()
        MATCH p2 = (:A)<--()
        RETURN p1 = p2
        ''')
    }

}
