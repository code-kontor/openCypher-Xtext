/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cypher Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.CypherOption#getVersionNumber <em>Version Number</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.CypherOption#getConfigurationOption <em>Configuration Option</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCypherOption()
 * @model
 * @generated
 */
public interface CypherOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version Number</em>' containment reference.
   * @see #setVersionNumber(VersionNumber)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCypherOption_VersionNumber()
   * @model containment="true"
   * @generated
   */
  VersionNumber getVersionNumber();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.CypherOption#getVersionNumber <em>Version Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Number</em>' containment reference.
   * @see #getVersionNumber()
   * @generated
   */
  void setVersionNumber(VersionNumber value);

  /**
   * Returns the value of the '<em><b>Configuration Option</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.ConfigurationOption}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration Option</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCypherOption_ConfigurationOption()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationOption> getConfigurationOption();

} // CypherOption
