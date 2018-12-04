/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.RequiredBinding;
import cOSA.RequiredPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.RequiredBindingImpl#getConfigPort <em>Config Port</em>}</li>
 *   <li>{@link cOSA.impl.RequiredBindingImpl#getComponentPort <em>Component Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredBindingImpl extends BindingImpl implements RequiredBinding {
	/**
	 * The cached value of the '{@link #getConfigPort() <em>Config Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigPort()
	 * @generated
	 * @ordered
	 */
	protected RequiredPort configPort;

	/**
	 * The cached value of the '{@link #getComponentPort() <em>Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPort()
	 * @generated
	 * @ordered
	 */
	protected RequiredPort componentPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.REQUIRED_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort getConfigPort() {
		if (configPort != null && configPort.eIsProxy()) {
			InternalEObject oldConfigPort = (InternalEObject)configPort;
			configPort = (RequiredPort)eResolveProxy(oldConfigPort);
			if (configPort != oldConfigPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSAPackage.REQUIRED_BINDING__CONFIG_PORT, oldConfigPort, configPort));
			}
		}
		return configPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort basicGetConfigPort() {
		return configPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigPort(RequiredPort newConfigPort) {
		RequiredPort oldConfigPort = configPort;
		configPort = newConfigPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSAPackage.REQUIRED_BINDING__CONFIG_PORT, oldConfigPort, configPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort getComponentPort() {
		if (componentPort != null && componentPort.eIsProxy()) {
			InternalEObject oldComponentPort = (InternalEObject)componentPort;
			componentPort = (RequiredPort)eResolveProxy(oldComponentPort);
			if (componentPort != oldComponentPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSAPackage.REQUIRED_BINDING__COMPONENT_PORT, oldComponentPort, componentPort));
			}
		}
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort basicGetComponentPort() {
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPort(RequiredPort newComponentPort) {
		RequiredPort oldComponentPort = componentPort;
		componentPort = newComponentPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSAPackage.REQUIRED_BINDING__COMPONENT_PORT, oldComponentPort, componentPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSAPackage.REQUIRED_BINDING__CONFIG_PORT:
				if (resolve) return getConfigPort();
				return basicGetConfigPort();
			case COSAPackage.REQUIRED_BINDING__COMPONENT_PORT:
				if (resolve) return getComponentPort();
				return basicGetComponentPort();
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
			case COSAPackage.REQUIRED_BINDING__CONFIG_PORT:
				setConfigPort((RequiredPort)newValue);
				return;
			case COSAPackage.REQUIRED_BINDING__COMPONENT_PORT:
				setComponentPort((RequiredPort)newValue);
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
			case COSAPackage.REQUIRED_BINDING__CONFIG_PORT:
				setConfigPort((RequiredPort)null);
				return;
			case COSAPackage.REQUIRED_BINDING__COMPONENT_PORT:
				setComponentPort((RequiredPort)null);
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
			case COSAPackage.REQUIRED_BINDING__CONFIG_PORT:
				return configPort != null;
			case COSAPackage.REQUIRED_BINDING__COMPONENT_PORT:
				return componentPort != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredBindingImpl
