/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.RelationshipTypes#getRelTypeNames <em>Rel Type Names</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipTypes()
 * @model
 * @generated
 */
public interface RelationshipTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Rel Type Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Type Names</em>' attribute list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipTypes_RelTypeNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelTypeNames();

} // RelationshipTypes
