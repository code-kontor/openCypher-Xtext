/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Labels Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.NodeLabelsExpression#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getNodeLabelsExpression()
 * @model
 * @generated
 */
public interface NodeLabelsExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getNodeLabelsExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.NodeLabelsExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

} // NodeLabelsExpression
