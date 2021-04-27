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
package io.codekontor.opencypher.xtext.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.runner.RunWith
import io.codekontor.opencypher.xtext.openCypher.Cypher

@RunWith(XtextRunner)
@InjectWith(OpenCypherInjectorProvider)
abstract class AbstractCypherTest {

	@Inject extension protected ParseHelper<Cypher>;

	@Inject extension protected ValidationTestHelper;

	def Cypher test(String cypher) {
		val model = cypher.parse
		Assert.assertNotNull(model)
		// println(dump(model, ""));
		model.assertNoErrors
		return model
	}

	def Cypher testAssertError(String cypher, EClass objectType, String code, int offset, int length,
		String... messageParts) {
		val model = cypher.parse
		Assert.assertNotNull(model)
		// println(dump(model, ""));
		model.assertError(objectType, code, offset, length, messageParts);
		return model
	}

	def static String dump(EObject mod_, String indent) {
		var res = indent + mod_.toString.replaceFirst('.*[.]impl[.](.*)Impl[^(]*', '$1 ')

		for (a : mod_.eCrossReferences)
			res += ' ->' + a.toString().replaceFirst('.*[.]impl[.](.*)Impl[^(]*', '$1 ')
		res += "\n"
		for (f : mod_.eContents) {
			res += f.dump(indent + "    ")
		}
		return res
	}
}
