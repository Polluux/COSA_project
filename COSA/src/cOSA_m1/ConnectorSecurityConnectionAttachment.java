/**
 */
package cOSA_m1;

import cOSA.AConnecteurComposant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Security Connection Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.ConnectorSecurityConnectionAttachment#getTo <em>To</em>}</li>
 *   <li>{@link cOSA_m1.ConnectorSecurityConnectionAttachment#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getConnectorSecurityConnectionAttachment()
 * @model
 * @generated
 */
public interface ConnectorSecurityConnectionAttachment extends AConnecteurComposant {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ConnectionInputFromSecurityPort)
	 * @see cOSA_m1.COSA_m1Package#getConnectorSecurityConnectionAttachment_To()
	 * @model required="true"
	 * @generated
	 */
	ConnectionInputFromSecurityPort getTo();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectorSecurityConnectionAttachment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ConnectionInputFromSecurityPort value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SecurityConnectionOutRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectorSecurityConnectionAttachment_From()
	 * @model required="true"
	 * @generated
	 */
	SecurityConnectionOutRole getFrom();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectorSecurityConnectionAttachment#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SecurityConnectionOutRole value);

} // ConnectorSecurityConnectionAttachment
