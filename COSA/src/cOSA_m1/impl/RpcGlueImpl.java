/**
 */
package cOSA_m1.impl;

import cOSA.impl.GlueImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ClientInRole;
import cOSA_m1.ClientOutRole;
import cOSA_m1.RpcGlue;
import cOSA_m1.ServerInRole;
import cOSA_m1.ServeurOutRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rpc Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.RpcGlueImpl#getClientout <em>Clientout</em>}</li>
 *   <li>{@link cOSA_m1.impl.RpcGlueImpl#getClientin <em>Clientin</em>}</li>
 *   <li>{@link cOSA_m1.impl.RpcGlueImpl#getServerin <em>Serverin</em>}</li>
 *   <li>{@link cOSA_m1.impl.RpcGlueImpl#getServeurout <em>Serveurout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RpcGlueImpl extends GlueImpl implements RpcGlue {
	/**
	 * The cached value of the '{@link #getClientout() <em>Clientout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientout()
	 * @generated
	 * @ordered
	 */
	protected ClientOutRole clientout;

	/**
	 * The cached value of the '{@link #getClientin() <em>Clientin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientin()
	 * @generated
	 * @ordered
	 */
	protected ClientInRole clientin;

	/**
	 * The cached value of the '{@link #getServerin() <em>Serverin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerin()
	 * @generated
	 * @ordered
	 */
	protected ServerInRole serverin;

	/**
	 * The cached value of the '{@link #getServeurout() <em>Serveurout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeurout()
	 * @generated
	 * @ordered
	 */
	protected ServeurOutRole serveurout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RpcGlueImpl() {
		super();
	}
	
	@Override
	public String traitementInOut(String s) {
		//System.out.println("Value "+s+" is treated by the RpcGLUE");
		return s;
	}
	
	@Override
	public String traitementOutIn(String s) {
		//System.out.println("Value "+s+" is treated by the RpcGLUE");
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.RPC_GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientOutRole getClientout() {
		if (clientout != null && clientout.eIsProxy()) {
			InternalEObject oldClientout = (InternalEObject)clientout;
			clientout = (ClientOutRole)eResolveProxy(oldClientout);
			if (clientout != oldClientout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.RPC_GLUE__CLIENTOUT, oldClientout, clientout));
			}
		}
		return clientout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientOutRole basicGetClientout() {
		return clientout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientout(ClientOutRole newClientout) {
		ClientOutRole oldClientout = clientout;
		clientout = newClientout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC_GLUE__CLIENTOUT, oldClientout, clientout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientInRole getClientin() {
		if (clientin != null && clientin.eIsProxy()) {
			InternalEObject oldClientin = (InternalEObject)clientin;
			clientin = (ClientInRole)eResolveProxy(oldClientin);
			if (clientin != oldClientin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.RPC_GLUE__CLIENTIN, oldClientin, clientin));
			}
		}
		return clientin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientInRole basicGetClientin() {
		return clientin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientin(ClientInRole newClientin) {
		ClientInRole oldClientin = clientin;
		clientin = newClientin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC_GLUE__CLIENTIN, oldClientin, clientin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInRole getServerin() {
		if (serverin != null && serverin.eIsProxy()) {
			InternalEObject oldServerin = (InternalEObject)serverin;
			serverin = (ServerInRole)eResolveProxy(oldServerin);
			if (serverin != oldServerin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.RPC_GLUE__SERVERIN, oldServerin, serverin));
			}
		}
		return serverin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInRole basicGetServerin() {
		return serverin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerin(ServerInRole newServerin) {
		ServerInRole oldServerin = serverin;
		serverin = newServerin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC_GLUE__SERVERIN, oldServerin, serverin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurOutRole getServeurout() {
		if (serveurout != null && serveurout.eIsProxy()) {
			InternalEObject oldServeurout = (InternalEObject)serveurout;
			serveurout = (ServeurOutRole)eResolveProxy(oldServeurout);
			if (serveurout != oldServeurout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.RPC_GLUE__SERVEUROUT, oldServeurout, serveurout));
			}
		}
		return serveurout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurOutRole basicGetServeurout() {
		return serveurout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServeurout(ServeurOutRole newServeurout) {
		ServeurOutRole oldServeurout = serveurout;
		serveurout = newServeurout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.RPC_GLUE__SERVEUROUT, oldServeurout, serveurout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.RPC_GLUE__CLIENTOUT:
				if (resolve) return getClientout();
				return basicGetClientout();
			case COSA_m1Package.RPC_GLUE__CLIENTIN:
				if (resolve) return getClientin();
				return basicGetClientin();
			case COSA_m1Package.RPC_GLUE__SERVERIN:
				if (resolve) return getServerin();
				return basicGetServerin();
			case COSA_m1Package.RPC_GLUE__SERVEUROUT:
				if (resolve) return getServeurout();
				return basicGetServeurout();
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
			case COSA_m1Package.RPC_GLUE__CLIENTOUT:
				setClientout((ClientOutRole)newValue);
				return;
			case COSA_m1Package.RPC_GLUE__CLIENTIN:
				setClientin((ClientInRole)newValue);
				return;
			case COSA_m1Package.RPC_GLUE__SERVERIN:
				setServerin((ServerInRole)newValue);
				return;
			case COSA_m1Package.RPC_GLUE__SERVEUROUT:
				setServeurout((ServeurOutRole)newValue);
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
			case COSA_m1Package.RPC_GLUE__CLIENTOUT:
				setClientout((ClientOutRole)null);
				return;
			case COSA_m1Package.RPC_GLUE__CLIENTIN:
				setClientin((ClientInRole)null);
				return;
			case COSA_m1Package.RPC_GLUE__SERVERIN:
				setServerin((ServerInRole)null);
				return;
			case COSA_m1Package.RPC_GLUE__SERVEUROUT:
				setServeurout((ServeurOutRole)null);
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
			case COSA_m1Package.RPC_GLUE__CLIENTOUT:
				return clientout != null;
			case COSA_m1Package.RPC_GLUE__CLIENTIN:
				return clientin != null;
			case COSA_m1Package.RPC_GLUE__SERVERIN:
				return serverin != null;
			case COSA_m1Package.RPC_GLUE__SERVEUROUT:
				return serveurout != null;
		}
		return super.eIsSet(featureID);
	}

} //RpcGlueImpl
