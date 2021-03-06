/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Create#isUniqueContraint <em>Unique Contraint</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.Create#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends UpdatingClause
{
  /**
   * Returns the value of the '<em><b>Unique Contraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Contraint</em>' attribute.
   * @see #setUniqueContraint(boolean)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCreate_UniqueContraint()
   * @model
   * @generated
   */
  boolean isUniqueContraint();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Create#isUniqueContraint <em>Unique Contraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique Contraint</em>' attribute.
   * @see #isUniqueContraint()
   * @generated
   */
  void setUniqueContraint(boolean value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Pattern)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getCreate_Pattern()
   * @model containment="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.Create#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

} // Create
