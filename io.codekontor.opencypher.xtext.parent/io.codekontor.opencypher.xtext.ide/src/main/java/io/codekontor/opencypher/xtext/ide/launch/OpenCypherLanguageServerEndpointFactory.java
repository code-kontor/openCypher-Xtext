/**
 * openCypher Xtext IDE - Slizaa Static Software Analysis Tools
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
package io.codekontor.opencypher.xtext.ide.launch;

import javax.websocket.Endpoint;

import com.google.inject.Injector;

import io.codekontor.opencypher.xtext.OpenCypherStandaloneSetup;
import io.codekontor.opencypher.xtext.api.IGraphDatabaseMetaDataProvider;
import io.codekontor.opencypher.xtext.api.IOpenCypherLanguageServerEndpointFactory;

public class OpenCypherLanguageServerEndpointFactory implements IOpenCypherLanguageServerEndpointFactory {
	
	@Override
	public Endpoint createNewEndpoint(IGraphDatabaseMetaDataProvider graphDatabaseMetaDataProvider) {
		
			
			Injector injector = new OpenCypherStandaloneSetup() {
				@Override
				public Injector createInjector() {
					return OpenCypherLspInjectorFactory.createInjector(graphDatabaseMetaDataProvider);
				}
			}.createInjectorAndDoEMFRegistration();

			return injector.getInstance(LanguageServerEndpoint.class);	
	}

}
