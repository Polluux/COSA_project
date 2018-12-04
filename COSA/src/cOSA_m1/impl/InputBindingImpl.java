/**
 */
package cOSA_m1.impl;

import cOSA.impl.RequiredBindingImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.InputBinding;
import cOSA_m1.ServerConfigInput;
import cOSA_m1.ServerInput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.InputBindingImpl#getServerinput <em>Serverinput</em>}</li>
 *   <li>{@link cOSA_m1.impl.InputBindingImpl#getServerconfiginput <em>Serverconfiginput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputBindingImpl extends RequiredBindingImpl implements InputBinding {
	/**
	 * The cached value of the '{@link #getServerinput() <em>Serverinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerinput()
	 * @generated
	 * @ordered
	 */
	protected ServerInput serverinput;

	/**
	 * The cached value of the '{@link #getServerconfiginput() <em>Serverconfiginput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerconfiginput()
	 * @generated
	 * @ordered
	 */
	protected ServerConfigInput serverconfiginput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputBindingImpl() {
		super();
	}
	
	protected void init() {
		if(serverinput != null && serverconfiginput != null) {
			serverinput.startBeingObservedBy(serverconfiginput);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.INPUT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInput getServerinput() {
		if (serverinput != null && serverinput.eIsProxy()) {
			InternalEObject oldServerinput = (InternalEObject)serverinput;
			serverinput = (ServerInput)eResolveProxy(oldServerinput);
			if (serverinput != oldServerinput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.INPUT_BINDING__SERVERINPUT, oldServerinput, serverinput));
			}
		}
		return serverinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInput basicGetServerinput() {
		return serverinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerinput(ServerInput newServerinput) {
		ServerInput oldServerinput = serverinput;
		serverinput = newServerinput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.INPUT_BINDING__SERVERINPUT, oldServerinput, serverinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigInput getServerconfiginput() {
		if (serverconfiginput != null && serverconfiginput.eIsProxy()) {
			InternalEObject oldServerconfiginput = (InternalEObject)serverconfiginput;
			serverconfiginput = (ServerConfigInput)eResolveProxy(oldServerconfiginput);
			if (serverconfiginput != oldServerconfiginput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.INPUT_BINDING__SERVERCONFIGINPUT, oldServerconfiginput, serverconfiginput));
			}
		}
		return serverconfiginput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigInput basicGetServerconfiginput() {
		return serverconfiginput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerconfiginput(ServerConfigInput newServerconfiginput) {
		ServerConfigInput oldServerconfiginput = serverconfiginput;
		serverconfiginput = newServerconfiginput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.INPUT_BINDING__SERVERCONFIGINPUT, oldServerconfiginput, serverconfiginput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.INPUT_BINDING__SERVERINPUT:
				if (resolve) return getServerinput();
				return basicGetServerinput();
			case COSA_m1Package.INPUT_BINDING__SERVERCONFIGINPUT:
				if (resolve) return getServerconfiginput();
				return basicGetServerconfiginput();
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
			case COSA_m1Package.INPUT_BINDING__SERVERINPUT:
				setServerinput((ServerInput)newValue);
				return;
			case COSA_m1Package.INPUT_BINDING__SERVERCONFIGINPUT:
				setServerconfiginput((ServerConfigInput)newValue);
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
			case COSA_m1Package.INPUT_BINDING__SERVERINPUT:
				setServerinput((ServerInput)null);
				return;
			case COSA_m1Package.INPUT_BINDING__SERVERCONFIGINPUT:
				setServerconfiginput((ServerConfigInput)null);
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
			case COSA_m1Package.INPUT_BINDING__SERVERINPUT:
				return serverinput != null;
			case COSA_m1Package.INPUT_BINDING__SERVERCONFIGINPUT:
				return serverconfiginput != null;
		}
		return super.eIsSet(featureID);
	}

} //InputBindingImpl
