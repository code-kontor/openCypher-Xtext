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

class SemanticErrorAcceptance_Test extends AbstractCypherTest {
    
    /*
    Scenario: Handling property access on the Any type
    */
    @Test
    def void testSemanticErrorAcceptance_01() {
        test('''
        WITH [{prop: 0}, 1] AS list
        RETURN (list[0]).prop
        ''')
    }

    /*
    Scenario: Failing when performing property access on a non-map 1
    */
    @Test
    def void testSemanticErrorAcceptance_02() {
        test('''
        WITH [{prop: 0}, 1] AS list
        RETURN (list[1]).prop
        ''')
    }

    /*
    Scenario: Failing when performing property access on a non-map 2
    */
    @Test
    def void testSemanticErrorAcceptance_03() {
        test('''
        CREATE (n {prop: 'foo'})
        WITH n.prop AS n2
        RETURN n2.prop
        ''')
    }

    /*
    Scenario: Bad arguments for `range()`
    */
    @Test
    def void testSemanticErrorAcceptance_04() {
        test('''
        RETURN range(2, 8, 0)
        ''')
    }

}
