/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Part Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.MultiPartQuery#getSubQueries <em>Sub Queries</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.MultiPartQuery#getSinglePartQuery <em>Single Part Query</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getMultiPartQuery()
 * @model
 * @generated
 */
public interface MultiPartQuery extends SingleQuery
{
  /**
   * Returns the value of the '<em><b>Sub Queries</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.MultiPartSubQuery}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Queries</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getMultiPartQuery_SubQueries()
   * @model containment="true"
   * @generated
   */
  EList<MultiPartSubQuery> getSubQueries();

  /**
   * Returns the value of the '<em><b>Single Part Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Part Query</em>' containment reference.
   * @see #setSinglePartQuery(SinglePartQuery)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getMultiPartQuery_SinglePartQuery()
   * @model containment="true"
   * @generated
   */
  SinglePartQuery getSinglePartQuery();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.MultiPartQuery#getSinglePartQuery <em>Single Part Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Part Query</em>' containment reference.
   * @see #getSinglePartQuery()
   * @generated
   */
  void setSinglePartQuery(SinglePartQuery value);

} // MultiPartQuery
