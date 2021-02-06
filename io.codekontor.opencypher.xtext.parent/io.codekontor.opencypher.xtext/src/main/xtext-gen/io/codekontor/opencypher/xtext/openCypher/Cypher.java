/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cypher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Cypher#getQueryOptions <em>Query Options</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Cypher#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCypher()
 * @model
 * @generated
 */
public interface Cypher extends EObject
{
  /**
   * Returns the value of the '<em><b>Query Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Options</em>' containment reference.
   * @see #setQueryOptions(QueryOptions)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCypher_QueryOptions()
   * @model containment="true"
   * @generated
   */
  QueryOptions getQueryOptions();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Cypher#getQueryOptions <em>Query Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Options</em>' containment reference.
   * @see #getQueryOptions()
   * @generated
   */
  void setQueryOptions(QueryOptions value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCypher_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Cypher
