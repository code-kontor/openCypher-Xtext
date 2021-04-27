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

import java.util.Collections;

import javax.websocket.Endpoint;

import org.eclipse.xtext.ide.server.ILanguageServerShutdownAndExitHandler;
import org.eclipse.xtext.ide.server.ServerModule;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Modules2;

import com.google.common.base.Preconditions;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Names;

import io.codekontor.opencypher.xtext.OpenCypherRuntimeModule;
import io.codekontor.opencypher.xtext.api.IGraphDatabaseMetaDataProvider;
import io.codekontor.opencypher.xtext.ide.OpenCypherIdeModule;


public class OpenCypherLspInjectorFactory {
	
	public static Injector createInjector(IGraphDatabaseMetaDataProvider graphMetaDataProvider) {
		Preconditions.checkNotNull(graphMetaDataProvider);
		
		return Guice.createInjector(Modules2.mixin(new OpenCypherIdeModule(), new OpenCypherRuntimeModule(),
				new ServerModule(), new Module() {

					@Override
					public void configure(Binder binder) {
						
						binder.bind(Endpoint.class).to(LanguageServerEndpoint.class);
						binder.bind(ILanguageServerShutdownAndExitHandler.class)
								.to(ILanguageServerShutdownAndExitHandler.NullImpl.class);
						binder.bind(IResourceServiceProvider.Registry.class)
								.toProvider(IResourceServiceProvider.Registry.RegistryProvider.class);
						
						// 
						binder.bind(IGraphDatabaseMetaDataProvider.class).toInstance(graphMetaDataProvider);
						Names.bindProperties(binder, Collections.singletonMap("opencypher.allowMultipleStatements", "true"));
					}
				}));
	}
}
