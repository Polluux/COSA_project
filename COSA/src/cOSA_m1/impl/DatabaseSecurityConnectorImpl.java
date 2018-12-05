/**
 */
package cOSA_m1.impl;

import cOSA.impl.ConnecteurImpl;
import cOSA_m1.CDConnectorGlue;
import cOSA_m1.COSA_m1Package;
import cOSA_m1.DSConnectorGlue;
import cOSA_m1.DatabaseSecurityConnector;
import cOSA_m1.DatabaseSecurityInRole;
import cOSA_m1.DatabaseSecurityOutRole;
import cOSA_m1.DecurityDatabaseOutRole;
import cOSA_m1.SecurityDatabaseInRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Security Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.DatabaseSecurityConnectorImpl#getDecuritydatabaseoutrole <em>Decuritydatabaseoutrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.DatabaseSecurityConnectorImpl#getDatabasesecurityinrole <em>Databasesecurityinrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.DatabaseSecurityConnectorImpl#getSecuritydatabaseinrole <em>Securitydatabaseinrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.DatabaseSecurityConnectorImpl#getDatabasesecurityoutrole <em>Databasesecurityoutrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseSecurityConnectorImpl extends ConnecteurImpl implements DatabaseSecurityConnector {
	/**
	 * The cached value of the '{@link #getDecuritydatabaseoutrole() <em>Decuritydatabaseoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecuritydatabaseoutrole()
	 * @generated
	 * @ordered
	 */
	protected DecurityDatabaseOutRole decuritydatabaseoutrole;

	/**
	 * The cached value of the '{@link #getDatabasesecurityinrole() <em>Databasesecurityinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasesecurityinrole()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSecurityInRole databasesecurityinrole;

	/**
	 * The cached value of the '{@link #getSecuritydatabaseinrole() <em>Securitydatabaseinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritydatabaseinrole()
	 * @generated
	 * @ordered
	 */
	protected SecurityDatabaseInRole securitydatabaseinrole;

	/**
	 * The cached value of the '{@link #getDatabasesecurityoutrole() <em>Databasesecurityoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasesecurityoutrole()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSecurityOutRole databasesecurityoutrole;
	
	protected DSConnectorGlue dsConnectorGlue;
	
	public DSConnectorGlue getDSConnectorGlue() {
		return dsConnectorGlue;
	}
	
	public void setDSConnectorGlue(DSConnectorGlue newGlue) {
		dsConnectorGlue = newGlue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseSecurityConnectorImpl() {
		super();
	}
	
	@Override
	public void init() {
		if(securitydatabaseinrole != null && decuritydatabaseoutrole != null) {
			securitydatabaseinrole.startBeingObservedBy(decuritydatabaseoutrole, dsConnectorGlue, 0);
		}
		if(databasesecurityinrole != null && databasesecurityoutrole != null) {
			databasesecurityinrole.startBeingObservedBy(databasesecurityoutrole, dsConnectorGlue, 1);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.DATABASE_SECURITY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecurityDatabaseOutRole getDecuritydatabaseoutrole() {
		return decuritydatabaseoutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecuritydatabaseoutrole(DecurityDatabaseOutRole newDecuritydatabaseoutrole, NotificationChain msgs) {
		DecurityDatabaseOutRole oldDecuritydatabaseoutrole = decuritydatabaseoutrole;
		decuritydatabaseoutrole = newDecuritydatabaseoutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE, oldDecuritydatabaseoutrole, newDecuritydatabaseoutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecuritydatabaseoutrole(DecurityDatabaseOutRole newDecuritydatabaseoutrole) {
		if (newDecuritydatabaseoutrole != decuritydatabaseoutrole) {
			NotificationChain msgs = null;
			if (decuritydatabaseoutrole != null)
				msgs = ((InternalEObject)decuritydatabaseoutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE, null, msgs);
			if (newDecuritydatabaseoutrole != null)
				msgs = ((InternalEObject)newDecuritydatabaseoutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE, null, msgs);
			msgs = basicSetDecuritydatabaseoutrole(newDecuritydatabaseoutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE, newDecuritydatabaseoutrole, newDecuritydatabaseoutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityInRole getDatabasesecurityinrole() {
		return databasesecurityinrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabasesecurityinrole(DatabaseSecurityInRole newDatabasesecurityinrole, NotificationChain msgs) {
		DatabaseSecurityInRole oldDatabasesecurityinrole = databasesecurityinrole;
		databasesecurityinrole = newDatabasesecurityinrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE, oldDatabasesecurityinrole, newDatabasesecurityinrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasesecurityinrole(DatabaseSecurityInRole newDatabasesecurityinrole) {
		if (newDatabasesecurityinrole != databasesecurityinrole) {
			NotificationChain msgs = null;
			if (databasesecurityinrole != null)
				msgs = ((InternalEObject)databasesecurityinrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE, null, msgs);
			if (newDatabasesecurityinrole != null)
				msgs = ((InternalEObject)newDatabasesecurityinrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE, null, msgs);
			msgs = basicSetDatabasesecurityinrole(newDatabasesecurityinrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE, newDatabasesecurityinrole, newDatabasesecurityinrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDatabaseInRole getSecuritydatabaseinrole() {
		return securitydatabaseinrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuritydatabaseinrole(SecurityDatabaseInRole newSecuritydatabaseinrole, NotificationChain msgs) {
		SecurityDatabaseInRole oldSecuritydatabaseinrole = securitydatabaseinrole;
		securitydatabaseinrole = newSecuritydatabaseinrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE, oldSecuritydatabaseinrole, newSecuritydatabaseinrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritydatabaseinrole(SecurityDatabaseInRole newSecuritydatabaseinrole) {
		if (newSecuritydatabaseinrole != securitydatabaseinrole) {
			NotificationChain msgs = null;
			if (securitydatabaseinrole != null)
				msgs = ((InternalEObject)securitydatabaseinrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE, null, msgs);
			if (newSecuritydatabaseinrole != null)
				msgs = ((InternalEObject)newSecuritydatabaseinrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE, null, msgs);
			msgs = basicSetSecuritydatabaseinrole(newSecuritydatabaseinrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE, newSecuritydatabaseinrole, newSecuritydatabaseinrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityOutRole getDatabasesecurityoutrole() {
		return databasesecurityoutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabasesecurityoutrole(DatabaseSecurityOutRole newDatabasesecurityoutrole, NotificationChain msgs) {
		DatabaseSecurityOutRole oldDatabasesecurityoutrole = databasesecurityoutrole;
		databasesecurityoutrole = newDatabasesecurityoutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE, oldDatabasesecurityoutrole, newDatabasesecurityoutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasesecurityoutrole(DatabaseSecurityOutRole newDatabasesecurityoutrole) {
		if (newDatabasesecurityoutrole != databasesecurityoutrole) {
			NotificationChain msgs = null;
			if (databasesecurityoutrole != null)
				msgs = ((InternalEObject)databasesecurityoutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE, null, msgs);
			if (newDatabasesecurityoutrole != null)
				msgs = ((InternalEObject)newDatabasesecurityoutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE, null, msgs);
			msgs = basicSetDatabasesecurityoutrole(newDatabasesecurityoutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE, newDatabasesecurityoutrole, newDatabasesecurityoutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE:
				return basicSetDecuritydatabaseoutrole(null, msgs);
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE:
				return basicSetDatabasesecurityinrole(null, msgs);
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE:
				return basicSetSecuritydatabaseinrole(null, msgs);
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE:
				return basicSetDatabasesecurityoutrole(null, msgs);
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
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE:
				return getDecuritydatabaseoutrole();
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE:
				return getDatabasesecurityinrole();
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE:
				return getSecuritydatabaseinrole();
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE:
				return getDatabasesecurityoutrole();
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
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE:
				setDecuritydatabaseoutrole((DecurityDatabaseOutRole)newValue);
				return;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE:
				setDatabasesecurityinrole((DatabaseSecurityInRole)newValue);
				return;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE:
				setSecuritydatabaseinrole((SecurityDatabaseInRole)newValue);
				return;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE:
				setDatabasesecurityoutrole((DatabaseSecurityOutRole)newValue);
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
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE:
				setDecuritydatabaseoutrole((DecurityDatabaseOutRole)null);
				return;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE:
				setDatabasesecurityinrole((DatabaseSecurityInRole)null);
				return;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE:
				setSecuritydatabaseinrole((SecurityDatabaseInRole)null);
				return;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE:
				setDatabasesecurityoutrole((DatabaseSecurityOutRole)null);
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
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE:
				return decuritydatabaseoutrole != null;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE:
				return databasesecurityinrole != null;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE:
				return securitydatabaseinrole != null;
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE:
				return databasesecurityoutrole != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseSecurityConnectorImpl
