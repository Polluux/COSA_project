/**
 */
package cOSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AConnecteur Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.AConnecteurComposant#getRequiredport <em>Requiredport</em>}</li>
 *   <li>{@link cOSA.AConnecteurComposant#getRequiredservice <em>Requiredservice</em>}</li>
 *   <li>{@link cOSA.AConnecteurComposant#getProvidedrole <em>Providedrole</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getAConnecteurComposant()
 * @model
 * @generated
 */
public interface AConnecteurComposant extends Attachement {
	/**
	 * Returns the value of the '<em><b>Requiredport</b></em>' reference list.
	 * The list contents are of type {@link cOSA.RequiredPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredport</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredport</em>' reference list.
	 * @see cOSA.COSAPackage#getAConnecteurComposant_Requiredport()
	 * @model
	 * @generated
	 */
	EList<RequiredPort> getRequiredport();

	/**
	 * Returns the value of the '<em><b>Requiredservice</b></em>' reference list.
	 * The list contents are of type {@link cOSA.RequiredService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredservice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredservice</em>' reference list.
	 * @see cOSA.COSAPackage#getAConnecteurComposant_Requiredservice()
	 * @model
	 * @generated
	 */
	EList<RequiredService> getRequiredservice();

	/**
	 * Returns the value of the '<em><b>Providedrole</b></em>' reference list.
	 * The list contents are of type {@link cOSA.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole</em>' reference list.
	 * @see cOSA.COSAPackage#getAConnecteurComposant_Providedrole()
	 * @model
	 * @generated
	 */
	EList<ProvidedRole> getProvidedrole();

} // AConnecteurComposant
