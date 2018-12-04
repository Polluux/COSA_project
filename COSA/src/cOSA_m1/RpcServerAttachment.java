/**
 */
package cOSA_m1;

import cOSA.AConnecteurComposant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rpc Server Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.RpcServerAttachment#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.RpcServerAttachment#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getRpcServerAttachment()
 * @model
 * @generated
 */
public interface RpcServerAttachment extends AConnecteurComposant {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ServerInRole)
	 * @see cOSA_m1.COSA_m1Package#getRpcServerAttachment_From()
	 * @model required="true"
	 * @generated
	 */
	ServerInRole getFrom();

	/**
	 * Sets the value of the '{@link cOSA_m1.RpcServerAttachment#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ServerInRole value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ServerInput)
	 * @see cOSA_m1.COSA_m1Package#getRpcServerAttachment_To()
	 * @model required="true"
	 * @generated
	 */
	ServerInput getTo();

	/**
	 * Sets the value of the '{@link cOSA_m1.RpcServerAttachment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ServerInput value);

} // RpcServerAttachment
