/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.NameAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getNameAttribute()
 * @model
 * @generated
 */
public interface NameAttribute extends AtomicNumber
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see smitey.rpgindividual.RpgindividualPackage#getNameAttribute_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.NameAttribute#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // NameAttribute
