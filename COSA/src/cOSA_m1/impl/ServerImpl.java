/**
 */
package cOSA_m1.impl;

import cOSA.impl.ConfigurationImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectionConnectorDatabaseAttachment;
import cOSA_m1.ConnectionConnectorSecurityAttachment;
import cOSA_m1.ConnectionDatabaseConnector;
import cOSA_m1.ConnectionManager;
import cOSA_m1.ConnectionSecurityConnector;
import cOSA_m1.ConnectorConnectionDatabaseAttachment;
import cOSA_m1.ConnectorConnectionSecurityAttachment;
import cOSA_m1.ConnectorDatabaseConnectionAttachment;
import cOSA_m1.ConnectorDatabaseSecurityAttachment;
import cOSA_m1.ConnectorSecurityConnectionAttachment;
import cOSA_m1.ConnectorSecurityDatabaseAttachment;
import cOSA_m1.DataBase;
import cOSA_m1.DatabaseConnectorConnectionAttachment;
import cOSA_m1.DatabaseConnectorSecurityAttachment;
import cOSA_m1.DatabaseSecurityConnector;
import cOSA_m1.InputBinding;
import cOSA_m1.OutputBinding;
import cOSA_m1.SecurityConnectorConnectionAttachment;
import cOSA_m1.SecurityConnectorDatabaseAttachment;
import cOSA_m1.Server;
import cOSA_m1.ServerInput;
import cOSA_m1.ServerOuput;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getServerinput <em>Serverinput</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getServerouput <em>Serverouput</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getOutputbinding <em>Outputbinding</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getInputbinding <em>Inputbinding</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectordatabaseconnectionattachment <em>Connectordatabaseconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectionconnectordatabaseattachment <em>Connectionconnectordatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectiondatabaseconnector <em>Connectiondatabaseconnector</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getDatabaseconnectorconnectionattachment <em>Databaseconnectorconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectorconnectiondatabaseattachment <em>Connectorconnectiondatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectorsecuritydatabaseattachment <em>Connectorsecuritydatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getDatabaseconnectorsecurityattachment <em>Databaseconnectorsecurityattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getDatabasesecurityconnector <em>Databasesecurityconnector</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectordatabasesecurityattachment <em>Connectordatabasesecurityattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getSecurityconnectordatabaseattachment <em>Securityconnectordatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getSecurityconnectorconnectionattachment <em>Securityconnectorconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectorconnectionsecurityattachment <em>Connectorconnectionsecurityattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectionsecurityconnector <em>Connectionsecurityconnector</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectorsecurityconnectionattachment <em>Connectorsecurityconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerImpl#getConnectionconnectorsecurityattachment <em>Connectionconnectorsecurityattachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends ConfigurationImpl implements Server {
	/**
	 * The cached value of the '{@link #getServerinput() <em>Serverinput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerinput()
	 * @generated
	 * @ordered
	 */
	protected ServerInput serverinput;

	/**
	 * The cached value of the '{@link #getServerouput() <em>Serverouput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerouput()
	 * @generated
	 * @ordered
	 */
	protected ServerOuput serverouput;

	/**
	 * The cached value of the '{@link #getOutputbinding() <em>Outputbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputbinding()
	 * @generated
	 * @ordered
	 */
	protected OutputBinding outputbinding;

	/**
	 * The cached value of the '{@link #getInputbinding() <em>Inputbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputbinding()
	 * @generated
	 * @ordered
	 */
	protected InputBinding inputbinding;

	/**
	 * The cached value of the '{@link #getConnectionmanager() <em>Connectionmanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionmanager()
	 * @generated
	 * @ordered
	 */
	protected ConnectionManager connectionmanager;

	/**
	 * The cached value of the '{@link #getConnectordatabaseconnectionattachment() <em>Connectordatabaseconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectordatabaseconnectionattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectorDatabaseConnectionAttachment connectordatabaseconnectionattachment;

	/**
	 * The cached value of the '{@link #getConnectionconnectordatabaseattachment() <em>Connectionconnectordatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionconnectordatabaseattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectionConnectorDatabaseAttachment connectionconnectordatabaseattachment;

	/**
	 * The cached value of the '{@link #getConnectiondatabaseconnector() <em>Connectiondatabaseconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectiondatabaseconnector()
	 * @generated
	 * @ordered
	 */
	protected ConnectionDatabaseConnector connectiondatabaseconnector;

	/**
	 * The cached value of the '{@link #getDatabaseconnectorconnectionattachment() <em>Databaseconnectorconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseconnectorconnectionattachment()
	 * @generated
	 * @ordered
	 */
	protected DatabaseConnectorConnectionAttachment databaseconnectorconnectionattachment;

	/**
	 * The cached value of the '{@link #getConnectorconnectiondatabaseattachment() <em>Connectorconnectiondatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorconnectiondatabaseattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectorConnectionDatabaseAttachment connectorconnectiondatabaseattachment;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DataBase database;

	/**
	 * The cached value of the '{@link #getConnectorsecuritydatabaseattachment() <em>Connectorsecuritydatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorsecuritydatabaseattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectorSecurityDatabaseAttachment connectorsecuritydatabaseattachment;

	/**
	 * The cached value of the '{@link #getDatabaseconnectorsecurityattachment() <em>Databaseconnectorsecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseconnectorsecurityattachment()
	 * @generated
	 * @ordered
	 */
	protected DatabaseConnectorSecurityAttachment databaseconnectorsecurityattachment;

	/**
	 * The cached value of the '{@link #getDatabasesecurityconnector() <em>Databasesecurityconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasesecurityconnector()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSecurityConnector databasesecurityconnector;

	/**
	 * The cached value of the '{@link #getConnectordatabasesecurityattachment() <em>Connectordatabasesecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectordatabasesecurityattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectorDatabaseSecurityAttachment connectordatabasesecurityattachment;

	/**
	 * The cached value of the '{@link #getSecurityconnectordatabaseattachment() <em>Securityconnectordatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityconnectordatabaseattachment()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectorDatabaseAttachment securityconnectordatabaseattachment;

	/**
	 * The cached value of the '{@link #getSecuritymanager() <em>Securitymanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanager()
	 * @generated
	 * @ordered
	 */
	protected cOSA_m1.SecurityManager securitymanager;

	/**
	 * The cached value of the '{@link #getSecurityconnectorconnectionattachment() <em>Securityconnectorconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityconnectorconnectionattachment()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectorConnectionAttachment securityconnectorconnectionattachment;

	/**
	 * The cached value of the '{@link #getConnectorconnectionsecurityattachment() <em>Connectorconnectionsecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorconnectionsecurityattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectorConnectionSecurityAttachment connectorconnectionsecurityattachment;

	/**
	 * The cached value of the '{@link #getConnectionsecurityconnector() <em>Connectionsecurityconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsecurityconnector()
	 * @generated
	 * @ordered
	 */
	protected ConnectionSecurityConnector connectionsecurityconnector;

	/**
	 * The cached value of the '{@link #getConnectorsecurityconnectionattachment() <em>Connectorsecurityconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorsecurityconnectionattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectorSecurityConnectionAttachment connectorsecurityconnectionattachment;

	/**
	 * The cached value of the '{@link #getConnectionconnectorsecurityattachment() <em>Connectionconnectorsecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionconnectorsecurityattachment()
	 * @generated
	 * @ordered
	 */
	protected ConnectionConnectorSecurityAttachment connectionconnectorsecurityattachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInput getServerinput() {
		return serverinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerinput(ServerInput newServerinput, NotificationChain msgs) {
		ServerInput oldServerinput = serverinput;
		serverinput = newServerinput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SERVERINPUT, oldServerinput, newServerinput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerinput(ServerInput newServerinput) {
		if (newServerinput != serverinput) {
			NotificationChain msgs = null;
			if (serverinput != null)
				msgs = ((InternalEObject)serverinput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SERVERINPUT, null, msgs);
			if (newServerinput != null)
				msgs = ((InternalEObject)newServerinput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SERVERINPUT, null, msgs);
			msgs = basicSetServerinput(newServerinput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SERVERINPUT, newServerinput, newServerinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOuput getServerouput() {
		return serverouput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerouput(ServerOuput newServerouput, NotificationChain msgs) {
		ServerOuput oldServerouput = serverouput;
		serverouput = newServerouput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SERVEROUPUT, oldServerouput, newServerouput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerouput(ServerOuput newServerouput) {
		if (newServerouput != serverouput) {
			NotificationChain msgs = null;
			if (serverouput != null)
				msgs = ((InternalEObject)serverouput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SERVEROUPUT, null, msgs);
			if (newServerouput != null)
				msgs = ((InternalEObject)newServerouput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SERVEROUPUT, null, msgs);
			msgs = basicSetServerouput(newServerouput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SERVEROUPUT, newServerouput, newServerouput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBinding getOutputbinding() {
		return outputbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputbinding(OutputBinding newOutputbinding, NotificationChain msgs) {
		OutputBinding oldOutputbinding = outputbinding;
		outputbinding = newOutputbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__OUTPUTBINDING, oldOutputbinding, newOutputbinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputbinding(OutputBinding newOutputbinding) {
		if (newOutputbinding != outputbinding) {
			NotificationChain msgs = null;
			if (outputbinding != null)
				msgs = ((InternalEObject)outputbinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__OUTPUTBINDING, null, msgs);
			if (newOutputbinding != null)
				msgs = ((InternalEObject)newOutputbinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__OUTPUTBINDING, null, msgs);
			msgs = basicSetOutputbinding(newOutputbinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__OUTPUTBINDING, newOutputbinding, newOutputbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBinding getInputbinding() {
		return inputbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputbinding(InputBinding newInputbinding, NotificationChain msgs) {
		InputBinding oldInputbinding = inputbinding;
		inputbinding = newInputbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__INPUTBINDING, oldInputbinding, newInputbinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputbinding(InputBinding newInputbinding) {
		if (newInputbinding != inputbinding) {
			NotificationChain msgs = null;
			if (inputbinding != null)
				msgs = ((InternalEObject)inputbinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__INPUTBINDING, null, msgs);
			if (newInputbinding != null)
				msgs = ((InternalEObject)newInputbinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__INPUTBINDING, null, msgs);
			msgs = basicSetInputbinding(newInputbinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__INPUTBINDING, newInputbinding, newInputbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager getConnectionmanager() {
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionmanager(ConnectionManager newConnectionmanager, NotificationChain msgs) {
		ConnectionManager oldConnectionmanager = connectionmanager;
		connectionmanager = newConnectionmanager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONMANAGER, oldConnectionmanager, newConnectionmanager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionmanager(ConnectionManager newConnectionmanager) {
		if (newConnectionmanager != connectionmanager) {
			NotificationChain msgs = null;
			if (connectionmanager != null)
				msgs = ((InternalEObject)connectionmanager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONMANAGER, null, msgs);
			if (newConnectionmanager != null)
				msgs = ((InternalEObject)newConnectionmanager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONMANAGER, null, msgs);
			msgs = basicSetConnectionmanager(newConnectionmanager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONMANAGER, newConnectionmanager, newConnectionmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDatabaseConnectionAttachment getConnectordatabaseconnectionattachment() {
		return connectordatabaseconnectionattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectordatabaseconnectionattachment(ConnectorDatabaseConnectionAttachment newConnectordatabaseconnectionattachment, NotificationChain msgs) {
		ConnectorDatabaseConnectionAttachment oldConnectordatabaseconnectionattachment = connectordatabaseconnectionattachment;
		connectordatabaseconnectionattachment = newConnectordatabaseconnectionattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT, oldConnectordatabaseconnectionattachment, newConnectordatabaseconnectionattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectordatabaseconnectionattachment(ConnectorDatabaseConnectionAttachment newConnectordatabaseconnectionattachment) {
		if (newConnectordatabaseconnectionattachment != connectordatabaseconnectionattachment) {
			NotificationChain msgs = null;
			if (connectordatabaseconnectionattachment != null)
				msgs = ((InternalEObject)connectordatabaseconnectionattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT, null, msgs);
			if (newConnectordatabaseconnectionattachment != null)
				msgs = ((InternalEObject)newConnectordatabaseconnectionattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT, null, msgs);
			msgs = basicSetConnectordatabaseconnectionattachment(newConnectordatabaseconnectionattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT, newConnectordatabaseconnectionattachment, newConnectordatabaseconnectionattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionConnectorDatabaseAttachment getConnectionconnectordatabaseattachment() {
		return connectionconnectordatabaseattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionconnectordatabaseattachment(ConnectionConnectorDatabaseAttachment newConnectionconnectordatabaseattachment, NotificationChain msgs) {
		ConnectionConnectorDatabaseAttachment oldConnectionconnectordatabaseattachment = connectionconnectordatabaseattachment;
		connectionconnectordatabaseattachment = newConnectionconnectordatabaseattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT, oldConnectionconnectordatabaseattachment, newConnectionconnectordatabaseattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionconnectordatabaseattachment(ConnectionConnectorDatabaseAttachment newConnectionconnectordatabaseattachment) {
		if (newConnectionconnectordatabaseattachment != connectionconnectordatabaseattachment) {
			NotificationChain msgs = null;
			if (connectionconnectordatabaseattachment != null)
				msgs = ((InternalEObject)connectionconnectordatabaseattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT, null, msgs);
			if (newConnectionconnectordatabaseattachment != null)
				msgs = ((InternalEObject)newConnectionconnectordatabaseattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT, null, msgs);
			msgs = basicSetConnectionconnectordatabaseattachment(newConnectionconnectordatabaseattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT, newConnectionconnectordatabaseattachment, newConnectionconnectordatabaseattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDatabaseConnector getConnectiondatabaseconnector() {
		return connectiondatabaseconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectiondatabaseconnector(ConnectionDatabaseConnector newConnectiondatabaseconnector, NotificationChain msgs) {
		ConnectionDatabaseConnector oldConnectiondatabaseconnector = connectiondatabaseconnector;
		connectiondatabaseconnector = newConnectiondatabaseconnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR, oldConnectiondatabaseconnector, newConnectiondatabaseconnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectiondatabaseconnector(ConnectionDatabaseConnector newConnectiondatabaseconnector) {
		if (newConnectiondatabaseconnector != connectiondatabaseconnector) {
			NotificationChain msgs = null;
			if (connectiondatabaseconnector != null)
				msgs = ((InternalEObject)connectiondatabaseconnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR, null, msgs);
			if (newConnectiondatabaseconnector != null)
				msgs = ((InternalEObject)newConnectiondatabaseconnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR, null, msgs);
			msgs = basicSetConnectiondatabaseconnector(newConnectiondatabaseconnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR, newConnectiondatabaseconnector, newConnectiondatabaseconnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseConnectorConnectionAttachment getDatabaseconnectorconnectionattachment() {
		return databaseconnectorconnectionattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseconnectorconnectionattachment(DatabaseConnectorConnectionAttachment newDatabaseconnectorconnectionattachment, NotificationChain msgs) {
		DatabaseConnectorConnectionAttachment oldDatabaseconnectorconnectionattachment = databaseconnectorconnectionattachment;
		databaseconnectorconnectionattachment = newDatabaseconnectorconnectionattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT, oldDatabaseconnectorconnectionattachment, newDatabaseconnectorconnectionattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseconnectorconnectionattachment(DatabaseConnectorConnectionAttachment newDatabaseconnectorconnectionattachment) {
		if (newDatabaseconnectorconnectionattachment != databaseconnectorconnectionattachment) {
			NotificationChain msgs = null;
			if (databaseconnectorconnectionattachment != null)
				msgs = ((InternalEObject)databaseconnectorconnectionattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT, null, msgs);
			if (newDatabaseconnectorconnectionattachment != null)
				msgs = ((InternalEObject)newDatabaseconnectorconnectionattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT, null, msgs);
			msgs = basicSetDatabaseconnectorconnectionattachment(newDatabaseconnectorconnectionattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT, newDatabaseconnectorconnectionattachment, newDatabaseconnectorconnectionattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorConnectionDatabaseAttachment getConnectorconnectiondatabaseattachment() {
		return connectorconnectiondatabaseattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorconnectiondatabaseattachment(ConnectorConnectionDatabaseAttachment newConnectorconnectiondatabaseattachment, NotificationChain msgs) {
		ConnectorConnectionDatabaseAttachment oldConnectorconnectiondatabaseattachment = connectorconnectiondatabaseattachment;
		connectorconnectiondatabaseattachment = newConnectorconnectiondatabaseattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT, oldConnectorconnectiondatabaseattachment, newConnectorconnectiondatabaseattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorconnectiondatabaseattachment(ConnectorConnectionDatabaseAttachment newConnectorconnectiondatabaseattachment) {
		if (newConnectorconnectiondatabaseattachment != connectorconnectiondatabaseattachment) {
			NotificationChain msgs = null;
			if (connectorconnectiondatabaseattachment != null)
				msgs = ((InternalEObject)connectorconnectiondatabaseattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT, null, msgs);
			if (newConnectorconnectiondatabaseattachment != null)
				msgs = ((InternalEObject)newConnectorconnectiondatabaseattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT, null, msgs);
			msgs = basicSetConnectorconnectiondatabaseattachment(newConnectorconnectiondatabaseattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT, newConnectorconnectiondatabaseattachment, newConnectorconnectiondatabaseattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(DataBase newDatabase, NotificationChain msgs) {
		DataBase oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DataBase newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSecurityDatabaseAttachment getConnectorsecuritydatabaseattachment() {
		return connectorsecuritydatabaseattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorsecuritydatabaseattachment(ConnectorSecurityDatabaseAttachment newConnectorsecuritydatabaseattachment, NotificationChain msgs) {
		ConnectorSecurityDatabaseAttachment oldConnectorsecuritydatabaseattachment = connectorsecuritydatabaseattachment;
		connectorsecuritydatabaseattachment = newConnectorsecuritydatabaseattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT, oldConnectorsecuritydatabaseattachment, newConnectorsecuritydatabaseattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorsecuritydatabaseattachment(ConnectorSecurityDatabaseAttachment newConnectorsecuritydatabaseattachment) {
		if (newConnectorsecuritydatabaseattachment != connectorsecuritydatabaseattachment) {
			NotificationChain msgs = null;
			if (connectorsecuritydatabaseattachment != null)
				msgs = ((InternalEObject)connectorsecuritydatabaseattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT, null, msgs);
			if (newConnectorsecuritydatabaseattachment != null)
				msgs = ((InternalEObject)newConnectorsecuritydatabaseattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT, null, msgs);
			msgs = basicSetConnectorsecuritydatabaseattachment(newConnectorsecuritydatabaseattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT, newConnectorsecuritydatabaseattachment, newConnectorsecuritydatabaseattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseConnectorSecurityAttachment getDatabaseconnectorsecurityattachment() {
		return databaseconnectorsecurityattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseconnectorsecurityattachment(DatabaseConnectorSecurityAttachment newDatabaseconnectorsecurityattachment, NotificationChain msgs) {
		DatabaseConnectorSecurityAttachment oldDatabaseconnectorsecurityattachment = databaseconnectorsecurityattachment;
		databaseconnectorsecurityattachment = newDatabaseconnectorsecurityattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT, oldDatabaseconnectorsecurityattachment, newDatabaseconnectorsecurityattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseconnectorsecurityattachment(DatabaseConnectorSecurityAttachment newDatabaseconnectorsecurityattachment) {
		if (newDatabaseconnectorsecurityattachment != databaseconnectorsecurityattachment) {
			NotificationChain msgs = null;
			if (databaseconnectorsecurityattachment != null)
				msgs = ((InternalEObject)databaseconnectorsecurityattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT, null, msgs);
			if (newDatabaseconnectorsecurityattachment != null)
				msgs = ((InternalEObject)newDatabaseconnectorsecurityattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT, null, msgs);
			msgs = basicSetDatabaseconnectorsecurityattachment(newDatabaseconnectorsecurityattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT, newDatabaseconnectorsecurityattachment, newDatabaseconnectorsecurityattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityConnector getDatabasesecurityconnector() {
		return databasesecurityconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabasesecurityconnector(DatabaseSecurityConnector newDatabasesecurityconnector, NotificationChain msgs) {
		DatabaseSecurityConnector oldDatabasesecurityconnector = databasesecurityconnector;
		databasesecurityconnector = newDatabasesecurityconnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR, oldDatabasesecurityconnector, newDatabasesecurityconnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasesecurityconnector(DatabaseSecurityConnector newDatabasesecurityconnector) {
		if (newDatabasesecurityconnector != databasesecurityconnector) {
			NotificationChain msgs = null;
			if (databasesecurityconnector != null)
				msgs = ((InternalEObject)databasesecurityconnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR, null, msgs);
			if (newDatabasesecurityconnector != null)
				msgs = ((InternalEObject)newDatabasesecurityconnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR, null, msgs);
			msgs = basicSetDatabasesecurityconnector(newDatabasesecurityconnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR, newDatabasesecurityconnector, newDatabasesecurityconnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDatabaseSecurityAttachment getConnectordatabasesecurityattachment() {
		return connectordatabasesecurityattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectordatabasesecurityattachment(ConnectorDatabaseSecurityAttachment newConnectordatabasesecurityattachment, NotificationChain msgs) {
		ConnectorDatabaseSecurityAttachment oldConnectordatabasesecurityattachment = connectordatabasesecurityattachment;
		connectordatabasesecurityattachment = newConnectordatabasesecurityattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT, oldConnectordatabasesecurityattachment, newConnectordatabasesecurityattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectordatabasesecurityattachment(ConnectorDatabaseSecurityAttachment newConnectordatabasesecurityattachment) {
		if (newConnectordatabasesecurityattachment != connectordatabasesecurityattachment) {
			NotificationChain msgs = null;
			if (connectordatabasesecurityattachment != null)
				msgs = ((InternalEObject)connectordatabasesecurityattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT, null, msgs);
			if (newConnectordatabasesecurityattachment != null)
				msgs = ((InternalEObject)newConnectordatabasesecurityattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT, null, msgs);
			msgs = basicSetConnectordatabasesecurityattachment(newConnectordatabasesecurityattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT, newConnectordatabasesecurityattachment, newConnectordatabasesecurityattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectorDatabaseAttachment getSecurityconnectordatabaseattachment() {
		return securityconnectordatabaseattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityconnectordatabaseattachment(SecurityConnectorDatabaseAttachment newSecurityconnectordatabaseattachment, NotificationChain msgs) {
		SecurityConnectorDatabaseAttachment oldSecurityconnectordatabaseattachment = securityconnectordatabaseattachment;
		securityconnectordatabaseattachment = newSecurityconnectordatabaseattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT, oldSecurityconnectordatabaseattachment, newSecurityconnectordatabaseattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityconnectordatabaseattachment(SecurityConnectorDatabaseAttachment newSecurityconnectordatabaseattachment) {
		if (newSecurityconnectordatabaseattachment != securityconnectordatabaseattachment) {
			NotificationChain msgs = null;
			if (securityconnectordatabaseattachment != null)
				msgs = ((InternalEObject)securityconnectordatabaseattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT, null, msgs);
			if (newSecurityconnectordatabaseattachment != null)
				msgs = ((InternalEObject)newSecurityconnectordatabaseattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT, null, msgs);
			msgs = basicSetSecurityconnectordatabaseattachment(newSecurityconnectordatabaseattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT, newSecurityconnectordatabaseattachment, newSecurityconnectordatabaseattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cOSA_m1.SecurityManager getSecuritymanager() {
		return securitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuritymanager(cOSA_m1.SecurityManager newSecuritymanager, NotificationChain msgs) {
		cOSA_m1.SecurityManager oldSecuritymanager = securitymanager;
		securitymanager = newSecuritymanager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SECURITYMANAGER, oldSecuritymanager, newSecuritymanager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritymanager(cOSA_m1.SecurityManager newSecuritymanager) {
		if (newSecuritymanager != securitymanager) {
			NotificationChain msgs = null;
			if (securitymanager != null)
				msgs = ((InternalEObject)securitymanager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SECURITYMANAGER, null, msgs);
			if (newSecuritymanager != null)
				msgs = ((InternalEObject)newSecuritymanager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SECURITYMANAGER, null, msgs);
			msgs = basicSetSecuritymanager(newSecuritymanager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SECURITYMANAGER, newSecuritymanager, newSecuritymanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectorConnectionAttachment getSecurityconnectorconnectionattachment() {
		return securityconnectorconnectionattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityconnectorconnectionattachment(SecurityConnectorConnectionAttachment newSecurityconnectorconnectionattachment, NotificationChain msgs) {
		SecurityConnectorConnectionAttachment oldSecurityconnectorconnectionattachment = securityconnectorconnectionattachment;
		securityconnectorconnectionattachment = newSecurityconnectorconnectionattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT, oldSecurityconnectorconnectionattachment, newSecurityconnectorconnectionattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityconnectorconnectionattachment(SecurityConnectorConnectionAttachment newSecurityconnectorconnectionattachment) {
		if (newSecurityconnectorconnectionattachment != securityconnectorconnectionattachment) {
			NotificationChain msgs = null;
			if (securityconnectorconnectionattachment != null)
				msgs = ((InternalEObject)securityconnectorconnectionattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT, null, msgs);
			if (newSecurityconnectorconnectionattachment != null)
				msgs = ((InternalEObject)newSecurityconnectorconnectionattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT, null, msgs);
			msgs = basicSetSecurityconnectorconnectionattachment(newSecurityconnectorconnectionattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT, newSecurityconnectorconnectionattachment, newSecurityconnectorconnectionattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorConnectionSecurityAttachment getConnectorconnectionsecurityattachment() {
		return connectorconnectionsecurityattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorconnectionsecurityattachment(ConnectorConnectionSecurityAttachment newConnectorconnectionsecurityattachment, NotificationChain msgs) {
		ConnectorConnectionSecurityAttachment oldConnectorconnectionsecurityattachment = connectorconnectionsecurityattachment;
		connectorconnectionsecurityattachment = newConnectorconnectionsecurityattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT, oldConnectorconnectionsecurityattachment, newConnectorconnectionsecurityattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorconnectionsecurityattachment(ConnectorConnectionSecurityAttachment newConnectorconnectionsecurityattachment) {
		if (newConnectorconnectionsecurityattachment != connectorconnectionsecurityattachment) {
			NotificationChain msgs = null;
			if (connectorconnectionsecurityattachment != null)
				msgs = ((InternalEObject)connectorconnectionsecurityattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT, null, msgs);
			if (newConnectorconnectionsecurityattachment != null)
				msgs = ((InternalEObject)newConnectorconnectionsecurityattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT, null, msgs);
			msgs = basicSetConnectorconnectionsecurityattachment(newConnectorconnectionsecurityattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT, newConnectorconnectionsecurityattachment, newConnectorconnectionsecurityattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityConnector getConnectionsecurityconnector() {
		return connectionsecurityconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionsecurityconnector(ConnectionSecurityConnector newConnectionsecurityconnector, NotificationChain msgs) {
		ConnectionSecurityConnector oldConnectionsecurityconnector = connectionsecurityconnector;
		connectionsecurityconnector = newConnectionsecurityconnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR, oldConnectionsecurityconnector, newConnectionsecurityconnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionsecurityconnector(ConnectionSecurityConnector newConnectionsecurityconnector) {
		if (newConnectionsecurityconnector != connectionsecurityconnector) {
			NotificationChain msgs = null;
			if (connectionsecurityconnector != null)
				msgs = ((InternalEObject)connectionsecurityconnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR, null, msgs);
			if (newConnectionsecurityconnector != null)
				msgs = ((InternalEObject)newConnectionsecurityconnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR, null, msgs);
			msgs = basicSetConnectionsecurityconnector(newConnectionsecurityconnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR, newConnectionsecurityconnector, newConnectionsecurityconnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSecurityConnectionAttachment getConnectorsecurityconnectionattachment() {
		return connectorsecurityconnectionattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorsecurityconnectionattachment(ConnectorSecurityConnectionAttachment newConnectorsecurityconnectionattachment, NotificationChain msgs) {
		ConnectorSecurityConnectionAttachment oldConnectorsecurityconnectionattachment = connectorsecurityconnectionattachment;
		connectorsecurityconnectionattachment = newConnectorsecurityconnectionattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT, oldConnectorsecurityconnectionattachment, newConnectorsecurityconnectionattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorsecurityconnectionattachment(ConnectorSecurityConnectionAttachment newConnectorsecurityconnectionattachment) {
		if (newConnectorsecurityconnectionattachment != connectorsecurityconnectionattachment) {
			NotificationChain msgs = null;
			if (connectorsecurityconnectionattachment != null)
				msgs = ((InternalEObject)connectorsecurityconnectionattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT, null, msgs);
			if (newConnectorsecurityconnectionattachment != null)
				msgs = ((InternalEObject)newConnectorsecurityconnectionattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT, null, msgs);
			msgs = basicSetConnectorsecurityconnectionattachment(newConnectorsecurityconnectionattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT, newConnectorsecurityconnectionattachment, newConnectorsecurityconnectionattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionConnectorSecurityAttachment getConnectionconnectorsecurityattachment() {
		return connectionconnectorsecurityattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionconnectorsecurityattachment(ConnectionConnectorSecurityAttachment newConnectionconnectorsecurityattachment, NotificationChain msgs) {
		ConnectionConnectorSecurityAttachment oldConnectionconnectorsecurityattachment = connectionconnectorsecurityattachment;
		connectionconnectorsecurityattachment = newConnectionconnectorsecurityattachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT, oldConnectionconnectorsecurityattachment, newConnectionconnectorsecurityattachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionconnectorsecurityattachment(ConnectionConnectorSecurityAttachment newConnectionconnectorsecurityattachment) {
		if (newConnectionconnectorsecurityattachment != connectionconnectorsecurityattachment) {
			NotificationChain msgs = null;
			if (connectionconnectorsecurityattachment != null)
				msgs = ((InternalEObject)connectionconnectorsecurityattachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT, null, msgs);
			if (newConnectionconnectorsecurityattachment != null)
				msgs = ((InternalEObject)newConnectionconnectorsecurityattachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT, null, msgs);
			msgs = basicSetConnectionconnectorsecurityattachment(newConnectionconnectorsecurityattachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT, newConnectionconnectorsecurityattachment, newConnectionconnectorsecurityattachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.SERVER__SERVERINPUT:
				return basicSetServerinput(null, msgs);
			case COSA_m1Package.SERVER__SERVEROUPUT:
				return basicSetServerouput(null, msgs);
			case COSA_m1Package.SERVER__OUTPUTBINDING:
				return basicSetOutputbinding(null, msgs);
			case COSA_m1Package.SERVER__INPUTBINDING:
				return basicSetInputbinding(null, msgs);
			case COSA_m1Package.SERVER__CONNECTIONMANAGER:
				return basicSetConnectionmanager(null, msgs);
			case COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT:
				return basicSetConnectordatabaseconnectionattachment(null, msgs);
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT:
				return basicSetConnectionconnectordatabaseattachment(null, msgs);
			case COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR:
				return basicSetConnectiondatabaseconnector(null, msgs);
			case COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT:
				return basicSetDatabaseconnectorconnectionattachment(null, msgs);
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT:
				return basicSetConnectorconnectiondatabaseattachment(null, msgs);
			case COSA_m1Package.SERVER__DATABASE:
				return basicSetDatabase(null, msgs);
			case COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT:
				return basicSetConnectorsecuritydatabaseattachment(null, msgs);
			case COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT:
				return basicSetDatabaseconnectorsecurityattachment(null, msgs);
			case COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR:
				return basicSetDatabasesecurityconnector(null, msgs);
			case COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT:
				return basicSetConnectordatabasesecurityattachment(null, msgs);
			case COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT:
				return basicSetSecurityconnectordatabaseattachment(null, msgs);
			case COSA_m1Package.SERVER__SECURITYMANAGER:
				return basicSetSecuritymanager(null, msgs);
			case COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT:
				return basicSetSecurityconnectorconnectionattachment(null, msgs);
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT:
				return basicSetConnectorconnectionsecurityattachment(null, msgs);
			case COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR:
				return basicSetConnectionsecurityconnector(null, msgs);
			case COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT:
				return basicSetConnectorsecurityconnectionattachment(null, msgs);
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT:
				return basicSetConnectionconnectorsecurityattachment(null, msgs);
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
			case COSA_m1Package.SERVER__SERVERINPUT:
				return getServerinput();
			case COSA_m1Package.SERVER__SERVEROUPUT:
				return getServerouput();
			case COSA_m1Package.SERVER__OUTPUTBINDING:
				return getOutputbinding();
			case COSA_m1Package.SERVER__INPUTBINDING:
				return getInputbinding();
			case COSA_m1Package.SERVER__CONNECTIONMANAGER:
				return getConnectionmanager();
			case COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT:
				return getConnectordatabaseconnectionattachment();
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT:
				return getConnectionconnectordatabaseattachment();
			case COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR:
				return getConnectiondatabaseconnector();
			case COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT:
				return getDatabaseconnectorconnectionattachment();
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT:
				return getConnectorconnectiondatabaseattachment();
			case COSA_m1Package.SERVER__DATABASE:
				return getDatabase();
			case COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT:
				return getConnectorsecuritydatabaseattachment();
			case COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT:
				return getDatabaseconnectorsecurityattachment();
			case COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR:
				return getDatabasesecurityconnector();
			case COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT:
				return getConnectordatabasesecurityattachment();
			case COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT:
				return getSecurityconnectordatabaseattachment();
			case COSA_m1Package.SERVER__SECURITYMANAGER:
				return getSecuritymanager();
			case COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT:
				return getSecurityconnectorconnectionattachment();
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT:
				return getConnectorconnectionsecurityattachment();
			case COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR:
				return getConnectionsecurityconnector();
			case COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT:
				return getConnectorsecurityconnectionattachment();
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT:
				return getConnectionconnectorsecurityattachment();
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
			case COSA_m1Package.SERVER__SERVERINPUT:
				setServerinput((ServerInput)newValue);
				return;
			case COSA_m1Package.SERVER__SERVEROUPUT:
				setServerouput((ServerOuput)newValue);
				return;
			case COSA_m1Package.SERVER__OUTPUTBINDING:
				setOutputbinding((OutputBinding)newValue);
				return;
			case COSA_m1Package.SERVER__INPUTBINDING:
				setInputbinding((InputBinding)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT:
				setConnectordatabaseconnectionattachment((ConnectorDatabaseConnectionAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT:
				setConnectionconnectordatabaseattachment((ConnectionConnectorDatabaseAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR:
				setConnectiondatabaseconnector((ConnectionDatabaseConnector)newValue);
				return;
			case COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT:
				setDatabaseconnectorconnectionattachment((DatabaseConnectorConnectionAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT:
				setConnectorconnectiondatabaseattachment((ConnectorConnectionDatabaseAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__DATABASE:
				setDatabase((DataBase)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT:
				setConnectorsecuritydatabaseattachment((ConnectorSecurityDatabaseAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT:
				setDatabaseconnectorsecurityattachment((DatabaseConnectorSecurityAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR:
				setDatabasesecurityconnector((DatabaseSecurityConnector)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT:
				setConnectordatabasesecurityattachment((ConnectorDatabaseSecurityAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT:
				setSecurityconnectordatabaseattachment((SecurityConnectorDatabaseAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__SECURITYMANAGER:
				setSecuritymanager((cOSA_m1.SecurityManager)newValue);
				return;
			case COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT:
				setSecurityconnectorconnectionattachment((SecurityConnectorConnectionAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT:
				setConnectorconnectionsecurityattachment((ConnectorConnectionSecurityAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR:
				setConnectionsecurityconnector((ConnectionSecurityConnector)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT:
				setConnectorsecurityconnectionattachment((ConnectorSecurityConnectionAttachment)newValue);
				return;
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT:
				setConnectionconnectorsecurityattachment((ConnectionConnectorSecurityAttachment)newValue);
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
			case COSA_m1Package.SERVER__SERVERINPUT:
				setServerinput((ServerInput)null);
				return;
			case COSA_m1Package.SERVER__SERVEROUPUT:
				setServerouput((ServerOuput)null);
				return;
			case COSA_m1Package.SERVER__OUTPUTBINDING:
				setOutputbinding((OutputBinding)null);
				return;
			case COSA_m1Package.SERVER__INPUTBINDING:
				setInputbinding((InputBinding)null);
				return;
			case COSA_m1Package.SERVER__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)null);
				return;
			case COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT:
				setConnectordatabaseconnectionattachment((ConnectorDatabaseConnectionAttachment)null);
				return;
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT:
				setConnectionconnectordatabaseattachment((ConnectionConnectorDatabaseAttachment)null);
				return;
			case COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR:
				setConnectiondatabaseconnector((ConnectionDatabaseConnector)null);
				return;
			case COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT:
				setDatabaseconnectorconnectionattachment((DatabaseConnectorConnectionAttachment)null);
				return;
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT:
				setConnectorconnectiondatabaseattachment((ConnectorConnectionDatabaseAttachment)null);
				return;
			case COSA_m1Package.SERVER__DATABASE:
				setDatabase((DataBase)null);
				return;
			case COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT:
				setConnectorsecuritydatabaseattachment((ConnectorSecurityDatabaseAttachment)null);
				return;
			case COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT:
				setDatabaseconnectorsecurityattachment((DatabaseConnectorSecurityAttachment)null);
				return;
			case COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR:
				setDatabasesecurityconnector((DatabaseSecurityConnector)null);
				return;
			case COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT:
				setConnectordatabasesecurityattachment((ConnectorDatabaseSecurityAttachment)null);
				return;
			case COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT:
				setSecurityconnectordatabaseattachment((SecurityConnectorDatabaseAttachment)null);
				return;
			case COSA_m1Package.SERVER__SECURITYMANAGER:
				setSecuritymanager((cOSA_m1.SecurityManager)null);
				return;
			case COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT:
				setSecurityconnectorconnectionattachment((SecurityConnectorConnectionAttachment)null);
				return;
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT:
				setConnectorconnectionsecurityattachment((ConnectorConnectionSecurityAttachment)null);
				return;
			case COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR:
				setConnectionsecurityconnector((ConnectionSecurityConnector)null);
				return;
			case COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT:
				setConnectorsecurityconnectionattachment((ConnectorSecurityConnectionAttachment)null);
				return;
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT:
				setConnectionconnectorsecurityattachment((ConnectionConnectorSecurityAttachment)null);
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
			case COSA_m1Package.SERVER__SERVERINPUT:
				return serverinput != null;
			case COSA_m1Package.SERVER__SERVEROUPUT:
				return serverouput != null;
			case COSA_m1Package.SERVER__OUTPUTBINDING:
				return outputbinding != null;
			case COSA_m1Package.SERVER__INPUTBINDING:
				return inputbinding != null;
			case COSA_m1Package.SERVER__CONNECTIONMANAGER:
				return connectionmanager != null;
			case COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT:
				return connectordatabaseconnectionattachment != null;
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT:
				return connectionconnectordatabaseattachment != null;
			case COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR:
				return connectiondatabaseconnector != null;
			case COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT:
				return databaseconnectorconnectionattachment != null;
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT:
				return connectorconnectiondatabaseattachment != null;
			case COSA_m1Package.SERVER__DATABASE:
				return database != null;
			case COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT:
				return connectorsecuritydatabaseattachment != null;
			case COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT:
				return databaseconnectorsecurityattachment != null;
			case COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR:
				return databasesecurityconnector != null;
			case COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT:
				return connectordatabasesecurityattachment != null;
			case COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT:
				return securityconnectordatabaseattachment != null;
			case COSA_m1Package.SERVER__SECURITYMANAGER:
				return securitymanager != null;
			case COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT:
				return securityconnectorconnectionattachment != null;
			case COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT:
				return connectorconnectionsecurityattachment != null;
			case COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR:
				return connectionsecurityconnector != null;
			case COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT:
				return connectorsecurityconnectionattachment != null;
			case COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT:
				return connectionconnectorsecurityattachment != null;
		}
		return super.eIsSet(featureID);
	}

} //ServerImpl
