/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teams</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.Teams#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getTeams()
 * @model
 * @generated
 */
public interface Teams extends Declaration
{
  /**
   * Returns the value of the '<em><b>Team</b></em>' containment reference list.
   * The list contents are of type {@link smitey.rpgindividual.Team}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Team</em>' containment reference list.
   * @see smitey.rpgindividual.RpgindividualPackage#getTeams_Team()
   * @model containment="true"
   * @generated
   */
  EList<Team> getTeam();

} // Teams
