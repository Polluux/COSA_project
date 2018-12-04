/**
 */
package cOSA_m1.impl;

import cOSA.impl.ConfigurationImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.CSConf;
import cOSA_m1.CSQueryPorts;
import cOSA_m1.CSResponsePorts;
import cOSA_m1.Client;
import cOSA_m1.ClientRpcAttachment;
import cOSA_m1.InputBindings;
import cOSA_m1.OutputBindings;
import cOSA_m1.RPC;
import cOSA_m1.RpcClientAttachment;
import cOSA_m1.RpcServerAttachment;
import cOSA_m1.Server;
import cOSA_m1.ServerRpcAttachment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getCsqueryports <em>Csqueryports</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getCsresponseports <em>Csresponseports</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getRpcs <em>Rpcs</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getClientrpcattachment <em>Clientrpcattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getRpcclientattachment <em>Rpcclientattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getOutputbindings <em>Outputbindings</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getInputbindings <em>Inputbindings</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getServerrpcattachment <em>Serverrpcattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getRpcserverattachment <em>Rpcserverattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSConfImpl#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSConfImpl extends ConfigurationImpl implements CSConf {
	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * The cached value of the '{@link #getCsqueryports() <em>Csqueryports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsqueryports()
	 * @generated
	 * @ordered
	 */
	protected EList<CSQueryPorts> csqueryports;

	/**
	 * The cached value of the '{@link #getCsresponseports() <em>Csresponseports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsresponseports()
	 * @generated
	 * @ordered
	 */
	protected EList<CSResponsePorts> csresponseports;

	/**
	 * The cached value of the '{@link #getRpcs() <em>Rpcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpcs()
	 * @generated
	 * @ordered
	 */
	protected EList<RPC> rpcs;

	/**
	 * The cached value of the '{@link #getClientrpcattachment() <em>Clientrpcattachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientrpcattachment()
	 * @generated
	 * @ordered
	 */
	protected EList<ClientRpcAttachment> clientrpcattachment;

	/**
	 * The cached value of the '{@link #getRpcclientattachment() <em>Rpcclientattachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpcclientattachment()
	 * @generated
	 * @ordered
	 */
	protected EList<RpcClientAttachment> rpcclientattachment;

	/**
	 * The cached value of the '{@link #getOutputbindings() <em>Outputbindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputbindings()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputBindings> outputbindings;

	/**
	 * The cached value of the '{@link #getInputbindings() <em>Inputbindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputbindings()
	 * @generated
	 * @ordered
	 */
	protected EList<InputBindings> inputbindings;

	/**
	 * The cached value of the '{@link #getServerrpcattachment() <em>Serverrpcattachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerrpcattachment()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerRpcAttachment> serverrpcattachment;

	/**
	 * The cached value of the '{@link #getRpcserverattachment() <em>Rpcserverattachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpcserverattachment()
	 * @generated
	 * @ordered
	 */
	protected EList<RpcServerAttachment> rpcserverattachment;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CS_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList<Client>(Client.class, this, COSA_m1Package.CS_CONF__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSQueryPorts> getCsqueryports() {
		if (csqueryports == null) {
			csqueryports = new EObjectContainmentEList<CSQueryPorts>(CSQueryPorts.class, this, COSA_m1Package.CS_CONF__CSQUERYPORTS);
		}
		return csqueryports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSResponsePorts> getCsresponseports() {
		if (csresponseports == null) {
			csresponseports = new EObjectContainmentEList<CSResponsePorts>(CSResponsePorts.class, this, COSA_m1Package.CS_CONF__CSRESPONSEPORTS);
		}
		return csresponseports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RPC> getRpcs() {
		if (rpcs == null) {
			rpcs = new EObjectContainmentEList<RPC>(RPC.class, this, COSA_m1Package.CS_CONF__RPCS);
		}
		return rpcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClientRpcAttachment> getClientrpcattachment() {
		if (clientrpcattachment == null) {
			clientrpcattachment = new EObjectContainmentEList<ClientRpcAttachment>(ClientRpcAttachment.class, this, COSA_m1Package.CS_CONF__CLIENTRPCATTACHMENT);
		}
		return clientrpcattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RpcClientAttachment> getRpcclientattachment() {
		if (rpcclientattachment == null) {
			rpcclientattachment = new EObjectContainmentEList<RpcClientAttachment>(RpcClientAttachment.class, this, COSA_m1Package.CS_CONF__RPCCLIENTATTACHMENT);
		}
		return rpcclientattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputBindings> getOutputbindings() {
		if (outputbindings == null) {
			outputbindings = new EObjectContainmentEList<OutputBindings>(OutputBindings.class, this, COSA_m1Package.CS_CONF__OUTPUTBINDINGS);
		}
		return outputbindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputBindings> getInputbindings() {
		if (inputbindings == null) {
			inputbindings = new EObjectContainmentEList<InputBindings>(InputBindings.class, this, COSA_m1Package.CS_CONF__INPUTBINDINGS);
		}
		return inputbindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerRpcAttachment> getServerrpcattachment() {
		if (serverrpcattachment == null) {
			serverrpcattachment = new EObjectContainmentEList<ServerRpcAttachment>(ServerRpcAttachment.class, this, COSA_m1Package.CS_CONF__SERVERRPCATTACHMENT);
		}
		return serverrpcattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RpcServerAttachment> getRpcserverattachment() {
		if (rpcserverattachment == null) {
			rpcserverattachment = new EObjectContainmentEList<RpcServerAttachment>(RpcServerAttachment.class, this, COSA_m1Package.CS_CONF__RPCSERVERATTACHMENT);
		}
		return rpcserverattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(Server newServer, NotificationChain msgs) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CS_CONF__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CS_CONF__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CS_CONF__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CS_CONF__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.CS_CONF__CLIENTS:
				return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__CSQUERYPORTS:
				return ((InternalEList<?>)getCsqueryports()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__CSRESPONSEPORTS:
				return ((InternalEList<?>)getCsresponseports()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__RPCS:
				return ((InternalEList<?>)getRpcs()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__CLIENTRPCATTACHMENT:
				return ((InternalEList<?>)getClientrpcattachment()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__RPCCLIENTATTACHMENT:
				return ((InternalEList<?>)getRpcclientattachment()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__OUTPUTBINDINGS:
				return ((InternalEList<?>)getOutputbindings()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__INPUTBINDINGS:
				return ((InternalEList<?>)getInputbindings()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__SERVERRPCATTACHMENT:
				return ((InternalEList<?>)getServerrpcattachment()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__RPCSERVERATTACHMENT:
				return ((InternalEList<?>)getRpcserverattachment()).basicRemove(otherEnd, msgs);
			case COSA_m1Package.CS_CONF__SERVER:
				return basicSetServer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.CS_CONF__CLIENTS:
				return getClients();
			case COSA_m1Package.CS_CONF__CSQUERYPORTS:
				return getCsqueryports();
			case COSA_m1Package.CS_CONF__CSRESPONSEPORTS:
				return getCsresponseports();
			case COSA_m1Package.CS_CONF__RPCS:
				return getRpcs();
			case COSA_m1Package.CS_CONF__CLIENTRPCATTACHMENT:
				return getClientrpcattachment();
			case COSA_m1Package.CS_CONF__RPCCLIENTATTACHMENT:
				return getRpcclientattachment();
			case COSA_m1Package.CS_CONF__OUTPUTBINDINGS:
				return getOutputbindings();
			case COSA_m1Package.CS_CONF__INPUTBINDINGS:
				return getInputbindings();
			case COSA_m1Package.CS_CONF__SERVERRPCATTACHMENT:
				return getServerrpcattachment();
			case COSA_m1Package.CS_CONF__RPCSERVERATTACHMENT:
				return getRpcserverattachment();
			case COSA_m1Package.CS_CONF__SERVER:
				return getServer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSA_m1Package.CS_CONF__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends Client>)newValue);
				return;
			case COSA_m1Package.CS_CONF__CSQUERYPORTS:
				getCsqueryports().clear();
				getCsqueryports().addAll((Collection<? extends CSQueryPorts>)newValue);
				return;
			case COSA_m1Package.CS_CONF__CSRESPONSEPORTS:
				getCsresponseports().clear();
				getCsresponseports().addAll((Collection<? extends CSResponsePorts>)newValue);
				return;
			case COSA_m1Package.CS_CONF__RPCS:
				getRpcs().clear();
				getRpcs().addAll((Collection<? extends RPC>)newValue);
				return;
			case COSA_m1Package.CS_CONF__CLIENTRPCATTACHMENT:
				getClientrpcattachment().clear();
				getClientrpcattachment().addAll((Collection<? extends ClientRpcAttachment>)newValue);
				return;
			case COSA_m1Package.CS_CONF__RPCCLIENTATTACHMENT:
				getRpcclientattachment().clear();
				getRpcclientattachment().addAll((Collection<? extends RpcClientAttachment>)newValue);
				return;
			case COSA_m1Package.CS_CONF__OUTPUTBINDINGS:
				getOutputbindings().clear();
				getOutputbindings().addAll((Collection<? extends OutputBindings>)newValue);
				return;
			case COSA_m1Package.CS_CONF__INPUTBINDINGS:
				getInputbindings().clear();
				getInputbindings().addAll((Collection<? extends InputBindings>)newValue);
				return;
			case COSA_m1Package.CS_CONF__SERVERRPCATTACHMENT:
				getServerrpcattachment().clear();
				getServerrpcattachment().addAll((Collection<? extends ServerRpcAttachment>)newValue);
				return;
			case COSA_m1Package.CS_CONF__RPCSERVERATTACHMENT:
				getRpcserverattachment().clear();
				getRpcserverattachment().addAll((Collection<? extends RpcServerAttachment>)newValue);
				return;
			case COSA_m1Package.CS_CONF__SERVER:
				setServer((Server)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case COSA_m1Package.CS_CONF__CLIENTS:
				getClients().clear();
				return;
			case COSA_m1Package.CS_CONF__CSQUERYPORTS:
				getCsqueryports().clear();
				return;
			case COSA_m1Package.CS_CONF__CSRESPONSEPORTS:
				getCsresponseports().clear();
				return;
			case COSA_m1Package.CS_CONF__RPCS:
				getRpcs().clear();
				return;
			case COSA_m1Package.CS_CONF__CLIENTRPCATTACHMENT:
				getClientrpcattachment().clear();
				return;
			case COSA_m1Package.CS_CONF__RPCCLIENTATTACHMENT:
				getRpcclientattachment().clear();
				return;
			case COSA_m1Package.CS_CONF__OUTPUTBINDINGS:
				getOutputbindings().clear();
				return;
			case COSA_m1Package.CS_CONF__INPUTBINDINGS:
				getInputbindings().clear();
				return;
			case COSA_m1Package.CS_CONF__SERVERRPCATTACHMENT:
				getServerrpcattachment().clear();
				return;
			case COSA_m1Package.CS_CONF__RPCSERVERATTACHMENT:
				getRpcserverattachment().clear();
				return;
			case COSA_m1Package.CS_CONF__SERVER:
				setServer((Server)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case COSA_m1Package.CS_CONF__CLIENTS:
				return clients != null && !clients.isEmpty();
			case COSA_m1Package.CS_CONF__CSQUERYPORTS:
				return csqueryports != null && !csqueryports.isEmpty();
			case COSA_m1Package.CS_CONF__CSRESPONSEPORTS:
				return csresponseports != null && !csresponseports.isEmpty();
			case COSA_m1Package.CS_CONF__RPCS:
				return rpcs != null && !rpcs.isEmpty();
			case COSA_m1Package.CS_CONF__CLIENTRPCATTACHMENT:
				return clientrpcattachment != null && !clientrpcattachment.isEmpty();
			case COSA_m1Package.CS_CONF__RPCCLIENTATTACHMENT:
				return rpcclientattachment != null && !rpcclientattachment.isEmpty();
			case COSA_m1Package.CS_CONF__OUTPUTBINDINGS:
				return outputbindings != null && !outputbindings.isEmpty();
			case COSA_m1Package.CS_CONF__INPUTBINDINGS:
				return inputbindings != null && !inputbindings.isEmpty();
			case COSA_m1Package.CS_CONF__SERVERRPCATTACHMENT:
				return serverrpcattachment != null && !serverrpcattachment.isEmpty();
			case COSA_m1Package.CS_CONF__RPCSERVERATTACHMENT:
				return rpcserverattachment != null && !rpcserverattachment.isEmpty();
			case COSA_m1Package.CS_CONF__SERVER:
				return server != null;
		}
		return super.eIsSet(featureID);
	}

} //CSConfImpl
