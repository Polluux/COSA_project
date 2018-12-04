/**
 */
package cOSA_m1.impl;

import cOSA.impl.ProvidedBindingImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.CSResponsePorts;
import cOSA_m1.ConfigOutput;
import cOSA_m1.OutputBindings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Bindings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.OutputBindingsImpl#getClientoutput <em>Clientoutput</em>}</li>
 *   <li>{@link cOSA_m1.impl.OutputBindingsImpl#getConfigoutput <em>Configoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputBindingsImpl extends ProvidedBindingImpl implements OutputBindings {
	/**
	 * The cached value of the '{@link #getClientoutput() <em>Clientoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientoutput()
	 * @generated
	 * @ordered
	 */
	protected ConfigOutput clientoutput;

	/**
	 * The cached value of the '{@link #getConfigoutput() <em>Configoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigoutput()
	 * @generated
	 * @ordered
	 */
	protected CSResponsePorts configoutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputBindingsImpl() {
		super();
	}

	protected void init() {
		if(clientoutput != null && configoutput != null) {
			clientoutput.startBeingObservedBy(configoutput);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.OUTPUT_BINDINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigOutput getClientoutput() {
		if (clientoutput != null && clientoutput.eIsProxy()) {
			InternalEObject oldClientoutput = (InternalEObject)clientoutput;
			clientoutput = (ConfigOutput)eResolveProxy(oldClientoutput);
			if (clientoutput != oldClientoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.OUTPUT_BINDINGS__CLIENTOUTPUT, oldClientoutput, clientoutput));
			}
		}
		return clientoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigOutput basicGetClientoutput() {
		return clientoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientoutput(ConfigOutput newClientoutput) {
		ConfigOutput oldClientoutput = clientoutput;
		clientoutput = newClientoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.OUTPUT_BINDINGS__CLIENTOUTPUT, oldClientoutput, clientoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSResponsePorts getConfigoutput() {
		if (configoutput != null && configoutput.eIsProxy()) {
			InternalEObject oldConfigoutput = (InternalEObject)configoutput;
			configoutput = (CSResponsePorts)eResolveProxy(oldConfigoutput);
			if (configoutput != oldConfigoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.OUTPUT_BINDINGS__CONFIGOUTPUT, oldConfigoutput, configoutput));
			}
		}
		return configoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSResponsePorts basicGetConfigoutput() {
		return configoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigoutput(CSResponsePorts newConfigoutput) {
		CSResponsePorts oldConfigoutput = configoutput;
		configoutput = newConfigoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.OUTPUT_BINDINGS__CONFIGOUTPUT, oldConfigoutput, configoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.OUTPUT_BINDINGS__CLIENTOUTPUT:
				if (resolve) return getClientoutput();
				return basicGetClientoutput();
			case COSA_m1Package.OUTPUT_BINDINGS__CONFIGOUTPUT:
				if (resolve) return getConfigoutput();
				return basicGetConfigoutput();
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
			case COSA_m1Package.OUTPUT_BINDINGS__CLIENTOUTPUT:
				setClientoutput((ConfigOutput)newValue);
				return;
			case COSA_m1Package.OUTPUT_BINDINGS__CONFIGOUTPUT:
				setConfigoutput((CSResponsePorts)newValue);
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
			case COSA_m1Package.OUTPUT_BINDINGS__CLIENTOUTPUT:
				setClientoutput((ConfigOutput)null);
				return;
			case COSA_m1Package.OUTPUT_BINDINGS__CONFIGOUTPUT:
				setConfigoutput((CSResponsePorts)null);
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
			case COSA_m1Package.OUTPUT_BINDINGS__CLIENTOUTPUT:
				return clientoutput != null;
			case COSA_m1Package.OUTPUT_BINDINGS__CONFIGOUTPUT:
				return configoutput != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputBindingsImpl
