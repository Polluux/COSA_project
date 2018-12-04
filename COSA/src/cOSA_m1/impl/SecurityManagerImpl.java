/**
 */
package cOSA_m1.impl;

import cOSA.impl.ComposantImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.SecurityInputFromConnectionPort;
import cOSA_m1.SecurityInputFromDatabasePort;
import cOSA_m1.SecurityOuputToConnectionPort;
import cOSA_m1.SecurityOutputToDatabasePort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.SecurityManagerImpl#getSecurityinputfromconnectionport <em>Securityinputfromconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.impl.SecurityManagerImpl#getSecurityouputtoconnectionport <em>Securityouputtoconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.impl.SecurityManagerImpl#getSecurityoutputtodatabaseport <em>Securityoutputtodatabaseport</em>}</li>
 *   <li>{@link cOSA_m1.impl.SecurityManagerImpl#getSecurityinputfromdatabaseport <em>Securityinputfromdatabaseport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityManagerImpl extends ComposantImpl implements cOSA_m1.SecurityManager {
	/**
	 * The cached value of the '{@link #getSecurityinputfromconnectionport() <em>Securityinputfromconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityinputfromconnectionport()
	 * @generated
	 * @ordered
	 */
	protected SecurityInputFromConnectionPort securityinputfromconnectionport;

	/**
	 * The cached value of the '{@link #getSecurityouputtoconnectionport() <em>Securityouputtoconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityouputtoconnectionport()
	 * @generated
	 * @ordered
	 */
	protected SecurityOuputToConnectionPort securityouputtoconnectionport;

	/**
	 * The cached value of the '{@link #getSecurityoutputtodatabaseport() <em>Securityoutputtodatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityoutputtodatabaseport()
	 * @generated
	 * @ordered
	 */
	protected SecurityOutputToDatabasePort securityoutputtodatabaseport;

	/**
	 * The cached value of the '{@link #getSecurityinputfromdatabaseport() <em>Securityinputfromdatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityinputfromdatabaseport()
	 * @generated
	 * @ordered
	 */
	protected SecurityInputFromDatabasePort securityinputfromdatabaseport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.SECURITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityInputFromConnectionPort getSecurityinputfromconnectionport() {
		return securityinputfromconnectionport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityinputfromconnectionport(SecurityInputFromConnectionPort newSecurityinputfromconnectionport, NotificationChain msgs) {
		SecurityInputFromConnectionPort oldSecurityinputfromconnectionport = securityinputfromconnectionport;
		securityinputfromconnectionport = newSecurityinputfromconnectionport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT, oldSecurityinputfromconnectionport, newSecurityinputfromconnectionport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityinputfromconnectionport(SecurityInputFromConnectionPort newSecurityinputfromconnectionport) {
		if (newSecurityinputfromconnectionport != securityinputfromconnectionport) {
			NotificationChain msgs = null;
			if (securityinputfromconnectionport != null)
				msgs = ((InternalEObject)securityinputfromconnectionport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT, null, msgs);
			if (newSecurityinputfromconnectionport != null)
				msgs = ((InternalEObject)newSecurityinputfromconnectionport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT, null, msgs);
			msgs = basicSetSecurityinputfromconnectionport(newSecurityinputfromconnectionport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT, newSecurityinputfromconnectionport, newSecurityinputfromconnectionport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityOuputToConnectionPort getSecurityouputtoconnectionport() {
		return securityouputtoconnectionport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityouputtoconnectionport(SecurityOuputToConnectionPort newSecurityouputtoconnectionport, NotificationChain msgs) {
		SecurityOuputToConnectionPort oldSecurityouputtoconnectionport = securityouputtoconnectionport;
		securityouputtoconnectionport = newSecurityouputtoconnectionport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT, oldSecurityouputtoconnectionport, newSecurityouputtoconnectionport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityouputtoconnectionport(SecurityOuputToConnectionPort newSecurityouputtoconnectionport) {
		if (newSecurityouputtoconnectionport != securityouputtoconnectionport) {
			NotificationChain msgs = null;
			if (securityouputtoconnectionport != null)
				msgs = ((InternalEObject)securityouputtoconnectionport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT, null, msgs);
			if (newSecurityouputtoconnectionport != null)
				msgs = ((InternalEObject)newSecurityouputtoconnectionport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT, null, msgs);
			msgs = basicSetSecurityouputtoconnectionport(newSecurityouputtoconnectionport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT, newSecurityouputtoconnectionport, newSecurityouputtoconnectionport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityOutputToDatabasePort getSecurityoutputtodatabaseport() {
		return securityoutputtodatabaseport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityoutputtodatabaseport(SecurityOutputToDatabasePort newSecurityoutputtodatabaseport, NotificationChain msgs) {
		SecurityOutputToDatabasePort oldSecurityoutputtodatabaseport = securityoutputtodatabaseport;
		securityoutputtodatabaseport = newSecurityoutputtodatabaseport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT, oldSecurityoutputtodatabaseport, newSecurityoutputtodatabaseport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityoutputtodatabaseport(SecurityOutputToDatabasePort newSecurityoutputtodatabaseport) {
		if (newSecurityoutputtodatabaseport != securityoutputtodatabaseport) {
			NotificationChain msgs = null;
			if (securityoutputtodatabaseport != null)
				msgs = ((InternalEObject)securityoutputtodatabaseport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT, null, msgs);
			if (newSecurityoutputtodatabaseport != null)
				msgs = ((InternalEObject)newSecurityoutputtodatabaseport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT, null, msgs);
			msgs = basicSetSecurityoutputtodatabaseport(newSecurityoutputtodatabaseport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT, newSecurityoutputtodatabaseport, newSecurityoutputtodatabaseport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityInputFromDatabasePort getSecurityinputfromdatabaseport() {
		return securityinputfromdatabaseport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityinputfromdatabaseport(SecurityInputFromDatabasePort newSecurityinputfromdatabaseport, NotificationChain msgs) {
		SecurityInputFromDatabasePort oldSecurityinputfromdatabaseport = securityinputfromdatabaseport;
		securityinputfromdatabaseport = newSecurityinputfromdatabaseport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT, oldSecurityinputfromdatabaseport, newSecurityinputfromdatabaseport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityinputfromdatabaseport(SecurityInputFromDatabasePort newSecurityinputfromdatabaseport) {
		if (newSecurityinputfromdatabaseport != securityinputfromdatabaseport) {
			NotificationChain msgs = null;
			if (securityinputfromdatabaseport != null)
				msgs = ((InternalEObject)securityinputfromdatabaseport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT, null, msgs);
			if (newSecurityinputfromdatabaseport != null)
				msgs = ((InternalEObject)newSecurityinputfromdatabaseport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT, null, msgs);
			msgs = basicSetSecurityinputfromdatabaseport(newSecurityinputfromdatabaseport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT, newSecurityinputfromdatabaseport, newSecurityinputfromdatabaseport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT:
				return basicSetSecurityinputfromconnectionport(null, msgs);
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT:
				return basicSetSecurityouputtoconnectionport(null, msgs);
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT:
				return basicSetSecurityoutputtodatabaseport(null, msgs);
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT:
				return basicSetSecurityinputfromdatabaseport(null, msgs);
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
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT:
				return getSecurityinputfromconnectionport();
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT:
				return getSecurityouputtoconnectionport();
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT:
				return getSecurityoutputtodatabaseport();
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT:
				return getSecurityinputfromdatabaseport();
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
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT:
				setSecurityinputfromconnectionport((SecurityInputFromConnectionPort)newValue);
				return;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT:
				setSecurityouputtoconnectionport((SecurityOuputToConnectionPort)newValue);
				return;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT:
				setSecurityoutputtodatabaseport((SecurityOutputToDatabasePort)newValue);
				return;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT:
				setSecurityinputfromdatabaseport((SecurityInputFromDatabasePort)newValue);
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
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT:
				setSecurityinputfromconnectionport((SecurityInputFromConnectionPort)null);
				return;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT:
				setSecurityouputtoconnectionport((SecurityOuputToConnectionPort)null);
				return;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT:
				setSecurityoutputtodatabaseport((SecurityOutputToDatabasePort)null);
				return;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT:
				setSecurityinputfromdatabaseport((SecurityInputFromDatabasePort)null);
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
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT:
				return securityinputfromconnectionport != null;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT:
				return securityouputtoconnectionport != null;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT:
				return securityoutputtodatabaseport != null;
			case COSA_m1Package.SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT:
				return securityinputfromdatabaseport != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityManagerImpl
