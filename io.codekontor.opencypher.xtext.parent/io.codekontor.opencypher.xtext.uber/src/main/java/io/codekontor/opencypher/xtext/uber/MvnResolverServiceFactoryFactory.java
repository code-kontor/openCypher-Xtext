/**
 * openCypher Xtext Uber JAR - Slizaa Static Software Analysis Tools
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
package io.codekontor.opencypher.xtext.uber;

import io.codekontor.opencypher.xtext.api.IOpenCypherLanguageServerEndpointFactory;
import io.codekontor.opencypher.xtext.uber.internal.UberServiceInvocationHandler;

public class MvnResolverServiceFactoryFactory {

  /**
   *
   * @return
   */
  public static IOpenCypherLanguageServerEndpointFactory createNewResolverServiceFactory() {

    return UberServiceInvocationHandler.createNewResolverService(IOpenCypherLanguageServerEndpointFactory.class, (jcl) -> {

      // load the class...
      Class<?> clazz = jcl
          .loadClass("io.codekontor.opencypher.xtext.ide.launch.OpenCypherLanguageServerEndpointFactory");

      // ... and create a new instance.
      return (IOpenCypherLanguageServerEndpointFactory) clazz.getDeclaredConstructor().newInstance();
    });
  }

}