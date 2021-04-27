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

class MiscellaneousErrorAcceptance_Test extends AbstractCypherTest {
    
    /*
    Scenario: Failing on merging relationship with null property
    */
    @Test
    def void testMiscellaneousErrorAcceptance_01() {
        test('''
        CREATE (a), (b)
        MERGE (a)-[r:X {p: null}]->(b)
        ''')
    }

    /*
    Scenario: Failing on merging node with null property
    */
    @Test
    def void testMiscellaneousErrorAcceptance_02() {
        test('''
        MERGE ({p: null})
        ''')
    }

    /*
    Scenario: Failing when setting a list of maps as a property
    */
    @Test
    def void testMiscellaneousErrorAcceptance_03() {
        test('''
        CREATE (a)
        SET a.foo = [{x: 1}]
        ''')
    }

}
