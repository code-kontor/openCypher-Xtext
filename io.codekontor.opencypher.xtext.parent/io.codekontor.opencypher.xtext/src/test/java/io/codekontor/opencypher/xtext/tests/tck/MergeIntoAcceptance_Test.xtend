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

class MergeIntoAcceptance_Test extends AbstractCypherTest {
    
    /*
    Scenario: Updating one property with ON CREATE
    */
    @Test
    def void testMergeIntoAcceptance_01() {
        test('''
        MATCH (a {name: 'A'}), (b {name: 'B'})
        MERGE (a)-[r:TYPE]->(b)
        ON CREATE SET r.name = 'foo'
        ''')
    }

    /*
    Scenario: Null-setting one property with ON CREATE
    */
    @Test
    def void testMergeIntoAcceptance_02() {
        test('''
        MATCH (a {name: 'A'}), (b {name: 'B'})
        MERGE (a)-[r:TYPE]->(b)
        ON CREATE SET r.name = null
        ''')
    }

    /*
    Scenario: Copying properties from node with ON CREATE
    */
    @Test
    def void testMergeIntoAcceptance_03() {
        test('''
        MATCH (a {name: 'A'}), (b {name: 'B'})
        MERGE (a)-[r:TYPE]->(b)
        ON CREATE SET r = a
        ''')
    }

    /*
    Scenario: Copying properties from node with ON MATCH
    And having executed:
      """
      MATCH (a:A), (b:B)
      CREATE (a)-[:TYPE {foo: 'bar'}]->(b)
      """
    */
    @Test
    def void testMergeIntoAcceptance_04() {
        test('''
        MATCH (a {name: 'A'}), (b {name: 'B'})
        MERGE (a)-[r:TYPE]->(b)
        ON MATCH SET r = a
        ''')
    }

    /*
    Scenario: Copying properties from literal map with ON CREATE
    */
    @Test
    def void testMergeIntoAcceptance_05() {
        test('''
        MATCH (a {name: 'A'}), (b {name: 'B'})
        MERGE (a)-[r:TYPE]->(b)
        ON CREATE SET r += {foo: 'bar', bar: 'baz'}
        ''')
    }

    /*
    Scenario: Copying properties from literal map with ON MATCH
    And having executed:
      """
      MATCH (a:A), (b:B)
      CREATE (a)-[:TYPE {foo: 'bar'}]->(b)
      """
    */
    @Test
    def void testMergeIntoAcceptance_06() {
        test('''
        MATCH (a {name: 'A'}), (b {name: 'B'})
        MERGE (a)-[r:TYPE]->(b)
        ON MATCH SET r += {foo: 'baz', bar: 'baz'}
        ''')
    }

}
