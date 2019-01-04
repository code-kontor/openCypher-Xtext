/*
 * generated by Xtext 2.12.0
 */
package io.codekontor.opencypher.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import io.codekontor.opencypher.xtext.OpenCypherRuntimeModule
import io.codekontor.opencypher.xtext.OpenCypherStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class OpenCypherIdeSetup extends OpenCypherStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new OpenCypherRuntimeModule, new OpenCypherIdeModule))
	}
	
}