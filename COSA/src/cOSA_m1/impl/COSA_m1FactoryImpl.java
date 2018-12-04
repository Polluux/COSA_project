/**
 */
package cOSA_m1.impl;

import cOSA_m1.CDConnectorGlue;
import cOSA_m1.COSA_m1Factory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class COSA_m1FactoryImpl extends EFactoryImpl implements COSA_m1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COSA_m1Factory init() {
		try {
			COSA_m1Factory theCOSA_m1Factory = (COSA_m1Factory)EPackage.Registry.INSTANCE.getEFactory(COSA_m1Package.eNS_URI);
			if (theCOSA_m1Factory != null) {
				return theCOSA_m1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new COSA_m1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSA_m1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case COSA_m1Package.CLIENT: return createClient();
			case COSA_m1Package.RESPONSE_PORT_RPC: return createResponsePortRPC();
			case COSA_m1Package.REQUEST_PORT_RPC: return createRequestPortRPC();
			case COSA_m1Package.CS_CONF: return createCSConf();
			case COSA_m1Package.CS_QUERY_PORTS: return createCSQueryPorts();
			case COSA_m1Package.CS_RESPONSE_PORTS: return createCSResponsePorts();
			case COSA_m1Package.RPC: return createRPC();
			case COSA_m1Package.CLIENT_OUT_ROLE: return createClientOutRole();
			case COSA_m1Package.CLIENT_IN_ROLE: return createClientInRole();
			case COSA_m1Package.SERVER_IN_ROLE: return createServerInRole();
			case COSA_m1Package.SERVEUR_OUT_ROLE: return createServeurOutRole();
			case COSA_m1Package.CLIENT_RPC_ATTACHMENT: return createClientRpcAttachment();
			case COSA_m1Package.RPC_CLIENT_ATTACHMENT: return createRpcClientAttachment();
			case COSA_m1Package.CONFIG_INPUT: return createConfigInput();
			case COSA_m1Package.CONFIG_OUTPUT: return createConfigOutput();
			case COSA_m1Package.INPUT_BINDINGS: return createInputBindings();
			case COSA_m1Package.OUTPUT_BINDINGS: return createOutputBindings();
			case COSA_m1Package.RPC_GLUE: return createRpcGlue();
			case COSA_m1Package.RPC_SERVER_ATTACHMENT: return createRpcServerAttachment();
			case COSA_m1Package.SERVER_RPC_ATTACHMENT: return createServerRpcAttachment();
			case COSA_m1Package.SERVER: return createServer();
			case COSA_m1Package.SERVER_INPUT: return createServerInput();
			case COSA_m1Package.SERVER_OUPUT: return createServerOuput();
			case COSA_m1Package.CONNECTION_MANAGER: return createConnectionManager();
			case COSA_m1Package.SECURITY_MANAGER: return createSecurityManager();
			case COSA_m1Package.DATA_BASE: return createDataBase();
			case COSA_m1Package.SERVER_CONFIG_INPUT: return createServerConfigInput();
			case COSA_m1Package.SERVER_CONFIG_OUTPUT: return createServerConfigOutput();
			case COSA_m1Package.INPUT_BINDING: return createInputBinding();
			case COSA_m1Package.OUTPUT_BINDING: return createOutputBinding();
			case COSA_m1Package.CONNECTION_OUTPUT_TO_SECURITY_PORT: return createConnectionOutputToSecurityPort();
			case COSA_m1Package.CONNECTION_INPUT_FROM_SECURITY_PORT: return createConnectionInputFromSecurityPort();
			case COSA_m1Package.CONNECTION_OUPUT_TO_DATA_BASE_PORT: return createConnectionOuputToDataBasePort();
			case COSA_m1Package.CONNECTION_INPUT_FROM_DATA_BASE_PORT: return createConnectionInputFromDataBasePort();
			case COSA_m1Package.CONNECTION_DATABASE_CONNECTOR: return createConnectionDatabaseConnector();
			case COSA_m1Package.DB_CONNECTION_OUT_ROLE: return createDBConnectionOutRole();
			case COSA_m1Package.CONNECTION_DB_IN_ROLE: return createConnectionDBInRole();
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT: return createConnectionConnectorDatabaseAttachment();
			case COSA_m1Package.CONNECTOR_DATABASE_CONNECTION_ATTACHMENT: return createConnectorDatabaseConnectionAttachment();
			case COSA_m1Package.CONNECTION_DB_OUT_ROLE: return createConnectionDBOutRole();
			case COSA_m1Package.DB_CONNECTION_IN_ROLE: return createDBConnectionInRole();
			case COSA_m1Package.CONNECTOR_CONNECTION_DATABASE_ATTACHMENT: return createConnectorConnectionDatabaseAttachment();
			case COSA_m1Package.DATABASE_CONNECTOR_CONNECTION_ATTACHMENT: return createDatabaseConnectorConnectionAttachment();
			case COSA_m1Package.DATABASE_INPUT_FROM_CONNECTION_PORT: return createDatabaseInputFromConnectionPort();
			case COSA_m1Package.DATABASE_OUTPUT_TO_CONNECTION_PORT: return createDatabaseOutputToConnectionPort();
			case COSA_m1Package.CONNECTION_SECURITY_CONNECTOR: return createConnectionSecurityConnector();
			case COSA_m1Package.CONNECTION_SECURITY_IN_ROLE: return createConnectionSecurityInRole();
			case COSA_m1Package.CONNECTION_SECURITY_OUT_ROLE: return createConnectionSecurityOutRole();
			case COSA_m1Package.SECURITY_CONNECTION_OUT_ROLE: return createSecurityConnectionOutRole();
			case COSA_m1Package.SECURITY_CONNECTION_IN_ROLE: return createSecurityConnectionInRole();
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT: return createConnectionConnectorSecurityAttachment();
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT: return createConnectorSecurityConnectionAttachment();
			case COSA_m1Package.SECURITY_INPUT_FROM_CONNECTION_PORT: return createSecurityInputFromConnectionPort();
			case COSA_m1Package.SECURITY_OUPUT_TO_CONNECTION_PORT: return createSecurityOuputToConnectionPort();
			case COSA_m1Package.CONNECTOR_CONNECTION_SECURITY_ATTACHMENT: return createConnectorConnectionSecurityAttachment();
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT: return createSecurityConnectorConnectionAttachment();
			case COSA_m1Package.DATABASE_OUTPUT_TO_SECURITY_PORT: return createDatabaseOutputToSecurityPort();
			case COSA_m1Package.DATABASE_INPUT_FROM_SECURITY_PORT: return createDatabaseInputFromSecurityPort();
			case COSA_m1Package.SECURITY_OUTPUT_TO_DATABASE_PORT: return createSecurityOutputToDatabasePort();
			case COSA_m1Package.SECURITY_INPUT_FROM_DATABASE_PORT: return createSecurityInputFromDatabasePort();
			case COSA_m1Package.DATABASE_SECURITY_CONNECTOR: return createDatabaseSecurityConnector();
			case COSA_m1Package.DATABASE_SECURITY_IN_ROLE: return createDatabaseSecurityInRole();
			case COSA_m1Package.DECURITY_DATABASE_OUT_ROLE: return createDecurityDatabaseOutRole();
			case COSA_m1Package.SECURITY_DATABASE_IN_ROLE: return createSecurityDatabaseInRole();
			case COSA_m1Package.DATABASE_SECURITY_OUT_ROLE: return createDatabaseSecurityOutRole();
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT: return createDatabaseConnectorSecurityAttachment();
			case COSA_m1Package.CONNECTOR_SECURITY_DATABASE_ATTACHMENT: return createConnectorSecurityDatabaseAttachment();
			case COSA_m1Package.SECURITY_CONNECTOR_DATABASE_ATTACHMENT: return createSecurityConnectorDatabaseAttachment();
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT: return createConnectorDatabaseSecurityAttachment();
			case COSA_m1Package.CD_CONNECTOR_GLUE: return createCDConnectorGlue();
			case COSA_m1Package.CSC_ONNECTOR_GLUE: return createCSCOnnectorGlue();
			case COSA_m1Package.DS_CONNECTOR_GLUE: return createDSConnectorGlue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePortRPC createResponsePortRPC() {
		ResponsePortRPCImpl responsePortRPC = new ResponsePortRPCImpl();
		return responsePortRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPortRPC createRequestPortRPC() {
		RequestPortRPCImpl requestPortRPC = new RequestPortRPCImpl();
		return requestPortRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSConf createCSConf() {
		CSConfImpl csConf = new CSConfImpl();
		return csConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSQueryPorts createCSQueryPorts() {
		CSQueryPortsImpl csQueryPorts = new CSQueryPortsImpl();
		return csQueryPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSResponsePorts createCSResponsePorts() {
		CSResponsePortsImpl csResponsePorts = new CSResponsePortsImpl();
		return csResponsePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC createRPC() {
		RPCImpl rpc = new RPCImpl();
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientOutRole createClientOutRole() {
		ClientOutRoleImpl clientOutRole = new ClientOutRoleImpl();
		return clientOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientInRole createClientInRole() {
		ClientInRoleImpl clientInRole = new ClientInRoleImpl();
		return clientInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInRole createServerInRole() {
		ServerInRoleImpl serverInRole = new ServerInRoleImpl();
		return serverInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurOutRole createServeurOutRole() {
		ServeurOutRoleImpl serveurOutRole = new ServeurOutRoleImpl();
		return serveurOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientRpcAttachment createClientRpcAttachment() {
		ClientRpcAttachmentImpl clientRpcAttachment = new ClientRpcAttachmentImpl();
		return clientRpcAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpcClientAttachment createRpcClientAttachment() {
		RpcClientAttachmentImpl rpcClientAttachment = new RpcClientAttachmentImpl();
		return rpcClientAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigInput createConfigInput() {
		ConfigInputImpl configInput = new ConfigInputImpl();
		return configInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigOutput createConfigOutput() {
		ConfigOutputImpl configOutput = new ConfigOutputImpl();
		return configOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBindings createInputBindings() {
		InputBindingsImpl inputBindings = new InputBindingsImpl();
		return inputBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBindings createOutputBindings() {
		OutputBindingsImpl outputBindings = new OutputBindingsImpl();
		return outputBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpcGlue createRpcGlue() {
		RpcGlueImpl rpcGlue = new RpcGlueImpl();
		return rpcGlue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpcServerAttachment createRpcServerAttachment() {
		RpcServerAttachmentImpl rpcServerAttachment = new RpcServerAttachmentImpl();
		return rpcServerAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerRpcAttachment createServerRpcAttachment() {
		ServerRpcAttachmentImpl serverRpcAttachment = new ServerRpcAttachmentImpl();
		return serverRpcAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInput createServerInput() {
		ServerInputImpl serverInput = new ServerInputImpl();
		return serverInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOuput createServerOuput() {
		ServerOuputImpl serverOuput = new ServerOuputImpl();
		return serverOuput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager createConnectionManager() {
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl();
		return connectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cOSA_m1.SecurityManager createSecurityManager() {
		SecurityManagerImpl securityManager = new SecurityManagerImpl();
		return securityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase createDataBase() {
		DataBaseImpl dataBase = new DataBaseImpl();
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigInput createServerConfigInput() {
		ServerConfigInputImpl serverConfigInput = new ServerConfigInputImpl();
		return serverConfigInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigOutput createServerConfigOutput() {
		ServerConfigOutputImpl serverConfigOutput = new ServerConfigOutputImpl();
		return serverConfigOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBinding createInputBinding() {
		InputBindingImpl inputBinding = new InputBindingImpl();
		return inputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBinding createOutputBinding() {
		OutputBindingImpl outputBinding = new OutputBindingImpl();
		return outputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOutputToSecurityPort createConnectionOutputToSecurityPort() {
		ConnectionOutputToSecurityPortImpl connectionOutputToSecurityPort = new ConnectionOutputToSecurityPortImpl();
		return connectionOutputToSecurityPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInputFromSecurityPort createConnectionInputFromSecurityPort() {
		ConnectionInputFromSecurityPortImpl connectionInputFromSecurityPort = new ConnectionInputFromSecurityPortImpl();
		return connectionInputFromSecurityPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOuputToDataBasePort createConnectionOuputToDataBasePort() {
		ConnectionOuputToDataBasePortImpl connectionOuputToDataBasePort = new ConnectionOuputToDataBasePortImpl();
		return connectionOuputToDataBasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInputFromDataBasePort createConnectionInputFromDataBasePort() {
		ConnectionInputFromDataBasePortImpl connectionInputFromDataBasePort = new ConnectionInputFromDataBasePortImpl();
		return connectionInputFromDataBasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDatabaseConnector createConnectionDatabaseConnector() {
		ConnectionDatabaseConnectorImpl connectionDatabaseConnector = new ConnectionDatabaseConnectorImpl();
		return connectionDatabaseConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionOutRole createDBConnectionOutRole() {
		DBConnectionOutRoleImpl dbConnectionOutRole = new DBConnectionOutRoleImpl();
		return dbConnectionOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBInRole createConnectionDBInRole() {
		ConnectionDBInRoleImpl connectionDBInRole = new ConnectionDBInRoleImpl();
		return connectionDBInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionConnectorDatabaseAttachment createConnectionConnectorDatabaseAttachment() {
		ConnectionConnectorDatabaseAttachmentImpl connectionConnectorDatabaseAttachment = new ConnectionConnectorDatabaseAttachmentImpl();
		return connectionConnectorDatabaseAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDatabaseConnectionAttachment createConnectorDatabaseConnectionAttachment() {
		ConnectorDatabaseConnectionAttachmentImpl connectorDatabaseConnectionAttachment = new ConnectorDatabaseConnectionAttachmentImpl();
		return connectorDatabaseConnectionAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBOutRole createConnectionDBOutRole() {
		ConnectionDBOutRoleImpl connectionDBOutRole = new ConnectionDBOutRoleImpl();
		return connectionDBOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionInRole createDBConnectionInRole() {
		DBConnectionInRoleImpl dbConnectionInRole = new DBConnectionInRoleImpl();
		return dbConnectionInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorConnectionDatabaseAttachment createConnectorConnectionDatabaseAttachment() {
		ConnectorConnectionDatabaseAttachmentImpl connectorConnectionDatabaseAttachment = new ConnectorConnectionDatabaseAttachmentImpl();
		return connectorConnectionDatabaseAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseConnectorConnectionAttachment createDatabaseConnectorConnectionAttachment() {
		DatabaseConnectorConnectionAttachmentImpl databaseConnectorConnectionAttachment = new DatabaseConnectorConnectionAttachmentImpl();
		return databaseConnectorConnectionAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInputFromConnectionPort createDatabaseInputFromConnectionPort() {
		DatabaseInputFromConnectionPortImpl databaseInputFromConnectionPort = new DatabaseInputFromConnectionPortImpl();
		return databaseInputFromConnectionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseOutputToConnectionPort createDatabaseOutputToConnectionPort() {
		DatabaseOutputToConnectionPortImpl databaseOutputToConnectionPort = new DatabaseOutputToConnectionPortImpl();
		return databaseOutputToConnectionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityConnector createConnectionSecurityConnector() {
		ConnectionSecurityConnectorImpl connectionSecurityConnector = new ConnectionSecurityConnectorImpl();
		return connectionSecurityConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityInRole createConnectionSecurityInRole() {
		ConnectionSecurityInRoleImpl connectionSecurityInRole = new ConnectionSecurityInRoleImpl();
		return connectionSecurityInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityOutRole createConnectionSecurityOutRole() {
		ConnectionSecurityOutRoleImpl connectionSecurityOutRole = new ConnectionSecurityOutRoleImpl();
		return connectionSecurityOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionOutRole createSecurityConnectionOutRole() {
		SecurityConnectionOutRoleImpl securityConnectionOutRole = new SecurityConnectionOutRoleImpl();
		return securityConnectionOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionInRole createSecurityConnectionInRole() {
		SecurityConnectionInRoleImpl securityConnectionInRole = new SecurityConnectionInRoleImpl();
		return securityConnectionInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionConnectorSecurityAttachment createConnectionConnectorSecurityAttachment() {
		ConnectionConnectorSecurityAttachmentImpl connectionConnectorSecurityAttachment = new ConnectionConnectorSecurityAttachmentImpl();
		return connectionConnectorSecurityAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSecurityConnectionAttachment createConnectorSecurityConnectionAttachment() {
		ConnectorSecurityConnectionAttachmentImpl connectorSecurityConnectionAttachment = new ConnectorSecurityConnectionAttachmentImpl();
		return connectorSecurityConnectionAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityInputFromConnectionPort createSecurityInputFromConnectionPort() {
		SecurityInputFromConnectionPortImpl securityInputFromConnectionPort = new SecurityInputFromConnectionPortImpl();
		return securityInputFromConnectionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityOuputToConnectionPort createSecurityOuputToConnectionPort() {
		SecurityOuputToConnectionPortImpl securityOuputToConnectionPort = new SecurityOuputToConnectionPortImpl();
		return securityOuputToConnectionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorConnectionSecurityAttachment createConnectorConnectionSecurityAttachment() {
		ConnectorConnectionSecurityAttachmentImpl connectorConnectionSecurityAttachment = new ConnectorConnectionSecurityAttachmentImpl();
		return connectorConnectionSecurityAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectorConnectionAttachment createSecurityConnectorConnectionAttachment() {
		SecurityConnectorConnectionAttachmentImpl securityConnectorConnectionAttachment = new SecurityConnectorConnectionAttachmentImpl();
		return securityConnectorConnectionAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseOutputToSecurityPort createDatabaseOutputToSecurityPort() {
		DatabaseOutputToSecurityPortImpl databaseOutputToSecurityPort = new DatabaseOutputToSecurityPortImpl();
		return databaseOutputToSecurityPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInputFromSecurityPort createDatabaseInputFromSecurityPort() {
		DatabaseInputFromSecurityPortImpl databaseInputFromSecurityPort = new DatabaseInputFromSecurityPortImpl();
		return databaseInputFromSecurityPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityOutputToDatabasePort createSecurityOutputToDatabasePort() {
		SecurityOutputToDatabasePortImpl securityOutputToDatabasePort = new SecurityOutputToDatabasePortImpl();
		return securityOutputToDatabasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityInputFromDatabasePort createSecurityInputFromDatabasePort() {
		SecurityInputFromDatabasePortImpl securityInputFromDatabasePort = new SecurityInputFromDatabasePortImpl();
		return securityInputFromDatabasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityConnector createDatabaseSecurityConnector() {
		DatabaseSecurityConnectorImpl databaseSecurityConnector = new DatabaseSecurityConnectorImpl();
		return databaseSecurityConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityInRole createDatabaseSecurityInRole() {
		DatabaseSecurityInRoleImpl databaseSecurityInRole = new DatabaseSecurityInRoleImpl();
		return databaseSecurityInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecurityDatabaseOutRole createDecurityDatabaseOutRole() {
		DecurityDatabaseOutRoleImpl decurityDatabaseOutRole = new DecurityDatabaseOutRoleImpl();
		return decurityDatabaseOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDatabaseInRole createSecurityDatabaseInRole() {
		SecurityDatabaseInRoleImpl securityDatabaseInRole = new SecurityDatabaseInRoleImpl();
		return securityDatabaseInRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityOutRole createDatabaseSecurityOutRole() {
		DatabaseSecurityOutRoleImpl databaseSecurityOutRole = new DatabaseSecurityOutRoleImpl();
		return databaseSecurityOutRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseConnectorSecurityAttachment createDatabaseConnectorSecurityAttachment() {
		DatabaseConnectorSecurityAttachmentImpl databaseConnectorSecurityAttachment = new DatabaseConnectorSecurityAttachmentImpl();
		return databaseConnectorSecurityAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSecurityDatabaseAttachment createConnectorSecurityDatabaseAttachment() {
		ConnectorSecurityDatabaseAttachmentImpl connectorSecurityDatabaseAttachment = new ConnectorSecurityDatabaseAttachmentImpl();
		return connectorSecurityDatabaseAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectorDatabaseAttachment createSecurityConnectorDatabaseAttachment() {
		SecurityConnectorDatabaseAttachmentImpl securityConnectorDatabaseAttachment = new SecurityConnectorDatabaseAttachmentImpl();
		return securityConnectorDatabaseAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDatabaseSecurityAttachment createConnectorDatabaseSecurityAttachment() {
		ConnectorDatabaseSecurityAttachmentImpl connectorDatabaseSecurityAttachment = new ConnectorDatabaseSecurityAttachmentImpl();
		return connectorDatabaseSecurityAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDConnectorGlue createCDConnectorGlue() {
		CDConnectorGlueImpl cdConnectorGlue = new CDConnectorGlueImpl();
		return cdConnectorGlue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSCOnnectorGlue createCSCOnnectorGlue() {
		CSCOnnectorGlueImpl cscOnnectorGlue = new CSCOnnectorGlueImpl();
		return cscOnnectorGlue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSConnectorGlue createDSConnectorGlue() {
		DSConnectorGlueImpl dsConnectorGlue = new DSConnectorGlueImpl();
		return dsConnectorGlue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSA_m1Package getCOSA_m1Package() {
		return (COSA_m1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static COSA_m1Package getPackage() {
		return COSA_m1Package.eINSTANCE;
	}

} //COSA_m1FactoryImpl
