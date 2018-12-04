/**
 */
package cOSA_m1;

import cOSA.AConnecteurComposant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Connection Security Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.ConnectorConnectionSecurityAttachment#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.ConnectorConnectionSecurityAttachment#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getConnectorConnectionSecurityAttachment()
 * @model
 * @generated
 */
public interface ConnectorConnectionSecurityAttachment extends AConnecteurComposant {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ConnectionSecurityOutRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectorConnectionSecurityAttachment_From()
	 * @model required="true"
	 * @generated
	 */
	ConnectionSecurityOutRole getFrom();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectorConnectionSecurityAttachment#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ConnectionSecurityOutRole value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(SecurityInputFromConnectionPort)
	 * @see cOSA_m1.COSA_m1Package#getConnectorConnectionSecurityAttachment_To()
	 * @model required="true"
	 * @generated
	 */
	SecurityInputFromConnectionPort getTo();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectorConnectionSecurityAttachment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SecurityInputFromConnectionPort value);

} // ConnectorConnectionSecurityAttachment
