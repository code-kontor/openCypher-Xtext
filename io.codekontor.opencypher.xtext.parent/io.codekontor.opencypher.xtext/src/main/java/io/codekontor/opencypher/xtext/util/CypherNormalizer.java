/**
 * openCypher Xtext - Slizaa Static Software Analysis Tools
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
package io.codekontor.opencypher.xtext.util;

import static com.google.common.base.Preconditions.checkNotNull;

public class CypherNormalizer {

  // http://blog.ostermiller.org/find-comment
  
  private static final String whitespace_chars         = ""                                     /*
                                                                                                 * dummy empty string
                                                                                                 * for homogeneity
                                                                                                 */
      + "\\u0009"                                                                               // CHARACTER
      // TABULATION
      + "\\u000A"                                                                               // LINE
      // FEED
      // (LF)
      + "\\u000B"                                                                               // LINE
      // TABULATION
      + "\\u000C"                                                                               // FORM
      // FEED
      // (FF)
      + "\\u000D"                                                                               // CARRIAGE
      // RETURN
      // (CR)
      + "\\u0020"                                                                               // SPACE
      + "\\u0085"                                                                               // NEXT
      // LINE
      // (NEL)
      + "\\u00A0"                                                                               // NO-BREAK
      // SPACE
      + "\\u1680"                                                                               // OGHAM
      // SPACE
      // MARK
      + "\\u180E"                                                                               // MONGOLIAN
      // VOWEL
      // SEPARATOR
      + "\\u2000"                                                                               // EN
      // QUAD
      + "\\u2001"                                                                               // EM
      // QUAD
      + "\\u2002"                                                                               // EN
      // SPACE
      + "\\u2003"                                                                               // EM
      // SPACE
      + "\\u2004"                                                                               // THREE-PER-EM
      // SPACE
      + "\\u2005"                                                                               // FOUR-PER-EM
      // SPACE
      + "\\u2006"                                                                               // SIX-PER-EM
      // SPACE
      + "\\u2007"                                                                               // FIGURE
      // SPACE
      + "\\u2008"                                                                               // PUNCTUATION
      // SPACE
      + "\\u2009"                                                                               // THIN
      // SPACE
      + "\\u200A"                                                                               // HAIR
      // SPACE
      + "\\u2028"                                                                               // LINE
      // SEPARATOR
      + "\\u2029"                                                                               // PARAGRAPH
      // SEPARATOR
      + "\\u202F"                                                                               // NARROW
      // NO-BREAK
      // SPACE
      + "\\u205F"                                                                               // MEDIUM
      // MATHEMATICAL
      // SPACE
      + "\\u3000"                                                                               // IDEOGRAPHIC
  // SPACE
  ;

  /**
   * <p>
   * </p>
   *
   * @param sourcecode
   * @return
   */
  public static String normalize(String sourcecode) {
    String result = removeComments(checkNotNull(sourcecode));
    result = removeWhiteSpaces(result);
    return result.trim();
  }

  /**
   * <p>
   * </p>
   *
   * @param sourcecode
   * @return
   */
  private static String removeWhiteSpaces(String sourcecode) {
    return sourcecode.replaceAll("[" + whitespace_chars + "]" + "+", " ");
  }

  /**
   * <p>
   * </p>
   *
   * @param sourcecode
   * @return
   */
  private static String removeComments(String sourcecode) {
    return checkNotNull(sourcecode).replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "");
  }
}
