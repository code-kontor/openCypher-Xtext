package io.codekontor.opencypher.xtext.api;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IGraphDatabaseMetaDataProvider {

  /**
   * <p>
   * </p>
   *
   * @return
   */
  List<String> getNodeLabels();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  List<String> getRelationshipTypes();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  List<String> getPropertyKeys();
  
  /**
   * <p>
   * </p>
   *
   * @return
   */
  Map<String, String> getFunctions();
}
