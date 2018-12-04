/**
 */
package cOSA_m1;

import cOSA.Connecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Security Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityinrole <em>Connectionsecurityinrole</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionSecurityConnector#getSecurityconnectionoutrole <em>Securityconnectionoutrole</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityoutrole <em>Connectionsecurityoutrole</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionSecurityConnector#getSecurityconnectioninrole <em>Securityconnectioninrole</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getConnectionSecurityConnector()
 * @model
 * @generated
 */
public interface ConnectionSecurityConnector extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Connectionsecurityinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionsecurityinrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionsecurityinrole</em>' containment reference.
	 * @see #setConnectionsecurityinrole(ConnectionSecurityInRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionSecurityConnector_Connectionsecurityinrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionSecurityInRole getConnectionsecurityinrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityinrole <em>Connectionsecurityinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionsecurityinrole</em>' containment reference.
	 * @see #getConnectionsecurityinrole()
	 * @generated
	 */
	void setConnectionsecurityinrole(ConnectionSecurityInRole value);

	/**
	 * Returns the value of the '<em><b>Securityconnectionoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityconnectionoutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityconnectionoutrole</em>' containment reference.
	 * @see #setSecurityconnectionoutrole(SecurityConnectionOutRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionSecurityConnector_Securityconnectionoutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityConnectionOutRole getSecurityconnectionoutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionSecurityConnector#getSecurityconnectionoutrole <em>Securityconnectionoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityconnectionoutrole</em>' containment reference.
	 * @see #getSecurityconnectionoutrole()
	 * @generated
	 */
	void setSecurityconnectionoutrole(SecurityConnectionOutRole value);

	/**
	 * Returns the value of the '<em><b>Connectionsecurityoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionsecurityoutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionsecurityoutrole</em>' containment reference.
	 * @see #setConnectionsecurityoutrole(ConnectionSecurityOutRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionSecurityConnector_Connectionsecurityoutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionSecurityOutRole getConnectionsecurityoutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityoutrole <em>Connectionsecurityoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionsecurityoutrole</em>' containment reference.
	 * @see #getConnectionsecurityoutrole()
	 * @generated
	 */
	void setConnectionsecurityoutrole(ConnectionSecurityOutRole value);

	/**
	 * Returns the value of the '<em><b>Securityconnectioninrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityconnectioninrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityconnectioninrole</em>' containment reference.
	 * @see #setSecurityconnectioninrole(SecurityConnectionInRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionSecurityConnector_Securityconnectioninrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityConnectionInRole getSecurityconnectioninrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionSecurityConnector#getSecurityconnectioninrole <em>Securityconnectioninrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityconnectioninrole</em>' containment reference.
	 * @see #getSecurityconnectioninrole()
	 * @generated
	 */
	void setSecurityconnectioninrole(SecurityConnectionInRole value);

} // ConnectionSecurityConnector
