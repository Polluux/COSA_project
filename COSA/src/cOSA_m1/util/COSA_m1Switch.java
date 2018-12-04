/**
 */
package cOSA_m1.util;

import cOSA.AComposantConnecteur;
import cOSA.AConnecteurComposant;
import cOSA.Attachement;
import cOSA.Binding;
import cOSA.Composant;
import cOSA.Configuration;
import cOSA.Connecteur;
import cOSA.Element;
import cOSA.Glue;
import cOSA.InterfaceCompo;
import cOSA.InterfaceConfig;
import cOSA.InterfaceConnect;
import cOSA.Port;
import cOSA.ProvidedBinding;
import cOSA.ProvidedPort;
import cOSA.ProvidedRole;
import cOSA.RequiredBinding;
import cOSA.RequiredPort;
import cOSA.RequiredRole;
import cOSA.Role;

import cOSA_m1.CDConnectorGlue;
import cOSA_m1.COSA_m1Package;
import cOSA_m1.CSCOnnectorGlue;
import cOSA_m1.CSConf;
import cOSA_m1.CSQueryPorts;
import cOSA_m1.CSResponsePorts;
import cOSA_m1.Client;
import cOSA_m1.ClientInRole;
import cOSA_m1.ClientOutRole;
import cOSA_m1.ClientRpcAttachment;
import cOSA_m1.ConfigInput;
import cOSA_m1.ConfigOutput;
import cOSA_m1.ConnectionConnectorDatabaseAttachment;
import cOSA_m1.ConnectionConnectorSecurityAttachment;
import cOSA_m1.ConnectionDBInRole;
import cOSA_m1.ConnectionDBOutRole;
import cOSA_m1.ConnectionDatabaseConnector;
import cOSA_m1.ConnectionInputFromDataBasePort;
import cOSA_m1.ConnectionInputFromSecurityPort;
import cOSA_m1.ConnectionManager;
import cOSA_m1.ConnectionOuputToDataBasePort;
import cOSA_m1.ConnectionOutputToSecurityPort;
import cOSA_m1.ConnectionSecurityConnector;
import cOSA_m1.ConnectionSecurityInRole;
import cOSA_m1.ConnectionSecurityOutRole;
import cOSA_m1.ConnectorConnectionDatabaseAttachment;
import cOSA_m1.ConnectorConnectionSecurityAttachment;
import cOSA_m1.ConnectorDatabaseConnectionAttachment;
import cOSA_m1.ConnectorDatabaseSecurityAttachment;
import cOSA_m1.ConnectorSecurityConnectionAttachment;
import cOSA_m1.ConnectorSecurityDatabaseAttachment;
import cOSA_m1.DBConnectionInRole;
import cOSA_m1.DBConnectionOutRole;
import cOSA_m1.DSConnectorGlue;
import cOSA_m1.DataBase;
import cOSA_m1.DatabaseConnectorConnectionAttachment;
import cOSA_m1.DatabaseConnectorSecurityAttachment;
import cOSA_m1.DatabaseInputFromConnectionPort;
import cOSA_m1.DatabaseInputFromSecurityPort;
import cOSA_m1.DatabaseOutputToConnectionPort;
import cOSA_m1.DatabaseOutputToSecurityPort;
import cOSA_m1.DatabaseSecurityConnector;
import cOSA_m1.DatabaseSecurityInRole;
import cOSA_m1.DatabaseSecurityOutRole;
import cOSA_m1.DecurityDatabaseOutRole;
import cOSA_m1.InputBinding;
import cOSA_m1.InputBindings;
import cOSA_m1.OutputBinding;
import cOSA_m1.OutputBindings;
import cOSA_m1.RPC;
import cOSA_m1.RequestPortRPC;
import cOSA_m1.ResponsePortRPC;
import cOSA_m1.RpcClientAttachment;
import cOSA_m1.RpcGlue;
import cOSA_m1.RpcServerAttachment;
import cOSA_m1.SecurityConnectionInRole;
import cOSA_m1.SecurityConnectionOutRole;
import cOSA_m1.SecurityConnectorConnectionAttachment;
import cOSA_m1.SecurityConnectorDatabaseAttachment;
import cOSA_m1.SecurityDatabaseInRole;
import cOSA_m1.SecurityInputFromConnectionPort;
import cOSA_m1.SecurityInputFromDatabasePort;
import cOSA_m1.SecurityOuputToConnectionPort;
import cOSA_m1.SecurityOutputToDatabasePort;
import cOSA_m1.Server;
import cOSA_m1.ServerConfigInput;
import cOSA_m1.ServerConfigOutput;
import cOSA_m1.ServerInRole;
import cOSA_m1.ServerInput;
import cOSA_m1.ServerOuput;
import cOSA_m1.ServerRpcAttachment;
import cOSA_m1.ServeurOutRole;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cOSA_m1.COSA_m1Package
 * @generated
 */
