/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.ProvidedBinding;
import cOSA.ProvidedPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.ProvidedBindingImpl#getComponentPort <em>Component Port</em>}</li>
 *   <li>{@link cOSA.impl.ProvidedBindingImpl#getConfigPort <em>Config Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedBindingImpl extends BindingImpl implements ProvidedBinding {
	/**
	 * The cached value of the '{@link #getComponentPort() <em>Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPort()
	 * @generated
	 * @ordered
	 */
	protected ProvidedPort componentPort;

	/**
	 * The cached value of the '{@link #getConfigPort() <em>Config Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigPort()
	 * @generated
	 * @ordered
	 */
	protected ProvidedPort configPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.PROVIDED_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort getComponentPort() {
		if (componentPort != null && componentPort.eIsProxy()) {
			InternalEObject oldComponentPort = (InternalEObject)componentPort;
			componentPort = (ProvidedPort)eResolveProxy(oldComponentPort);
			if (componentPort != oldComponentPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSAPackage.PROVIDED_BINDING__COMPONENT_PORT, oldComponentPort, componentPort));
			}
		}
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort basicGetComponentPort() {
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPort(ProvidedPort newComponentPort) {
		ProvidedPort oldComponentPort = componentPort;
		componentPort = newComponentPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSAPackage.PROVIDED_BINDING__COMPONENT_PORT, oldComponentPort, componentPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort getConfigPort() {
		if (configPort != null && configPort.eIsProxy()) {
			InternalEObject oldConfigPort = (InternalEObject)configPort;
			configPort = (ProvidedPort)eResolveProxy(oldConfigPort);
			if (configPort != oldConfigPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSAPackage.PROVIDED_BINDING__CONFIG_PORT, oldConfigPort, configPort));
			}
		}
		return configPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort basicGetConfigPort() {
		return configPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigPort(ProvidedPort newConfigPort) {
		ProvidedPort oldConfigPort = configPort;
		configPort = newConfigPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSAPackage.PROVIDED_BINDING__CONFIG_PORT, oldConfigPort, configPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSAPackage.PROVIDED_BINDING__COMPONENT_PORT:
				if (resolve) return getComponentPort();
				return basicGetComponentPort();
			case COSAPackage.PROVIDED_BINDING__CONFIG_PORT:
				if (resolve) return getConfigPort();
				return basicGetConfigPort();
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
			case COSAPackage.PROVIDED_BINDING__COMPONENT_PORT:
				setComponentPort((ProvidedPort)newValue);
				return;
			case COSAPackage.PROVIDED_BINDING__CONFIG_PORT:
				setConfigPort((ProvidedPort)newValue);
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
			case COSAPackage.PROVIDED_BINDING__COMPONENT_PORT:
				setComponentPort((ProvidedPort)null);
				return;
			case COSAPackage.PROVIDED_BINDING__CONFIG_PORT:
				setConfigPort((ProvidedPort)null);
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
			case COSAPackage.PROVIDED_BINDING__COMPONENT_PORT:
				return componentPort != null;
			case COSAPackage.PROVIDED_BINDING__CONFIG_PORT:
				return configPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedBindingImpl
