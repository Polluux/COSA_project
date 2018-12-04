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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cOSA_m1.COSA_m1Package
 * @generated
 */
public class COSA_m1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static COSA_m1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSA_m1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = COSA_m1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COSA_m1Switch<Adapter> modelSwitch =
		new COSA_m1Switch<Adapter>() {
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseResponsePortRPC(ResponsePortRPC object) {
				return createResponsePortRPCAdapter();
			}
			@Override
			public Adapter caseRequestPortRPC(RequestPortRPC object) {
				return createRequestPortRPCAdapter();
			}
			@Override
			public Adapter caseCSConf(CSConf object) {
				return createCSConfAdapter();
			}
			@Override
			public Adapter caseCSQueryPorts(CSQueryPorts object) {
				return createCSQueryPortsAdapter();
			}
			@Override
			public Adapter caseCSResponsePorts(CSResponsePorts object) {
				return createCSResponsePortsAdapter();
			}
			@Override
			public Adapter caseRPC(RPC object) {
				return createRPCAdapter();
			}
			@Override
			public Adapter caseClientOutRole(ClientOutRole object) {
				return createClientOutRoleAdapter();
			}
			@Override
			public Adapter caseClientInRole(ClientInRole object) {
				return createClientInRoleAdapter();
			}
			@Override
			public Adapter caseServerInRole(ServerInRole object) {
				return createServerInRoleAdapter();
			}
			@Override
			public Adapter caseServeurOutRole(ServeurOutRole object) {
				return createServeurOutRoleAdapter();
			}
			@Override
			public Adapter caseClientRpcAttachment(ClientRpcAttachment object) {
				return createClientRpcAttachmentAdapter();
			}
			@Override
			public Adapter caseRpcClientAttachment(RpcClientAttachment object) {
				return createRpcClientAttachmentAdapter();
			}
			@Override
			public Adapter caseConfigInput(ConfigInput object) {
				return createConfigInputAdapter();
			}
			@Override
			public Adapter caseConfigOutput(ConfigOutput object) {
				return createConfigOutputAdapter();
			}
			@Override
			public Adapter caseInputBindings(InputBindings object) {
				return createInputBindingsAdapter();
			}
			@Override
			public Adapter caseOutputBindings(OutputBindings object) {
				return createOutputBindingsAdapter();
			}
			@Override
			public Adapter caseRpcGlue(RpcGlue object) {
				return createRpcGlueAdapter();
			}
			@Override
			public Adapter caseRpcServerAttachment(RpcServerAttachment object) {
				return createRpcServerAttachmentAdapter();
			}
			@Override
			public Adapter caseServerRpcAttachment(ServerRpcAttachment object) {
				return createServerRpcAttachmentAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseServerInput(ServerInput object) {
				return createServerInputAdapter();
			}
			@Override
			public Adapter caseServerOuput(ServerOuput object) {
				return createServerOuputAdapter();
			}
			@Override
			public Adapter caseConnectionManager(ConnectionManager object) {
				return createConnectionManagerAdapter();
			}
			@Override
			public Adapter caseSecurityManager(cOSA_m1.SecurityManager object) {
				return createSecurityManagerAdapter();
			}
			@Override
			public Adapter caseDataBase(DataBase object) {
				return createDataBaseAdapter();
			}
			@Override
			public Adapter caseServerConfigInput(ServerConfigInput object) {
				return createServerConfigInputAdapter();
			}
			@Override
			public Adapter caseServerConfigOutput(ServerConfigOutput object) {
				return createServerConfigOutputAdapter();
			}
			@Override
			public Adapter caseInputBinding(InputBinding object) {
				return createInputBindingAdapter();
			}
			@Override
			public Adapter caseOutputBinding(OutputBinding object) {
				return createOutputBindingAdapter();
			}
			@Override
			public Adapter caseConnectionOutputToSecurityPort(ConnectionOutputToSecurityPort object) {
				return createConnectionOutputToSecurityPortAdapter();
			}
			@Override
			public Adapter caseConnectionInputFromSecurityPort(ConnectionInputFromSecurityPort object) {
				return createConnectionInputFromSecurityPortAdapter();
			}
			@Override
			public Adapter caseConnectionOuputToDataBasePort(ConnectionOuputToDataBasePort object) {
				return createConnectionOuputToDataBasePortAdapter();
			}
			@Override
			public Adapter caseConnectionInputFromDataBasePort(ConnectionInputFromDataBasePort object) {
				return createConnectionInputFromDataBasePortAdapter();
			}
			@Override
			public Adapter caseConnectionDatabaseConnector(ConnectionDatabaseConnector object) {
				return createConnectionDatabaseConnectorAdapter();
			}
			@Override
			public Adapter caseDBConnectionOutRole(DBConnectionOutRole object) {
				return createDBConnectionOutRoleAdapter();
			}
			@Override
			public Adapter caseConnectionDBInRole(ConnectionDBInRole object) {
				return createConnectionDBInRoleAdapter();
			}
			@Override
			public Adapter caseConnectionConnectorDatabaseAttachment(ConnectionConnectorDatabaseAttachment object) {
				return createConnectionConnectorDatabaseAttachmentAdapter();
			}
			@Override
			public Adapter caseConnectorDatabaseConnectionAttachment(ConnectorDatabaseConnectionAttachment object) {
				return createConnectorDatabaseConnectionAttachmentAdapter();
			}
			@Override
			public Adapter caseConnectionDBOutRole(ConnectionDBOutRole object) {
				return createConnectionDBOutRoleAdapter();
			}
			@Override
			public Adapter caseDBConnectionInRole(DBConnectionInRole object) {
				return createDBConnectionInRoleAdapter();
			}
			@Override
			public Adapter caseConnectorConnectionDatabaseAttachment(ConnectorConnectionDatabaseAttachment object) {
				return createConnectorConnectionDatabaseAttachmentAdapter();
			}
			@Override
			public Adapter caseDatabaseConnectorConnectionAttachment(DatabaseConnectorConnectionAttachment object) {
				return createDatabaseConnectorConnectionAttachmentAdapter();
			}
			@Override
			public Adapter caseDatabaseInputFromConnectionPort(DatabaseInputFromConnectionPort object) {
				return createDatabaseInputFromConnectionPortAdapter();
			}
			@Override
			public Adapter caseDatabaseOutputToConnectionPort(DatabaseOutputToConnectionPort object) {
				return createDatabaseOutputToConnectionPortAdapter();
			}
			@Override
			public Adapter caseConnectionSecurityConnector(ConnectionSecurityConnector object) {
				return createConnectionSecurityConnectorAdapter();
			}
			@Override
			public Adapter caseConnectionSecurityInRole(ConnectionSecurityInRole object) {
				return createConnectionSecurityInRoleAdapter();
			}
			@Override
			public Adapter caseConnectionSecurityOutRole(ConnectionSecurityOutRole object) {
				return createConnectionSecurityOutRoleAdapter();
			}
			@Override
			public Adapter caseSecurityConnectionOutRole(SecurityConnectionOutRole object) {
				return createSecurityConnectionOutRoleAdapter();
			}
			@Override
			public Adapter caseSecurityConnectionInRole(SecurityConnectionInRole object) {
				return createSecurityConnectionInRoleAdapter();
			}
			@Override
			public Adapter caseConnectionConnectorSecurityAttachment(ConnectionConnectorSecurityAttachment object) {
				return createConnectionConnectorSecurityAttachmentAdapter();
			}
			@Override
			public Adapter caseConnectorSecurityConnectionAttachment(ConnectorSecurityConnectionAttachment object) {
				return createConnectorSecurityConnectionAttachmentAdapter();
			}
			@Override
			public Adapter caseSecurityInputFromConnectionPort(SecurityInputFromConnectionPort object) {
				return createSecurityInputFromConnectionPortAdapter();
			}
			@Override
			public Adapter caseSecurityOuputToConnectionPort(SecurityOuputToConnectionPort object) {
				return createSecurityOuputToConnectionPortAdapter();
			}
			@Override
			public Adapter caseConnectorConnectionSecurityAttachment(ConnectorConnectionSecurityAttachment object) {
				return createConnectorConnectionSecurityAttachmentAdapter();
			}
			@Override
			public Adapter caseSecurityConnectorConnectionAttachment(SecurityConnectorConnectionAttachment object) {
				return createSecurityConnectorConnectionAttachmentAdapter();
			}
			@Override
			public Adapter caseDatabaseOutputToSecurityPort(DatabaseOutputToSecurityPort object) {
				return createDatabaseOutputToSecurityPortAdapter();
			}
			@Override
			public Adapter caseDatabaseInputFromSecurityPort(DatabaseInputFromSecurityPort object) {
				return createDatabaseInputFromSecurityPortAdapter();
			}
			@Override
			public Adapter caseSecurityOutputToDatabasePort(SecurityOutputToDatabasePort object) {
				return createSecurityOutputToDatabasePortAdapter();
			}
			@Override
			public Adapter caseSecurityInputFromDatabasePort(SecurityInputFromDatabasePort object) {
				return createSecurityInputFromDatabasePortAdapter();
			}
			@Override
			public Adapter caseDatabaseSecurityConnector(DatabaseSecurityConnector object) {
				return createDatabaseSecurityConnectorAdapter();
			}
			@Override
			public Adapter caseDatabaseSecurityInRole(DatabaseSecurityInRole object) {
				return createDatabaseSecurityInRoleAdapter();
			}
			@Override
			public Adapter caseDecurityDatabaseOutRole(DecurityDatabaseOutRole object) {
				return createDecurityDatabaseOutRoleAdapter();
			}
			@Override
			public Adapter caseSecurityDatabaseInRole(SecurityDatabaseInRole object) {
				return createSecurityDatabaseInRoleAdapter();
			}
			@Override
			public Adapter caseDatabaseSecurityOutRole(DatabaseSecurityOutRole object) {
				return createDatabaseSecurityOutRoleAdapter();
			}
			@Override
			public Adapter caseDatabaseConnectorSecurityAttachment(DatabaseConnectorSecurityAttachment object) {
				return createDatabaseConnectorSecurityAttachmentAdapter();
			}
			@Override
			public Adapter caseConnectorSecurityDatabaseAttachment(ConnectorSecurityDatabaseAttachment object) {
				return createConnectorSecurityDatabaseAttachmentAdapter();
			}
			@Override
			public Adapter caseSecurityConnectorDatabaseAttachment(SecurityConnectorDatabaseAttachment object) {
				return createSecurityConnectorDatabaseAttachmentAdapter();
			}
			@Override
			public Adapter caseConnectorDatabaseSecurityAttachment(ConnectorDatabaseSecurityAttachment object) {
				return createConnectorDatabaseSecurityAttachmentAdapter();
			}
			@Override
			public Adapter caseCDConnectorGlue(CDConnectorGlue object) {
				return createCDConnectorGlueAdapter();
			}
			@Override
			public Adapter caseCSCOnnectorGlue(CSCOnnectorGlue object) {
				return createCSCOnnectorGlueAdapter();
			}
			@Override
			public Adapter caseDSConnectorGlue(DSConnectorGlue object) {
				return createDSConnectorGlueAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter caseInterfaceConfig(InterfaceConfig object) {
				return createInterfaceConfigAdapter();
			}
			@Override
			public Adapter caseInterfaceCompo(InterfaceCompo object) {
				return createInterfaceCompoAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseRequiredPort(RequiredPort object) {
				return createRequiredPortAdapter();
			}
			@Override
			public Adapter caseProvidedPort(ProvidedPort object) {
				return createProvidedPortAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseConnecteur(Connecteur object) {
				return createConnecteurAdapter();
			}
			@Override
			public Adapter caseInterfaceConnect(InterfaceConnect object) {
				return createInterfaceConnectAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRequiredRole(RequiredRole object) {
				return createRequiredRoleAdapter();
			}
			@Override
			public Adapter caseProvidedRole(ProvidedRole object) {
				return createProvidedRoleAdapter();
			}
			@Override
			public Adapter caseAttachement(Attachement object) {
				return createAttachementAdapter();
			}
			@Override
			public Adapter caseAComposantConnecteur(AComposantConnecteur object) {
				return createAComposantConnecteurAdapter();
			}
			@Override
			public Adapter caseAConnecteurComposant(AConnecteurComposant object) {
				return createAConnecteurComposantAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseRequiredBinding(RequiredBinding object) {
				return createRequiredBindingAdapter();
			}
			@Override
			public Adapter caseProvidedBinding(ProvidedBinding object) {
				return createProvidedBindingAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ResponsePortRPC <em>Response Port RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ResponsePortRPC
	 * @generated
	 */
	public Adapter createResponsePortRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.RequestPortRPC <em>Request Port RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.RequestPortRPC
	 * @generated
	 */
	public Adapter createRequestPortRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.CSConf <em>CS Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.CSConf
	 * @generated
	 */
	public Adapter createCSConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.CSQueryPorts <em>CS Query Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.CSQueryPorts
	 * @generated
	 */
	public Adapter createCSQueryPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.CSResponsePorts <em>CS Response Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.CSResponsePorts
	 * @generated
	 */
	public Adapter createCSResponsePortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.RPC
	 * @generated
	 */
	public Adapter createRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ClientOutRole <em>Client Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ClientOutRole
	 * @generated
	 */
	public Adapter createClientOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ClientInRole <em>Client In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ClientInRole
	 * @generated
	 */
	public Adapter createClientInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ServerInRole <em>Server In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ServerInRole
	 * @generated
	 */
	public Adapter createServerInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ServeurOutRole <em>Serveur Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ServeurOutRole
	 * @generated
	 */
	public Adapter createServeurOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ClientRpcAttachment <em>Client Rpc Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ClientRpcAttachment
	 * @generated
	 */
	public Adapter createClientRpcAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.RpcClientAttachment <em>Rpc Client Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.RpcClientAttachment
	 * @generated
	 */
	public Adapter createRpcClientAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConfigInput <em>Config Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConfigInput
	 * @generated
	 */
	public Adapter createConfigInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConfigOutput <em>Config Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConfigOutput
	 * @generated
	 */
	public Adapter createConfigOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.InputBindings <em>Input Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.InputBindings
	 * @generated
	 */
	public Adapter createInputBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.OutputBindings <em>Output Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.OutputBindings
	 * @generated
	 */
	public Adapter createOutputBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.RpcGlue <em>Rpc Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.RpcGlue
	 * @generated
	 */
	public Adapter createRpcGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.RpcServerAttachment <em>Rpc Server Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.RpcServerAttachment
	 * @generated
	 */
	public Adapter createRpcServerAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ServerRpcAttachment <em>Server Rpc Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ServerRpcAttachment
	 * @generated
	 */
	public Adapter createServerRpcAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ServerInput <em>Server Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ServerInput
	 * @generated
	 */
	public Adapter createServerInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ServerOuput <em>Server Ouput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ServerOuput
	 * @generated
	 */
	public Adapter createServerOuputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionManager
	 * @generated
	 */
	public Adapter createConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityManager
	 * @generated
	 */
	public Adapter createSecurityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DataBase
	 * @generated
	 */
	public Adapter createDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ServerConfigInput <em>Server Config Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ServerConfigInput
	 * @generated
	 */
	public Adapter createServerConfigInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ServerConfigOutput <em>Server Config Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ServerConfigOutput
	 * @generated
	 */
	public Adapter createServerConfigOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.InputBinding <em>Input Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.InputBinding
	 * @generated
	 */
	public Adapter createInputBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.OutputBinding <em>Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.OutputBinding
	 * @generated
	 */
	public Adapter createOutputBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionOutputToSecurityPort <em>Connection Output To Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionOutputToSecurityPort
	 * @generated
	 */
	public Adapter createConnectionOutputToSecurityPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionInputFromSecurityPort <em>Connection Input From Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionInputFromSecurityPort
	 * @generated
	 */
	public Adapter createConnectionInputFromSecurityPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionOuputToDataBasePort <em>Connection Ouput To Data Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionOuputToDataBasePort
	 * @generated
	 */
	public Adapter createConnectionOuputToDataBasePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionInputFromDataBasePort <em>Connection Input From Data Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionInputFromDataBasePort
	 * @generated
	 */
	public Adapter createConnectionInputFromDataBasePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionDatabaseConnector <em>Connection Database Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionDatabaseConnector
	 * @generated
	 */
	public Adapter createConnectionDatabaseConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DBConnectionOutRole <em>DB Connection Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DBConnectionOutRole
	 * @generated
	 */
	public Adapter createDBConnectionOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionDBInRole <em>Connection DB In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionDBInRole
	 * @generated
	 */
	public Adapter createConnectionDBInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionConnectorDatabaseAttachment <em>Connection Connector Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionConnectorDatabaseAttachment
	 * @generated
	 */
	public Adapter createConnectionConnectorDatabaseAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectorDatabaseConnectionAttachment <em>Connector Database Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectorDatabaseConnectionAttachment
	 * @generated
	 */
	public Adapter createConnectorDatabaseConnectionAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionDBOutRole <em>Connection DB Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionDBOutRole
	 * @generated
	 */
	public Adapter createConnectionDBOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DBConnectionInRole <em>DB Connection In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DBConnectionInRole
	 * @generated
	 */
	public Adapter createDBConnectionInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectorConnectionDatabaseAttachment <em>Connector Connection Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectorConnectionDatabaseAttachment
	 * @generated
	 */
	public Adapter createConnectorConnectionDatabaseAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseConnectorConnectionAttachment <em>Database Connector Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseConnectorConnectionAttachment
	 * @generated
	 */
	public Adapter createDatabaseConnectorConnectionAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseInputFromConnectionPort <em>Database Input From Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseInputFromConnectionPort
	 * @generated
	 */
	public Adapter createDatabaseInputFromConnectionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseOutputToConnectionPort <em>Database Output To Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseOutputToConnectionPort
	 * @generated
	 */
	public Adapter createDatabaseOutputToConnectionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionSecurityConnector <em>Connection Security Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionSecurityConnector
	 * @generated
	 */
	public Adapter createConnectionSecurityConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionSecurityInRole <em>Connection Security In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionSecurityInRole
	 * @generated
	 */
	public Adapter createConnectionSecurityInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionSecurityOutRole <em>Connection Security Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionSecurityOutRole
	 * @generated
	 */
	public Adapter createConnectionSecurityOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityConnectionOutRole <em>Security Connection Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityConnectionOutRole
	 * @generated
	 */
	public Adapter createSecurityConnectionOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityConnectionInRole <em>Security Connection In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityConnectionInRole
	 * @generated
	 */
	public Adapter createSecurityConnectionInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectionConnectorSecurityAttachment <em>Connection Connector Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectionConnectorSecurityAttachment
	 * @generated
	 */
	public Adapter createConnectionConnectorSecurityAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectorSecurityConnectionAttachment <em>Connector Security Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectorSecurityConnectionAttachment
	 * @generated
	 */
	public Adapter createConnectorSecurityConnectionAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityInputFromConnectionPort <em>Security Input From Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityInputFromConnectionPort
	 * @generated
	 */
	public Adapter createSecurityInputFromConnectionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityOuputToConnectionPort <em>Security Ouput To Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityOuputToConnectionPort
	 * @generated
	 */
	public Adapter createSecurityOuputToConnectionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectorConnectionSecurityAttachment <em>Connector Connection Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectorConnectionSecurityAttachment
	 * @generated
	 */
	public Adapter createConnectorConnectionSecurityAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityConnectorConnectionAttachment <em>Security Connector Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityConnectorConnectionAttachment
	 * @generated
	 */
	public Adapter createSecurityConnectorConnectionAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseOutputToSecurityPort <em>Database Output To Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseOutputToSecurityPort
	 * @generated
	 */
	public Adapter createDatabaseOutputToSecurityPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseInputFromSecurityPort <em>Database Input From Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseInputFromSecurityPort
	 * @generated
	 */
	public Adapter createDatabaseInputFromSecurityPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityOutputToDatabasePort <em>Security Output To Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityOutputToDatabasePort
	 * @generated
	 */
	public Adapter createSecurityOutputToDatabasePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityInputFromDatabasePort <em>Security Input From Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityInputFromDatabasePort
	 * @generated
	 */
	public Adapter createSecurityInputFromDatabasePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseSecurityConnector <em>Database Security Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseSecurityConnector
	 * @generated
	 */
	public Adapter createDatabaseSecurityConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseSecurityInRole <em>Database Security In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseSecurityInRole
	 * @generated
	 */
	public Adapter createDatabaseSecurityInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DecurityDatabaseOutRole <em>Decurity Database Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DecurityDatabaseOutRole
	 * @generated
	 */
	public Adapter createDecurityDatabaseOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityDatabaseInRole <em>Security Database In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityDatabaseInRole
	 * @generated
	 */
	public Adapter createSecurityDatabaseInRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseSecurityOutRole <em>Database Security Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseSecurityOutRole
	 * @generated
	 */
	public Adapter createDatabaseSecurityOutRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DatabaseConnectorSecurityAttachment <em>Database Connector Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DatabaseConnectorSecurityAttachment
	 * @generated
	 */
	public Adapter createDatabaseConnectorSecurityAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectorSecurityDatabaseAttachment <em>Connector Security Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectorSecurityDatabaseAttachment
	 * @generated
	 */
	public Adapter createConnectorSecurityDatabaseAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.SecurityConnectorDatabaseAttachment <em>Security Connector Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.SecurityConnectorDatabaseAttachment
	 * @generated
	 */
	public Adapter createSecurityConnectorDatabaseAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.ConnectorDatabaseSecurityAttachment <em>Connector Database Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.ConnectorDatabaseSecurityAttachment
	 * @generated
	 */
	public Adapter createConnectorDatabaseSecurityAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.CDConnectorGlue <em>CD Connector Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.CDConnectorGlue
	 * @generated
	 */
	public Adapter createCDConnectorGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.CSCOnnectorGlue <em>CSC Onnector Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.CSCOnnectorGlue
	 * @generated
	 */
	public Adapter createCSCOnnectorGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA_m1.DSConnectorGlue <em>DS Connector Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA_m1.DSConnectorGlue
	 * @generated
	 */
	public Adapter createDSConnectorGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Composant
	 * @generated
	 */
	public Adapter createComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.InterfaceConfig <em>Interface Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.InterfaceConfig
	 * @generated
	 */
	public Adapter createInterfaceConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.InterfaceCompo <em>Interface Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.InterfaceCompo
	 * @generated
	 */
	public Adapter createInterfaceCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.RequiredPort
	 * @generated
	 */
	public Adapter createRequiredPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.ProvidedPort
	 * @generated
	 */
	public Adapter createProvidedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Connecteur
	 * @generated
	 */
	public Adapter createConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.InterfaceConnect <em>Interface Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.InterfaceConnect
	 * @generated
	 */
	public Adapter createInterfaceConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.RequiredRole
	 * @generated
	 */
	public Adapter createRequiredRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.ProvidedRole
	 * @generated
	 */
	public Adapter createProvidedRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Attachement
	 * @generated
	 */
	public Adapter createAttachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.AComposantConnecteur <em>AComposant Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.AComposantConnecteur
	 * @generated
	 */
	public Adapter createAComposantConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.AConnecteurComposant <em>AConnecteur Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.AConnecteurComposant
	 * @generated
	 */
	public Adapter createAConnecteurComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.RequiredBinding <em>Required Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.RequiredBinding
	 * @generated
	 */
	public Adapter createRequiredBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.ProvidedBinding <em>Provided Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.ProvidedBinding
	 * @generated
	 */
	public Adapter createProvidedBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cOSA.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cOSA.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //COSA_m1AdapterFactory
