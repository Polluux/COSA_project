/**
 */
package cOSA_m1;

import cOSA.AComposantConnecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Rpc Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.ServerRpcAttachment#getTo <em>To</em>}</li>
 *   <li>{@link cOSA_m1.ServerRpcAttachment#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getServerRpcAttachment()
 * @model
 * @generated
 */
public interface ServerRpcAttachment extends AComposantConnecteur {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ServeurOutRole)
	 * @see cOSA_m1.COSA_m1Package#getServerRpcAttachment_To()
	 * @model required="true"
	 * @generated
	 */
	ServeurOutRole getTo();

	/**
	 * Sets the value of the '{@link cOSA_m1.ServerRpcAttachment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ServeurOutRole value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ServerOuput)
	 * @see cOSA_m1.COSA_m1Package#getServerRpcAttachment_From()
	 * @model required="true"
	 * @generated
	 */
	ServerOuput getFrom();

	/**
	 * Sets the value of the '{@link cOSA_m1.ServerRpcAttachment#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ServerOuput value);

} // ServerRpcAttachment
