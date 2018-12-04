/**
 */
package cOSA_m1;

import cOSA.Connecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.RPC#getClientoutrole <em>Clientoutrole</em>}</li>
 *   <li>{@link cOSA_m1.RPC#getClientinrole <em>Clientinrole</em>}</li>
 *   <li>{@link cOSA_m1.RPC#getServerinrole <em>Serverinrole</em>}</li>
 *   <li>{@link cOSA_m1.RPC#getServeuroutrole <em>Serveuroutrole</em>}</li>
 *   <li>{@link cOSA_m1.RPC#getRpcglue <em>Rpcglue</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getRPC()
 * @model
 * @generated
 */
public interface RPC extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Clientoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientoutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientoutrole</em>' containment reference.
	 * @see #setClientoutrole(ClientOutRole)
	 * @see cOSA_m1.COSA_m1Package#getRPC_Clientoutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClientOutRole getClientoutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.RPC#getClientoutrole <em>Clientoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clientoutrole</em>' containment reference.
	 * @see #getClientoutrole()
	 * @generated
	 */
	void setClientoutrole(ClientOutRole value);

	/**
	 * Returns the value of the '<em><b>Clientinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientinrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientinrole</em>' containment reference.
	 * @see #setClientinrole(ClientInRole)
	 * @see cOSA_m1.COSA_m1Package#getRPC_Clientinrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClientInRole getClientinrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.RPC#getClientinrole <em>Clientinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clientinrole</em>' containment reference.
	 * @see #getClientinrole()
	 * @generated
	 */
	void setClientinrole(ClientInRole value);

	/**
	 * Returns the value of the '<em><b>Serverinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverinrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverinrole</em>' containment reference.
	 * @see #setServerinrole(ServerInRole)
	 * @see cOSA_m1.COSA_m1Package#getRPC_Serverinrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServerInRole getServerinrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.RPC#getServerinrole <em>Serverinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverinrole</em>' containment reference.
	 * @see #getServerinrole()
	 * @generated
	 */
	void setServerinrole(ServerInRole value);

	/**
	 * Returns the value of the '<em><b>Serveuroutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveuroutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveuroutrole</em>' containment reference.
	 * @see #setServeuroutrole(ServeurOutRole)
	 * @see cOSA_m1.COSA_m1Package#getRPC_Serveuroutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServeurOutRole getServeuroutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.RPC#getServeuroutrole <em>Serveuroutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveuroutrole</em>' containment reference.
	 * @see #getServeuroutrole()
	 * @generated
	 */
	void setServeuroutrole(ServeurOutRole value);

	/**
	 * Returns the value of the '<em><b>Rpcglue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpcglue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpcglue</em>' containment reference.
	 * @see #setRpcglue(RpcGlue)
	 * @see cOSA_m1.COSA_m1Package#getRPC_Rpcglue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RpcGlue getRpcglue();

	/**
	 * Sets the value of the '{@link cOSA_m1.RPC#getRpcglue <em>Rpcglue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpcglue</em>' containment reference.
	 * @see #getRpcglue()
	 * @generated
	 */
	void setRpcglue(RpcGlue value);

} // RPC
