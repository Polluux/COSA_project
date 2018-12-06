/**
 */
package cOSA_m1.impl;

import cOSA.impl.ComposantImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.DataBase;
import cOSA_m1.DatabaseInputFromConnectionPort;
import cOSA_m1.DatabaseInputFromSecurityPort;
import cOSA_m1.DatabaseOutputToConnectionPort;
import cOSA_m1.DatabaseOutputToSecurityPort;
import cOSA_m1.impl.SecurityManagerImpl.IntermediateObserver;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.DataBaseImpl#getDatabaseinputfromconnectionport <em>Databaseinputfromconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.impl.DataBaseImpl#getDatabaseoutputtoconnectionport <em>Databaseoutputtoconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.impl.DataBaseImpl#getDatabaseoutputtosecurityport <em>Databaseoutputtosecurityport</em>}</li>
 *   <li>{@link cOSA_m1.impl.DataBaseImpl#getDatabaseinputfromsecurityport <em>Databaseinputfromsecurityport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataBaseImpl extends ComposantImpl implements DataBase {
	/**
	 * The cached value of the '{@link #getDatabaseinputfromconnectionport() <em>Databaseinputfromconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseinputfromconnectionport()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInputFromConnectionPort databaseinputfromconnectionport;

	/**
	 * The cached value of the '{@link #getDatabaseoutputtoconnectionport() <em>Databaseoutputtoconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseoutputtoconnectionport()
	 * @generated
	 * @ordered
	 */
	protected DatabaseOutputToConnectionPort databaseoutputtoconnectionport;

	/**
	 * The cached value of the '{@link #getDatabaseoutputtosecurityport() <em>Databaseoutputtosecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseoutputtosecurityport()
	 * @generated
	 * @ordered
	 */
	protected DatabaseOutputToSecurityPort databaseoutputtosecurityport;

	/**
	 * The cached value of the '{@link #getDatabaseinputfromsecurityport() <em>Databaseinputfromsecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseinputfromsecurityport()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInputFromSecurityPort databaseinputfromsecurityport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseImpl() {
		super();
		this.base=new HashMap<String,String>();
		interm = new IntermediateObserver();
	}
	
	HashMap<String,String> base;
	
	
	public void init() {
		if(databaseinputfromconnectionport != null && databaseoutputtoconnectionport != null && databaseoutputtosecurityport != null && databaseinputfromsecurityport != null) {
			databaseinputfromconnectionport.startBeingObservedBy(interm);
			databaseinputfromsecurityport.startBeingObservedBy(interm);
			interm.addObserver(databaseoutputtoconnectionport);
			//databaseoutputtosecurityport observe NOTHING because we didn't plan to send query back to Security for now
		}
	}
	
	IntermediateObserver interm;
	
	class IntermediateObserver extends Observable implements Observer{
		@Override
		public void update(Observable o, Object arg) {
			String res = "";
			String query = (String)arg;
			String[] parts = query.split(" ");
			
			switch(parts[0].toUpperCase()) {
			case "GET":
				if(parts.length == 2 && base.containsKey(parts[1])) {
					res = base.get(parts[1]);
				}else {
					res = "The database does not contains the key : "+parts[1];
				}
				break;	
			case "SET":
				String regex = "SET ([A-Z]|[a-z]|[0-9]|\\_)+ = \".*\"";
				if(parts.length >= 4 && query.matches(regex)) {
					base.put(parts[1],query.substring(query.indexOf("\"")+1, query.length()-1));
					res = "Query success.";
				}else {
					res = "The correct use of SET query is :    SET key = \"value\"";
				}
				break;
			default:
				res = "Unknown query : "+query;
				break;
			}
			setChanged();
			notifyObservers(res);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.DATA_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInputFromConnectionPort getDatabaseinputfromconnectionport() {
		return databaseinputfromconnectionport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseinputfromconnectionport(DatabaseInputFromConnectionPort newDatabaseinputfromconnectionport, NotificationChain msgs) {
		DatabaseInputFromConnectionPort oldDatabaseinputfromconnectionport = databaseinputfromconnectionport;
		databaseinputfromconnectionport = newDatabaseinputfromconnectionport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT, oldDatabaseinputfromconnectionport, newDatabaseinputfromconnectionport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseinputfromconnectionport(DatabaseInputFromConnectionPort newDatabaseinputfromconnectionport) {
		if (newDatabaseinputfromconnectionport != databaseinputfromconnectionport) {
			NotificationChain msgs = null;
			if (databaseinputfromconnectionport != null)
				msgs = ((InternalEObject)databaseinputfromconnectionport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT, null, msgs);
			if (newDatabaseinputfromconnectionport != null)
				msgs = ((InternalEObject)newDatabaseinputfromconnectionport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT, null, msgs);
			msgs = basicSetDatabaseinputfromconnectionport(newDatabaseinputfromconnectionport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT, newDatabaseinputfromconnectionport, newDatabaseinputfromconnectionport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseOutputToConnectionPort getDatabaseoutputtoconnectionport() {
		return databaseoutputtoconnectionport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseoutputtoconnectionport(DatabaseOutputToConnectionPort newDatabaseoutputtoconnectionport, NotificationChain msgs) {
		DatabaseOutputToConnectionPort oldDatabaseoutputtoconnectionport = databaseoutputtoconnectionport;
		databaseoutputtoconnectionport = newDatabaseoutputtoconnectionport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT, oldDatabaseoutputtoconnectionport, newDatabaseoutputtoconnectionport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseoutputtoconnectionport(DatabaseOutputToConnectionPort newDatabaseoutputtoconnectionport) {
		if (newDatabaseoutputtoconnectionport != databaseoutputtoconnectionport) {
			NotificationChain msgs = null;
			if (databaseoutputtoconnectionport != null)
				msgs = ((InternalEObject)databaseoutputtoconnectionport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT, null, msgs);
			if (newDatabaseoutputtoconnectionport != null)
				msgs = ((InternalEObject)newDatabaseoutputtoconnectionport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT, null, msgs);
			msgs = basicSetDatabaseoutputtoconnectionport(newDatabaseoutputtoconnectionport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT, newDatabaseoutputtoconnectionport, newDatabaseoutputtoconnectionport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseOutputToSecurityPort getDatabaseoutputtosecurityport() {
		return databaseoutputtosecurityport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseoutputtosecurityport(DatabaseOutputToSecurityPort newDatabaseoutputtosecurityport, NotificationChain msgs) {
		DatabaseOutputToSecurityPort oldDatabaseoutputtosecurityport = databaseoutputtosecurityport;
		databaseoutputtosecurityport = newDatabaseoutputtosecurityport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT, oldDatabaseoutputtosecurityport, newDatabaseoutputtosecurityport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseoutputtosecurityport(DatabaseOutputToSecurityPort newDatabaseoutputtosecurityport) {
		if (newDatabaseoutputtosecurityport != databaseoutputtosecurityport) {
			NotificationChain msgs = null;
			if (databaseoutputtosecurityport != null)
				msgs = ((InternalEObject)databaseoutputtosecurityport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT, null, msgs);
			if (newDatabaseoutputtosecurityport != null)
				msgs = ((InternalEObject)newDatabaseoutputtosecurityport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT, null, msgs);
			msgs = basicSetDatabaseoutputtosecurityport(newDatabaseoutputtosecurityport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT, newDatabaseoutputtosecurityport, newDatabaseoutputtosecurityport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInputFromSecurityPort getDatabaseinputfromsecurityport() {
		return databaseinputfromsecurityport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseinputfromsecurityport(DatabaseInputFromSecurityPort newDatabaseinputfromsecurityport, NotificationChain msgs) {
		DatabaseInputFromSecurityPort oldDatabaseinputfromsecurityport = databaseinputfromsecurityport;
		databaseinputfromsecurityport = newDatabaseinputfromsecurityport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT, oldDatabaseinputfromsecurityport, newDatabaseinputfromsecurityport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseinputfromsecurityport(DatabaseInputFromSecurityPort newDatabaseinputfromsecurityport) {
		if (newDatabaseinputfromsecurityport != databaseinputfromsecurityport) {
			NotificationChain msgs = null;
			if (databaseinputfromsecurityport != null)
				msgs = ((InternalEObject)databaseinputfromsecurityport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT, null, msgs);
			if (newDatabaseinputfromsecurityport != null)
				msgs = ((InternalEObject)newDatabaseinputfromsecurityport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT, null, msgs);
			msgs = basicSetDatabaseinputfromsecurityport(newDatabaseinputfromsecurityport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT, newDatabaseinputfromsecurityport, newDatabaseinputfromsecurityport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT:
				return basicSetDatabaseinputfromconnectionport(null, msgs);
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT:
				return basicSetDatabaseoutputtoconnectionport(null, msgs);
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT:
				return basicSetDatabaseoutputtosecurityport(null, msgs);
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT:
				return basicSetDatabaseinputfromsecurityport(null, msgs);
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
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT:
				return getDatabaseinputfromconnectionport();
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT:
				return getDatabaseoutputtoconnectionport();
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT:
				return getDatabaseoutputtosecurityport();
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT:
				return getDatabaseinputfromsecurityport();
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
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT:
				setDatabaseinputfromconnectionport((DatabaseInputFromConnectionPort)newValue);
				return;
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT:
				setDatabaseoutputtoconnectionport((DatabaseOutputToConnectionPort)newValue);
				return;
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT:
				setDatabaseoutputtosecurityport((DatabaseOutputToSecurityPort)newValue);
				return;
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT:
				setDatabaseinputfromsecurityport((DatabaseInputFromSecurityPort)newValue);
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
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT:
				setDatabaseinputfromconnectionport((DatabaseInputFromConnectionPort)null);
				return;
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT:
				setDatabaseoutputtoconnectionport((DatabaseOutputToConnectionPort)null);
				return;
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT:
				setDatabaseoutputtosecurityport((DatabaseOutputToSecurityPort)null);
				return;
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT:
				setDatabaseinputfromsecurityport((DatabaseInputFromSecurityPort)null);
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
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT:
				return databaseinputfromconnectionport != null;
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT:
				return databaseoutputtoconnectionport != null;
			case COSA_m1Package.DATA_BASE__DATABASEOUTPUTTOSECURITYPORT:
				return databaseoutputtosecurityport != null;
			case COSA_m1Package.DATA_BASE__DATABASEINPUTFROMSECURITYPORT:
				return databaseinputfromsecurityport != null;
		}
		return super.eIsSet(featureID);
	}

} //DataBaseImpl
