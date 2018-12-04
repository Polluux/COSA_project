/**
 */
package cOSA_m1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cOSA_m1.COSA_m1Package
 * @generated
 */
public interface COSA_m1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	COSA_m1Factory eINSTANCE = cOSA_m1.impl.COSA_m1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Response Port RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Port RPC</em>'.
	 * @generated
	 */
	ResponsePortRPC createResponsePortRPC();

	/**
	 * Returns a new object of class '<em>Request Port RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Port RPC</em>'.
	 * @generated
	 */
	RequestPortRPC createRequestPortRPC();

	/**
	 * Returns a new object of class '<em>CS Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CS Conf</em>'.
	 * @generated
	 */
	CSConf createCSConf();

	/**
	 * Returns a new object of class '<em>CS Query Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CS Query Ports</em>'.
	 * @generated
	 */
	CSQueryPorts createCSQueryPorts();

	/**
	 * Returns a new object of class '<em>CS Response Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CS Response Ports</em>'.
	 * @generated
	 */
	CSResponsePorts createCSResponsePorts();

	/**
	 * Returns a new object of class '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC</em>'.
	 * @generated
	 */
	RPC createRPC();

	/**
	 * Returns a new object of class '<em>Client Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Out Role</em>'.
	 * @generated
	 */
	ClientOutRole createClientOutRole();

	/**
	 * Returns a new object of class '<em>Client In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client In Role</em>'.
	 * @generated
	 */
	ClientInRole createClientInRole();

	/**
	 * Returns a new object of class '<em>Server In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server In Role</em>'.
	 * @generated
	 */
	ServerInRole createServerInRole();

	/**
	 * Returns a new object of class '<em>Serveur Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur Out Role</em>'.
	 * @generated
	 */
	ServeurOutRole createServeurOutRole();

	/**
	 * Returns a new object of class '<em>Client Rpc Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Rpc Attachment</em>'.
	 * @generated
	 */
	ClientRpcAttachment createClientRpcAttachment();

	/**
	 * Returns a new object of class '<em>Rpc Client Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rpc Client Attachment</em>'.
	 * @generated
	 */
	RpcClientAttachment createRpcClientAttachment();

	/**
	 * Returns a new object of class '<em>Config Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Input</em>'.
	 * @generated
	 */
	ConfigInput createConfigInput();

	/**
	 * Returns a new object of class '<em>Config Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Output</em>'.
	 * @generated
	 */
	ConfigOutput createConfigOutput();

	/**
	 * Returns a new object of class '<em>Input Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Bindings</em>'.
	 * @generated
	 */
	InputBindings createInputBindings();

	/**
	 * Returns a new object of class '<em>Output Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Bindings</em>'.
	 * @generated
	 */
	OutputBindings createOutputBindings();

	/**
	 * Returns a new object of class '<em>Rpc Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rpc Glue</em>'.
	 * @generated
	 */
	RpcGlue createRpcGlue();

	/**
	 * Returns a new object of class '<em>Rpc Server Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rpc Server Attachment</em>'.
	 * @generated
	 */
	RpcServerAttachment createRpcServerAttachment();

	/**
	 * Returns a new object of class '<em>Server Rpc Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Rpc Attachment</em>'.
	 * @generated
	 */
	ServerRpcAttachment createServerRpcAttachment();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Server Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Input</em>'.
	 * @generated
	 */
	ServerInput createServerInput();

	/**
	 * Returns a new object of class '<em>Server Ouput</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Ouput</em>'.
	 * @generated
	 */
	ServerOuput createServerOuput();

	/**
	 * Returns a new object of class '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Manager</em>'.
	 * @generated
	 */
	ConnectionManager createConnectionManager();

	/**
	 * Returns a new object of class '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Manager</em>'.
	 * @generated
	 */
	SecurityManager createSecurityManager();

	/**
	 * Returns a new object of class '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Base</em>'.
	 * @generated
	 */
	DataBase createDataBase();

	/**
	 * Returns a new object of class '<em>Server Config Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Config Input</em>'.
	 * @generated
	 */
	ServerConfigInput createServerConfigInput();

	/**
	 * Returns a new object of class '<em>Server Config Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Config Output</em>'.
	 * @generated
	 */
	ServerConfigOutput createServerConfigOutput();

	/**
	 * Returns a new object of class '<em>Input Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Binding</em>'.
	 * @generated
	 */
	InputBinding createInputBinding();

	/**
	 * Returns a new object of class '<em>Output Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Binding</em>'.
	 * @generated
	 */
	OutputBinding createOutputBinding();

	/**
	 * Returns a new object of class '<em>Connection Output To Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Output To Security Port</em>'.
	 * @generated
	 */
	ConnectionOutputToSecurityPort createConnectionOutputToSecurityPort();

	/**
	 * Returns a new object of class '<em>Connection Input From Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Input From Security Port</em>'.
	 * @generated
	 */
	ConnectionInputFromSecurityPort createConnectionInputFromSecurityPort();

	/**
	 * Returns a new object of class '<em>Connection Ouput To Data Base Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Ouput To Data Base Port</em>'.
	 * @generated
	 */
	ConnectionOuputToDataBasePort createConnectionOuputToDataBasePort();

	/**
	 * Returns a new object of class '<em>Connection Input From Data Base Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Input From Data Base Port</em>'.
	 * @generated
	 */
	ConnectionInputFromDataBasePort createConnectionInputFromDataBasePort();

	/**
	 * Returns a new object of class '<em>Connection Database Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Database Connector</em>'.
	 * @generated
	 */
	ConnectionDatabaseConnector createConnectionDatabaseConnector();

	/**
	 * Returns a new object of class '<em>DB Connection Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Connection Out Role</em>'.
	 * @generated
	 */
	DBConnectionOutRole createDBConnectionOutRole();

	/**
	 * Returns a new object of class '<em>Connection DB In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection DB In Role</em>'.
	 * @generated
	 */
	ConnectionDBInRole createConnectionDBInRole();

	/**
	 * Returns a new object of class '<em>Connection Connector Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Connector Database Attachment</em>'.
	 * @generated
	 */
	ConnectionConnectorDatabaseAttachment createConnectionConnectorDatabaseAttachment();

	/**
	 * Returns a new object of class '<em>Connector Database Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Database Connection Attachment</em>'.
	 * @generated
	 */
	ConnectorDatabaseConnectionAttachment createConnectorDatabaseConnectionAttachment();

	/**
	 * Returns a new object of class '<em>Connection DB Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection DB Out Role</em>'.
	 * @generated
	 */
	ConnectionDBOutRole createConnectionDBOutRole();

	/**
	 * Returns a new object of class '<em>DB Connection In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Connection In Role</em>'.
	 * @generated
	 */
	DBConnectionInRole createDBConnectionInRole();

	/**
	 * Returns a new object of class '<em>Connector Connection Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Connection Database Attachment</em>'.
	 * @generated
	 */
	ConnectorConnectionDatabaseAttachment createConnectorConnectionDatabaseAttachment();

	/**
	 * Returns a new object of class '<em>Database Connector Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Connector Connection Attachment</em>'.
	 * @generated
	 */
	DatabaseConnectorConnectionAttachment createDatabaseConnectorConnectionAttachment();

	/**
	 * Returns a new object of class '<em>Database Input From Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Input From Connection Port</em>'.
	 * @generated
	 */
	DatabaseInputFromConnectionPort createDatabaseInputFromConnectionPort();

	/**
	 * Returns a new object of class '<em>Database Output To Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Output To Connection Port</em>'.
	 * @generated
	 */
	DatabaseOutputToConnectionPort createDatabaseOutputToConnectionPort();

	/**
	 * Returns a new object of class '<em>Connection Security Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Security Connector</em>'.
	 * @generated
	 */
	ConnectionSecurityConnector createConnectionSecurityConnector();

	/**
	 * Returns a new object of class '<em>Connection Security In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Security In Role</em>'.
	 * @generated
	 */
	ConnectionSecurityInRole createConnectionSecurityInRole();

	/**
	 * Returns a new object of class '<em>Connection Security Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Security Out Role</em>'.
	 * @generated
	 */
	ConnectionSecurityOutRole createConnectionSecurityOutRole();

	/**
	 * Returns a new object of class '<em>Security Connection Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Connection Out Role</em>'.
	 * @generated
	 */
	SecurityConnectionOutRole createSecurityConnectionOutRole();

	/**
	 * Returns a new object of class '<em>Security Connection In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Connection In Role</em>'.
	 * @generated
	 */
	SecurityConnectionInRole createSecurityConnectionInRole();

	/**
	 * Returns a new object of class '<em>Connection Connector Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Connector Security Attachment</em>'.
	 * @generated
	 */
	ConnectionConnectorSecurityAttachment createConnectionConnectorSecurityAttachment();

	/**
	 * Returns a new object of class '<em>Connector Security Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Security Connection Attachment</em>'.
	 * @generated
	 */
	ConnectorSecurityConnectionAttachment createConnectorSecurityConnectionAttachment();

	/**
	 * Returns a new object of class '<em>Security Input From Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Input From Connection Port</em>'.
	 * @generated
	 */
	SecurityInputFromConnectionPort createSecurityInputFromConnectionPort();

	/**
	 * Returns a new object of class '<em>Security Ouput To Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Ouput To Connection Port</em>'.
	 * @generated
	 */
	SecurityOuputToConnectionPort createSecurityOuputToConnectionPort();

	/**
	 * Returns a new object of class '<em>Connector Connection Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Connection Security Attachment</em>'.
	 * @generated
	 */
	ConnectorConnectionSecurityAttachment createConnectorConnectionSecurityAttachment();

	/**
	 * Returns a new object of class '<em>Security Connector Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Connector Connection Attachment</em>'.
	 * @generated
	 */
	SecurityConnectorConnectionAttachment createSecurityConnectorConnectionAttachment();

	/**
	 * Returns a new object of class '<em>Database Output To Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Output To Security Port</em>'.
	 * @generated
	 */
	DatabaseOutputToSecurityPort createDatabaseOutputToSecurityPort();

	/**
	 * Returns a new object of class '<em>Database Input From Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Input From Security Port</em>'.
	 * @generated
	 */
	DatabaseInputFromSecurityPort createDatabaseInputFromSecurityPort();

	/**
	 * Returns a new object of class '<em>Security Output To Database Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Output To Database Port</em>'.
	 * @generated
	 */
	SecurityOutputToDatabasePort createSecurityOutputToDatabasePort();

	/**
	 * Returns a new object of class '<em>Security Input From Database Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Input From Database Port</em>'.
	 * @generated
	 */
	SecurityInputFromDatabasePort createSecurityInputFromDatabasePort();

	/**
	 * Returns a new object of class '<em>Database Security Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Security Connector</em>'.
	 * @generated
	 */
	DatabaseSecurityConnector createDatabaseSecurityConnector();

	/**
	 * Returns a new object of class '<em>Database Security In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Security In Role</em>'.
	 * @generated
	 */
	DatabaseSecurityInRole createDatabaseSecurityInRole();

	/**
	 * Returns a new object of class '<em>Decurity Database Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decurity Database Out Role</em>'.
	 * @generated
	 */
	DecurityDatabaseOutRole createDecurityDatabaseOutRole();

	/**
	 * Returns a new object of class '<em>Security Database In Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Database In Role</em>'.
	 * @generated
	 */
	SecurityDatabaseInRole createSecurityDatabaseInRole();

	/**
	 * Returns a new object of class '<em>Database Security Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Security Out Role</em>'.
	 * @generated
	 */
	DatabaseSecurityOutRole createDatabaseSecurityOutRole();

	/**
	 * Returns a new object of class '<em>Database Connector Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Connector Security Attachment</em>'.
	 * @generated
	 */
	DatabaseConnectorSecurityAttachment createDatabaseConnectorSecurityAttachment();

	/**
	 * Returns a new object of class '<em>Connector Security Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Security Database Attachment</em>'.
	 * @generated
	 */
	ConnectorSecurityDatabaseAttachment createConnectorSecurityDatabaseAttachment();

	/**
	 * Returns a new object of class '<em>Security Connector Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Connector Database Attachment</em>'.
	 * @generated
	 */
	SecurityConnectorDatabaseAttachment createSecurityConnectorDatabaseAttachment();

	/**
	 * Returns a new object of class '<em>Connector Database Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Database Security Attachment</em>'.
	 * @generated
	 */
	ConnectorDatabaseSecurityAttachment createConnectorDatabaseSecurityAttachment();

	/**
	 * Returns a new object of class '<em>CD Connector Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CD Connector Glue</em>'.
	 * @generated
	 */
	CDConnectorGlue createCDConnectorGlue();

	/**
	 * Returns a new object of class '<em>CSC Onnector Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSC Onnector Glue</em>'.
	 * @generated
	 */
	CSCOnnectorGlue createCSCOnnectorGlue();

	/**
	 * Returns a new object of class '<em>DS Connector Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Connector Glue</em>'.
	 * @generated
	 */
	DSConnectorGlue createDSConnectorGlue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	COSA_m1Package getCOSA_m1Package();

} //COSA_m1Factory
