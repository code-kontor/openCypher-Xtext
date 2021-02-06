/**
 * generated by Xtext 2.21.0
 */
package io.codekontor.opencypher.xtext.openCypher.impl;

import io.codekontor.opencypher.xtext.openCypher.Expression;
import io.codekontor.opencypher.xtext.openCypher.Extract;
import io.codekontor.opencypher.xtext.openCypher.FilterExpression;
import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.ExtractImpl#getFilterExpression <em>Filter Expression</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.ExtractImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtractImpl extends ExpressionImpl implements Extract
{
  /**
   * The cached value of the '{@link #getFilterExpression() <em>Filter Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterExpression()
   * @generated
   * @ordered
   */
  protected FilterExpression filterExpression;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtractImpl()
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
    return OpenCypherPackage.Literals.EXTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterExpression getFilterExpression()
  {
    return filterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilterExpression(FilterExpression newFilterExpression, NotificationChain msgs)
  {
    FilterExpression oldFilterExpression = filterExpression;
    filterExpression = newFilterExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.EXTRACT__FILTER_EXPRESSION, oldFilterExpression, newFilterExpression);
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
  public void setFilterExpression(FilterExpression newFilterExpression)
  {
    if (newFilterExpression != filterExpression)
    {
      NotificationChain msgs = null;
      if (filterExpression != null)
        msgs = ((InternalEObject)filterExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.EXTRACT__FILTER_EXPRESSION, null, msgs);
      if (newFilterExpression != null)
        msgs = ((InternalEObject)newFilterExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.EXTRACT__FILTER_EXPRESSION, null, msgs);
      msgs = basicSetFilterExpression(newFilterExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.EXTRACT__FILTER_EXPRESSION, newFilterExpression, newFilterExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.EXTRACT__EXPRESSION, oldExpression, newExpression);
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
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.EXTRACT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.EXTRACT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.EXTRACT__EXPRESSION, newExpression, newExpression));
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
      case OpenCypherPackage.EXTRACT__FILTER_EXPRESSION:
        return basicSetFilterExpression(null, msgs);
      case OpenCypherPackage.EXTRACT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case OpenCypherPackage.EXTRACT__FILTER_EXPRESSION:
        return getFilterExpression();
      case OpenCypherPackage.EXTRACT__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.EXTRACT__FILTER_EXPRESSION:
        setFilterExpression((FilterExpression)newValue);
        return;
      case OpenCypherPackage.EXTRACT__EXPRESSION:
        setExpression((Expression)newValue);
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
      case OpenCypherPackage.EXTRACT__FILTER_EXPRESSION:
        setFilterExpression((FilterExpression)null);
        return;
      case OpenCypherPackage.EXTRACT__EXPRESSION:
        setExpression((Expression)null);
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
      case OpenCypherPackage.EXTRACT__FILTER_EXPRESSION:
        return filterExpression != null;
      case OpenCypherPackage.EXTRACT__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //ExtractImpl