public class COSA_m1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static COSA_m1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSA_m1Switch() {
		if (modelPackage == null) {
			modelPackage = COSA_m1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case COSA_m1Package.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseComposant(client);
				if (result == null) result = caseElement(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.RESPONSE_PORT_RPC: {
				ResponsePortRPC responsePortRPC = (ResponsePortRPC)theEObject;
				T result = caseResponsePortRPC(responsePortRPC);
				if (result == null) result = caseRequiredPort(responsePortRPC);
				if (result == null) result = casePort(responsePortRPC);
				if (result == null) result = caseInterfaceConfig(responsePortRPC);
				if (result == null) result = caseInterfaceCompo(responsePortRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.REQUEST_PORT_RPC: {
				RequestPortRPC requestPortRPC = (RequestPortRPC)theEObject;
				T result = caseRequestPortRPC(requestPortRPC);
				if (result == null) result = caseProvidedPort(requestPortRPC);
				if (result == null) result = casePort(requestPortRPC);
				if (result == null) result = caseInterfaceConfig(requestPortRPC);
				if (result == null) result = caseInterfaceCompo(requestPortRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CS_CONF: {
				CSConf csConf = (CSConf)theEObject;
				T result = caseCSConf(csConf);
				if (result == null) result = caseConfiguration(csConf);
				if (result == null) result = caseElement(csConf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CS_QUERY_PORTS: {
				CSQueryPorts csQueryPorts = (CSQueryPorts)theEObject;
				T result = caseCSQueryPorts(csQueryPorts);
				if (result == null) result = caseRequiredPort(csQueryPorts);
				if (result == null) result = casePort(csQueryPorts);
				if (result == null) result = caseInterfaceConfig(csQueryPorts);
				if (result == null) result = caseInterfaceCompo(csQueryPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CS_RESPONSE_PORTS: {
				CSResponsePorts csResponsePorts = (CSResponsePorts)theEObject;
				T result = caseCSResponsePorts(csResponsePorts);
				if (result == null) result = caseProvidedPort(csResponsePorts);
				if (result == null) result = casePort(csResponsePorts);
				if (result == null) result = caseInterfaceConfig(csResponsePorts);
				if (result == null) result = caseInterfaceCompo(csResponsePorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.RPC: {
				RPC rpc = (RPC)theEObject;
				T result = caseRPC(rpc);
				if (result == null) result = caseConnecteur(rpc);
				if (result == null) result = caseElement(rpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CLIENT_OUT_ROLE: {
				ClientOutRole clientOutRole = (ClientOutRole)theEObject;
				T result = caseClientOutRole(clientOutRole);
				if (result == null) result = caseRequiredRole(clientOutRole);
				if (result == null) result = caseRole(clientOutRole);
				if (result == null) result = caseInterfaceConnect(clientOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CLIENT_IN_ROLE: {
				ClientInRole clientInRole = (ClientInRole)theEObject;
				T result = caseClientInRole(clientInRole);
				if (result == null) result = caseProvidedRole(clientInRole);
				if (result == null) result = caseRole(clientInRole);
				if (result == null) result = caseInterfaceConnect(clientInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVER_IN_ROLE: {
				ServerInRole serverInRole = (ServerInRole)theEObject;
				T result = caseServerInRole(serverInRole);
				if (result == null) result = caseProvidedRole(serverInRole);
				if (result == null) result = caseRole(serverInRole);
				if (result == null) result = caseInterfaceConnect(serverInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVEUR_OUT_ROLE: {
				ServeurOutRole serveurOutRole = (ServeurOutRole)theEObject;
				T result = caseServeurOutRole(serveurOutRole);
				if (result == null) result = caseRequiredRole(serveurOutRole);
				if (result == null) result = caseRole(serveurOutRole);
				if (result == null) result = caseInterfaceConnect(serveurOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CLIENT_RPC_ATTACHMENT: {
				ClientRpcAttachment clientRpcAttachment = (ClientRpcAttachment)theEObject;
				T result = caseClientRpcAttachment(clientRpcAttachment);
				if (result == null) result = caseAComposantConnecteur(clientRpcAttachment);
				if (result == null) result = caseAttachement(clientRpcAttachment);
				if (result == null) result = caseElement(clientRpcAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.RPC_CLIENT_ATTACHMENT: {
				RpcClientAttachment rpcClientAttachment = (RpcClientAttachment)theEObject;
				T result = caseRpcClientAttachment(rpcClientAttachment);
				if (result == null) result = caseAConnecteurComposant(rpcClientAttachment);
				if (result == null) result = caseAttachement(rpcClientAttachment);
				if (result == null) result = caseElement(rpcClientAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONFIG_INPUT: {
				ConfigInput configInput = (ConfigInput)theEObject;
				T result = caseConfigInput(configInput);
				if (result == null) result = caseRequiredPort(configInput);
				if (result == null) result = casePort(configInput);
				if (result == null) result = caseInterfaceConfig(configInput);
				if (result == null) result = caseInterfaceCompo(configInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONFIG_OUTPUT: {
				ConfigOutput configOutput = (ConfigOutput)theEObject;
				T result = caseConfigOutput(configOutput);
				if (result == null) result = caseProvidedPort(configOutput);
				if (result == null) result = casePort(configOutput);
				if (result == null) result = caseInterfaceConfig(configOutput);
				if (result == null) result = caseInterfaceCompo(configOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.INPUT_BINDINGS: {
				InputBindings inputBindings = (InputBindings)theEObject;
				T result = caseInputBindings(inputBindings);
				if (result == null) result = caseRequiredBinding(inputBindings);
				if (result == null) result = caseBinding(inputBindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.OUTPUT_BINDINGS: {
				OutputBindings outputBindings = (OutputBindings)theEObject;
				T result = caseOutputBindings(outputBindings);
				if (result == null) result = caseProvidedBinding(outputBindings);
				if (result == null) result = caseBinding(outputBindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.RPC_GLUE: {
				RpcGlue rpcGlue = (RpcGlue)theEObject;
				T result = caseRpcGlue(rpcGlue);
				if (result == null) result = caseGlue(rpcGlue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.RPC_SERVER_ATTACHMENT: {
				RpcServerAttachment rpcServerAttachment = (RpcServerAttachment)theEObject;
				T result = caseRpcServerAttachment(rpcServerAttachment);
				if (result == null) result = caseAConnecteurComposant(rpcServerAttachment);
				if (result == null) result = caseAttachement(rpcServerAttachment);
				if (result == null) result = caseElement(rpcServerAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVER_RPC_ATTACHMENT: {
				ServerRpcAttachment serverRpcAttachment = (ServerRpcAttachment)theEObject;
				T result = caseServerRpcAttachment(serverRpcAttachment);
				if (result == null) result = caseAComposantConnecteur(serverRpcAttachment);
				if (result == null) result = caseAttachement(serverRpcAttachment);
				if (result == null) result = caseElement(serverRpcAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseConfiguration(server);
				if (result == null) result = caseElement(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVER_INPUT: {
				ServerInput serverInput = (ServerInput)theEObject;
				T result = caseServerInput(serverInput);
				if (result == null) result = caseRequiredPort(serverInput);
				if (result == null) result = casePort(serverInput);
				if (result == null) result = caseInterfaceConfig(serverInput);
				if (result == null) result = caseInterfaceCompo(serverInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVER_OUPUT: {
				ServerOuput serverOuput = (ServerOuput)theEObject;
				T result = caseServerOuput(serverOuput);
				if (result == null) result = caseProvidedPort(serverOuput);
				if (result == null) result = casePort(serverOuput);
				if (result == null) result = caseInterfaceConfig(serverOuput);
				if (result == null) result = caseInterfaceCompo(serverOuput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_MANAGER: {
				ConnectionManager connectionManager = (ConnectionManager)theEObject;
				T result = caseConnectionManager(connectionManager);
				if (result == null) result = caseComposant(connectionManager);
				if (result == null) result = caseElement(connectionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_MANAGER: {
				cOSA_m1.SecurityManager securityManager = (cOSA_m1.SecurityManager)theEObject;
				T result = caseSecurityManager(securityManager);
				if (result == null) result = caseComposant(securityManager);
				if (result == null) result = caseElement(securityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATA_BASE: {
				DataBase dataBase = (DataBase)theEObject;
				T result = caseDataBase(dataBase);
				if (result == null) result = caseComposant(dataBase);
				if (result == null) result = caseElement(dataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVER_CONFIG_INPUT: {
				ServerConfigInput serverConfigInput = (ServerConfigInput)theEObject;
				T result = caseServerConfigInput(serverConfigInput);
				if (result == null) result = caseRequiredPort(serverConfigInput);
				if (result == null) result = casePort(serverConfigInput);
				if (result == null) result = caseInterfaceConfig(serverConfigInput);
				if (result == null) result = caseInterfaceCompo(serverConfigInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SERVER_CONFIG_OUTPUT: {
				ServerConfigOutput serverConfigOutput = (ServerConfigOutput)theEObject;
				T result = caseServerConfigOutput(serverConfigOutput);
				if (result == null) result = caseProvidedPort(serverConfigOutput);
				if (result == null) result = casePort(serverConfigOutput);
				if (result == null) result = caseInterfaceConfig(serverConfigOutput);
				if (result == null) result = caseInterfaceCompo(serverConfigOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.INPUT_BINDING: {
				InputBinding inputBinding = (InputBinding)theEObject;
				T result = caseInputBinding(inputBinding);
				if (result == null) result = caseRequiredBinding(inputBinding);
				if (result == null) result = caseBinding(inputBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.OUTPUT_BINDING: {
				OutputBinding outputBinding = (OutputBinding)theEObject;
				T result = caseOutputBinding(outputBinding);
				if (result == null) result = caseProvidedBinding(outputBinding);
				if (result == null) result = caseBinding(outputBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_OUTPUT_TO_SECURITY_PORT: {
				ConnectionOutputToSecurityPort connectionOutputToSecurityPort = (ConnectionOutputToSecurityPort)theEObject;
				T result = caseConnectionOutputToSecurityPort(connectionOutputToSecurityPort);
				if (result == null) result = caseProvidedPort(connectionOutputToSecurityPort);
				if (result == null) result = casePort(connectionOutputToSecurityPort);
				if (result == null) result = caseInterfaceConfig(connectionOutputToSecurityPort);
				if (result == null) result = caseInterfaceCompo(connectionOutputToSecurityPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_INPUT_FROM_SECURITY_PORT: {
				ConnectionInputFromSecurityPort connectionInputFromSecurityPort = (ConnectionInputFromSecurityPort)theEObject;
				T result = caseConnectionInputFromSecurityPort(connectionInputFromSecurityPort);
				if (result == null) result = caseRequiredPort(connectionInputFromSecurityPort);
				if (result == null) result = casePort(connectionInputFromSecurityPort);
				if (result == null) result = caseInterfaceConfig(connectionInputFromSecurityPort);
				if (result == null) result = caseInterfaceCompo(connectionInputFromSecurityPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_OUPUT_TO_DATA_BASE_PORT: {
				ConnectionOuputToDataBasePort connectionOuputToDataBasePort = (ConnectionOuputToDataBasePort)theEObject;
				T result = caseConnectionOuputToDataBasePort(connectionOuputToDataBasePort);
				if (result == null) result = caseProvidedPort(connectionOuputToDataBasePort);
				if (result == null) result = casePort(connectionOuputToDataBasePort);
				if (result == null) result = caseInterfaceConfig(connectionOuputToDataBasePort);
				if (result == null) result = caseInterfaceCompo(connectionOuputToDataBasePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_INPUT_FROM_DATA_BASE_PORT: {
				ConnectionInputFromDataBasePort connectionInputFromDataBasePort = (ConnectionInputFromDataBasePort)theEObject;
				T result = caseConnectionInputFromDataBasePort(connectionInputFromDataBasePort);
				if (result == null) result = caseRequiredPort(connectionInputFromDataBasePort);
				if (result == null) result = casePort(connectionInputFromDataBasePort);
				if (result == null) result = caseInterfaceConfig(connectionInputFromDataBasePort);
				if (result == null) result = caseInterfaceCompo(connectionInputFromDataBasePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR: {
				ConnectionDatabaseConnector connectionDatabaseConnector = (ConnectionDatabaseConnector)theEObject;
				T result = caseConnectionDatabaseConnector(connectionDatabaseConnector);
				if (result == null) result = caseConnecteur(connectionDatabaseConnector);
				if (result == null) result = caseElement(connectionDatabaseConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DB_CONNECTION_OUT_ROLE: {
				DBConnectionOutRole dbConnectionOutRole = (DBConnectionOutRole)theEObject;
				T result = caseDBConnectionOutRole(dbConnectionOutRole);
				if (result == null) result = caseProvidedRole(dbConnectionOutRole);
				if (result == null) result = caseRole(dbConnectionOutRole);
				if (result == null) result = caseInterfaceConnect(dbConnectionOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_DB_IN_ROLE: {
				ConnectionDBInRole connectionDBInRole = (ConnectionDBInRole)theEObject;
				T result = caseConnectionDBInRole(connectionDBInRole);
				if (result == null) result = caseRequiredRole(connectionDBInRole);
				if (result == null) result = caseRole(connectionDBInRole);
				if (result == null) result = caseInterfaceConnect(connectionDBInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT: {
				ConnectionConnectorDatabaseAttachment connectionConnectorDatabaseAttachment = (ConnectionConnectorDatabaseAttachment)theEObject;
				T result = caseConnectionConnectorDatabaseAttachment(connectionConnectorDatabaseAttachment);
				if (result == null) result = caseAComposantConnecteur(connectionConnectorDatabaseAttachment);
				if (result == null) result = caseAttachement(connectionConnectorDatabaseAttachment);
				if (result == null) result = caseElement(connectionConnectorDatabaseAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTOR_DATABASE_CONNECTION_ATTACHMENT: {
				ConnectorDatabaseConnectionAttachment connectorDatabaseConnectionAttachment = (ConnectorDatabaseConnectionAttachment)theEObject;
				T result = caseConnectorDatabaseConnectionAttachment(connectorDatabaseConnectionAttachment);
				if (result == null) result = caseAConnecteurComposant(connectorDatabaseConnectionAttachment);
				if (result == null) result = caseAttachement(connectorDatabaseConnectionAttachment);
				if (result == null) result = caseElement(connectorDatabaseConnectionAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_DB_OUT_ROLE: {
				ConnectionDBOutRole connectionDBOutRole = (ConnectionDBOutRole)theEObject;
				T result = caseConnectionDBOutRole(connectionDBOutRole);
				if (result == null) result = caseProvidedRole(connectionDBOutRole);
				if (result == null) result = caseRole(connectionDBOutRole);
				if (result == null) result = caseInterfaceConnect(connectionDBOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DB_CONNECTION_IN_ROLE: {
				DBConnectionInRole dbConnectionInRole = (DBConnectionInRole)theEObject;
				T result = caseDBConnectionInRole(dbConnectionInRole);
				if (result == null) result = caseRequiredRole(dbConnectionInRole);
				if (result == null) result = caseRole(dbConnectionInRole);
				if (result == null) result = caseInterfaceConnect(dbConnectionInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTOR_CONNECTION_DATABASE_ATTACHMENT: {
				ConnectorConnectionDatabaseAttachment connectorConnectionDatabaseAttachment = (ConnectorConnectionDatabaseAttachment)theEObject;
				T result = caseConnectorConnectionDatabaseAttachment(connectorConnectionDatabaseAttachment);
				if (result == null) result = caseAConnecteurComposant(connectorConnectionDatabaseAttachment);
				if (result == null) result = caseAttachement(connectorConnectionDatabaseAttachment);
				if (result == null) result = caseElement(connectorConnectionDatabaseAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_CONNECTOR_CONNECTION_ATTACHMENT: {
				DatabaseConnectorConnectionAttachment databaseConnectorConnectionAttachment = (DatabaseConnectorConnectionAttachment)theEObject;
				T result = caseDatabaseConnectorConnectionAttachment(databaseConnectorConnectionAttachment);
				if (result == null) result = caseAComposantConnecteur(databaseConnectorConnectionAttachment);
				if (result == null) result = caseAttachement(databaseConnectorConnectionAttachment);
				if (result == null) result = caseElement(databaseConnectorConnectionAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_INPUT_FROM_CONNECTION_PORT: {
				DatabaseInputFromConnectionPort databaseInputFromConnectionPort = (DatabaseInputFromConnectionPort)theEObject;
				T result = caseDatabaseInputFromConnectionPort(databaseInputFromConnectionPort);
				if (result == null) result = caseRequiredPort(databaseInputFromConnectionPort);
				if (result == null) result = casePort(databaseInputFromConnectionPort);
				if (result == null) result = caseInterfaceConfig(databaseInputFromConnectionPort);
				if (result == null) result = caseInterfaceCompo(databaseInputFromConnectionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_OUTPUT_TO_CONNECTION_PORT: {
				DatabaseOutputToConnectionPort databaseOutputToConnectionPort = (DatabaseOutputToConnectionPort)theEObject;
				T result = caseDatabaseOutputToConnectionPort(databaseOutputToConnectionPort);
				if (result == null) result = caseProvidedPort(databaseOutputToConnectionPort);
				if (result == null) result = casePort(databaseOutputToConnectionPort);
				if (result == null) result = caseInterfaceConfig(databaseOutputToConnectionPort);
				if (result == null) result = caseInterfaceCompo(databaseOutputToConnectionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR: {
				ConnectionSecurityConnector connectionSecurityConnector = (ConnectionSecurityConnector)theEObject;
				T result = caseConnectionSecurityConnector(connectionSecurityConnector);
				if (result == null) result = caseConnecteur(connectionSecurityConnector);
				if (result == null) result = caseElement(connectionSecurityConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_SECURITY_IN_ROLE: {
				ConnectionSecurityInRole connectionSecurityInRole = (ConnectionSecurityInRole)theEObject;
				T result = caseConnectionSecurityInRole(connectionSecurityInRole);
				if (result == null) result = caseRequiredRole(connectionSecurityInRole);
				if (result == null) result = caseRole(connectionSecurityInRole);
				if (result == null) result = caseInterfaceConnect(connectionSecurityInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_SECURITY_OUT_ROLE: {
				ConnectionSecurityOutRole connectionSecurityOutRole = (ConnectionSecurityOutRole)theEObject;
				T result = caseConnectionSecurityOutRole(connectionSecurityOutRole);
				if (result == null) result = caseProvidedRole(connectionSecurityOutRole);
				if (result == null) result = caseRole(connectionSecurityOutRole);
				if (result == null) result = caseInterfaceConnect(connectionSecurityOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_CONNECTION_OUT_ROLE: {
				SecurityConnectionOutRole securityConnectionOutRole = (SecurityConnectionOutRole)theEObject;
				T result = caseSecurityConnectionOutRole(securityConnectionOutRole);
				if (result == null) result = caseProvidedRole(securityConnectionOutRole);
				if (result == null) result = caseRole(securityConnectionOutRole);
				if (result == null) result = caseInterfaceConnect(securityConnectionOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_CONNECTION_IN_ROLE: {
				SecurityConnectionInRole securityConnectionInRole = (SecurityConnectionInRole)theEObject;
				T result = caseSecurityConnectionInRole(securityConnectionInRole);
				if (result == null) result = caseRequiredRole(securityConnectionInRole);
				if (result == null) result = caseRole(securityConnectionInRole);
				if (result == null) result = caseInterfaceConnect(securityConnectionInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT: {
				ConnectionConnectorSecurityAttachment connectionConnectorSecurityAttachment = (ConnectionConnectorSecurityAttachment)theEObject;
				T result = caseConnectionConnectorSecurityAttachment(connectionConnectorSecurityAttachment);
				if (result == null) result = caseAComposantConnecteur(connectionConnectorSecurityAttachment);
				if (result == null) result = caseAttachement(connectionConnectorSecurityAttachment);
				if (result == null) result = caseElement(connectionConnectorSecurityAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT: {
				ConnectorSecurityConnectionAttachment connectorSecurityConnectionAttachment = (ConnectorSecurityConnectionAttachment)theEObject;
				T result = caseConnectorSecurityConnectionAttachment(connectorSecurityConnectionAttachment);
				if (result == null) result = caseAConnecteurComposant(connectorSecurityConnectionAttachment);
				if (result == null) result = caseAttachement(connectorSecurityConnectionAttachment);
				if (result == null) result = caseElement(connectorSecurityConnectionAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_INPUT_FROM_CONNECTION_PORT: {
				SecurityInputFromConnectionPort securityInputFromConnectionPort = (SecurityInputFromConnectionPort)theEObject;
				T result = caseSecurityInputFromConnectionPort(securityInputFromConnectionPort);
				if (result == null) result = caseRequiredPort(securityInputFromConnectionPort);
				if (result == null) result = casePort(securityInputFromConnectionPort);
				if (result == null) result = caseInterfaceConfig(securityInputFromConnectionPort);
				if (result == null) result = caseInterfaceCompo(securityInputFromConnectionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_OUPUT_TO_CONNECTION_PORT: {
				SecurityOuputToConnectionPort securityOuputToConnectionPort = (SecurityOuputToConnectionPort)theEObject;
				T result = caseSecurityOuputToConnectionPort(securityOuputToConnectionPort);
				if (result == null) result = caseProvidedPort(securityOuputToConnectionPort);
				if (result == null) result = casePort(securityOuputToConnectionPort);
				if (result == null) result = caseInterfaceConfig(securityOuputToConnectionPort);
				if (result == null) result = caseInterfaceCompo(securityOuputToConnectionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTOR_CONNECTION_SECURITY_ATTACHMENT: {
				ConnectorConnectionSecurityAttachment connectorConnectionSecurityAttachment = (ConnectorConnectionSecurityAttachment)theEObject;
				T result = caseConnectorConnectionSecurityAttachment(connectorConnectionSecurityAttachment);
				if (result == null) result = caseAConnecteurComposant(connectorConnectionSecurityAttachment);
				if (result == null) result = caseAttachement(connectorConnectionSecurityAttachment);
				if (result == null) result = caseElement(connectorConnectionSecurityAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT: {
				SecurityConnectorConnectionAttachment securityConnectorConnectionAttachment = (SecurityConnectorConnectionAttachment)theEObject;
				T result = caseSecurityConnectorConnectionAttachment(securityConnectorConnectionAttachment);
				if (result == null) result = caseAComposantConnecteur(securityConnectorConnectionAttachment);
				if (result == null) result = caseAttachement(securityConnectorConnectionAttachment);
				if (result == null) result = caseElement(securityConnectorConnectionAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_OUTPUT_TO_SECURITY_PORT: {
				DatabaseOutputToSecurityPort databaseOutputToSecurityPort = (DatabaseOutputToSecurityPort)theEObject;
				T result = caseDatabaseOutputToSecurityPort(databaseOutputToSecurityPort);
				if (result == null) result = caseProvidedPort(databaseOutputToSecurityPort);
				if (result == null) result = casePort(databaseOutputToSecurityPort);
				if (result == null) result = caseInterfaceConfig(databaseOutputToSecurityPort);
				if (result == null) result = caseInterfaceCompo(databaseOutputToSecurityPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_INPUT_FROM_SECURITY_PORT: {
				DatabaseInputFromSecurityPort databaseInputFromSecurityPort = (DatabaseInputFromSecurityPort)theEObject;
				T result = caseDatabaseInputFromSecurityPort(databaseInputFromSecurityPort);
				if (result == null) result = caseRequiredPort(databaseInputFromSecurityPort);
				if (result == null) result = casePort(databaseInputFromSecurityPort);
				if (result == null) result = caseInterfaceConfig(databaseInputFromSecurityPort);
				if (result == null) result = caseInterfaceCompo(databaseInputFromSecurityPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_OUTPUT_TO_DATABASE_PORT: {
				SecurityOutputToDatabasePort securityOutputToDatabasePort = (SecurityOutputToDatabasePort)theEObject;
				T result = caseSecurityOutputToDatabasePort(securityOutputToDatabasePort);
				if (result == null) result = caseProvidedPort(securityOutputToDatabasePort);
				if (result == null) result = casePort(securityOutputToDatabasePort);
				if (result == null) result = caseInterfaceConfig(securityOutputToDatabasePort);
				if (result == null) result = caseInterfaceCompo(securityOutputToDatabasePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_INPUT_FROM_DATABASE_PORT: {
				SecurityInputFromDatabasePort securityInputFromDatabasePort = (SecurityInputFromDatabasePort)theEObject;
				T result = caseSecurityInputFromDatabasePort(securityInputFromDatabasePort);
				if (result == null) result = caseRequiredPort(securityInputFromDatabasePort);
				if (result == null) result = casePort(securityInputFromDatabasePort);
				if (result == null) result = caseInterfaceConfig(securityInputFromDatabasePort);
				if (result == null) result = caseInterfaceCompo(securityInputFromDatabasePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR: {
				DatabaseSecurityConnector databaseSecurityConnector = (DatabaseSecurityConnector)theEObject;
				T result = caseDatabaseSecurityConnector(databaseSecurityConnector);
				if (result == null) result = caseConnecteur(databaseSecurityConnector);
				if (result == null) result = caseElement(databaseSecurityConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_SECURITY_IN_ROLE: {
				DatabaseSecurityInRole databaseSecurityInRole = (DatabaseSecurityInRole)theEObject;
				T result = caseDatabaseSecurityInRole(databaseSecurityInRole);
				if (result == null) result = caseRequiredRole(databaseSecurityInRole);
				if (result == null) result = caseRole(databaseSecurityInRole);
				if (result == null) result = caseInterfaceConnect(databaseSecurityInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DECURITY_DATABASE_OUT_ROLE: {
				DecurityDatabaseOutRole decurityDatabaseOutRole = (DecurityDatabaseOutRole)theEObject;
				T result = caseDecurityDatabaseOutRole(decurityDatabaseOutRole);
				if (result == null) result = caseProvidedRole(decurityDatabaseOutRole);
				if (result == null) result = caseRole(decurityDatabaseOutRole);
				if (result == null) result = caseInterfaceConnect(decurityDatabaseOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_DATABASE_IN_ROLE: {
				SecurityDatabaseInRole securityDatabaseInRole = (SecurityDatabaseInRole)theEObject;
				T result = caseSecurityDatabaseInRole(securityDatabaseInRole);
				if (result == null) result = caseRequiredRole(securityDatabaseInRole);
				if (result == null) result = caseRole(securityDatabaseInRole);
				if (result == null) result = caseInterfaceConnect(securityDatabaseInRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_SECURITY_OUT_ROLE: {
				DatabaseSecurityOutRole databaseSecurityOutRole = (DatabaseSecurityOutRole)theEObject;
				T result = caseDatabaseSecurityOutRole(databaseSecurityOutRole);
				if (result == null) result = caseProvidedRole(databaseSecurityOutRole);
				if (result == null) result = caseRole(databaseSecurityOutRole);
				if (result == null) result = caseInterfaceConnect(databaseSecurityOutRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT: {
				DatabaseConnectorSecurityAttachment databaseConnectorSecurityAttachment = (DatabaseConnectorSecurityAttachment)theEObject;
				T result = caseDatabaseConnectorSecurityAttachment(databaseConnectorSecurityAttachment);
				if (result == null) result = caseAComposantConnecteur(databaseConnectorSecurityAttachment);
				if (result == null) result = caseAttachement(databaseConnectorSecurityAttachment);
				if (result == null) result = caseElement(databaseConnectorSecurityAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTOR_SECURITY_DATABASE_ATTACHMENT: {
				ConnectorSecurityDatabaseAttachment connectorSecurityDatabaseAttachment = (ConnectorSecurityDatabaseAttachment)theEObject;
				T result = caseConnectorSecurityDatabaseAttachment(connectorSecurityDatabaseAttachment);
				if (result == null) result = caseAConnecteurComposant(connectorSecurityDatabaseAttachment);
				if (result == null) result = caseAttachement(connectorSecurityDatabaseAttachment);
				if (result == null) result = caseElement(connectorSecurityDatabaseAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.SECURITY_CONNECTOR_DATABASE_ATTACHMENT: {
				SecurityConnectorDatabaseAttachment securityConnectorDatabaseAttachment = (SecurityConnectorDatabaseAttachment)theEObject;
				T result = caseSecurityConnectorDatabaseAttachment(securityConnectorDatabaseAttachment);
				if (result == null) result = caseAComposantConnecteur(securityConnectorDatabaseAttachment);
				if (result == null) result = caseAttachement(securityConnectorDatabaseAttachment);
				if (result == null) result = caseElement(securityConnectorDatabaseAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT: {
				ConnectorDatabaseSecurityAttachment connectorDatabaseSecurityAttachment = (ConnectorDatabaseSecurityAttachment)theEObject;
				T result = caseConnectorDatabaseSecurityAttachment(connectorDatabaseSecurityAttachment);
				if (result == null) result = caseAConnecteurComposant(connectorDatabaseSecurityAttachment);
				if (result == null) result = caseAttachement(connectorDatabaseSecurityAttachment);
				if (result == null) result = caseElement(connectorDatabaseSecurityAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CD_CONNECTOR_GLUE: {
				CDConnectorGlue cdConnectorGlue = (CDConnectorGlue)theEObject;
				T result = caseCDConnectorGlue(cdConnectorGlue);
				if (result == null) result = caseGlue(cdConnectorGlue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.CSC_ONNECTOR_GLUE: {
				CSCOnnectorGlue cscOnnectorGlue = (CSCOnnectorGlue)theEObject;
				T result = caseCSCOnnectorGlue(cscOnnectorGlue);
				if (result == null) result = caseGlue(cscOnnectorGlue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSA_m1Package.DS_CONNECTOR_GLUE: {
				DSConnectorGlue dsConnectorGlue = (DSConnectorGlue)theEObject;
				T result = caseDSConnectorGlue(dsConnectorGlue);
				if (result == null) result = caseGlue(dsConnectorGlue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Port RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Port RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsePortRPC(ResponsePortRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Port RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Port RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestPortRPC(RequestPortRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSConf(CSConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS Query Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS Query Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSQueryPorts(CSQueryPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS Response Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS Response Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSResponsePorts(CSResponsePorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC(RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientOutRole(ClientOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientInRole(ClientInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerInRole(ServerInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeurOutRole(ServeurOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Rpc Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Rpc Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientRpcAttachment(ClientRpcAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rpc Client Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rpc Client Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRpcClientAttachment(RpcClientAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigInput(ConfigInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigOutput(ConfigOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBindings(InputBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputBindings(OutputBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rpc Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rpc Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRpcGlue(RpcGlue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rpc Server Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rpc Server Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRpcServerAttachment(RpcServerAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Rpc Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Rpc Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerRpcAttachment(ServerRpcAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerInput(ServerInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Ouput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Ouput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerOuput(ServerOuput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionManager(ConnectionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManager(cOSA_m1.SecurityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBase(DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Config Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Config Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerConfigInput(ServerConfigInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Config Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Config Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerConfigOutput(ServerConfigOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBinding(InputBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputBinding(OutputBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Output To Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Output To Security Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionOutputToSecurityPort(ConnectionOutputToSecurityPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Input From Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Input From Security Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionInputFromSecurityPort(ConnectionInputFromSecurityPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Ouput To Data Base Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Ouput To Data Base Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionOuputToDataBasePort(ConnectionOuputToDataBasePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Input From Data Base Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Input From Data Base Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionInputFromDataBasePort(ConnectionInputFromDataBasePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Database Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Database Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionDatabaseConnector(ConnectionDatabaseConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Connection Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Connection Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBConnectionOutRole(DBConnectionOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection DB In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection DB In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionDBInRole(ConnectionDBInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Connector Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Connector Database Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionConnectorDatabaseAttachment(ConnectionConnectorDatabaseAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Database Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Database Connection Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorDatabaseConnectionAttachment(ConnectorDatabaseConnectionAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection DB Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection DB Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionDBOutRole(ConnectionDBOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Connection In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Connection In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBConnectionInRole(DBConnectionInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Connection Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Connection Database Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorConnectionDatabaseAttachment(ConnectorConnectionDatabaseAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Connector Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Connector Connection Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseConnectorConnectionAttachment(DatabaseConnectorConnectionAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Input From Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Input From Connection Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseInputFromConnectionPort(DatabaseInputFromConnectionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Output To Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Output To Connection Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseOutputToConnectionPort(DatabaseOutputToConnectionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Security Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Security Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionSecurityConnector(ConnectionSecurityConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Security In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Security In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionSecurityInRole(ConnectionSecurityInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Security Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Security Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionSecurityOutRole(ConnectionSecurityOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Connection Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Connection Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConnectionOutRole(SecurityConnectionOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Connection In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Connection In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConnectionInRole(SecurityConnectionInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Connector Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Connector Security Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionConnectorSecurityAttachment(ConnectionConnectorSecurityAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Security Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Security Connection Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorSecurityConnectionAttachment(ConnectorSecurityConnectionAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Input From Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Input From Connection Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityInputFromConnectionPort(SecurityInputFromConnectionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Ouput To Connection Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Ouput To Connection Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityOuputToConnectionPort(SecurityOuputToConnectionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Connection Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Connection Security Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorConnectionSecurityAttachment(ConnectorConnectionSecurityAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Connector Connection Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Connector Connection Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConnectorConnectionAttachment(SecurityConnectorConnectionAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Output To Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Output To Security Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseOutputToSecurityPort(DatabaseOutputToSecurityPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Input From Security Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Input From Security Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseInputFromSecurityPort(DatabaseInputFromSecurityPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Output To Database Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Output To Database Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityOutputToDatabasePort(SecurityOutputToDatabasePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Input From Database Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Input From Database Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityInputFromDatabasePort(SecurityInputFromDatabasePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Security Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Security Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseSecurityConnector(DatabaseSecurityConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Security In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Security In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseSecurityInRole(DatabaseSecurityInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decurity Database Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decurity Database Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecurityDatabaseOutRole(DecurityDatabaseOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Database In Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Database In Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityDatabaseInRole(SecurityDatabaseInRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Security Out Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Security Out Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseSecurityOutRole(DatabaseSecurityOutRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Connector Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Connector Security Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseConnectorSecurityAttachment(DatabaseConnectorSecurityAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Security Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Security Database Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorSecurityDatabaseAttachment(ConnectorSecurityDatabaseAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Connector Database Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Connector Database Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConnectorDatabaseAttachment(SecurityConnectorDatabaseAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Database Security Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Database Security Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorDatabaseSecurityAttachment(ConnectorDatabaseSecurityAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Connector Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Connector Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDConnectorGlue(CDConnectorGlue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSC Onnector Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSC Onnector Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSCOnnectorGlue(CSCOnnectorGlue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Connector Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Connector Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSConnectorGlue(DSConnectorGlue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConfig(InterfaceConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceCompo(InterfaceCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPort(RequiredPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedPort(ProvidedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteur(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnect(InterfaceConnect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredRole(RequiredRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedRole(ProvidedRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachement(Attachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AComposant Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AComposant Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAComposantConnecteur(AComposantConnecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AConnecteur Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AConnecteur Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAConnecteurComposant(AConnecteurComposant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredBinding(RequiredBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedBinding(ProvidedBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //COSA_m1Switch
