/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher.impl;

import io.codekontor.opencypher.xtext.openCypher.AllOptions;
import io.codekontor.opencypher.xtext.openCypher.CypherOption;
import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.AllOptionsImpl#isExplain <em>Explain</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.AllOptionsImpl#isProfile <em>Profile</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.AllOptionsImpl#getCypherOption <em>Cypher Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllOptionsImpl extends QueryOptionsImpl implements AllOptions
{
  /**
   * The default value of the '{@link #isExplain() <em>Explain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplain()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLAIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplain() <em>Explain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplain()
   * @generated
   * @ordered
   */
  protected boolean explain = EXPLAIN_EDEFAULT;

  /**
   * The default value of the '{@link #isProfile() <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProfile()
   * @generated
   * @ordered
   */
  protected static final boolean PROFILE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProfile() <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProfile()
   * @generated
   * @ordered
   */
  protected boolean profile = PROFILE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCypherOption() <em>Cypher Option</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCypherOption()
   * @generated
   * @ordered
   */
  protected EList<CypherOption> cypherOption;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllOptionsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpenCypherPackage.Literals.ALL_OPTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isExplain()
  {
    return explain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExplain(boolean newExplain)
  {
    boolean oldExplain = explain;
    explain = newExplain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.ALL_OPTIONS__EXPLAIN, oldExplain, explain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isProfile()
  {
    return profile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProfile(boolean newProfile)
  {
    boolean oldProfile = profile;
    profile = newProfile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.ALL_OPTIONS__PROFILE, oldProfile, profile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CypherOption> getCypherOption()
  {
    if (cypherOption == null)
    {
      cypherOption = new EObjectContainmentEList<CypherOption>(CypherOption.class, this, OpenCypherPackage.ALL_OPTIONS__CYPHER_OPTION);
    }
    return cypherOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenCypherPackage.ALL_OPTIONS__CYPHER_OPTION:
        return ((InternalEList<?>)getCypherOption()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpenCypherPackage.ALL_OPTIONS__EXPLAIN:
        return isExplain();
      case OpenCypherPackage.ALL_OPTIONS__PROFILE:
        return isProfile();
      case OpenCypherPackage.ALL_OPTIONS__CYPHER_OPTION:
        return getCypherOption();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.ALL_OPTIONS__EXPLAIN:
        setExplain((Boolean)newValue);
        return;
      case OpenCypherPackage.ALL_OPTIONS__PROFILE:
        setProfile((Boolean)newValue);
        return;
      case OpenCypherPackage.ALL_OPTIONS__CYPHER_OPTION:
        getCypherOption().clear();
        getCypherOption().addAll((Collection<? extends CypherOption>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.ALL_OPTIONS__EXPLAIN:
        setExplain(EXPLAIN_EDEFAULT);
        return;
      case OpenCypherPackage.ALL_OPTIONS__PROFILE:
        setProfile(PROFILE_EDEFAULT);
        return;
      case OpenCypherPackage.ALL_OPTIONS__CYPHER_OPTION:
        getCypherOption().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.ALL_OPTIONS__EXPLAIN:
        return explain != EXPLAIN_EDEFAULT;
      case OpenCypherPackage.ALL_OPTIONS__PROFILE:
        return profile != PROFILE_EDEFAULT;
      case OpenCypherPackage.ALL_OPTIONS__CYPHER_OPTION:
        return cypherOption != null && !cypherOption.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (explain: ");
    result.append(explain);
    result.append(", profile: ");
    result.append(profile);
    result.append(')');
    return result.toString();
  }

} //AllOptionsImpl
