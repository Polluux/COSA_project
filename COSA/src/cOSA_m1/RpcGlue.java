/**
 */
package cOSA_m1;

import cOSA.Glue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rpc Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.RpcGlue#getClientout <em>Clientout</em>}</li>
 *   <li>{@link cOSA_m1.RpcGlue#getClientin <em>Clientin</em>}</li>
 *   <li>{@link cOSA_m1.RpcGlue#getServerin <em>Serverin</em>}</li>
 *   <li>{@link cOSA_m1.RpcGlue#getServeurout <em>Serveurout</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getRpcGlue()
 * @model
 * @generated
 */
public interface RpcGlue extends Glue {
	/**
	 * Returns the value of the '<em><b>Clientout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientout</em>' reference.
	 * @see #setClientout(ClientOutRole)
	 * @see cOSA_m1.COSA_m1Package#getRpcGlue_Clientout()
	 * @model required="true"
	 * @generated
	 */
	ClientOutRole getClientout();

	/**
	 * Sets the value of the '{@link cOSA_m1.RpcGlue#getClientout <em>Clientout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clientout</em>' reference.
	 * @see #getClientout()
	 * @generated
	 */
	void setClientout(ClientOutRole value);

	/**
	 * Returns the value of the '<em><b>Clientin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientin</em>' reference.
	 * @see #setClientin(ClientInRole)
	 * @see cOSA_m1.COSA_m1Package#getRpcGlue_Clientin()
	 * @model required="true"
	 * @generated
	 */
	ClientInRole getClientin();

	/**
	 * Sets the value of the '{@link cOSA_m1.RpcGlue#getClientin <em>Clientin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clientin</em>' reference.
	 * @see #getClientin()
	 * @generated
	 */
	void setClientin(ClientInRole value);

	/**
	 * Returns the value of the '<em><b>Serverin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverin</em>' reference.
	 * @see #setServerin(ServerInRole)
	 * @see cOSA_m1.COSA_m1Package#getRpcGlue_Serverin()
	 * @model required="true"
	 * @generated
	 */
	ServerInRole getServerin();

	/**
	 * Sets the value of the '{@link cOSA_m1.RpcGlue#getServerin <em>Serverin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverin</em>' reference.
	 * @see #getServerin()
	 * @generated
	 */
	void setServerin(ServerInRole value);

	/**
	 * Returns the value of the '<em><b>Serveurout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveurout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveurout</em>' reference.
	 * @see #setServeurout(ServeurOutRole)
	 * @see cOSA_m1.COSA_m1Package#getRpcGlue_Serveurout()
	 * @model required="true"
	 * @generated
	 */
	ServeurOutRole getServeurout();

	/**
	 * Sets the value of the '{@link cOSA_m1.RpcGlue#getServeurout <em>Serveurout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveurout</em>' reference.
	 * @see #getServeurout()
	 * @generated
	 */
	void setServeurout(ServeurOutRole value);

} // RpcGlue
