/**
 */
package cOSA_m1.impl;

import cOSA.impl.RequiredBindingImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.CSQueryPorts;
import cOSA_m1.ConfigInput;
import cOSA_m1.InputBindings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Bindings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.InputBindingsImpl#getConfiginput <em>Configinput</em>}</li>
 *   <li>{@link cOSA_m1.impl.InputBindingsImpl#getClientinput <em>Clientinput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputBindingsImpl extends RequiredBindingImpl implements InputBindings {
	/**
	 * The cached value of the '{@link #getConfiginput() <em>Configinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiginput()
	 * @generated
	 * @ordered
	 */
	protected CSQueryPorts configinput;

	/**
	 * The cached value of the '{@link #getClientinput() <em>Clientinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientinput()
	 * @generated
	 * @ordered
	 */
	protected ConfigInput clientinput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputBindingsImpl() {
		super();
	}
	
	protected void init() {
		if(configinput != null && clientinput != null) {
			configinput.startBeingObservedBy(clientinput);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.INPUT_BINDINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSQueryPorts getConfiginput() {
		if (configinput != null && configinput.eIsProxy()) {
			InternalEObject oldConfiginput = (InternalEObject)configinput;
			configinput = (CSQueryPorts)eResolveProxy(oldConfiginput);
			if (configinput != oldConfiginput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.INPUT_BINDINGS__CONFIGINPUT, oldConfiginput, configinput));
			}
		}
		return configinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSQueryPorts basicGetConfiginput() {
		return configinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiginput(CSQueryPorts newConfiginput) {
		CSQueryPorts oldConfiginput = configinput;
		configinput = newConfiginput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.INPUT_BINDINGS__CONFIGINPUT, oldConfiginput, configinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigInput getClientinput() {
		if (clientinput != null && clientinput.eIsProxy()) {
			InternalEObject oldClientinput = (InternalEObject)clientinput;
			clientinput = (ConfigInput)eResolveProxy(oldClientinput);
			if (clientinput != oldClientinput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.INPUT_BINDINGS__CLIENTINPUT, oldClientinput, clientinput));
			}
		}
		return clientinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigInput basicGetClientinput() {
		return clientinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientinput(ConfigInput newClientinput) {
		ConfigInput oldClientinput = clientinput;
		clientinput = newClientinput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.INPUT_BINDINGS__CLIENTINPUT, oldClientinput, clientinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.INPUT_BINDINGS__CONFIGINPUT:
				if (resolve) return getConfiginput();
				return basicGetConfiginput();
			case COSA_m1Package.INPUT_BINDINGS__CLIENTINPUT:
				if (resolve) return getClientinput();
				return basicGetClientinput();
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
			case COSA_m1Package.INPUT_BINDINGS__CONFIGINPUT:
				setConfiginput((CSQueryPorts)newValue);
				return;
			case COSA_m1Package.INPUT_BINDINGS__CLIENTINPUT:
				setClientinput((ConfigInput)newValue);
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
			case COSA_m1Package.INPUT_BINDINGS__CONFIGINPUT:
				setConfiginput((CSQueryPorts)null);
				return;
			case COSA_m1Package.INPUT_BINDINGS__CLIENTINPUT:
				setClientinput((ConfigInput)null);
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
			case COSA_m1Package.INPUT_BINDINGS__CONFIGINPUT:
				return configinput != null;
			case COSA_m1Package.INPUT_BINDINGS__CLIENTINPUT:
				return clientinput != null;
		}
		return super.eIsSet(featureID);
	}

} //InputBindingsImpl
