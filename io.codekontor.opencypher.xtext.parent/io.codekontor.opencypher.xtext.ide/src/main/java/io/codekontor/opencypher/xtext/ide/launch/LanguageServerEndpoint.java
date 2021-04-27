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

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.function.Consumer;


import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageClientAware;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.websocket.WebSocketEndpoint;

/**
 * WebSocket endpoint that connects to the Xtext language server.
 */
public class LanguageServerEndpoint extends WebSocketEndpoint<LanguageClient> {
	
  @Inject
  private LanguageServer languageServer;
  
  @Override
  protected void configure(final Launcher.Builder<LanguageClient> builder) {
    builder.setLocalService(this.languageServer);
    builder.setRemoteInterface(LanguageClient.class);
  }
  
  @Override
  protected void connect(final Collection<Object> localServices, final LanguageClient remoteProxy) {
    Iterables.<LanguageClientAware>filter(localServices, LanguageClientAware.class).forEach((Consumer<LanguageClientAware>) (LanguageClientAware it) -> {
      it.connect(remoteProxy);
    });
  }
}
