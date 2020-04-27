/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.TypeExpression#getStrong <em>Strong</em>}</li>
 *   <li>{@link smitey.rpgindividual.TypeExpression#getStrong2 <em>Strong2</em>}</li>
 *   <li>{@link smitey.rpgindividual.TypeExpression#getCurrentT <em>Current T</em>}</li>
 *   <li>{@link smitey.rpgindividual.TypeExpression#getWeak <em>Weak</em>}</li>
 *   <li>{@link smitey.rpgindividual.TypeExpression#getWeak2 <em>Weak2</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getTypeExpression()
 * @model
 * @generated
 */
public interface TypeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Strong</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strong</em>' reference.
   * @see #setStrong(Type)
   * @see smitey.rpgindividual.RpgindividualPackage#getTypeExpression_Strong()
   * @model
   * @generated
   */
  Type getStrong();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.TypeExpression#getStrong <em>Strong</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strong</em>' reference.
   * @see #getStrong()
   * @generated
   */
  void setStrong(Type value);

  /**
   * Returns the value of the '<em><b>Strong2</b></em>' reference list.
   * The list contents are of type {@link smitey.rpgindividual.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strong2</em>' reference list.
   * @see smitey.rpgindividual.RpgindividualPackage#getTypeExpression_Strong2()
   * @model
   * @generated
   */
  EList<Type> getStrong2();

  /**
   * Returns the value of the '<em><b>Current T</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current T</em>' reference.
   * @see #setCurrentT(Type)
   * @see smitey.rpgindividual.RpgindividualPackage#getTypeExpression_CurrentT()
   * @model
   * @generated
   */
  Type getCurrentT();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.TypeExpression#getCurrentT <em>Current T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current T</em>' reference.
   * @see #getCurrentT()
   * @generated
   */
  void setCurrentT(Type value);

  /**
   * Returns the value of the '<em><b>Weak</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weak</em>' reference.
   * @see #setWeak(Type)
   * @see smitey.rpgindividual.RpgindividualPackage#getTypeExpression_Weak()
   * @model
   * @generated
   */
  Type getWeak();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.TypeExpression#getWeak <em>Weak</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weak</em>' reference.
   * @see #getWeak()
   * @generated
   */
  void setWeak(Type value);

  /**
   * Returns the value of the '<em><b>Weak2</b></em>' reference list.
   * The list contents are of type {@link smitey.rpgindividual.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weak2</em>' reference list.
   * @see smitey.rpgindividual.RpgindividualPackage#getTypeExpression_Weak2()
   * @model
   * @generated
   */
  EList<Type> getWeak2();

} // TypeExpression
