/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SortItem#getExpression <em>Expression</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SortItem#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSortItem()
 * @model
 * @generated
 */
public interface SortItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSortItem_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.SortItem#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' attribute.
   * @see #setSort(String)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSortItem_Sort()
   * @model
   * @generated
   */
  String getSort();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.SortItem#getSort <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' attribute.
   * @see #getSort()
   * @generated
   */
  void setSort(String value);

} // SortItem