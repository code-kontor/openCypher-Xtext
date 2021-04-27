/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPropertyExistenceConstraint#getRelationshipPattern <em>Relationship Pattern</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPropertyExistenceConstraint#getPropertyExpression <em>Property Expression</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipPropertyExistenceConstraint()
 * @model
 * @generated
 */
public interface RelationshipPropertyExistenceConstraint extends CreateRelationshipPropertyExistenceConstraint
{
  /**
   * Returns the value of the '<em><b>Relationship Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Pattern</em>' containment reference.
   * @see #setRelationshipPattern(RelationshipPatternSyntax)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipPropertyExistenceConstraint_RelationshipPattern()
   * @model containment="true"
   * @generated
   */
  RelationshipPatternSyntax getRelationshipPattern();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPropertyExistenceConstraint#getRelationshipPattern <em>Relationship Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship Pattern</em>' containment reference.
   * @see #getRelationshipPattern()
   * @generated
   */
  void setRelationshipPattern(RelationshipPatternSyntax value);

  /**
   * Returns the value of the '<em><b>Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Expression</em>' containment reference.
   * @see #setPropertyExpression(PropertyExpression)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipPropertyExistenceConstraint_PropertyExpression()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getPropertyExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPropertyExistenceConstraint#getPropertyExpression <em>Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Expression</em>' containment reference.
   * @see #getPropertyExpression()
   * @generated
   */
  void setPropertyExpression(PropertyExpression value);

} // RelationshipPropertyExistenceConstraint