/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Delete#isDetach <em>Detach</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Delete#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDelete()
 * @model
 * @generated
 */
public interface Delete extends UpdatingClause
{
  /**
   * Returns the value of the '<em><b>Detach</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detach</em>' attribute.
   * @see #setDetach(boolean)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDelete_Detach()
   * @model
   * @generated
   */
  boolean isDetach();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Delete#isDetach <em>Detach</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detach</em>' attribute.
   * @see #isDetach()
   * @generated
   */
  void setDetach(boolean value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDelete_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Delete
