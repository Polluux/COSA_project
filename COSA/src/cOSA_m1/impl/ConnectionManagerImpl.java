/**
 */
package cOSA_m1.impl;

import cOSA.impl.ComposantImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectionInputFromDataBasePort;
import cOSA_m1.ConnectionInputFromSecurityPort;
import cOSA_m1.ConnectionManager;
import cOSA_m1.ConnectionOuputToDataBasePort;
import cOSA_m1.ConnectionOutputToSecurityPort;
import cOSA_m1.ServerConfigInput;
import cOSA_m1.ServerConfigOutput;

import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ConnectionManagerImpl#getServerconfiginput <em>Serverconfiginput</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionManagerImpl#getServerconfigoutput <em>Serverconfigoutput</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionManagerImpl#getConnectionoutputtosecurityport <em>Connectionoutputtosecurityport</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionManagerImpl#getConnectioninputfromsecurityport <em>Connectioninputfromsecurityport</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionManagerImpl#getConnectioninputfromdatabaseport <em>Connectioninputfromdatabaseport</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionManagerImpl#getConnectionouputtodatabaseport <em>Connectionouputtodatabaseport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionManagerImpl extends ComposantImpl implements ConnectionManager {
	/**
	 * The cached value of the '{@link #getServerconfiginput() <em>Serverconfiginput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerconfiginput()
	 * @generated
	 * @ordered
	 */
	protected ServerConfigInput serverconfiginput;

	/**
	 * The cached value of the '{@link #getServerconfigoutput() <em>Serverconfigoutput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerconfigoutput()
	 * @generated
	 * @ordered
	 */
	protected ServerConfigOutput serverconfigoutput;

	/**
	 * The cached value of the '{@link #getConnectionoutputtosecurityport() <em>Connectionoutputtosecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionoutputtosecurityport()
	 * @generated
	 * @ordered
	 */
	protected ConnectionOutputToSecurityPort connectionoutputtosecurityport;

	/**
	 * The cached value of the '{@link #getConnectioninputfromsecurityport() <em>Connectioninputfromsecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectioninputfromsecurityport()
	 * @generated
	 * @ordered
	 */
	protected ConnectionInputFromSecurityPort connectioninputfromsecurityport;

	/**
	 * The cached value of the '{@link #getConnectioninputfromdatabaseport() <em>Connectioninputfromdatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectioninputfromdatabaseport()
	 * @generated
	 * @ordered
	 */
	protected ConnectionInputFromDataBasePort connectioninputfromdatabaseport;

	/**
	 * The cached value of the '{@link #getConnectionouputtodatabaseport() <em>Connectionouputtodatabaseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionouputtodatabaseport()
	 * @generated
	 * @ordered
	 */
	protected ConnectionOuputToDataBasePort connectionouputtodatabaseport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionManagerImpl() {
		super();
		manager = new BigObserv();
	}
	
	public void init() {
		if(serverconfiginput != null && serverconfigoutput != null && connectionouputtodatabaseport != null && connectioninputfromdatabaseport != null && connectionoutputtosecurityport != null && connectioninputfromsecurityport != null) {
			serverconfiginput.startBeingObservedBy(manager);
			manager.getDB().addObserver(connectionouputtodatabaseport);
			manager.getSecu().addObserver(connectionoutputtosecurityport);
			connectioninputfromdatabaseport.startBeingObservedBy(serverconfigoutput);
			connectioninputfromsecurityport.startBeingObservedBy(serverconfigoutput);
		}
	}
	
	BigObserv manager;
	
	
	private class BigObserv implements Observer{
		MiniObserv portToDB;
		MiniObserv portToSecu;
		
		public BigObserv() {
			portToDB = new MiniObserv();
			portToSecu = new MiniObserv();
		}
		
		public Observable getDB() {
			return (Observable)portToDB;
		}
		
		public Observable getSecu() {
			return (Observable)portToSecu;
		}
		
		@Override
		public void update(Observable o, Object arg) {
			//Here we treat the value to see were we want to send the query
			//We choosed to handle 2 cases :
			// - The Query begins with "GET" then we send it to the Database Manager
			// - The Query begins with "SET" then we send it to the Security Manager
			//Otherwise, an error is returned
			switch(((String)arg).split(" ")[0].toUpperCase()) {
				case "GET":
					portToDB.setValue((String)arg);
					break;	
				case "SET":
					portToSecu.setValue((String)arg);
					break;
				default:
					serverconfigoutput.setValue("Unknown query : "+(String)arg);
					break;
			}
		}
	}
	
	private class MiniObserv extends Observable{
		public void setValue(String s) {
			setChanged();
			notifyObservers(s);
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigInput getServerconfiginput() {
		return serverconfiginput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerconfiginput(ServerConfigInput newServerconfiginput, NotificationChain msgs) {
		ServerConfigInput oldServerconfiginput = serverconfiginput;
		serverconfiginput = newServerconfiginput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT, oldServerconfiginput, newServerconfiginput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerconfiginput(ServerConfigInput newServerconfiginput) {
		if (newServerconfiginput != serverconfiginput) {
			NotificationChain msgs = null;
			if (serverconfiginput != null)
				msgs = ((InternalEObject)serverconfiginput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT, null, msgs);
			if (newServerconfiginput != null)
				msgs = ((InternalEObject)newServerconfiginput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT, null, msgs);
			msgs = basicSetServerconfiginput(newServerconfiginput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT, newServerconfiginput, newServerconfiginput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigOutput getServerconfigoutput() {
		return serverconfigoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerconfigoutput(ServerConfigOutput newServerconfigoutput, NotificationChain msgs) {
		ServerConfigOutput oldServerconfigoutput = serverconfigoutput;
		serverconfigoutput = newServerconfigoutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT, oldServerconfigoutput, newServerconfigoutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerconfigoutput(ServerConfigOutput newServerconfigoutput) {
		if (newServerconfigoutput != serverconfigoutput) {
			NotificationChain msgs = null;
			if (serverconfigoutput != null)
				msgs = ((InternalEObject)serverconfigoutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT, null, msgs);
			if (newServerconfigoutput != null)
				msgs = ((InternalEObject)newServerconfigoutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT, null, msgs);
			msgs = basicSetServerconfigoutput(newServerconfigoutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT, newServerconfigoutput, newServerconfigoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOutputToSecurityPort getConnectionoutputtosecurityport() {
		return connectionoutputtosecurityport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionoutputtosecurityport(ConnectionOutputToSecurityPort newConnectionoutputtosecurityport, NotificationChain msgs) {
		ConnectionOutputToSecurityPort oldConnectionoutputtosecurityport = connectionoutputtosecurityport;
		connectionoutputtosecurityport = newConnectionoutputtosecurityport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT, oldConnectionoutputtosecurityport, newConnectionoutputtosecurityport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionoutputtosecurityport(ConnectionOutputToSecurityPort newConnectionoutputtosecurityport) {
		if (newConnectionoutputtosecurityport != connectionoutputtosecurityport) {
			NotificationChain msgs = null;
			if (connectionoutputtosecurityport != null)
				msgs = ((InternalEObject)connectionoutputtosecurityport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT, null, msgs);
			if (newConnectionoutputtosecurityport != null)
				msgs = ((InternalEObject)newConnectionoutputtosecurityport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT, null, msgs);
			msgs = basicSetConnectionoutputtosecurityport(newConnectionoutputtosecurityport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT, newConnectionoutputtosecurityport, newConnectionoutputtosecurityport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInputFromSecurityPort getConnectioninputfromsecurityport() {
		return connectioninputfromsecurityport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectioninputfromsecurityport(ConnectionInputFromSecurityPort newConnectioninputfromsecurityport, NotificationChain msgs) {
		ConnectionInputFromSecurityPort oldConnectioninputfromsecurityport = connectioninputfromsecurityport;
		connectioninputfromsecurityport = newConnectioninputfromsecurityport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT, oldConnectioninputfromsecurityport, newConnectioninputfromsecurityport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectioninputfromsecurityport(ConnectionInputFromSecurityPort newConnectioninputfromsecurityport) {
		if (newConnectioninputfromsecurityport != connectioninputfromsecurityport) {
			NotificationChain msgs = null;
			if (connectioninputfromsecurityport != null)
				msgs = ((InternalEObject)connectioninputfromsecurityport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT, null, msgs);
			if (newConnectioninputfromsecurityport != null)
				msgs = ((InternalEObject)newConnectioninputfromsecurityport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT, null, msgs);
			msgs = basicSetConnectioninputfromsecurityport(newConnectioninputfromsecurityport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT, newConnectioninputfromsecurityport, newConnectioninputfromsecurityport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInputFromDataBasePort getConnectioninputfromdatabaseport() {
		return connectioninputfromdatabaseport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectioninputfromdatabaseport(ConnectionInputFromDataBasePort newConnectioninputfromdatabaseport, NotificationChain msgs) {
		ConnectionInputFromDataBasePort oldConnectioninputfromdatabaseport = connectioninputfromdatabaseport;
		connectioninputfromdatabaseport = newConnectioninputfromdatabaseport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT, oldConnectioninputfromdatabaseport, newConnectioninputfromdatabaseport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectioninputfromdatabaseport(ConnectionInputFromDataBasePort newConnectioninputfromdatabaseport) {
		if (newConnectioninputfromdatabaseport != connectioninputfromdatabaseport) {
			NotificationChain msgs = null;
			if (connectioninputfromdatabaseport != null)
				msgs = ((InternalEObject)connectioninputfromdatabaseport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT, null, msgs);
			if (newConnectioninputfromdatabaseport != null)
				msgs = ((InternalEObject)newConnectioninputfromdatabaseport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT, null, msgs);
			msgs = basicSetConnectioninputfromdatabaseport(newConnectioninputfromdatabaseport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT, newConnectioninputfromdatabaseport, newConnectioninputfromdatabaseport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOuputToDataBasePort getConnectionouputtodatabaseport() {
		return connectionouputtodatabaseport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionouputtodatabaseport(ConnectionOuputToDataBasePort newConnectionouputtodatabaseport, NotificationChain msgs) {
		ConnectionOuputToDataBasePort oldConnectionouputtodatabaseport = connectionouputtodatabaseport;
		connectionouputtodatabaseport = newConnectionouputtodatabaseport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT, oldConnectionouputtodatabaseport, newConnectionouputtodatabaseport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionouputtodatabaseport(ConnectionOuputToDataBasePort newConnectionouputtodatabaseport) {
		if (newConnectionouputtodatabaseport != connectionouputtodatabaseport) {
			NotificationChain msgs = null;
			if (connectionouputtodatabaseport != null)
				msgs = ((InternalEObject)connectionouputtodatabaseport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT, null, msgs);
			if (newConnectionouputtodatabaseport != null)
				msgs = ((InternalEObject)newConnectionouputtodatabaseport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT, null, msgs);
			msgs = basicSetConnectionouputtodatabaseport(newConnectionouputtodatabaseport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT, newConnectionouputtodatabaseport, newConnectionouputtodatabaseport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT:
				return basicSetServerconfiginput(null, msgs);
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT:
				return basicSetServerconfigoutput(null, msgs);
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT:
				return basicSetConnectionoutputtosecurityport(null, msgs);
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT:
				return basicSetConnectioninputfromsecurityport(null, msgs);
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT:
				return basicSetConnectioninputfromdatabaseport(null, msgs);
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT:
				return basicSetConnectionouputtodatabaseport(null, msgs);
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
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT:
				return getServerconfiginput();
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT:
				return getServerconfigoutput();
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT:
				return getConnectionoutputtosecurityport();
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT:
				return getConnectioninputfromsecurityport();
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT:
				return getConnectioninputfromdatabaseport();
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT:
				return getConnectionouputtodatabaseport();
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
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT:
				setServerconfiginput((ServerConfigInput)newValue);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT:
				setServerconfigoutput((ServerConfigOutput)newValue);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT:
				setConnectionoutputtosecurityport((ConnectionOutputToSecurityPort)newValue);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT:
				setConnectioninputfromsecurityport((ConnectionInputFromSecurityPort)newValue);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT:
				setConnectioninputfromdatabaseport((ConnectionInputFromDataBasePort)newValue);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT:
				setConnectionouputtodatabaseport((ConnectionOuputToDataBasePort)newValue);
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
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT:
				setServerconfiginput((ServerConfigInput)null);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT:
				setServerconfigoutput((ServerConfigOutput)null);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT:
				setConnectionoutputtosecurityport((ConnectionOutputToSecurityPort)null);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT:
				setConnectioninputfromsecurityport((ConnectionInputFromSecurityPort)null);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT:
				setConnectioninputfromdatabaseport((ConnectionInputFromDataBasePort)null);
				return;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT:
				setConnectionouputtodatabaseport((ConnectionOuputToDataBasePort)null);
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
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGINPUT:
				return serverconfiginput != null;
			case COSA_m1Package.CONNECTION_MANAGER__SERVERCONFIGOUTPUT:
				return serverconfigoutput != null;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT:
				return connectionoutputtosecurityport != null;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT:
				return connectioninputfromsecurityport != null;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT:
				return connectioninputfromdatabaseport != null;
			case COSA_m1Package.CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT:
				return connectionouputtodatabaseport != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionManagerImpl
