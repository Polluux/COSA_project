/**
 */
package cOSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.Connecteur#getInterfaceconnect <em>Interfaceconnect</em>}</li>
 *   <li>{@link cOSA.Connecteur#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getConnecteur()
 * @model
 * @generated
 */
public interface Connecteur extends Element {
	/**
	 * Returns the value of the '<em><b>Interfaceconnect</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA.InterfaceConnect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconnect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconnect</em>' containment reference list.
	 * @see cOSA.COSAPackage#getConnecteur_Interfaceconnect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceConnect> getInterfaceconnect();

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference.
	 * @see #setGlue(Glue)
	 * @see cOSA.COSAPackage#getConnecteur_Glue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link cOSA.Connecteur#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

} // Connecteur
