/**
 */
package cOSA_m1.impl;

import cOSA.impl.ConnecteurImpl;
import cOSA_m1.CDConnectorGlue;
import cOSA_m1.COSA_m1Package;
import cOSA_m1.CSCOnnectorGlue;
import cOSA_m1.ConnectionDBInRole;
import cOSA_m1.ConnectionDBOutRole;
import cOSA_m1.ConnectionDatabaseConnector;
import cOSA_m1.DBConnectionInRole;
import cOSA_m1.DBConnectionOutRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Database Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ConnectionDatabaseConnectorImpl#getConnectiondbinrole <em>Connectiondbinrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionDatabaseConnectorImpl#getDbconnectionoutrole <em>Dbconnectionoutrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionDatabaseConnectorImpl#getConnectiondboutrole <em>Connectiondboutrole</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionDatabaseConnectorImpl#getDbconnectioninrole <em>Dbconnectioninrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionDatabaseConnectorImpl extends ConnecteurImpl implements ConnectionDatabaseConnector {
	/**
	 * The cached value of the '{@link #getConnectiondbinrole() <em>Connectiondbinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectiondbinrole()
	 * @generated
	 * @ordered
	 */
	protected ConnectionDBInRole connectiondbinrole;

	/**
	 * The cached value of the '{@link #getDbconnectionoutrole() <em>Dbconnectionoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbconnectionoutrole()
	 * @generated
	 * @ordered
	 */
	protected DBConnectionOutRole dbconnectionoutrole;

	/**
	 * The cached value of the '{@link #getConnectiondboutrole() <em>Connectiondboutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectiondboutrole()
	 * @generated
	 * @ordered
	 */
	protected ConnectionDBOutRole connectiondboutrole;

	/**
	 * The cached value of the '{@link #getDbconnectioninrole() <em>Dbconnectioninrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbconnectioninrole()
	 * @generated
	 * @ordered
	 */
	protected DBConnectionInRole dbconnectioninrole;
	
	protected CDConnectorGlue cdConnectorGlue;
	
	public CDConnectorGlue getCDCnnectorGlue() {
		return cdConnectorGlue;
	}
	
	@Override
	public void init() {
		if(connectiondbinrole != null && connectiondboutrole != null) {
			connectiondbinrole.startBeingObservedBy(connectiondboutrole, cdConnectorGlue, 0);
		}
		if(dbconnectioninrole != null && dbconnectionoutrole != null) {
			dbconnectioninrole.startBeingObservedBy(dbconnectionoutrole, cdConnectorGlue, 1);
		}
	}
	
	public void setCDConnectorGlue(CDConnectorGlue newGlue) {
		cdConnectorGlue = newGlue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionDatabaseConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CONNECTION_DATABASE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBInRole getConnectiondbinrole() {
		return connectiondbinrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectiondbinrole(ConnectionDBInRole newConnectiondbinrole, NotificationChain msgs) {
		ConnectionDBInRole oldConnectiondbinrole = connectiondbinrole;
		connectiondbinrole = newConnectiondbinrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE, oldConnectiondbinrole, newConnectiondbinrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectiondbinrole(ConnectionDBInRole newConnectiondbinrole) {
		if (newConnectiondbinrole != connectiondbinrole) {
			NotificationChain msgs = null;
			if (connectiondbinrole != null)
				msgs = ((InternalEObject)connectiondbinrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE, null, msgs);
			if (newConnectiondbinrole != null)
				msgs = ((InternalEObject)newConnectiondbinrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE, null, msgs);
			msgs = basicSetConnectiondbinrole(newConnectiondbinrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE, newConnectiondbinrole, newConnectiondbinrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionOutRole getDbconnectionoutrole() {
		return dbconnectionoutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbconnectionoutrole(DBConnectionOutRole newDbconnectionoutrole, NotificationChain msgs) {
		DBConnectionOutRole oldDbconnectionoutrole = dbconnectionoutrole;
		dbconnectionoutrole = newDbconnectionoutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE, oldDbconnectionoutrole, newDbconnectionoutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbconnectionoutrole(DBConnectionOutRole newDbconnectionoutrole) {
		if (newDbconnectionoutrole != dbconnectionoutrole) {
			NotificationChain msgs = null;
			if (dbconnectionoutrole != null)
				msgs = ((InternalEObject)dbconnectionoutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE, null, msgs);
			if (newDbconnectionoutrole != null)
				msgs = ((InternalEObject)newDbconnectionoutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE, null, msgs);
			msgs = basicSetDbconnectionoutrole(newDbconnectionoutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE, newDbconnectionoutrole, newDbconnectionoutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBOutRole getConnectiondboutrole() {
		return connectiondboutrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectiondboutrole(ConnectionDBOutRole newConnectiondboutrole, NotificationChain msgs) {
		ConnectionDBOutRole oldConnectiondboutrole = connectiondboutrole;
		connectiondboutrole = newConnectiondboutrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE, oldConnectiondboutrole, newConnectiondboutrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectiondboutrole(ConnectionDBOutRole newConnectiondboutrole) {
		if (newConnectiondboutrole != connectiondboutrole) {
			NotificationChain msgs = null;
			if (connectiondboutrole != null)
				msgs = ((InternalEObject)connectiondboutrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE, null, msgs);
			if (newConnectiondboutrole != null)
				msgs = ((InternalEObject)newConnectiondboutrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE, null, msgs);
			msgs = basicSetConnectiondboutrole(newConnectiondboutrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE, newConnectiondboutrole, newConnectiondboutrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionInRole getDbconnectioninrole() {
		return dbconnectioninrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbconnectioninrole(DBConnectionInRole newDbconnectioninrole, NotificationChain msgs) {
		DBConnectionInRole oldDbconnectioninrole = dbconnectioninrole;
		dbconnectioninrole = newDbconnectioninrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE, oldDbconnectioninrole, newDbconnectioninrole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbconnectioninrole(DBConnectionInRole newDbconnectioninrole) {
		if (newDbconnectioninrole != dbconnectioninrole) {
			NotificationChain msgs = null;
			if (dbconnectioninrole != null)
				msgs = ((InternalEObject)dbconnectioninrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE, null, msgs);
			if (newDbconnectioninrole != null)
				msgs = ((InternalEObject)newDbconnectioninrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE, null, msgs);
			msgs = basicSetDbconnectioninrole(newDbconnectioninrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE, newDbconnectioninrole, newDbconnectioninrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE:
				return basicSetConnectiondbinrole(null, msgs);
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE:
				return basicSetDbconnectionoutrole(null, msgs);
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE:
				return basicSetConnectiondboutrole(null, msgs);
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE:
				return basicSetDbconnectioninrole(null, msgs);
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
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE:
				return getConnectiondbinrole();
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE:
				return getDbconnectionoutrole();
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE:
				return getConnectiondboutrole();
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE:
				return getDbconnectioninrole();
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
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE:
				setConnectiondbinrole((ConnectionDBInRole)newValue);
				return;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE:
				setDbconnectionoutrole((DBConnectionOutRole)newValue);
				return;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE:
				setConnectiondboutrole((ConnectionDBOutRole)newValue);
				return;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE:
				setDbconnectioninrole((DBConnectionInRole)newValue);
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
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE:
				setConnectiondbinrole((ConnectionDBInRole)null);
				return;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE:
				setDbconnectionoutrole((DBConnectionOutRole)null);
				return;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE:
				setConnectiondboutrole((ConnectionDBOutRole)null);
				return;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE:
				setDbconnectioninrole((DBConnectionInRole)null);
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
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE:
				return connectiondbinrole != null;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE:
				return dbconnectionoutrole != null;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE:
				return connectiondboutrole != null;
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE:
				return dbconnectioninrole != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionDatabaseConnectorImpl
