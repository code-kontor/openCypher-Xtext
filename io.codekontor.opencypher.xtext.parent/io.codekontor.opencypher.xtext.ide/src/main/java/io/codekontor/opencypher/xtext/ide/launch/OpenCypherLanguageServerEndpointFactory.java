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
