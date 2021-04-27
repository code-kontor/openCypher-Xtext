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