/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.DropIndex#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDropIndex()
 * @model
 * @generated
 */
public interface DropIndex extends Command
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Index)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDropIndex_Index()
   * @model containment="true"
   * @generated
   */
  Index getIndex();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.DropIndex#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Index value);

} // DropIndex
