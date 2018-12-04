/**
 */
package cOSA_m1.impl;

import cOSA.impl.ConnecteurImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ClientInRole;
import cOSA_m1.ClientOutRole;
import cOSA_m1.RPC;
import cOSA_m1.RpcGlue;
import cOSA_m1.ServerInRole;
import cOSA_m1.ServeurOutRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.RPCImpl#getClientoutrole <em>Clientoutrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.RPCImpl#getClientinrole <em>Clientinrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.RPCImpl#getServerinrole <em>Serverinrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.RPCImpl#getServeuroutrole <em>Serveuroutrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.RPCImpl#getRpcglue <em>Rpcglue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCImpl extends ConnecteurImpl implements RPC {
	/**
	 * The cached value of the '{@link #getClientoutrole() <em>Clientoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientoutrole()
	 * @generated
	 * @ordered
	 */
	protected ClientOutRole clientoutrole;

	/**
	 * The cached value of the '{@link #getClientinrole() <em>Clientinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientinrole()
	 * @generated
	 * @ordered
	 */
	protected ClientInRole clientinrole;

	/**
	 * The cached value of the '{@link #getServerinrole() <em>Serverinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerinrole()
	 * @generated
	 * @ordered
	 */
	protected ServerInRole serverinrole;

	/**
	 * The cached value of the '{@link #getServeuroutrole() <em>Serveuroutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeuroutrole()
	 * @generated
	 * @ordered
	 */
	protected ServeurOutRole serveuroutrole;

	/**
	 * The cached value of the '{@link #getRpcglue() <em>Rpcglue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpcglue()
	 * @generated
	 * @ordered
	 */
	protected RpcGlue rpcglue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCImpl() {
		super();
	}
	
	@Override
	public void init() {
		if(clientoutrole != null && serverinrole != null) {
			clientoutrole.startBeingObservedBy(serverinrole, rpcglue, 0);
		}
		if(serveuroutrole != null && clientinrole != null) {
			serveuroutrole.startBeingObservedBy(clientinrole, rpcglue, 1);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientOutRole getClientoutrole() {
		return clientoutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientoutrole(ClientOutRole newClientoutrole, NotificationChain msgs) {
		ClientOutRole oldClientoutrole = clientoutrole;
		clientoutrole = newClientoutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__CLIENTOUTROLE, oldClientoutrole, newClientoutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientoutrole(ClientOutRole newClientoutrole) {
		if (newClientoutrole != clientoutrole) {
			NotificationChain msgs = null;
			if (clientoutrole != null)
				msgs = ((InternalEObject)clientoutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__CLIENTOUTROLE, null, msgs);
			if (newClientoutrole != null)
				msgs = ((InternalEObject)newClientoutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__CLIENTOUTROLE, null, msgs);
			msgs = basicSetClientoutrole(newClientoutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__CLIENTOUTROLE, newClientoutrole, newClientoutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientInRole getClientinrole() {
		return clientinrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientinrole(ClientInRole newClientinrole, NotificationChain msgs) {
		ClientInRole oldClientinrole = clientinrole;
		clientinrole = newClientinrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__CLIENTINROLE, oldClientinrole, newClientinrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientinrole(ClientInRole newClientinrole) {
		if (newClientinrole != clientinrole) {
			NotificationChain msgs = null;
			if (clientinrole != null)
				msgs = ((InternalEObject)clientinrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__CLIENTINROLE, null, msgs);
			if (newClientinrole != null)
				msgs = ((InternalEObject)newClientinrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__CLIENTINROLE, null, msgs);
			msgs = basicSetClientinrole(newClientinrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__CLIENTINROLE, newClientinrole, newClientinrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInRole getServerinrole() {
		return serverinrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerinrole(ServerInRole newServerinrole, NotificationChain msgs) {
		ServerInRole oldServerinrole = serverinrole;
		serverinrole = newServerinrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__SERVERINROLE, oldServerinrole, newServerinrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerinrole(ServerInRole newServerinrole) {
		if (newServerinrole != serverinrole) {
			NotificationChain msgs = null;
			if (serverinrole != null)
				msgs = ((InternalEObject)serverinrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__SERVERINROLE, null, msgs);
			if (newServerinrole != null)
				msgs = ((InternalEObject)newServerinrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__SERVERINROLE, null, msgs);
			msgs = basicSetServerinrole(newServerinrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__SERVERINROLE, newServerinrole, newServerinrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurOutRole getServeuroutrole() {
		return serveuroutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServeuroutrole(ServeurOutRole newServeuroutrole, NotificationChain msgs) {
		ServeurOutRole oldServeuroutrole = serveuroutrole;
		serveuroutrole = newServeuroutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__SERVEUROUTROLE, oldServeuroutrole, newServeuroutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServeuroutrole(ServeurOutRole newServeuroutrole) {
		if (newServeuroutrole != serveuroutrole) {
			NotificationChain msgs = null;
			if (serveuroutrole != null)
				msgs = ((InternalEObject)serveuroutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__SERVEUROUTROLE, null, msgs);
			if (newServeuroutrole != null)
				msgs = ((InternalEObject)newServeuroutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__SERVEUROUTROLE, null, msgs);
			msgs = basicSetServeuroutrole(newServeuroutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__SERVEUROUTROLE, newServeuroutrole, newServeuroutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpcGlue getRpcglue() {
		return rpcglue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRpcglue(RpcGlue newRpcglue, NotificationChain msgs) {
		RpcGlue oldRpcglue = rpcglue;
		rpcglue = newRpcglue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__RPCGLUE, oldRpcglue, newRpcglue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpcglue(RpcGlue newRpcglue) {
		if (newRpcglue != rpcglue) {
			NotificationChain msgs = null;
			if (rpcglue != null)
				msgs = ((InternalEObject)rpcglue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__RPCGLUE, null, msgs);
			if (newRpcglue != null)
				msgs = ((InternalEObject)newRpcglue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.RPC__RPCGLUE, null, msgs);
			msgs = basicSetRpcglue(newRpcglue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC__RPCGLUE, newRpcglue, newRpcglue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.RPC__CLIENTOUTROLE:
				return basicSetClientoutrole(null, msgs);
			case COSA_m1Package.RPC__CLIENTINROLE:
				return basicSetClientinrole(null, msgs);
			case COSA_m1Package.RPC__SERVERINROLE:
				return basicSetServerinrole(null, msgs);
			case COSA_m1Package.RPC__SERVEUROUTROLE:
				return basicSetServeuroutrole(null, msgs);
			case COSA_m1Package.RPC__RPCGLUE:
				return basicSetRpcglue(null, msgs);
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
			case COSA_m1Package.RPC__CLIENTOUTROLE:
				return getClientoutrole();
			case COSA_m1Package.RPC__CLIENTINROLE:
				return getClientinrole();
			case COSA_m1Package.RPC__SERVERINROLE:
				return getServerinrole();
			case COSA_m1Package.RPC__SERVEUROUTROLE:
				return getServeuroutrole();
			case COSA_m1Package.RPC__RPCGLUE:
				return getRpcglue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSA_m1Package.RPC__CLIENTOUTROLE:
				setClientoutrole((ClientOutRole)newValue);
				return;
			case COSA_m1Package.RPC__CLIENTINROLE:
				setClientinrole((ClientInRole)newValue);
				return;
			case COSA_m1Package.RPC__SERVERINROLE:
				setServerinrole((ServerInRole)newValue);
				return;
			case COSA_m1Package.RPC__SERVEUROUTROLE:
				setServeuroutrole((ServeurOutRole)newValue);
				return;
			case COSA_m1Package.RPC__RPCGLUE:
				setRpcglue((RpcGlue)newValue);
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
			case COSA_m1Package.RPC__CLIENTOUTROLE:
				setClientoutrole((ClientOutRole)null);
				return;
			case COSA_m1Package.RPC__CLIENTINROLE:
				setClientinrole((ClientInRole)null);
				return;
			case COSA_m1Package.RPC__SERVERINROLE:
				setServerinrole((ServerInRole)null);
				return;
			case COSA_m1Package.RPC__SERVEUROUTROLE:
				setServeuroutrole((ServeurOutRole)null);
				return;
			case COSA_m1Package.RPC__RPCGLUE:
				setRpcglue((RpcGlue)null);
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
			case COSA_m1Package.RPC__CLIENTOUTROLE:
				return clientoutrole != null;
			case COSA_m1Package.RPC__CLIENTINROLE:
				return clientinrole != null;
			case COSA_m1Package.RPC__SERVERINROLE:
				return serverinrole != null;
			case COSA_m1Package.RPC__SERVEUROUTROLE:
				return serveuroutrole != null;
			case COSA_m1Package.RPC__RPCGLUE:
				return rpcglue != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCImpl
