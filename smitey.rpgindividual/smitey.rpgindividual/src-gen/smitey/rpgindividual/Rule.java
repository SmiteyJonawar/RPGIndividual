/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.Rule#getOr <em>Or</em>}</li>
 *   <li>{@link smitey.rpgindividual.Rule#getTargetThen <em>Target Then</em>}</li>
 *   <li>{@link smitey.rpgindividual.Rule#getTargetAtt <em>Target Att</em>}</li>
 *   <li>{@link smitey.rpgindividual.Rule#getChange <em>Change</em>}</li>
 *   <li>{@link smitey.rpgindividual.Rule#getSum <em>Sum</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' containment reference.
   * @see #setOr(Proposition)
   * @see smitey.rpgindividual.RpgindividualPackage#getRule_Or()
   * @model containment="true"
   * @generated
   */
  Proposition getOr();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Rule#getOr <em>Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' containment reference.
   * @see #getOr()
   * @generated
   */
  void setOr(Proposition value);

  /**
   * Returns the value of the '<em><b>Target Then</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Then</em>' attribute.
   * @see #setTargetThen(String)
   * @see smitey.rpgindividual.RpgindividualPackage#getRule_TargetThen()
   * @model
   * @generated
   */
  String getTargetThen();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Rule#getTargetThen <em>Target Then</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Then</em>' attribute.
   * @see #getTargetThen()
   * @generated
   */
  void setTargetThen(String value);

  /**
   * Returns the value of the '<em><b>Target Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Att</em>' reference.
   * @see #setTargetAtt(Attribute)
   * @see smitey.rpgindividual.RpgindividualPackage#getRule_TargetAtt()
   * @model
   * @generated
   */
  Attribute getTargetAtt();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Rule#getTargetAtt <em>Target Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Att</em>' reference.
   * @see #getTargetAtt()
   * @generated
   */
  void setTargetAtt(Attribute value);

  /**
   * Returns the value of the '<em><b>Change</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change</em>' attribute.
   * @see #setChange(String)
   * @see smitey.rpgindividual.RpgindividualPackage#getRule_Change()
   * @model
   * @generated
   */
  String getChange();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Rule#getChange <em>Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change</em>' attribute.
   * @see #getChange()
   * @generated
   */
  void setChange(String value);

  /**
   * Returns the value of the '<em><b>Sum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum</em>' containment reference.
   * @see #setSum(Sum)
   * @see smitey.rpgindividual.RpgindividualPackage#getRule_Sum()
   * @model containment="true"
   * @generated
   */
  Sum getSum();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Rule#getSum <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum</em>' containment reference.
   * @see #getSum()
   * @generated
   */
  void setSum(Sum value);

} // Rule
