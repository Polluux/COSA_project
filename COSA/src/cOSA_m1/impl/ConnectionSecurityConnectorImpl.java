/**
 */
package cOSA_m1.impl;

import cOSA.impl.ConnecteurImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectionSecurityConnector;
import cOSA_m1.ConnectionSecurityInRole;
import cOSA_m1.ConnectionSecurityOutRole;
import cOSA_m1.SecurityConnectionInRole;
import cOSA_m1.SecurityConnectionOutRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Security Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ConnectionSecurityConnectorImpl#getConnectionsecurityinrole <em>Connectionsecurityinrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionSecurityConnectorImpl#getSecurityconnectionoutrole <em>Securityconnectionoutrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionSecurityConnectorImpl#getConnectionsecurityoutrole <em>Connectionsecurityoutrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionSecurityConnectorImpl#getSecurityconnectioninrole <em>Securityconnectioninrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionSecurityConnectorImpl extends ConnecteurImpl implements ConnectionSecurityConnector {
	/**
	 * The cached value of the '{@link #getConnectionsecurityinrole() <em>Connectionsecurityinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsecurityinrole()
	 * @generated
	 * @ordered
	 */
	protected ConnectionSecurityInRole connectionsecurityinrole;

	/**
	 * The cached value of the '{@link #getSecurityconnectionoutrole() <em>Securityconnectionoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityconnectionoutrole()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectionOutRole securityconnectionoutrole;

	/**
	 * The cached value of the '{@link #getConnectionsecurityoutrole() <em>Connectionsecurityoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsecurityoutrole()
	 * @generated
	 * @ordered
	 */
	protected ConnectionSecurityOutRole connectionsecurityoutrole;

	/**
	 * The cached value of the '{@link #getSecurityconnectioninrole() <em>Securityconnectioninrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityconnectioninrole()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectionInRole securityconnectioninrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionSecurityConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CONNECTION_SECURITY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityInRole getConnectionsecurityinrole() {
		return connectionsecurityinrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionsecurityinrole(ConnectionSecurityInRole newConnectionsecurityinrole, NotificationChain msgs) {
		ConnectionSecurityInRole oldConnectionsecurityinrole = connectionsecurityinrole;
		connectionsecurityinrole = newConnectionsecurityinrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE, oldConnectionsecurityinrole, newConnectionsecurityinrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionsecurityinrole(ConnectionSecurityInRole newConnectionsecurityinrole) {
		if (newConnectionsecurityinrole != connectionsecurityinrole) {
			NotificationChain msgs = null;
			if (connectionsecurityinrole != null)
				msgs = ((InternalEObject)connectionsecurityinrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE, null, msgs);
			if (newConnectionsecurityinrole != null)
				msgs = ((InternalEObject)newConnectionsecurityinrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE, null, msgs);
			msgs = basicSetConnectionsecurityinrole(newConnectionsecurityinrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE, newConnectionsecurityinrole, newConnectionsecurityinrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionOutRole getSecurityconnectionoutrole() {
		return securityconnectionoutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityconnectionoutrole(SecurityConnectionOutRole newSecurityconnectionoutrole, NotificationChain msgs) {
		SecurityConnectionOutRole oldSecurityconnectionoutrole = securityconnectionoutrole;
		securityconnectionoutrole = newSecurityconnectionoutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE, oldSecurityconnectionoutrole, newSecurityconnectionoutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityconnectionoutrole(SecurityConnectionOutRole newSecurityconnectionoutrole) {
		if (newSecurityconnectionoutrole != securityconnectionoutrole) {
			NotificationChain msgs = null;
			if (securityconnectionoutrole != null)
				msgs = ((InternalEObject)securityconnectionoutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE, null, msgs);
			if (newSecurityconnectionoutrole != null)
				msgs = ((InternalEObject)newSecurityconnectionoutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE, null, msgs);
			msgs = basicSetSecurityconnectionoutrole(newSecurityconnectionoutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE, newSecurityconnectionoutrole, newSecurityconnectionoutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityOutRole getConnectionsecurityoutrole() {
		return connectionsecurityoutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionsecurityoutrole(ConnectionSecurityOutRole newConnectionsecurityoutrole, NotificationChain msgs) {
		ConnectionSecurityOutRole oldConnectionsecurityoutrole = connectionsecurityoutrole;
		connectionsecurityoutrole = newConnectionsecurityoutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE, oldConnectionsecurityoutrole, newConnectionsecurityoutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionsecurityoutrole(ConnectionSecurityOutRole newConnectionsecurityoutrole) {
		if (newConnectionsecurityoutrole != connectionsecurityoutrole) {
			NotificationChain msgs = null;
			if (connectionsecurityoutrole != null)
				msgs = ((InternalEObject)connectionsecurityoutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE, null, msgs);
			if (newConnectionsecurityoutrole != null)
				msgs = ((InternalEObject)newConnectionsecurityoutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE, null, msgs);
			msgs = basicSetConnectionsecurityoutrole(newConnectionsecurityoutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE, newConnectionsecurityoutrole, newConnectionsecurityoutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionInRole getSecurityconnectioninrole() {
		return securityconnectioninrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityconnectioninrole(SecurityConnectionInRole newSecurityconnectioninrole, NotificationChain msgs) {
		SecurityConnectionInRole oldSecurityconnectioninrole = securityconnectioninrole;
		securityconnectioninrole = newSecurityconnectioninrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE, oldSecurityconnectioninrole, newSecurityconnectioninrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityconnectioninrole(SecurityConnectionInRole newSecurityconnectioninrole) {
		if (newSecurityconnectioninrole != securityconnectioninrole) {
			NotificationChain msgs = null;
			if (securityconnectioninrole != null)
				msgs = ((InternalEObject)securityconnectioninrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE, null, msgs);
			if (newSecurityconnectioninrole != null)
				msgs = ((InternalEObject)newSecurityconnectioninrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE, null, msgs);
			msgs = basicSetSecurityconnectioninrole(newSecurityconnectioninrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE, newSecurityconnectioninrole, newSecurityconnectioninrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE:
				return basicSetConnectionsecurityinrole(null, msgs);
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE:
				return basicSetSecurityconnectionoutrole(null, msgs);
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE:
				return basicSetConnectionsecurityoutrole(null, msgs);
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE:
				return basicSetSecurityconnectioninrole(null, msgs);
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
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE:
				return getConnectionsecurityinrole();
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE:
				return getSecurityconnectionoutrole();
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE:
				return getConnectionsecurityoutrole();
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE:
				return getSecurityconnectioninrole();
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
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE:
				setConnectionsecurityinrole((ConnectionSecurityInRole)newValue);
				return;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE:
				setSecurityconnectionoutrole((SecurityConnectionOutRole)newValue);
				return;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE:
				setConnectionsecurityoutrole((ConnectionSecurityOutRole)newValue);
				return;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE:
				setSecurityconnectioninrole((SecurityConnectionInRole)newValue);
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
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE:
				setConnectionsecurityinrole((ConnectionSecurityInRole)null);
				return;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE:
				setSecurityconnectionoutrole((SecurityConnectionOutRole)null);
				return;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE:
				setConnectionsecurityoutrole((ConnectionSecurityOutRole)null);
				return;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE:
				setSecurityconnectioninrole((SecurityConnectionInRole)null);
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
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE:
				return connectionsecurityinrole != null;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE:
				return securityconnectionoutrole != null;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE:
				return connectionsecurityoutrole != null;
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE:
				return securityconnectioninrole != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionSecurityConnectorImpl
