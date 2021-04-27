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

class Comparability_Test extends AbstractCypherTest {
    
    /*
    Scenario: Comparing strings and integers using > in an AND'd predicate
    Given an empty graph
    And having executed:
      """
      CREATE (root:Root)-[:T]->(:Child {id: 0}),
             (root)-[:T]->(:Child {id: 'xx'}),
             (root)-[:T]->(:Child)
      """
    */
    @Test
    def void testComparability_01() {
        test('''
        MATCH (:Root)-->(i:Child)
        WHERE exists(i.id) AND i.id > 'x'
        RETURN i.id
        ''')
    }

    /*
    Scenario: Comparing strings and integers using > in a OR'd predicate
    Given an empty graph
    And having executed:
      """
      CREATE (root:Root)-[:T]->(:Child {id: 0}),
             (root)-[:T]->(:Child {id: 'xx'}),
             (root)-[:T]->(:Child)
      """
    */
    @Test
    def void testComparability_02() {
        test('''
        MATCH (:Root)-->(i:Child)
        WHERE NOT exists(i.id) OR i.id > 'x'
        RETURN i.id
        ''')
    }

}
