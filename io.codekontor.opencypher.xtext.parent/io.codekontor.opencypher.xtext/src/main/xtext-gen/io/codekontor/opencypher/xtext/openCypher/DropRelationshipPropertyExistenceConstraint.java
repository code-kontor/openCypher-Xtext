/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Relationship Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.DropRelationshipPropertyExistenceConstraint#getRelationshipPropertyExistenceConstraint <em>Relationship Property Existence Constraint</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDropRelationshipPropertyExistenceConstraint()
 * @model
 * @generated
 */
public interface DropRelationshipPropertyExistenceConstraint extends Command
{
  /**
   * Returns the value of the '<em><b>Relationship Property Existence Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Property Existence Constraint</em>' containment reference.
   * @see #setRelationshipPropertyExistenceConstraint(RelationshipPropertyExistenceConstraint)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDropRelationshipPropertyExistenceConstraint_RelationshipPropertyExistenceConstraint()
   * @model containment="true"
   * @generated
   */
  RelationshipPropertyExistenceConstraint getRelationshipPropertyExistenceConstraint();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.DropRelationshipPropertyExistenceConstraint#getRelationshipPropertyExistenceConstraint <em>Relationship Property Existence Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship Property Existence Constraint</em>' containment reference.
   * @see #getRelationshipPropertyExistenceConstraint()
   * @generated
   */
  void setRelationshipPropertyExistenceConstraint(RelationshipPropertyExistenceConstraint value);

} // DropRelationshipPropertyExistenceConstraint
