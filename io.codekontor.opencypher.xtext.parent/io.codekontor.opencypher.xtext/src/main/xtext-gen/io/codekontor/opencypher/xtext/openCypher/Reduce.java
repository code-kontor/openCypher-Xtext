/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getAccumulatorExpression <em>Accumulator Expression</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getIdInColl <em>Id In Coll</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getReduce()
 * @model
 * @generated
 */
public interface Reduce extends Expression
{
  /**
   * Returns the value of the '<em><b>Accumulator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accumulator</em>' containment reference.
   * @see #setAccumulator(VariableDeclaration)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getReduce_Accumulator()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getAccumulator();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getAccumulator <em>Accumulator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accumulator</em>' containment reference.
   * @see #getAccumulator()
   * @generated
   */
  void setAccumulator(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Accumulator Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accumulator Expression</em>' containment reference.
   * @see #setAccumulatorExpression(Expression)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getReduce_AccumulatorExpression()
   * @model containment="true"
   * @generated
   */
  Expression getAccumulatorExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getAccumulatorExpression <em>Accumulator Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accumulator Expression</em>' containment reference.
   * @see #getAccumulatorExpression()
   * @generated
   */
  void setAccumulatorExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Id In Coll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id In Coll</em>' containment reference.
   * @see #setIdInColl(IdInColl)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getReduce_IdInColl()
   * @model containment="true"
   * @generated
   */
  IdInColl getIdInColl();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getIdInColl <em>Id In Coll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id In Coll</em>' containment reference.
   * @see #getIdInColl()
   * @generated
   */
  void setIdInColl(IdInColl value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getReduce_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Reduce#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Reduce
