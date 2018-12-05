/**
 */
package cOSA_m1.impl;

import cOSA.impl.GlueImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.CSCOnnectorGlue;
import cOSA_m1.ConnectionSecurityInRole;
import cOSA_m1.ConnectionSecurityOutRole;
import cOSA_m1.SecurityConnectionInRole;
import cOSA_m1.SecurityConnectionOutRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSC Onnector Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.CSCOnnectorGlueImpl#getConnectionoutput <em>Connectionoutput</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSCOnnectorGlueImpl#getConnectioninput <em>Connectioninput</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSCOnnectorGlueImpl#getSecurityinput <em>Securityinput</em>}</li>
 *   <li>{@link cOSA_m1.impl.CSCOnnectorGlueImpl#getSecurityoutput <em>Securityoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSCOnnectorGlueImpl extends GlueImpl implements CSCOnnectorGlue {
	/**
	 * The cached value of the '{@link #getConnectionoutput() <em>Connectionoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionoutput()
	 * @generated
	 * @ordered
	 */
	protected ConnectionSecurityInRole connectionoutput;

	/**
	 * The cached value of the '{@link #getConnectioninput() <em>Connectioninput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectioninput()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectionOutRole connectioninput;

	/**
	 * The cached value of the '{@link #getSecurityinput() <em>Securityinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityinput()
	 * @generated
	 * @ordered
	 */
	protected ConnectionSecurityOutRole securityinput;

	/**
	 * The cached value of the '{@link #getSecurityoutput() <em>Securityoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityoutput()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectionInRole securityoutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSCOnnectorGlueImpl() {
		super();
	}
	
	@Override
	public String traitementInOut(String s) {
		return s;
	}
	
	@Override
	public String traitementOutIn(String s) {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CSC_ONNECTOR_GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityInRole getConnectionoutput() {
		if (connectionoutput != null && connectionoutput.eIsProxy()) {
			InternalEObject oldConnectionoutput = (InternalEObject)connectionoutput;
			connectionoutput = (ConnectionSecurityInRole)eResolveProxy(oldConnectionoutput);
			if (connectionoutput != oldConnectionoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT, oldConnectionoutput, connectionoutput));
			}
		}
		return connectionoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityInRole basicGetConnectionoutput() {
		return connectionoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionoutput(ConnectionSecurityInRole newConnectionoutput) {
		ConnectionSecurityInRole oldConnectionoutput = connectionoutput;
		connectionoutput = newConnectionoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT, oldConnectionoutput, connectionoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionOutRole getConnectioninput() {
		if (connectioninput != null && connectioninput.eIsProxy()) {
			InternalEObject oldConnectioninput = (InternalEObject)connectioninput;
			connectioninput = (SecurityConnectionOutRole)eResolveProxy(oldConnectioninput);
			if (connectioninput != oldConnectioninput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONINPUT, oldConnectioninput, connectioninput));
			}
		}
		return connectioninput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionOutRole basicGetConnectioninput() {
		return connectioninput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectioninput(SecurityConnectionOutRole newConnectioninput) {
		SecurityConnectionOutRole oldConnectioninput = connectioninput;
		connectioninput = newConnectioninput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONINPUT, oldConnectioninput, connectioninput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityOutRole getSecurityinput() {
		if (securityinput != null && securityinput.eIsProxy()) {
			InternalEObject oldSecurityinput = (InternalEObject)securityinput;
			securityinput = (ConnectionSecurityOutRole)eResolveProxy(oldSecurityinput);
			if (securityinput != oldSecurityinput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYINPUT, oldSecurityinput, securityinput));
			}
		}
		return securityinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityOutRole basicGetSecurityinput() {
		return securityinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityinput(ConnectionSecurityOutRole newSecurityinput) {
		ConnectionSecurityOutRole oldSecurityinput = securityinput;
		securityinput = newSecurityinput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYINPUT, oldSecurityinput, securityinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionInRole getSecurityoutput() {
		if (securityoutput != null && securityoutput.eIsProxy()) {
			InternalEObject oldSecurityoutput = (InternalEObject)securityoutput;
			securityoutput = (SecurityConnectionInRole)eResolveProxy(oldSecurityoutput);
			if (securityoutput != oldSecurityoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYOUTPUT, oldSecurityoutput, securityoutput));
			}
		}
		return securityoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionInRole basicGetSecurityoutput() {
		return securityoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityoutput(SecurityConnectionInRole newSecurityoutput) {
		SecurityConnectionInRole oldSecurityoutput = securityoutput;
		securityoutput = newSecurityoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYOUTPUT, oldSecurityoutput, securityoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT:
				if (resolve) return getConnectionoutput();
				return basicGetConnectionoutput();
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONINPUT:
				if (resolve) return getConnectioninput();
				return basicGetConnectioninput();
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYINPUT:
				if (resolve) return getSecurityinput();
				return basicGetSecurityinput();
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYOUTPUT:
				if (resolve) return getSecurityoutput();
				return basicGetSecurityoutput();
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
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT:
				setConnectionoutput((ConnectionSecurityInRole)newValue);
				return;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONINPUT:
				setConnectioninput((SecurityConnectionOutRole)newValue);
				return;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYINPUT:
				setSecurityinput((ConnectionSecurityOutRole)newValue);
				return;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYOUTPUT:
				setSecurityoutput((SecurityConnectionInRole)newValue);
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
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT:
				setConnectionoutput((ConnectionSecurityInRole)null);
				return;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONINPUT:
				setConnectioninput((SecurityConnectionOutRole)null);
				return;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYINPUT:
				setSecurityinput((ConnectionSecurityOutRole)null);
				return;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYOUTPUT:
				setSecurityoutput((SecurityConnectionInRole)null);
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
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT:
				return connectionoutput != null;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__CONNECTIONINPUT:
				return connectioninput != null;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYINPUT:
				return securityinput != null;
			case COSA_m1Package.CSC_ONNECTOR_GLUE__SECURITYOUTPUT:
				return securityoutput != null;
		}
		return super.eIsSet(featureID);
	}

} //CSCOnnectorGlueImpl
