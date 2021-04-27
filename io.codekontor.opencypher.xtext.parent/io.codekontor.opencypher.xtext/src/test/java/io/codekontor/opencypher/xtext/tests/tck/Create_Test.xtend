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

class Create_Test extends AbstractCypherTest {
    
    /*
    Scenario: Creating a node
    Given any graph
    */
    @Test
    def void testCreate_01() {
        test('''
        CREATE ()
        ''')
    }

    /*
    Scenario: Creating two nodes
    Given any graph
    */
    @Test
    def void testCreate_02() {
        test('''
        CREATE (), ()
        ''')
    }

    /*
    Scenario: Creating two nodes and a relationship
    Given any graph
    */
    @Test
    def void testCreate_03() {
        test('''
        CREATE ()-[:TYPE]->()
        ''')
    }

    /*
    Scenario: Creating a node with a label
    Given any graph
    */
    @Test
    def void testCreate_04() {
        test('''
        CREATE (:Label)
        ''')
    }

    /*
    Scenario: Creating a node with a property
    Given any graph
    */
    @Test
    def void testCreate_05() {
        test('''
        CREATE ({created: true})
        ''')
    }

}
