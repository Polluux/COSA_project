/**
 */
package cOSA_m1;

import cOSA.Composant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.SecurityManager#getSecurityinputfromconnectionport <em>Securityinputfromconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.SecurityManager#getSecurityouputtoconnectionport <em>Securityouputtoconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.SecurityManager#getSecurityoutputtodatabaseport <em>Securityoutputtodatabaseport</em>}</li>
 *   <li>{@link cOSA_m1.SecurityManager#getSecurityinputfromdatabaseport <em>Securityinputfromdatabaseport</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getSecurityManager()
 * @model
 * @generated
 */
public interface SecurityManager extends Composant {
	/**
	 * Returns the value of the '<em><b>Securityinputfromconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityinputfromconnectionport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityinputfromconnectionport</em>' containment reference.
	 * @see #setSecurityinputfromconnectionport(SecurityInputFromConnectionPort)
	 * @see cOSA_m1.COSA_m1Package#getSecurityManager_Securityinputfromconnectionport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityInputFromConnectionPort getSecurityinputfromconnectionport();

	/**
	 * Sets the value of the '{@link cOSA_m1.SecurityManager#getSecurityinputfromconnectionport <em>Securityinputfromconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityinputfromconnectionport</em>' containment reference.
	 * @see #getSecurityinputfromconnectionport()
	 * @generated
	 */
	void setSecurityinputfromconnectionport(SecurityInputFromConnectionPort value);

	/**
	 * Returns the value of the '<em><b>Securityouputtoconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityouputtoconnectionport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityouputtoconnectionport</em>' containment reference.
	 * @see #setSecurityouputtoconnectionport(SecurityOuputToConnectionPort)
	 * @see cOSA_m1.COSA_m1Package#getSecurityManager_Securityouputtoconnectionport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityOuputToConnectionPort getSecurityouputtoconnectionport();

	/**
	 * Sets the value of the '{@link cOSA_m1.SecurityManager#getSecurityouputtoconnectionport <em>Securityouputtoconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityouputtoconnectionport</em>' containment reference.
	 * @see #getSecurityouputtoconnectionport()
	 * @generated
	 */
	void setSecurityouputtoconnectionport(SecurityOuputToConnectionPort value);

	/**
	 * Returns the value of the '<em><b>Securityoutputtodatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityoutputtodatabaseport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityoutputtodatabaseport</em>' containment reference.
	 * @see #setSecurityoutputtodatabaseport(SecurityOutputToDatabasePort)
	 * @see cOSA_m1.COSA_m1Package#getSecurityManager_Securityoutputtodatabaseport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityOutputToDatabasePort getSecurityoutputtodatabaseport();

	/**
	 * Sets the value of the '{@link cOSA_m1.SecurityManager#getSecurityoutputtodatabaseport <em>Securityoutputtodatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityoutputtodatabaseport</em>' containment reference.
	 * @see #getSecurityoutputtodatabaseport()
	 * @generated
	 */
	void setSecurityoutputtodatabaseport(SecurityOutputToDatabasePort value);

	/**
	 * Returns the value of the '<em><b>Securityinputfromdatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityinputfromdatabaseport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityinputfromdatabaseport</em>' containment reference.
	 * @see #setSecurityinputfromdatabaseport(SecurityInputFromDatabasePort)
	 * @see cOSA_m1.COSA_m1Package#getSecurityManager_Securityinputfromdatabaseport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityInputFromDatabasePort getSecurityinputfromdatabaseport();

	/**
	 * Sets the value of the '{@link cOSA_m1.SecurityManager#getSecurityinputfromdatabaseport <em>Securityinputfromdatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityinputfromdatabaseport</em>' containment reference.
	 * @see #getSecurityinputfromdatabaseport()
	 * @generated
	 */
	void setSecurityinputfromdatabaseport(SecurityInputFromDatabasePort value);

} // SecurityManager
