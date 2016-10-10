/*
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher

import org.slizaa.neo4j.opencypher.scoping.NullGlobalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class OpenCypherRuntimeModule extends AbstractOpenCypherRuntimeModule {
	
	override bindIFormatter2() {
		super.bindIFormatter2()
	}

	override bindIGlobalScopeProvider() {
		NullGlobalScopeProvider;
	}
	
}