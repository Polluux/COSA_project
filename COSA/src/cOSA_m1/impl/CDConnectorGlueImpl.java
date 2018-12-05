/**
 */
package cOSA_m1.impl;

import cOSA.impl.GlueImpl;

import cOSA_m1.CDConnectorGlue;
import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectionDBInRole;
import cOSA_m1.ConnectionDBOutRole;
import cOSA_m1.DBConnectionInRole;
import cOSA_m1.DBConnectionOutRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CD Connector Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.CDConnectorGlueImpl#getConnectionoutput <em>Connectionoutput</em>}</li>
 *   <li>{@link cOSA_m1.impl.CDConnectorGlueImpl#getConnectioninput <em>Connectioninput</em>}</li>
 *   <li>{@link cOSA_m1.impl.CDConnectorGlueImpl#getDatabaseinput <em>Databaseinput</em>}</li>
 *   <li>{@link cOSA_m1.impl.CDConnectorGlueImpl#getDatabaseoutput <em>Databaseoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDConnectorGlueImpl extends GlueImpl implements CDConnectorGlue {
	/**
	 * The cached value of the '{@link #getConnectionoutput() <em>Connectionoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionoutput()
	 * @generated
	 * @ordered
	 */
	protected ConnectionDBInRole connectionoutput;

	/**
	 * The cached value of the '{@link #getConnectioninput() <em>Connectioninput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectioninput()
	 * @generated
	 * @ordered
	 */
	protected DBConnectionOutRole connectioninput;

	/**
	 * The cached value of the '{@link #getDatabaseinput() <em>Databaseinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseinput()
	 * @generated
	 * @ordered
	 */
	protected ConnectionDBOutRole databaseinput;

	/**
	 * The cached value of the '{@link #getDatabaseoutput() <em>Databaseoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseoutput()
	 * @generated
	 * @ordered
	 */
	protected DBConnectionInRole databaseoutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDConnectorGlueImpl() {
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
		return COSA_m1Package.Literals.CD_CONNECTOR_GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBInRole getConnectionoutput() {
		if (connectionoutput != null && connectionoutput.eIsProxy()) {
			InternalEObject oldConnectionoutput = (InternalEObject)connectionoutput;
			connectionoutput = (ConnectionDBInRole)eResolveProxy(oldConnectionoutput);
			if (connectionoutput != oldConnectionoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONOUTPUT, oldConnectionoutput, connectionoutput));
			}
		}
		return connectionoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBInRole basicGetConnectionoutput() {
		return connectionoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionoutput(ConnectionDBInRole newConnectionoutput) {
		ConnectionDBInRole oldConnectionoutput = connectionoutput;
		connectionoutput = newConnectionoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONOUTPUT, oldConnectionoutput, connectionoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionOutRole getConnectioninput() {
		if (connectioninput != null && connectioninput.eIsProxy()) {
			InternalEObject oldConnectioninput = (InternalEObject)connectioninput;
			connectioninput = (DBConnectionOutRole)eResolveProxy(oldConnectioninput);
			if (connectioninput != oldConnectioninput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONINPUT, oldConnectioninput, connectioninput));
			}
		}
		return connectioninput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionOutRole basicGetConnectioninput() {
		return connectioninput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectioninput(DBConnectionOutRole newConnectioninput) {
		DBConnectionOutRole oldConnectioninput = connectioninput;
		connectioninput = newConnectioninput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONINPUT, oldConnectioninput, connectioninput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBOutRole getDatabaseinput() {
		if (databaseinput != null && databaseinput.eIsProxy()) {
			InternalEObject oldDatabaseinput = (InternalEObject)databaseinput;
			databaseinput = (ConnectionDBOutRole)eResolveProxy(oldDatabaseinput);
			if (databaseinput != oldDatabaseinput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEINPUT, oldDatabaseinput, databaseinput));
			}
		}
		return databaseinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBOutRole basicGetDatabaseinput() {
		return databaseinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseinput(ConnectionDBOutRole newDatabaseinput) {
		ConnectionDBOutRole oldDatabaseinput = databaseinput;
		databaseinput = newDatabaseinput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEINPUT, oldDatabaseinput, databaseinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionInRole getDatabaseoutput() {
		if (databaseoutput != null && databaseoutput.eIsProxy()) {
			InternalEObject oldDatabaseoutput = (InternalEObject)databaseoutput;
			databaseoutput = (DBConnectionInRole)eResolveProxy(oldDatabaseoutput);
			if (databaseoutput != oldDatabaseoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEOUTPUT, oldDatabaseoutput, databaseoutput));
			}
		}
		return databaseoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionInRole basicGetDatabaseoutput() {
		return databaseoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseoutput(DBConnectionInRole newDatabaseoutput) {
		DBConnectionInRole oldDatabaseoutput = databaseoutput;
		databaseoutput = newDatabaseoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEOUTPUT, oldDatabaseoutput, databaseoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONOUTPUT:
				if (resolve) return getConnectionoutput();
				return basicGetConnectionoutput();
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONINPUT:
				if (resolve) return getConnectioninput();
				return basicGetConnectioninput();
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEINPUT:
				if (resolve) return getDatabaseinput();
				return basicGetDatabaseinput();
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEOUTPUT:
				if (resolve) return getDatabaseoutput();
				return basicGetDatabaseoutput();
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
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONOUTPUT:
				setConnectionoutput((ConnectionDBInRole)newValue);
				return;
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONINPUT:
				setConnectioninput((DBConnectionOutRole)newValue);
				return;
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEINPUT:
				setDatabaseinput((ConnectionDBOutRole)newValue);
				return;
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEOUTPUT:
				setDatabaseoutput((DBConnectionInRole)newValue);
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
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONOUTPUT:
				setConnectionoutput((ConnectionDBInRole)null);
				return;
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONINPUT:
				setConnectioninput((DBConnectionOutRole)null);
				return;
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEINPUT:
				setDatabaseinput((ConnectionDBOutRole)null);
				return;
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEOUTPUT:
				setDatabaseoutput((DBConnectionInRole)null);
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
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONOUTPUT:
				return connectionoutput != null;
			case COSA_m1Package.CD_CONNECTOR_GLUE__CONNECTIONINPUT:
				return connectioninput != null;
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEINPUT:
				return databaseinput != null;
			case COSA_m1Package.CD_CONNECTOR_GLUE__DATABASEOUTPUT:
				return databaseoutput != null;
		}
		return super.eIsSet(featureID);
	}

} //CDConnectorGlueImpl
