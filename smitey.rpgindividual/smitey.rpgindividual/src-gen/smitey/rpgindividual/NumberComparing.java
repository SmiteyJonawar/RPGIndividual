/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Comparing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.NumberComparing#getLeft <em>Left</em>}</li>
 *   <li>{@link smitey.rpgindividual.NumberComparing#getComp <em>Comp</em>}</li>
 *   <li>{@link smitey.rpgindividual.NumberComparing#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getNumberComparing()
 * @model
 * @generated
 */
public interface NumberComparing extends Proposition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Sum)
   * @see smitey.rpgindividual.RpgindividualPackage#getNumberComparing_Left()
   * @model containment="true"
   * @generated
   */
  Sum getLeft();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.NumberComparing#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Sum value);

  /**
   * Returns the value of the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' containment reference.
   * @see #setComp(Comparator)
   * @see smitey.rpgindividual.RpgindividualPackage#getNumberComparing_Comp()
   * @model containment="true"
   * @generated
   */
  Comparator getComp();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.NumberComparing#getComp <em>Comp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' containment reference.
   * @see #getComp()
   * @generated
   */
  void setComp(Comparator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Sum)
   * @see smitey.rpgindividual.RpgindividualPackage#getNumberComparing_Right()
   * @model containment="true"
   * @generated
   */
  Sum getRight();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.NumberComparing#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Sum value);

} // NumberComparing
