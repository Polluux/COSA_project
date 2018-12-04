/**
 */
package cOSA_m1;

import cOSA.Configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.CSConf#getClients <em>Clients</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getCsqueryports <em>Csqueryports</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getCsresponseports <em>Csresponseports</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getRpcs <em>Rpcs</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getClientrpcattachment <em>Clientrpcattachment</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getRpcclientattachment <em>Rpcclientattachment</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getOutputbindings <em>Outputbindings</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getInputbindings <em>Inputbindings</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getServerrpcattachment <em>Serverrpcattachment</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getRpcserverattachment <em>Rpcserverattachment</em>}</li>
 *   <li>{@link cOSA_m1.CSConf#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getCSConf()
 * @model
 * @generated
 */
public interface CSConf extends Configuration {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Clients()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Client> getClients();

	/**
	 * Returns the value of the '<em><b>Csqueryports</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.CSQueryPorts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csqueryports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csqueryports</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Csqueryports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CSQueryPorts> getCsqueryports();

	/**
	 * Returns the value of the '<em><b>Csresponseports</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.CSResponsePorts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csresponseports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csresponseports</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Csresponseports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CSResponsePorts> getCsresponseports();

	/**
	 * Returns the value of the '<em><b>Rpcs</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.RPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpcs</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Rpcs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RPC> getRpcs();

	/**
	 * Returns the value of the '<em><b>Clientrpcattachment</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.ClientRpcAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientrpcattachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientrpcattachment</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Clientrpcattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClientRpcAttachment> getClientrpcattachment();

	/**
	 * Returns the value of the '<em><b>Rpcclientattachment</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.RpcClientAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpcclientattachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpcclientattachment</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Rpcclientattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RpcClientAttachment> getRpcclientattachment();

	/**
	 * Returns the value of the '<em><b>Outputbindings</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.OutputBindings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputbindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputbindings</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Outputbindings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputBindings> getOutputbindings();

	/**
	 * Returns the value of the '<em><b>Inputbindings</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.InputBindings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputbindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputbindings</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Inputbindings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputBindings> getInputbindings();

	/**
	 * Returns the value of the '<em><b>Serverrpcattachment</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.ServerRpcAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverrpcattachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverrpcattachment</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Serverrpcattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServerRpcAttachment> getServerrpcattachment();

	/**
	 * Returns the value of the '<em><b>Rpcserverattachment</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA_m1.RpcServerAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpcserverattachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpcserverattachment</em>' containment reference list.
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Rpcserverattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RpcServerAttachment> getRpcserverattachment();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(Server)
	 * @see cOSA_m1.COSA_m1Package#getCSConf_Server()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link cOSA_m1.CSConf#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

} // CSConf
