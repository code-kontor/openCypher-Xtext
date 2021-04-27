/**
 * generated by Xtext 2.25.0
 */
package io.codekontor.opencypher.xtext.openCypher.impl;

import io.codekontor.opencypher.xtext.openCypher.CombinedQuery;
import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage;
import io.codekontor.opencypher.xtext.openCypher.SingleQuery;
import io.codekontor.opencypher.xtext.openCypher.Union;

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
 * An implementation of the model object '<em><b>Combined Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.CombinedQueryImpl#getSingleQuery <em>Single Query</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.CombinedQueryImpl#getUnion <em>Union</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedQueryImpl extends RegularQueryImpl implements CombinedQuery
{
  /**
   * The cached value of the '{@link #getSingleQuery() <em>Single Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleQuery()
   * @generated
   * @ordered
   */
  protected SingleQuery singleQuery;

  /**
   * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnion()
   * @generated
   * @ordered
   */
  protected EList<Union> union;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CombinedQueryImpl()
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
    return OpenCypherPackage.Literals.COMBINED_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SingleQuery getSingleQuery()
  {
    return singleQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleQuery(SingleQuery newSingleQuery, NotificationChain msgs)
  {
    SingleQuery oldSingleQuery = singleQuery;
    singleQuery = newSingleQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY, oldSingleQuery, newSingleQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSingleQuery(SingleQuery newSingleQuery)
  {
    if (newSingleQuery != singleQuery)
    {
      NotificationChain msgs = null;
      if (singleQuery != null)
        msgs = ((InternalEObject)singleQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY, null, msgs);
      if (newSingleQuery != null)
        msgs = ((InternalEObject)newSingleQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY, null, msgs);
      msgs = basicSetSingleQuery(newSingleQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY, newSingleQuery, newSingleQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Union> getUnion()
  {
    if (union == null)
    {
      union = new EObjectContainmentEList<Union>(Union.class, this, OpenCypherPackage.COMBINED_QUERY__UNION);
    }
    return union;
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
      case OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY:
        return basicSetSingleQuery(null, msgs);
      case OpenCypherPackage.COMBINED_QUERY__UNION:
        return ((InternalEList<?>)getUnion()).basicRemove(otherEnd, msgs);
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
      case OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY:
        return getSingleQuery();
      case OpenCypherPackage.COMBINED_QUERY__UNION:
        return getUnion();
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
      case OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY:
        setSingleQuery((SingleQuery)newValue);
        return;
      case OpenCypherPackage.COMBINED_QUERY__UNION:
        getUnion().clear();
        getUnion().addAll((Collection<? extends Union>)newValue);
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
      case OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY:
        setSingleQuery((SingleQuery)null);
        return;
      case OpenCypherPackage.COMBINED_QUERY__UNION:
        getUnion().clear();
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
      case OpenCypherPackage.COMBINED_QUERY__SINGLE_QUERY:
        return singleQuery != null;
      case OpenCypherPackage.COMBINED_QUERY__UNION:
        return union != null && !union.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CombinedQueryImpl
