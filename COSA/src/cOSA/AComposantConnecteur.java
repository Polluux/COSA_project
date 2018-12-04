/**
 */
package cOSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AComposant Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.AComposantConnecteur#getProvidedport <em>Providedport</em>}</li>
 *   <li>{@link cOSA.AComposantConnecteur#getProvidedservice <em>Providedservice</em>}</li>
 *   <li>{@link cOSA.AComposantConnecteur#getRequiredrole <em>Requiredrole</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getAComposantConnecteur()
 * @model
 * @generated
 */
public interface AComposantConnecteur extends Attachement {
	/**
	 * Returns the value of the '<em><b>Providedport</b></em>' reference list.
	 * The list contents are of type {@link cOSA.ProvidedPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedport</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedport</em>' reference list.
	 * @see cOSA.COSAPackage#getAComposantConnecteur_Providedport()
	 * @model
	 * @generated
	 */
	EList<ProvidedPort> getProvidedport();

	/**
	 * Returns the value of the '<em><b>Providedservice</b></em>' reference list.
	 * The list contents are of type {@link cOSA.ProvidedService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedservice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedservice</em>' reference list.
	 * @see cOSA.COSAPackage#getAComposantConnecteur_Providedservice()
	 * @model
	 * @generated
	 */
	EList<ProvidedService> getProvidedservice();

	/**
	 * Returns the value of the '<em><b>Requiredrole</b></em>' reference list.
	 * The list contents are of type {@link cOSA.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredrole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredrole</em>' reference list.
	 * @see cOSA.COSAPackage#getAComposantConnecteur_Requiredrole()
	 * @model
	 * @generated
	 */
	EList<RequiredRole> getRequiredrole();

} // AComposantConnecteur
