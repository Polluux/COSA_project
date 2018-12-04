/**
 */
package cOSA_m1.impl;

import cOSA.impl.GlueImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.DSConnectorGlue;
import cOSA_m1.DatabaseSecurityInRole;
import cOSA_m1.DatabaseSecurityOutRole;
import cOSA_m1.DecurityDatabaseOutRole;
import cOSA_m1.SecurityDatabaseInRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Connector Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.DSConnectorGlueImpl#getDatabaseinput <em>Databaseinput</em>}</li>
 *   <li>{@link cOSA_m1.impl.DSConnectorGlueImpl#getDatabaseoutput <em>Databaseoutput</em>}</li>
 *   <li>{@link cOSA_m1.impl.DSConnectorGlueImpl#getSecurityinput <em>Securityinput</em>}</li>
 *   <li>{@link cOSA_m1.impl.DSConnectorGlueImpl#getSecurityoutput <em>Securityoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSConnectorGlueImpl extends GlueImpl implements DSConnectorGlue {
	/**
	 * The cached value of the '{@link #getDatabaseinput() <em>Databaseinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseinput()
	 * @generated
	 * @ordered
	 */
	protected DecurityDatabaseOutRole databaseinput;

	/**
	 * The cached value of the '{@link #getDatabaseoutput() <em>Databaseoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseoutput()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSecurityInRole databaseoutput;

	/**
	 * The cached value of the '{@link #getSecurityinput() <em>Securityinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityinput()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSecurityOutRole securityinput;

	/**
	 * The cached value of the '{@link #getSecurityoutput() <em>Securityoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityoutput()
	 * @generated
	 * @ordered
	 */
	protected SecurityDatabaseInRole securityoutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSConnectorGlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.DS_CONNECTOR_GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecurityDatabaseOutRole getDatabaseinput() {
		if (databaseinput != null && databaseinput.eIsProxy()) {
			InternalEObject oldDatabaseinput = (InternalEObject)databaseinput;
			databaseinput = (DecurityDatabaseOutRole)eResolveProxy(oldDatabaseinput);
			if (databaseinput != oldDatabaseinput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEINPUT, oldDatabaseinput, databaseinput));
			}
		}
		return databaseinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecurityDatabaseOutRole basicGetDatabaseinput() {
		return databaseinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseinput(DecurityDatabaseOutRole newDatabaseinput) {
		DecurityDatabaseOutRole oldDatabaseinput = databaseinput;
		databaseinput = newDatabaseinput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEINPUT, oldDatabaseinput, databaseinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityInRole getDatabaseoutput() {
		if (databaseoutput != null && databaseoutput.eIsProxy()) {
			InternalEObject oldDatabaseoutput = (InternalEObject)databaseoutput;
			databaseoutput = (DatabaseSecurityInRole)eResolveProxy(oldDatabaseoutput);
			if (databaseoutput != oldDatabaseoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEOUTPUT, oldDatabaseoutput, databaseoutput));
			}
		}
		return databaseoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityInRole basicGetDatabaseoutput() {
		return databaseoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseoutput(DatabaseSecurityInRole newDatabaseoutput) {
		DatabaseSecurityInRole oldDatabaseoutput = databaseoutput;
		databaseoutput = newDatabaseoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEOUTPUT, oldDatabaseoutput, databaseoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityOutRole getSecurityinput() {
		if (securityinput != null && securityinput.eIsProxy()) {
			InternalEObject oldSecurityinput = (InternalEObject)securityinput;
			securityinput = (DatabaseSecurityOutRole)eResolveProxy(oldSecurityinput);
			if (securityinput != oldSecurityinput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYINPUT, oldSecurityinput, securityinput));
			}
		}
		return securityinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityOutRole basicGetSecurityinput() {
		return securityinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityinput(DatabaseSecurityOutRole newSecurityinput) {
		DatabaseSecurityOutRole oldSecurityinput = securityinput;
		securityinput = newSecurityinput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYINPUT, oldSecurityinput, securityinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDatabaseInRole getSecurityoutput() {
		if (securityoutput != null && securityoutput.eIsProxy()) {
			InternalEObject oldSecurityoutput = (InternalEObject)securityoutput;
			securityoutput = (SecurityDatabaseInRole)eResolveProxy(oldSecurityoutput);
			if (securityoutput != oldSecurityoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYOUTPUT, oldSecurityoutput, securityoutput));
			}
		}
		return securityoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDatabaseInRole basicGetSecurityoutput() {
		return securityoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityoutput(SecurityDatabaseInRole newSecurityoutput) {
		SecurityDatabaseInRole oldSecurityoutput = securityoutput;
		securityoutput = newSecurityoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYOUTPUT, oldSecurityoutput, securityoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEINPUT:
				if (resolve) return getDatabaseinput();
				return basicGetDatabaseinput();
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEOUTPUT:
				if (resolve) return getDatabaseoutput();
				return basicGetDatabaseoutput();
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYINPUT:
				if (resolve) return getSecurityinput();
				return basicGetSecurityinput();
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYOUTPUT:
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
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEINPUT:
				setDatabaseinput((DecurityDatabaseOutRole)newValue);
				return;
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEOUTPUT:
				setDatabaseoutput((DatabaseSecurityInRole)newValue);
				return;
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYINPUT:
				setSecurityinput((DatabaseSecurityOutRole)newValue);
				return;
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYOUTPUT:
				setSecurityoutput((SecurityDatabaseInRole)newValue);
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
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEINPUT:
				setDatabaseinput((DecurityDatabaseOutRole)null);
				return;
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEOUTPUT:
				setDatabaseoutput((DatabaseSecurityInRole)null);
				return;
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYINPUT:
				setSecurityinput((DatabaseSecurityOutRole)null);
				return;
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYOUTPUT:
				setSecurityoutput((SecurityDatabaseInRole)null);
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
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEINPUT:
				return databaseinput != null;
			case COSA_m1Package.DS_CONNECTOR_GLUE__DATABASEOUTPUT:
				return databaseoutput != null;
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYINPUT:
				return securityinput != null;
			case COSA_m1Package.DS_CONNECTOR_GLUE__SECURITYOUTPUT:
				return securityoutput != null;
		}
		return super.eIsSet(featureID);
	}

} //DSConnectorGlueImpl
