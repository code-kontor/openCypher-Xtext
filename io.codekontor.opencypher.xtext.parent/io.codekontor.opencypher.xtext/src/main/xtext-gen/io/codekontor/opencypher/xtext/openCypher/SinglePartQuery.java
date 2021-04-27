/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Part Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SinglePartQuery#getReadingClauses <em>Reading Clauses</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SinglePartQuery#getReturn <em>Return</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SinglePartQuery#getUpdatingClauses <em>Updating Clauses</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSinglePartQuery()
 * @model
 * @generated
 */
public interface SinglePartQuery extends SingleQuery
{
  /**
   * Returns the value of the '<em><b>Reading Clauses</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.ReadingClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Clauses</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSinglePartQuery_ReadingClauses()
   * @model containment="true"
   * @generated
   */
  EList<ReadingClause> getReadingClauses();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(Return)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSinglePartQuery_Return()
   * @model containment="true"
   * @generated
   */
  Return getReturn();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.SinglePartQuery#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(Return value);

  /**
   * Returns the value of the '<em><b>Updating Clauses</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.UpdatingClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updating Clauses</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSinglePartQuery_UpdatingClauses()
   * @model containment="true"
   * @generated
   */
  EList<UpdatingClause> getUpdatingClauses();

} // SinglePartQuery
