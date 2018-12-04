/**
 */
package cOSA_m1;

import cOSA.Composant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.ConnectionManager#getServerconfiginput <em>Serverconfiginput</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionManager#getServerconfigoutput <em>Serverconfigoutput</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionManager#getConnectionoutputtosecurityport <em>Connectionoutputtosecurityport</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionManager#getConnectioninputfromsecurityport <em>Connectioninputfromsecurityport</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionManager#getConnectioninputfromdatabaseport <em>Connectioninputfromdatabaseport</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionManager#getConnectionouputtodatabaseport <em>Connectionouputtodatabaseport</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getConnectionManager()
 * @model
 * @generated
 */
public interface ConnectionManager extends Composant {
	/**
	 * Returns the value of the '<em><b>Serverconfiginput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverconfiginput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverconfiginput</em>' containment reference.
	 * @see #setServerconfiginput(ServerConfigInput)
	 * @see cOSA_m1.COSA_m1Package#getConnectionManager_Serverconfiginput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServerConfigInput getServerconfiginput();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionManager#getServerconfiginput <em>Serverconfiginput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverconfiginput</em>' containment reference.
	 * @see #getServerconfiginput()
	 * @generated
	 */
	void setServerconfiginput(ServerConfigInput value);

	/**
	 * Returns the value of the '<em><b>Serverconfigoutput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverconfigoutput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverconfigoutput</em>' containment reference.
	 * @see #setServerconfigoutput(ServerConfigOutput)
	 * @see cOSA_m1.COSA_m1Package#getConnectionManager_Serverconfigoutput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServerConfigOutput getServerconfigoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionManager#getServerconfigoutput <em>Serverconfigoutput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverconfigoutput</em>' containment reference.
	 * @see #getServerconfigoutput()
	 * @generated
	 */
	void setServerconfigoutput(ServerConfigOutput value);

	/**
	 * Returns the value of the '<em><b>Connectionoutputtosecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionoutputtosecurityport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionoutputtosecurityport</em>' containment reference.
	 * @see #setConnectionoutputtosecurityport(ConnectionOutputToSecurityPort)
	 * @see cOSA_m1.COSA_m1Package#getConnectionManager_Connectionoutputtosecurityport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionOutputToSecurityPort getConnectionoutputtosecurityport();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionManager#getConnectionoutputtosecurityport <em>Connectionoutputtosecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionoutputtosecurityport</em>' containment reference.
	 * @see #getConnectionoutputtosecurityport()
	 * @generated
	 */
	void setConnectionoutputtosecurityport(ConnectionOutputToSecurityPort value);

	/**
	 * Returns the value of the '<em><b>Connectioninputfromsecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectioninputfromsecurityport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectioninputfromsecurityport</em>' containment reference.
	 * @see #setConnectioninputfromsecurityport(ConnectionInputFromSecurityPort)
	 * @see cOSA_m1.COSA_m1Package#getConnectionManager_Connectioninputfromsecurityport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionInputFromSecurityPort getConnectioninputfromsecurityport();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionManager#getConnectioninputfromsecurityport <em>Connectioninputfromsecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectioninputfromsecurityport</em>' containment reference.
	 * @see #getConnectioninputfromsecurityport()
	 * @generated
	 */
	void setConnectioninputfromsecurityport(ConnectionInputFromSecurityPort value);

	/**
	 * Returns the value of the '<em><b>Connectioninputfromdatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectioninputfromdatabaseport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectioninputfromdatabaseport</em>' containment reference.
	 * @see #setConnectioninputfromdatabaseport(ConnectionInputFromDataBasePort)
	 * @see cOSA_m1.COSA_m1Package#getConnectionManager_Connectioninputfromdatabaseport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionInputFromDataBasePort getConnectioninputfromdatabaseport();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionManager#getConnectioninputfromdatabaseport <em>Connectioninputfromdatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectioninputfromdatabaseport</em>' containment reference.
	 * @see #getConnectioninputfromdatabaseport()
	 * @generated
	 */
	void setConnectioninputfromdatabaseport(ConnectionInputFromDataBasePort value);

	/**
	 * Returns the value of the '<em><b>Connectionouputtodatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionouputtodatabaseport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionouputtodatabaseport</em>' containment reference.
	 * @see #setConnectionouputtodatabaseport(ConnectionOuputToDataBasePort)
	 * @see cOSA_m1.COSA_m1Package#getConnectionManager_Connectionouputtodatabaseport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionOuputToDataBasePort getConnectionouputtodatabaseport();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionManager#getConnectionouputtodatabaseport <em>Connectionouputtodatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionouputtodatabaseport</em>' containment reference.
	 * @see #getConnectionouputtodatabaseport()
	 * @generated
	 */
	void setConnectionouputtodatabaseport(ConnectionOuputToDataBasePort value);

} // ConnectionManager
