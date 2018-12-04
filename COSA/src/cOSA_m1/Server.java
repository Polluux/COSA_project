/**
 */
package cOSA_m1;

import cOSA.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.Server#getServerinput <em>Serverinput</em>}</li>
 *   <li>{@link cOSA_m1.Server#getServerouput <em>Serverouput</em>}</li>
 *   <li>{@link cOSA_m1.Server#getOutputbinding <em>Outputbinding</em>}</li>
 *   <li>{@link cOSA_m1.Server#getInputbinding <em>Inputbinding</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectordatabaseconnectionattachment <em>Connectordatabaseconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectionconnectordatabaseattachment <em>Connectionconnectordatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectiondatabaseconnector <em>Connectiondatabaseconnector</em>}</li>
 *   <li>{@link cOSA_m1.Server#getDatabaseconnectorconnectionattachment <em>Databaseconnectorconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectorconnectiondatabaseattachment <em>Connectorconnectiondatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getDatabase <em>Database</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectorsecuritydatabaseattachment <em>Connectorsecuritydatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getDatabaseconnectorsecurityattachment <em>Databaseconnectorsecurityattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getDatabasesecurityconnector <em>Databasesecurityconnector</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectordatabasesecurityattachment <em>Connectordatabasesecurityattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getSecurityconnectordatabaseattachment <em>Securityconnectordatabaseattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link cOSA_m1.Server#getSecurityconnectorconnectionattachment <em>Securityconnectorconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectorconnectionsecurityattachment <em>Connectorconnectionsecurityattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectionsecurityconnector <em>Connectionsecurityconnector</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectorsecurityconnectionattachment <em>Connectorsecurityconnectionattachment</em>}</li>
 *   <li>{@link cOSA_m1.Server#getConnectionconnectorsecurityattachment <em>Connectionconnectorsecurityattachment</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getServer()
 * @model
 * @generated
 */
public interface Server extends Configuration {
	/**
	 * Returns the value of the '<em><b>Serverinput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverinput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverinput</em>' containment reference.
	 * @see #setServerinput(ServerInput)
	 * @see cOSA_m1.COSA_m1Package#getServer_Serverinput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServerInput getServerinput();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getServerinput <em>Serverinput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverinput</em>' containment reference.
	 * @see #getServerinput()
	 * @generated
	 */
	void setServerinput(ServerInput value);

	/**
	 * Returns the value of the '<em><b>Serverouput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverouput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverouput</em>' containment reference.
	 * @see #setServerouput(ServerOuput)
	 * @see cOSA_m1.COSA_m1Package#getServer_Serverouput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServerOuput getServerouput();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getServerouput <em>Serverouput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverouput</em>' containment reference.
	 * @see #getServerouput()
	 * @generated
	 */
	void setServerouput(ServerOuput value);

	/**
	 * Returns the value of the '<em><b>Outputbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputbinding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputbinding</em>' containment reference.
	 * @see #setOutputbinding(OutputBinding)
	 * @see cOSA_m1.COSA_m1Package#getServer_Outputbinding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputBinding getOutputbinding();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getOutputbinding <em>Outputbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputbinding</em>' containment reference.
	 * @see #getOutputbinding()
	 * @generated
	 */
	void setOutputbinding(OutputBinding value);

	/**
	 * Returns the value of the '<em><b>Inputbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputbinding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputbinding</em>' containment reference.
	 * @see #setInputbinding(InputBinding)
	 * @see cOSA_m1.COSA_m1Package#getServer_Inputbinding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputBinding getInputbinding();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getInputbinding <em>Inputbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputbinding</em>' containment reference.
	 * @see #getInputbinding()
	 * @generated
	 */
	void setInputbinding(InputBinding value);

	/**
	 * Returns the value of the '<em><b>Connectionmanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionmanager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionmanager</em>' containment reference.
	 * @see #setConnectionmanager(ConnectionManager)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectionmanager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionManager getConnectionmanager();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectionmanager <em>Connectionmanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionmanager</em>' containment reference.
	 * @see #getConnectionmanager()
	 * @generated
	 */
	void setConnectionmanager(ConnectionManager value);

	/**
	 * Returns the value of the '<em><b>Connectordatabaseconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectordatabaseconnectionattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectordatabaseconnectionattachment</em>' containment reference.
	 * @see #setConnectordatabaseconnectionattachment(ConnectorDatabaseConnectionAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectordatabaseconnectionattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorDatabaseConnectionAttachment getConnectordatabaseconnectionattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectordatabaseconnectionattachment <em>Connectordatabaseconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectordatabaseconnectionattachment</em>' containment reference.
	 * @see #getConnectordatabaseconnectionattachment()
	 * @generated
	 */
	void setConnectordatabaseconnectionattachment(ConnectorDatabaseConnectionAttachment value);

	/**
	 * Returns the value of the '<em><b>Connectionconnectordatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionconnectordatabaseattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionconnectordatabaseattachment</em>' containment reference.
	 * @see #setConnectionconnectordatabaseattachment(ConnectionConnectorDatabaseAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectionconnectordatabaseattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionConnectorDatabaseAttachment getConnectionconnectordatabaseattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectionconnectordatabaseattachment <em>Connectionconnectordatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionconnectordatabaseattachment</em>' containment reference.
	 * @see #getConnectionconnectordatabaseattachment()
	 * @generated
	 */
	void setConnectionconnectordatabaseattachment(ConnectionConnectorDatabaseAttachment value);

	/**
	 * Returns the value of the '<em><b>Connectiondatabaseconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectiondatabaseconnector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectiondatabaseconnector</em>' containment reference.
	 * @see #setConnectiondatabaseconnector(ConnectionDatabaseConnector)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectiondatabaseconnector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionDatabaseConnector getConnectiondatabaseconnector();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectiondatabaseconnector <em>Connectiondatabaseconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectiondatabaseconnector</em>' containment reference.
	 * @see #getConnectiondatabaseconnector()
	 * @generated
	 */
	void setConnectiondatabaseconnector(ConnectionDatabaseConnector value);

	/**
	 * Returns the value of the '<em><b>Databaseconnectorconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseconnectorconnectionattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseconnectorconnectionattachment</em>' containment reference.
	 * @see #setDatabaseconnectorconnectionattachment(DatabaseConnectorConnectionAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Databaseconnectorconnectionattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseConnectorConnectionAttachment getDatabaseconnectorconnectionattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getDatabaseconnectorconnectionattachment <em>Databaseconnectorconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseconnectorconnectionattachment</em>' containment reference.
	 * @see #getDatabaseconnectorconnectionattachment()
	 * @generated
	 */
	void setDatabaseconnectorconnectionattachment(DatabaseConnectorConnectionAttachment value);

	/**
	 * Returns the value of the '<em><b>Connectorconnectiondatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectorconnectiondatabaseattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectorconnectiondatabaseattachment</em>' containment reference.
	 * @see #setConnectorconnectiondatabaseattachment(ConnectorConnectionDatabaseAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectorconnectiondatabaseattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorConnectionDatabaseAttachment getConnectorconnectiondatabaseattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectorconnectiondatabaseattachment <em>Connectorconnectiondatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectorconnectiondatabaseattachment</em>' containment reference.
	 * @see #getConnectorconnectiondatabaseattachment()
	 * @generated
	 */
	void setConnectorconnectiondatabaseattachment(ConnectorConnectionDatabaseAttachment value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(DataBase)
	 * @see cOSA_m1.COSA_m1Package#getServer_Database()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataBase getDatabase();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DataBase value);

	/**
	 * Returns the value of the '<em><b>Connectorsecuritydatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectorsecuritydatabaseattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectorsecuritydatabaseattachment</em>' containment reference.
	 * @see #setConnectorsecuritydatabaseattachment(ConnectorSecurityDatabaseAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectorsecuritydatabaseattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorSecurityDatabaseAttachment getConnectorsecuritydatabaseattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectorsecuritydatabaseattachment <em>Connectorsecuritydatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectorsecuritydatabaseattachment</em>' containment reference.
	 * @see #getConnectorsecuritydatabaseattachment()
	 * @generated
	 */
	void setConnectorsecuritydatabaseattachment(ConnectorSecurityDatabaseAttachment value);

	/**
	 * Returns the value of the '<em><b>Databaseconnectorsecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseconnectorsecurityattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseconnectorsecurityattachment</em>' containment reference.
	 * @see #setDatabaseconnectorsecurityattachment(DatabaseConnectorSecurityAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Databaseconnectorsecurityattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseConnectorSecurityAttachment getDatabaseconnectorsecurityattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getDatabaseconnectorsecurityattachment <em>Databaseconnectorsecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseconnectorsecurityattachment</em>' containment reference.
	 * @see #getDatabaseconnectorsecurityattachment()
	 * @generated
	 */
	void setDatabaseconnectorsecurityattachment(DatabaseConnectorSecurityAttachment value);

	/**
	 * Returns the value of the '<em><b>Databasesecurityconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databasesecurityconnector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databasesecurityconnector</em>' containment reference.
	 * @see #setDatabasesecurityconnector(DatabaseSecurityConnector)
	 * @see cOSA_m1.COSA_m1Package#getServer_Databasesecurityconnector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseSecurityConnector getDatabasesecurityconnector();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getDatabasesecurityconnector <em>Databasesecurityconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databasesecurityconnector</em>' containment reference.
	 * @see #getDatabasesecurityconnector()
	 * @generated
	 */
	void setDatabasesecurityconnector(DatabaseSecurityConnector value);

	/**
	 * Returns the value of the '<em><b>Connectordatabasesecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectordatabasesecurityattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectordatabasesecurityattachment</em>' containment reference.
	 * @see #setConnectordatabasesecurityattachment(ConnectorDatabaseSecurityAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectordatabasesecurityattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorDatabaseSecurityAttachment getConnectordatabasesecurityattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectordatabasesecurityattachment <em>Connectordatabasesecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectordatabasesecurityattachment</em>' containment reference.
	 * @see #getConnectordatabasesecurityattachment()
	 * @generated
	 */
	void setConnectordatabasesecurityattachment(ConnectorDatabaseSecurityAttachment value);

	/**
	 * Returns the value of the '<em><b>Securityconnectordatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityconnectordatabaseattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityconnectordatabaseattachment</em>' containment reference.
	 * @see #setSecurityconnectordatabaseattachment(SecurityConnectorDatabaseAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Securityconnectordatabaseattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityConnectorDatabaseAttachment getSecurityconnectordatabaseattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getSecurityconnectordatabaseattachment <em>Securityconnectordatabaseattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityconnectordatabaseattachment</em>' containment reference.
	 * @see #getSecurityconnectordatabaseattachment()
	 * @generated
	 */
	void setSecurityconnectordatabaseattachment(SecurityConnectorDatabaseAttachment value);

	/**
	 * Returns the value of the '<em><b>Securitymanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanager</em>' containment reference.
	 * @see #setSecuritymanager(cOSA_m1.SecurityManager)
	 * @see cOSA_m1.COSA_m1Package#getServer_Securitymanager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	cOSA_m1.SecurityManager getSecuritymanager();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getSecuritymanager <em>Securitymanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanager</em>' containment reference.
	 * @see #getSecuritymanager()
	 * @generated
	 */
	void setSecuritymanager(cOSA_m1.SecurityManager value);

	/**
	 * Returns the value of the '<em><b>Securityconnectorconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityconnectorconnectionattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityconnectorconnectionattachment</em>' containment reference.
	 * @see #setSecurityconnectorconnectionattachment(SecurityConnectorConnectionAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Securityconnectorconnectionattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityConnectorConnectionAttachment getSecurityconnectorconnectionattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getSecurityconnectorconnectionattachment <em>Securityconnectorconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityconnectorconnectionattachment</em>' containment reference.
	 * @see #getSecurityconnectorconnectionattachment()
	 * @generated
	 */
	void setSecurityconnectorconnectionattachment(SecurityConnectorConnectionAttachment value);

	/**
	 * Returns the value of the '<em><b>Connectorconnectionsecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectorconnectionsecurityattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectorconnectionsecurityattachment</em>' containment reference.
	 * @see #setConnectorconnectionsecurityattachment(ConnectorConnectionSecurityAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectorconnectionsecurityattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorConnectionSecurityAttachment getConnectorconnectionsecurityattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectorconnectionsecurityattachment <em>Connectorconnectionsecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectorconnectionsecurityattachment</em>' containment reference.
	 * @see #getConnectorconnectionsecurityattachment()
	 * @generated
	 */
	void setConnectorconnectionsecurityattachment(ConnectorConnectionSecurityAttachment value);

	/**
	 * Returns the value of the '<em><b>Connectionsecurityconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionsecurityconnector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionsecurityconnector</em>' containment reference.
	 * @see #setConnectionsecurityconnector(ConnectionSecurityConnector)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectionsecurityconnector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionSecurityConnector getConnectionsecurityconnector();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectionsecurityconnector <em>Connectionsecurityconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionsecurityconnector</em>' containment reference.
	 * @see #getConnectionsecurityconnector()
	 * @generated
	 */
	void setConnectionsecurityconnector(ConnectionSecurityConnector value);

	/**
	 * Returns the value of the '<em><b>Connectorsecurityconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectorsecurityconnectionattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectorsecurityconnectionattachment</em>' containment reference.
	 * @see #setConnectorsecurityconnectionattachment(ConnectorSecurityConnectionAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectorsecurityconnectionattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorSecurityConnectionAttachment getConnectorsecurityconnectionattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectorsecurityconnectionattachment <em>Connectorsecurityconnectionattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectorsecurityconnectionattachment</em>' containment reference.
	 * @see #getConnectorsecurityconnectionattachment()
	 * @generated
	 */
	void setConnectorsecurityconnectionattachment(ConnectorSecurityConnectionAttachment value);

	/**
	 * Returns the value of the '<em><b>Connectionconnectorsecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionconnectorsecurityattachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionconnectorsecurityattachment</em>' containment reference.
	 * @see #setConnectionconnectorsecurityattachment(ConnectionConnectorSecurityAttachment)
	 * @see cOSA_m1.COSA_m1Package#getServer_Connectionconnectorsecurityattachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionConnectorSecurityAttachment getConnectionconnectorsecurityattachment();

	/**
	 * Sets the value of the '{@link cOSA_m1.Server#getConnectionconnectorsecurityattachment <em>Connectionconnectorsecurityattachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionconnectorsecurityattachment</em>' containment reference.
	 * @see #getConnectionconnectorsecurityattachment()
	 * @generated
	 */
	void setConnectionconnectorsecurityattachment(ConnectionConnectorSecurityAttachment value);

} // Server
