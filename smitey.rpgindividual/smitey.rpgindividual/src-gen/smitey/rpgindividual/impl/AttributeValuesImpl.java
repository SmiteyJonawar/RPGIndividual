/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smitey.rpgindividual.ActualNumbers;
import smitey.rpgindividual.AttributeValues;
import smitey.rpgindividual.RpgindividualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.impl.AttributeValuesImpl#getLTypes <em>LTypes</em>}</li>
 *   <li>{@link smitey.rpgindividual.impl.AttributeValuesImpl#getAn <em>An</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValuesImpl extends MinimalEObjectImpl.Container implements AttributeValues
{
  /**
   * The default value of the '{@link #getLTypes() <em>LTypes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLTypes()
   * @generated
   * @ordered
   */
  protected static final String LTYPES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLTypes() <em>LTypes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLTypes()
   * @generated
   * @ordered
   */
  protected String lTypes = LTYPES_EDEFAULT;

  /**
   * The cached value of the '{@link #getAn() <em>An</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAn()
   * @generated
   * @ordered
   */
  protected ActualNumbers an;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeValuesImpl()
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
    return RpgindividualPackage.Literals.ATTRIBUTE_VALUES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLTypes()
  {
    return lTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLTypes(String newLTypes)
  {
    String oldLTypes = lTypes;
    lTypes = newLTypes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpgindividualPackage.ATTRIBUTE_VALUES__LTYPES, oldLTypes, lTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActualNumbers getAn()
  {
    return an;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAn(ActualNumbers newAn, NotificationChain msgs)
  {
    ActualNumbers oldAn = an;
    an = newAn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpgindividualPackage.ATTRIBUTE_VALUES__AN, oldAn, newAn);
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
  public void setAn(ActualNumbers newAn)
  {
    if (newAn != an)
    {
      NotificationChain msgs = null;
      if (an != null)
        msgs = ((InternalEObject)an).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpgindividualPackage.ATTRIBUTE_VALUES__AN, null, msgs);
      if (newAn != null)
        msgs = ((InternalEObject)newAn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpgindividualPackage.ATTRIBUTE_VALUES__AN, null, msgs);
      msgs = basicSetAn(newAn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpgindividualPackage.ATTRIBUTE_VALUES__AN, newAn, newAn));
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
      case RpgindividualPackage.ATTRIBUTE_VALUES__AN:
        return basicSetAn(null, msgs);
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
      case RpgindividualPackage.ATTRIBUTE_VALUES__LTYPES:
        return getLTypes();
      case RpgindividualPackage.ATTRIBUTE_VALUES__AN:
        return getAn();
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
      case RpgindividualPackage.ATTRIBUTE_VALUES__LTYPES:
        setLTypes((String)newValue);
        return;
      case RpgindividualPackage.ATTRIBUTE_VALUES__AN:
        setAn((ActualNumbers)newValue);
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
      case RpgindividualPackage.ATTRIBUTE_VALUES__LTYPES:
        setLTypes(LTYPES_EDEFAULT);
        return;
      case RpgindividualPackage.ATTRIBUTE_VALUES__AN:
        setAn((ActualNumbers)null);
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
      case RpgindividualPackage.ATTRIBUTE_VALUES__LTYPES:
        return LTYPES_EDEFAULT == null ? lTypes != null : !LTYPES_EDEFAULT.equals(lTypes);
      case RpgindividualPackage.ATTRIBUTE_VALUES__AN:
        return an != null;
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
    result.append(" (lTypes: ");
    result.append(lTypes);
    result.append(')');
    return result.toString();
  }

} //AttributeValuesImpl
