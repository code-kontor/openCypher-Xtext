package io.codekontor.opencypher.xtext.api;

import javax.websocket.Endpoint;

public interface IOpenCypherLanguageServerEndpointFactory {

	Endpoint createNewEndpoint(IGraphDatabaseMetaDataProvider graphDatabaseMetaDataProvider);

}
