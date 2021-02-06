/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.With#getReturnBody <em>Return Body</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.With#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getWith()
 * @model
 * @generated
 */
public interface With extends Clause
{
  /**
   * Returns the value of the '<em><b>Return Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Body</em>' containment reference.
   * @see #setReturnBody(ReturnBody)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getWith_ReturnBody()
   * @model containment="true"
   * @generated
   */
  ReturnBody getReturnBody();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.With#getReturnBody <em>Return Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Body</em>' containment reference.
   * @see #getReturnBody()
   * @generated
   */
  void setReturnBody(ReturnBody value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getWith_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.With#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

} // With
