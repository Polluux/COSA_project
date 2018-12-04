/**
 */
package cOSA_m1.impl;

import cOSA.COSAPackage;

import cOSA.impl.COSAPackageImpl;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class COSA_m1PackageImpl extends EPackageImpl implements COSA_m1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsePortRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestPortRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csQueryPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csResponsePortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveurOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientRpcAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcClientAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputBindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputBindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcGlueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcServerAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverRpcAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverOuputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverConfigInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverConfigOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionOutputToSecurityPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionInputFromSecurityPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionOuputToDataBasePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionInputFromDataBasePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionDatabaseConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbConnectionOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionDBInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionConnectorDatabaseAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorDatabaseConnectionAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionDBOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbConnectionInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorConnectionDatabaseAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseConnectorConnectionAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInputFromConnectionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseOutputToConnectionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionSecurityConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionSecurityInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionSecurityOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityConnectionOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityConnectionInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionConnectorSecurityAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorSecurityConnectionAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityInputFromConnectionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityOuputToConnectionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorConnectionSecurityAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityConnectorConnectionAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseOutputToSecurityPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInputFromSecurityPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityOutputToDatabasePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityInputFromDatabasePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseSecurityConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseSecurityInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decurityDatabaseOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityDatabaseInRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseSecurityOutRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseConnectorSecurityAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorSecurityDatabaseAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityConnectorDatabaseAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorDatabaseSecurityAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdConnectorGlueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cscOnnectorGlueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsConnectorGlueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cOSA_m1.COSA_m1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private COSA_m1PackageImpl() {
		super(eNS_URI, COSA_m1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link COSA_m1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static COSA_m1Package init() {
		if (isInited) return (COSA_m1Package)EPackage.Registry.INSTANCE.getEPackage(COSA_m1Package.eNS_URI);

		// Obtain or create and register package
		COSA_m1PackageImpl theCOSA_m1Package = (COSA_m1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof COSA_m1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new COSA_m1PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		COSAPackageImpl theCOSAPackage = (COSAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSAPackage.eNS_URI) instanceof COSAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSAPackage.eNS_URI) : COSAPackage.eINSTANCE);

		// Create package meta-data objects
		theCOSA_m1Package.createPackageContents();
		theCOSAPackage.createPackageContents();

		// Initialize created meta-data
		theCOSA_m1Package.initializePackageContents();
		theCOSAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCOSA_m1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(COSA_m1Package.eNS_URI, theCOSA_m1Package);
		return theCOSA_m1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Responseportrpc() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Requestportrpc() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Configoutput() {
		return (EReference)clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Configinput() {
		return (EReference)clientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsePortRPC() {
		return responsePortRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestPortRPC() {
		return requestPortRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSConf() {
		return csConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Clients() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Csqueryports() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Csresponseports() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Rpcs() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Clientrpcattachment() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Rpcclientattachment() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Outputbindings() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Inputbindings() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Serverrpcattachment() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Rpcserverattachment() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConf_Server() {
		return (EReference)csConfEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSQueryPorts() {
		return csQueryPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSResponsePorts() {
		return csResponsePortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPC() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Clientoutrole() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Clientinrole() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Serverinrole() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Serveuroutrole() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Rpcglue() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientOutRole() {
		return clientOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientInRole() {
		return clientInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerInRole() {
		return serverInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeurOutRole() {
		return serveurOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientRpcAttachment() {
		return clientRpcAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientRpcAttachment_From() {
		return (EReference)clientRpcAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientRpcAttachment_To() {
		return (EReference)clientRpcAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRpcClientAttachment() {
		return rpcClientAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcClientAttachment_To() {
		return (EReference)rpcClientAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcClientAttachment_From() {
		return (EReference)rpcClientAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigInput() {
		return configInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigOutput() {
		return configOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputBindings() {
		return inputBindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputBindings_Configinput() {
		return (EReference)inputBindingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputBindings_Clientinput() {
		return (EReference)inputBindingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputBindings() {
		return outputBindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputBindings_Clientoutput() {
		return (EReference)outputBindingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputBindings_Configoutput() {
		return (EReference)outputBindingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRpcGlue() {
		return rpcGlueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcGlue_Clientout() {
		return (EReference)rpcGlueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcGlue_Clientin() {
		return (EReference)rpcGlueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcGlue_Serverin() {
		return (EReference)rpcGlueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcGlue_Serveurout() {
		return (EReference)rpcGlueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRpcServerAttachment() {
		return rpcServerAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcServerAttachment_From() {
		return (EReference)rpcServerAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRpcServerAttachment_To() {
		return (EReference)rpcServerAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerRpcAttachment() {
		return serverRpcAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerRpcAttachment_To() {
		return (EReference)serverRpcAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerRpcAttachment_From() {
		return (EReference)serverRpcAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Serverinput() {
		return (EReference)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Serverouput() {
		return (EReference)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Outputbinding() {
		return (EReference)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Inputbinding() {
		return (EReference)serverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectionmanager() {
		return (EReference)serverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectordatabaseconnectionattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectionconnectordatabaseattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectiondatabaseconnector() {
		return (EReference)serverEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Databaseconnectorconnectionattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectorconnectiondatabaseattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Database() {
		return (EReference)serverEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectorsecuritydatabaseattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Databaseconnectorsecurityattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Databasesecurityconnector() {
		return (EReference)serverEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectordatabasesecurityattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Securityconnectordatabaseattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Securitymanager() {
		return (EReference)serverEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Securityconnectorconnectionattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectorconnectionsecurityattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectionsecurityconnector() {
		return (EReference)serverEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectorsecurityconnectionattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Connectionconnectorsecurityattachment() {
		return (EReference)serverEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerInput() {
		return serverInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerOuput() {
		return serverOuputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Serverconfiginput() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Serverconfigoutput() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Connectionoutputtosecurityport() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Connectioninputfromsecurityport() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Connectioninputfromdatabaseport() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Connectionouputtodatabaseport() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityManager() {
		return securityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Securityinputfromconnectionport() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Securityouputtoconnectionport() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Securityoutputtodatabaseport() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Securityinputfromdatabaseport() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBase() {
		return dataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Databaseinputfromconnectionport() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Databaseoutputtoconnectionport() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Databaseoutputtosecurityport() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Databaseinputfromsecurityport() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerConfigInput() {
		return serverConfigInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerConfigOutput() {
		return serverConfigOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputBinding() {
		return inputBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputBinding_Serverinput() {
		return (EReference)inputBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputBinding_Serverconfiginput() {
		return (EReference)inputBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputBinding() {
		return outputBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputBinding_Serverconfigoutput() {
		return (EReference)outputBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputBinding_Serverouput() {
		return (EReference)outputBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionOutputToSecurityPort() {
		return connectionOutputToSecurityPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionInputFromSecurityPort() {
		return connectionInputFromSecurityPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionOuputToDataBasePort() {
		return connectionOuputToDataBasePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionInputFromDataBasePort() {
		return connectionInputFromDataBasePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionDatabaseConnector() {
		return connectionDatabaseConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionDatabaseConnector_Connectiondbinrole() {
		return (EReference)connectionDatabaseConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionDatabaseConnector_Dbconnectionoutrole() {
		return (EReference)connectionDatabaseConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionDatabaseConnector_Connectiondboutrole() {
		return (EReference)connectionDatabaseConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionDatabaseConnector_Dbconnectioninrole() {
		return (EReference)connectionDatabaseConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBConnectionOutRole() {
		return dbConnectionOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionDBInRole() {
		return connectionDBInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionConnectorDatabaseAttachment() {
		return connectionConnectorDatabaseAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionConnectorDatabaseAttachment_From() {
		return (EReference)connectionConnectorDatabaseAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionConnectorDatabaseAttachment_To() {
		return (EReference)connectionConnectorDatabaseAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorDatabaseConnectionAttachment() {
		return connectorDatabaseConnectionAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorDatabaseConnectionAttachment_To() {
		return (EReference)connectorDatabaseConnectionAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorDatabaseConnectionAttachment_From() {
		return (EReference)connectorDatabaseConnectionAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionDBOutRole() {
		return connectionDBOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBConnectionInRole() {
		return dbConnectionInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorConnectionDatabaseAttachment() {
		return connectorConnectionDatabaseAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorConnectionDatabaseAttachment_From() {
		return (EReference)connectorConnectionDatabaseAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorConnectionDatabaseAttachment_To() {
		return (EReference)connectorConnectionDatabaseAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseConnectorConnectionAttachment() {
		return databaseConnectorConnectionAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseConnectorConnectionAttachment_To() {
		return (EReference)databaseConnectorConnectionAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseConnectorConnectionAttachment_From() {
		return (EReference)databaseConnectorConnectionAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseInputFromConnectionPort() {
		return databaseInputFromConnectionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseOutputToConnectionPort() {
		return databaseOutputToConnectionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionSecurityConnector() {
		return connectionSecurityConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionSecurityConnector_Connectionsecurityinrole() {
		return (EReference)connectionSecurityConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionSecurityConnector_Securityconnectionoutrole() {
		return (EReference)connectionSecurityConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionSecurityConnector_Connectionsecurityoutrole() {
		return (EReference)connectionSecurityConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionSecurityConnector_Securityconnectioninrole() {
		return (EReference)connectionSecurityConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionSecurityInRole() {
		return connectionSecurityInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionSecurityOutRole() {
		return connectionSecurityOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityConnectionOutRole() {
		return securityConnectionOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityConnectionInRole() {
		return securityConnectionInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionConnectorSecurityAttachment() {
		return connectionConnectorSecurityAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionConnectorSecurityAttachment_From() {
		return (EReference)connectionConnectorSecurityAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionConnectorSecurityAttachment_To() {
		return (EReference)connectionConnectorSecurityAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorSecurityConnectionAttachment() {
		return connectorSecurityConnectionAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSecurityConnectionAttachment_To() {
		return (EReference)connectorSecurityConnectionAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSecurityConnectionAttachment_From() {
		return (EReference)connectorSecurityConnectionAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityInputFromConnectionPort() {
		return securityInputFromConnectionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityOuputToConnectionPort() {
		return securityOuputToConnectionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorConnectionSecurityAttachment() {
		return connectorConnectionSecurityAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorConnectionSecurityAttachment_From() {
		return (EReference)connectorConnectionSecurityAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorConnectionSecurityAttachment_To() {
		return (EReference)connectorConnectionSecurityAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityConnectorConnectionAttachment() {
		return securityConnectorConnectionAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConnectorConnectionAttachment_From() {
		return (EReference)securityConnectorConnectionAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConnectorConnectionAttachment_To() {
		return (EReference)securityConnectorConnectionAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseOutputToSecurityPort() {
		return databaseOutputToSecurityPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseInputFromSecurityPort() {
		return databaseInputFromSecurityPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityOutputToDatabasePort() {
		return securityOutputToDatabasePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityInputFromDatabasePort() {
		return securityInputFromDatabasePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseSecurityConnector() {
		return databaseSecurityConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseSecurityConnector_Decuritydatabaseoutrole() {
		return (EReference)databaseSecurityConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseSecurityConnector_Databasesecurityinrole() {
		return (EReference)databaseSecurityConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseSecurityConnector_Securitydatabaseinrole() {
		return (EReference)databaseSecurityConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseSecurityConnector_Databasesecurityoutrole() {
		return (EReference)databaseSecurityConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseSecurityInRole() {
		return databaseSecurityInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecurityDatabaseOutRole() {
		return decurityDatabaseOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityDatabaseInRole() {
		return securityDatabaseInRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseSecurityOutRole() {
		return databaseSecurityOutRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseConnectorSecurityAttachment() {
		return databaseConnectorSecurityAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseConnectorSecurityAttachment_From() {
		return (EReference)databaseConnectorSecurityAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseConnectorSecurityAttachment_To() {
		return (EReference)databaseConnectorSecurityAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorSecurityDatabaseAttachment() {
		return connectorSecurityDatabaseAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSecurityDatabaseAttachment_From() {
		return (EReference)connectorSecurityDatabaseAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSecurityDatabaseAttachment_To() {
		return (EReference)connectorSecurityDatabaseAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityConnectorDatabaseAttachment() {
		return securityConnectorDatabaseAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConnectorDatabaseAttachment_From() {
		return (EReference)securityConnectorDatabaseAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConnectorDatabaseAttachment_To() {
		return (EReference)securityConnectorDatabaseAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorDatabaseSecurityAttachment() {
		return connectorDatabaseSecurityAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorDatabaseSecurityAttachment_From() {
		return (EReference)connectorDatabaseSecurityAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorDatabaseSecurityAttachment_To() {
		return (EReference)connectorDatabaseSecurityAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDConnectorGlue() {
		return cdConnectorGlueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDConnectorGlue_Connectionoutput() {
		return (EReference)cdConnectorGlueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDConnectorGlue_Connectioninput() {
		return (EReference)cdConnectorGlueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDConnectorGlue_Databaseinput() {
		return (EReference)cdConnectorGlueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDConnectorGlue_Databaseoutput() {
		return (EReference)cdConnectorGlueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSCOnnectorGlue() {
		return cscOnnectorGlueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSCOnnectorGlue_Connectionoutput() {
		return (EReference)cscOnnectorGlueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSCOnnectorGlue_Connectioninput() {
		return (EReference)cscOnnectorGlueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSCOnnectorGlue_Securityinput() {
		return (EReference)cscOnnectorGlueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSCOnnectorGlue_Securityoutput() {
		return (EReference)cscOnnectorGlueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSConnectorGlue() {
		return dsConnectorGlueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSConnectorGlue_Databaseinput() {
		return (EReference)dsConnectorGlueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSConnectorGlue_Databaseoutput() {
		return (EReference)dsConnectorGlueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSConnectorGlue_Securityinput() {
		return (EReference)dsConnectorGlueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSConnectorGlue_Securityoutput() {
		return (EReference)dsConnectorGlueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSA_m1Factory getCOSA_m1Factory() {
		return (COSA_m1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__RESPONSEPORTRPC);
		createEReference(clientEClass, CLIENT__REQUESTPORTRPC);
		createEReference(clientEClass, CLIENT__CONFIGOUTPUT);
		createEReference(clientEClass, CLIENT__CONFIGINPUT);

		responsePortRPCEClass = createEClass(RESPONSE_PORT_RPC);

		requestPortRPCEClass = createEClass(REQUEST_PORT_RPC);

		csConfEClass = createEClass(CS_CONF);
		createEReference(csConfEClass, CS_CONF__CLIENTS);
		createEReference(csConfEClass, CS_CONF__CSQUERYPORTS);
		createEReference(csConfEClass, CS_CONF__CSRESPONSEPORTS);
		createEReference(csConfEClass, CS_CONF__RPCS);
		createEReference(csConfEClass, CS_CONF__CLIENTRPCATTACHMENT);
		createEReference(csConfEClass, CS_CONF__RPCCLIENTATTACHMENT);
		createEReference(csConfEClass, CS_CONF__OUTPUTBINDINGS);
		createEReference(csConfEClass, CS_CONF__INPUTBINDINGS);
		createEReference(csConfEClass, CS_CONF__SERVERRPCATTACHMENT);
		createEReference(csConfEClass, CS_CONF__RPCSERVERATTACHMENT);
		createEReference(csConfEClass, CS_CONF__SERVER);

		csQueryPortsEClass = createEClass(CS_QUERY_PORTS);

		csResponsePortsEClass = createEClass(CS_RESPONSE_PORTS);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__CLIENTOUTROLE);
		createEReference(rpcEClass, RPC__CLIENTINROLE);
		createEReference(rpcEClass, RPC__SERVERINROLE);
		createEReference(rpcEClass, RPC__SERVEUROUTROLE);
		createEReference(rpcEClass, RPC__RPCGLUE);

		clientOutRoleEClass = createEClass(CLIENT_OUT_ROLE);

		clientInRoleEClass = createEClass(CLIENT_IN_ROLE);

		serverInRoleEClass = createEClass(SERVER_IN_ROLE);

		serveurOutRoleEClass = createEClass(SERVEUR_OUT_ROLE);

		clientRpcAttachmentEClass = createEClass(CLIENT_RPC_ATTACHMENT);
		createEReference(clientRpcAttachmentEClass, CLIENT_RPC_ATTACHMENT__FROM);
		createEReference(clientRpcAttachmentEClass, CLIENT_RPC_ATTACHMENT__TO);

		rpcClientAttachmentEClass = createEClass(RPC_CLIENT_ATTACHMENT);
		createEReference(rpcClientAttachmentEClass, RPC_CLIENT_ATTACHMENT__TO);
		createEReference(rpcClientAttachmentEClass, RPC_CLIENT_ATTACHMENT__FROM);

		configInputEClass = createEClass(CONFIG_INPUT);

		configOutputEClass = createEClass(CONFIG_OUTPUT);

		inputBindingsEClass = createEClass(INPUT_BINDINGS);
		createEReference(inputBindingsEClass, INPUT_BINDINGS__CONFIGINPUT);
		createEReference(inputBindingsEClass, INPUT_BINDINGS__CLIENTINPUT);

		outputBindingsEClass = createEClass(OUTPUT_BINDINGS);
		createEReference(outputBindingsEClass, OUTPUT_BINDINGS__CLIENTOUTPUT);
		createEReference(outputBindingsEClass, OUTPUT_BINDINGS__CONFIGOUTPUT);

		rpcGlueEClass = createEClass(RPC_GLUE);
		createEReference(rpcGlueEClass, RPC_GLUE__CLIENTOUT);
		createEReference(rpcGlueEClass, RPC_GLUE__CLIENTIN);
		createEReference(rpcGlueEClass, RPC_GLUE__SERVERIN);
		createEReference(rpcGlueEClass, RPC_GLUE__SERVEUROUT);

		rpcServerAttachmentEClass = createEClass(RPC_SERVER_ATTACHMENT);
		createEReference(rpcServerAttachmentEClass, RPC_SERVER_ATTACHMENT__FROM);
		createEReference(rpcServerAttachmentEClass, RPC_SERVER_ATTACHMENT__TO);

		serverRpcAttachmentEClass = createEClass(SERVER_RPC_ATTACHMENT);
		createEReference(serverRpcAttachmentEClass, SERVER_RPC_ATTACHMENT__TO);
		createEReference(serverRpcAttachmentEClass, SERVER_RPC_ATTACHMENT__FROM);

		serverEClass = createEClass(SERVER);
		createEReference(serverEClass, SERVER__SERVERINPUT);
		createEReference(serverEClass, SERVER__SERVEROUPUT);
		createEReference(serverEClass, SERVER__OUTPUTBINDING);
		createEReference(serverEClass, SERVER__INPUTBINDING);
		createEReference(serverEClass, SERVER__CONNECTIONMANAGER);
		createEReference(serverEClass, SERVER__CONNECTORDATABASECONNECTIONATTACHMENT);
		createEReference(serverEClass, SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT);
		createEReference(serverEClass, SERVER__CONNECTIONDATABASECONNECTOR);
		createEReference(serverEClass, SERVER__DATABASECONNECTORCONNECTIONATTACHMENT);
		createEReference(serverEClass, SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT);
		createEReference(serverEClass, SERVER__DATABASE);
		createEReference(serverEClass, SERVER__CONNECTORSECURITYDATABASEATTACHMENT);
		createEReference(serverEClass, SERVER__DATABASECONNECTORSECURITYATTACHMENT);
		createEReference(serverEClass, SERVER__DATABASESECURITYCONNECTOR);
		createEReference(serverEClass, SERVER__CONNECTORDATABASESECURITYATTACHMENT);
		createEReference(serverEClass, SERVER__SECURITYCONNECTORDATABASEATTACHMENT);
		createEReference(serverEClass, SERVER__SECURITYMANAGER);
		createEReference(serverEClass, SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT);
		createEReference(serverEClass, SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT);
		createEReference(serverEClass, SERVER__CONNECTIONSECURITYCONNECTOR);
		createEReference(serverEClass, SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT);
		createEReference(serverEClass, SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT);

		serverInputEClass = createEClass(SERVER_INPUT);

		serverOuputEClass = createEClass(SERVER_OUPUT);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__SERVERCONFIGINPUT);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__SERVERCONFIGOUTPUT);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT);

		securityManagerEClass = createEClass(SECURITY_MANAGER);
		createEReference(securityManagerEClass, SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT);
		createEReference(securityManagerEClass, SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT);
		createEReference(securityManagerEClass, SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT);
		createEReference(securityManagerEClass, SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT);

		dataBaseEClass = createEClass(DATA_BASE);
		createEReference(dataBaseEClass, DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT);
		createEReference(dataBaseEClass, DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT);
		createEReference(dataBaseEClass, DATA_BASE__DATABASEOUTPUTTOSECURITYPORT);
		createEReference(dataBaseEClass, DATA_BASE__DATABASEINPUTFROMSECURITYPORT);

		serverConfigInputEClass = createEClass(SERVER_CONFIG_INPUT);

		serverConfigOutputEClass = createEClass(SERVER_CONFIG_OUTPUT);

		inputBindingEClass = createEClass(INPUT_BINDING);
		createEReference(inputBindingEClass, INPUT_BINDING__SERVERINPUT);
		createEReference(inputBindingEClass, INPUT_BINDING__SERVERCONFIGINPUT);

		outputBindingEClass = createEClass(OUTPUT_BINDING);
		createEReference(outputBindingEClass, OUTPUT_BINDING__SERVERCONFIGOUTPUT);
		createEReference(outputBindingEClass, OUTPUT_BINDING__SERVEROUPUT);

		connectionOutputToSecurityPortEClass = createEClass(CONNECTION_OUTPUT_TO_SECURITY_PORT);

		connectionInputFromSecurityPortEClass = createEClass(CONNECTION_INPUT_FROM_SECURITY_PORT);

		connectionOuputToDataBasePortEClass = createEClass(CONNECTION_OUPUT_TO_DATA_BASE_PORT);

		connectionInputFromDataBasePortEClass = createEClass(CONNECTION_INPUT_FROM_DATA_BASE_PORT);

		connectionDatabaseConnectorEClass = createEClass(CONNECTION_DATABASE_CONNECTOR);
		createEReference(connectionDatabaseConnectorEClass, CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE);
		createEReference(connectionDatabaseConnectorEClass, CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE);
		createEReference(connectionDatabaseConnectorEClass, CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE);
		createEReference(connectionDatabaseConnectorEClass, CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE);

		dbConnectionOutRoleEClass = createEClass(DB_CONNECTION_OUT_ROLE);

		connectionDBInRoleEClass = createEClass(CONNECTION_DB_IN_ROLE);

		connectionConnectorDatabaseAttachmentEClass = createEClass(CONNECTION_CONNECTOR_DATABASE_ATTACHMENT);
		createEReference(connectionConnectorDatabaseAttachmentEClass, CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM);
		createEReference(connectionConnectorDatabaseAttachmentEClass, CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO);

		connectorDatabaseConnectionAttachmentEClass = createEClass(CONNECTOR_DATABASE_CONNECTION_ATTACHMENT);
		createEReference(connectorDatabaseConnectionAttachmentEClass, CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__TO);
		createEReference(connectorDatabaseConnectionAttachmentEClass, CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__FROM);

		connectionDBOutRoleEClass = createEClass(CONNECTION_DB_OUT_ROLE);

		dbConnectionInRoleEClass = createEClass(DB_CONNECTION_IN_ROLE);

		connectorConnectionDatabaseAttachmentEClass = createEClass(CONNECTOR_CONNECTION_DATABASE_ATTACHMENT);
		createEReference(connectorConnectionDatabaseAttachmentEClass, CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__FROM);
		createEReference(connectorConnectionDatabaseAttachmentEClass, CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__TO);

		databaseConnectorConnectionAttachmentEClass = createEClass(DATABASE_CONNECTOR_CONNECTION_ATTACHMENT);
		createEReference(databaseConnectorConnectionAttachmentEClass, DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__TO);
		createEReference(databaseConnectorConnectionAttachmentEClass, DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__FROM);

		databaseInputFromConnectionPortEClass = createEClass(DATABASE_INPUT_FROM_CONNECTION_PORT);

		databaseOutputToConnectionPortEClass = createEClass(DATABASE_OUTPUT_TO_CONNECTION_PORT);

		connectionSecurityConnectorEClass = createEClass(CONNECTION_SECURITY_CONNECTOR);
		createEReference(connectionSecurityConnectorEClass, CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE);
		createEReference(connectionSecurityConnectorEClass, CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE);
		createEReference(connectionSecurityConnectorEClass, CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE);
		createEReference(connectionSecurityConnectorEClass, CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE);

		connectionSecurityInRoleEClass = createEClass(CONNECTION_SECURITY_IN_ROLE);

		connectionSecurityOutRoleEClass = createEClass(CONNECTION_SECURITY_OUT_ROLE);

		securityConnectionOutRoleEClass = createEClass(SECURITY_CONNECTION_OUT_ROLE);

		securityConnectionInRoleEClass = createEClass(SECURITY_CONNECTION_IN_ROLE);

		connectionConnectorSecurityAttachmentEClass = createEClass(CONNECTION_CONNECTOR_SECURITY_ATTACHMENT);
		createEReference(connectionConnectorSecurityAttachmentEClass, CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM);
		createEReference(connectionConnectorSecurityAttachmentEClass, CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO);

		connectorSecurityConnectionAttachmentEClass = createEClass(CONNECTOR_SECURITY_CONNECTION_ATTACHMENT);
		createEReference(connectorSecurityConnectionAttachmentEClass, CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO);
		createEReference(connectorSecurityConnectionAttachmentEClass, CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM);

		securityInputFromConnectionPortEClass = createEClass(SECURITY_INPUT_FROM_CONNECTION_PORT);

		securityOuputToConnectionPortEClass = createEClass(SECURITY_OUPUT_TO_CONNECTION_PORT);

		connectorConnectionSecurityAttachmentEClass = createEClass(CONNECTOR_CONNECTION_SECURITY_ATTACHMENT);
		createEReference(connectorConnectionSecurityAttachmentEClass, CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__FROM);
		createEReference(connectorConnectionSecurityAttachmentEClass, CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__TO);

		securityConnectorConnectionAttachmentEClass = createEClass(SECURITY_CONNECTOR_CONNECTION_ATTACHMENT);
		createEReference(securityConnectorConnectionAttachmentEClass, SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM);
		createEReference(securityConnectorConnectionAttachmentEClass, SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO);

		databaseOutputToSecurityPortEClass = createEClass(DATABASE_OUTPUT_TO_SECURITY_PORT);

		databaseInputFromSecurityPortEClass = createEClass(DATABASE_INPUT_FROM_SECURITY_PORT);

		securityOutputToDatabasePortEClass = createEClass(SECURITY_OUTPUT_TO_DATABASE_PORT);

		securityInputFromDatabasePortEClass = createEClass(SECURITY_INPUT_FROM_DATABASE_PORT);

		databaseSecurityConnectorEClass = createEClass(DATABASE_SECURITY_CONNECTOR);
		createEReference(databaseSecurityConnectorEClass, DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE);
		createEReference(databaseSecurityConnectorEClass, DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE);
		createEReference(databaseSecurityConnectorEClass, DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE);
		createEReference(databaseSecurityConnectorEClass, DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE);

		databaseSecurityInRoleEClass = createEClass(DATABASE_SECURITY_IN_ROLE);

		decurityDatabaseOutRoleEClass = createEClass(DECURITY_DATABASE_OUT_ROLE);

		securityDatabaseInRoleEClass = createEClass(SECURITY_DATABASE_IN_ROLE);

		databaseSecurityOutRoleEClass = createEClass(DATABASE_SECURITY_OUT_ROLE);

		databaseConnectorSecurityAttachmentEClass = createEClass(DATABASE_CONNECTOR_SECURITY_ATTACHMENT);
		createEReference(databaseConnectorSecurityAttachmentEClass, DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM);
		createEReference(databaseConnectorSecurityAttachmentEClass, DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO);

		connectorSecurityDatabaseAttachmentEClass = createEClass(CONNECTOR_SECURITY_DATABASE_ATTACHMENT);
		createEReference(connectorSecurityDatabaseAttachmentEClass, CONNECTOR_SECURITY_DATABASE_ATTACHMENT__FROM);
		createEReference(connectorSecurityDatabaseAttachmentEClass, CONNECTOR_SECURITY_DATABASE_ATTACHMENT__TO);

		securityConnectorDatabaseAttachmentEClass = createEClass(SECURITY_CONNECTOR_DATABASE_ATTACHMENT);
		createEReference(securityConnectorDatabaseAttachmentEClass, SECURITY_CONNECTOR_DATABASE_ATTACHMENT__FROM);
		createEReference(securityConnectorDatabaseAttachmentEClass, SECURITY_CONNECTOR_DATABASE_ATTACHMENT__TO);

		connectorDatabaseSecurityAttachmentEClass = createEClass(CONNECTOR_DATABASE_SECURITY_ATTACHMENT);
		createEReference(connectorDatabaseSecurityAttachmentEClass, CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM);
		createEReference(connectorDatabaseSecurityAttachmentEClass, CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO);

		cdConnectorGlueEClass = createEClass(CD_CONNECTOR_GLUE);
		createEReference(cdConnectorGlueEClass, CD_CONNECTOR_GLUE__CONNECTIONOUTPUT);
		createEReference(cdConnectorGlueEClass, CD_CONNECTOR_GLUE__CONNECTIONINPUT);
		createEReference(cdConnectorGlueEClass, CD_CONNECTOR_GLUE__DATABASEINPUT);
		createEReference(cdConnectorGlueEClass, CD_CONNECTOR_GLUE__DATABASEOUTPUT);

		cscOnnectorGlueEClass = createEClass(CSC_ONNECTOR_GLUE);
		createEReference(cscOnnectorGlueEClass, CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT);
		createEReference(cscOnnectorGlueEClass, CSC_ONNECTOR_GLUE__CONNECTIONINPUT);
		createEReference(cscOnnectorGlueEClass, CSC_ONNECTOR_GLUE__SECURITYINPUT);
		createEReference(cscOnnectorGlueEClass, CSC_ONNECTOR_GLUE__SECURITYOUTPUT);

		dsConnectorGlueEClass = createEClass(DS_CONNECTOR_GLUE);
		createEReference(dsConnectorGlueEClass, DS_CONNECTOR_GLUE__DATABASEINPUT);
		createEReference(dsConnectorGlueEClass, DS_CONNECTOR_GLUE__DATABASEOUTPUT);
		createEReference(dsConnectorGlueEClass, DS_CONNECTOR_GLUE__SECURITYINPUT);
		createEReference(dsConnectorGlueEClass, DS_CONNECTOR_GLUE__SECURITYOUTPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		COSAPackage theCOSAPackage = (COSAPackage)EPackage.Registry.INSTANCE.getEPackage(COSAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientEClass.getESuperTypes().add(theCOSAPackage.getComposant());
		responsePortRPCEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		requestPortRPCEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		csConfEClass.getESuperTypes().add(theCOSAPackage.getConfiguration());
		csQueryPortsEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		csResponsePortsEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		rpcEClass.getESuperTypes().add(theCOSAPackage.getConnecteur());
		clientOutRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		clientInRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		serverInRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		serveurOutRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		clientRpcAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		rpcClientAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		configInputEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		configOutputEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		inputBindingsEClass.getESuperTypes().add(theCOSAPackage.getRequiredBinding());
		outputBindingsEClass.getESuperTypes().add(theCOSAPackage.getProvidedBinding());
		rpcGlueEClass.getESuperTypes().add(theCOSAPackage.getGlue());
		rpcServerAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		serverRpcAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		serverEClass.getESuperTypes().add(theCOSAPackage.getConfiguration());
		serverInputEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		serverOuputEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		connectionManagerEClass.getESuperTypes().add(theCOSAPackage.getComposant());
		securityManagerEClass.getESuperTypes().add(theCOSAPackage.getComposant());
		dataBaseEClass.getESuperTypes().add(theCOSAPackage.getComposant());
		serverConfigInputEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		serverConfigOutputEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		inputBindingEClass.getESuperTypes().add(theCOSAPackage.getRequiredBinding());
		outputBindingEClass.getESuperTypes().add(theCOSAPackage.getProvidedBinding());
		connectionOutputToSecurityPortEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		connectionInputFromSecurityPortEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		connectionOuputToDataBasePortEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		connectionInputFromDataBasePortEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		connectionDatabaseConnectorEClass.getESuperTypes().add(theCOSAPackage.getConnecteur());
		dbConnectionOutRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		connectionDBInRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		connectionConnectorDatabaseAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		connectorDatabaseConnectionAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		connectionDBOutRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		dbConnectionInRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		connectorConnectionDatabaseAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		databaseConnectorConnectionAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		databaseInputFromConnectionPortEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		databaseOutputToConnectionPortEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		connectionSecurityConnectorEClass.getESuperTypes().add(theCOSAPackage.getConnecteur());
		connectionSecurityInRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		connectionSecurityOutRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		securityConnectionOutRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		securityConnectionInRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		connectionConnectorSecurityAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		connectorSecurityConnectionAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		securityInputFromConnectionPortEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		securityOuputToConnectionPortEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		connectorConnectionSecurityAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		securityConnectorConnectionAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		databaseOutputToSecurityPortEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		databaseInputFromSecurityPortEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		securityOutputToDatabasePortEClass.getESuperTypes().add(theCOSAPackage.getProvidedPort());
		securityInputFromDatabasePortEClass.getESuperTypes().add(theCOSAPackage.getRequiredPort());
		databaseSecurityConnectorEClass.getESuperTypes().add(theCOSAPackage.getConnecteur());
		databaseSecurityInRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		decurityDatabaseOutRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		securityDatabaseInRoleEClass.getESuperTypes().add(theCOSAPackage.getRequiredRole());
		databaseSecurityOutRoleEClass.getESuperTypes().add(theCOSAPackage.getProvidedRole());
		databaseConnectorSecurityAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		connectorSecurityDatabaseAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		securityConnectorDatabaseAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAComposantConnecteur());
		connectorDatabaseSecurityAttachmentEClass.getESuperTypes().add(theCOSAPackage.getAConnecteurComposant());
		cdConnectorGlueEClass.getESuperTypes().add(theCOSAPackage.getGlue());
		cscOnnectorGlueEClass.getESuperTypes().add(theCOSAPackage.getGlue());
		dsConnectorGlueEClass.getESuperTypes().add(theCOSAPackage.getGlue());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Responseportrpc(), this.getResponsePortRPC(), null, "responseportrpc", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Requestportrpc(), this.getRequestPortRPC(), null, "requestportrpc", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Configoutput(), this.getConfigOutput(), null, "configoutput", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Configinput(), this.getConfigInput(), null, "configinput", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsePortRPCEClass, ResponsePortRPC.class, "ResponsePortRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestPortRPCEClass, RequestPortRPC.class, "RequestPortRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csConfEClass, CSConf.class, "CSConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSConf_Clients(), this.getClient(), null, "clients", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Csqueryports(), this.getCSQueryPorts(), null, "csqueryports", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Csresponseports(), this.getCSResponsePorts(), null, "csresponseports", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Rpcs(), this.getRPC(), null, "rpcs", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Clientrpcattachment(), this.getClientRpcAttachment(), null, "clientrpcattachment", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Rpcclientattachment(), this.getRpcClientAttachment(), null, "rpcclientattachment", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Outputbindings(), this.getOutputBindings(), null, "outputbindings", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Inputbindings(), this.getInputBindings(), null, "inputbindings", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Serverrpcattachment(), this.getServerRpcAttachment(), null, "serverrpcattachment", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Rpcserverattachment(), this.getRpcServerAttachment(), null, "rpcserverattachment", null, 1, -1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConf_Server(), this.getServer(), null, "server", null, 1, 1, CSConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csQueryPortsEClass, CSQueryPorts.class, "CSQueryPorts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csResponsePortsEClass, CSResponsePorts.class, "CSResponsePorts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpcEClass, cOSA_m1.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Clientoutrole(), this.getClientOutRole(), null, "clientoutrole", null, 1, 1, cOSA_m1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Clientinrole(), this.getClientInRole(), null, "clientinrole", null, 1, 1, cOSA_m1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Serverinrole(), this.getServerInRole(), null, "serverinrole", null, 1, 1, cOSA_m1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Serveuroutrole(), this.getServeurOutRole(), null, "serveuroutrole", null, 1, 1, cOSA_m1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Rpcglue(), this.getRpcGlue(), null, "rpcglue", null, 1, 1, cOSA_m1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientOutRoleEClass, ClientOutRole.class, "ClientOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientInRoleEClass, ClientInRole.class, "ClientInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverInRoleEClass, ServerInRole.class, "ServerInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serveurOutRoleEClass, ServeurOutRole.class, "ServeurOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientRpcAttachmentEClass, ClientRpcAttachment.class, "ClientRpcAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientRpcAttachment_From(), this.getRequestPortRPC(), null, "from", null, 1, 1, ClientRpcAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientRpcAttachment_To(), this.getClientOutRole(), null, "to", null, 1, 1, ClientRpcAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcClientAttachmentEClass, RpcClientAttachment.class, "RpcClientAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRpcClientAttachment_To(), this.getResponsePortRPC(), null, "to", null, 1, 1, RpcClientAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRpcClientAttachment_From(), this.getClientInRole(), null, "from", null, 1, 1, RpcClientAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configInputEClass, ConfigInput.class, "ConfigInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configOutputEClass, ConfigOutput.class, "ConfigOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputBindingsEClass, InputBindings.class, "InputBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputBindings_Configinput(), this.getCSQueryPorts(), null, "configinput", null, 1, 1, InputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputBindings_Clientinput(), this.getConfigInput(), null, "clientinput", null, 1, 1, InputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputBindingsEClass, OutputBindings.class, "OutputBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputBindings_Clientoutput(), this.getConfigOutput(), null, "clientoutput", null, 1, 1, OutputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputBindings_Configoutput(), this.getCSResponsePorts(), null, "configoutput", null, 1, 1, OutputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcGlueEClass, RpcGlue.class, "RpcGlue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRpcGlue_Clientout(), this.getClientOutRole(), null, "clientout", null, 1, 1, RpcGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRpcGlue_Clientin(), this.getClientInRole(), null, "clientin", null, 1, 1, RpcGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRpcGlue_Serverin(), this.getServerInRole(), null, "serverin", null, 1, 1, RpcGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRpcGlue_Serveurout(), this.getServeurOutRole(), null, "serveurout", null, 1, 1, RpcGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcServerAttachmentEClass, RpcServerAttachment.class, "RpcServerAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRpcServerAttachment_From(), this.getServerInRole(), null, "from", null, 1, 1, RpcServerAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRpcServerAttachment_To(), this.getServerInput(), null, "to", null, 1, 1, RpcServerAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverRpcAttachmentEClass, ServerRpcAttachment.class, "ServerRpcAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerRpcAttachment_To(), this.getServeurOutRole(), null, "to", null, 1, 1, ServerRpcAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerRpcAttachment_From(), this.getServerOuput(), null, "from", null, 1, 1, ServerRpcAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServer_Serverinput(), this.getServerInput(), null, "serverinput", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Serverouput(), this.getServerOuput(), null, "serverouput", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Outputbinding(), this.getOutputBinding(), null, "outputbinding", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Inputbinding(), this.getInputBinding(), null, "inputbinding", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectionmanager(), this.getConnectionManager(), null, "connectionmanager", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectordatabaseconnectionattachment(), this.getConnectorDatabaseConnectionAttachment(), null, "connectordatabaseconnectionattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectionconnectordatabaseattachment(), this.getConnectionConnectorDatabaseAttachment(), null, "connectionconnectordatabaseattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectiondatabaseconnector(), this.getConnectionDatabaseConnector(), null, "connectiondatabaseconnector", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Databaseconnectorconnectionattachment(), this.getDatabaseConnectorConnectionAttachment(), null, "databaseconnectorconnectionattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectorconnectiondatabaseattachment(), this.getConnectorConnectionDatabaseAttachment(), null, "connectorconnectiondatabaseattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Database(), this.getDataBase(), null, "database", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectorsecuritydatabaseattachment(), this.getConnectorSecurityDatabaseAttachment(), null, "connectorsecuritydatabaseattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Databaseconnectorsecurityattachment(), this.getDatabaseConnectorSecurityAttachment(), null, "databaseconnectorsecurityattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Databasesecurityconnector(), this.getDatabaseSecurityConnector(), null, "databasesecurityconnector", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectordatabasesecurityattachment(), this.getConnectorDatabaseSecurityAttachment(), null, "connectordatabasesecurityattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Securityconnectordatabaseattachment(), this.getSecurityConnectorDatabaseAttachment(), null, "securityconnectordatabaseattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Securitymanager(), this.getSecurityManager(), null, "securitymanager", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Securityconnectorconnectionattachment(), this.getSecurityConnectorConnectionAttachment(), null, "securityconnectorconnectionattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectorconnectionsecurityattachment(), this.getConnectorConnectionSecurityAttachment(), null, "connectorconnectionsecurityattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectionsecurityconnector(), this.getConnectionSecurityConnector(), null, "connectionsecurityconnector", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectorsecurityconnectionattachment(), this.getConnectorSecurityConnectionAttachment(), null, "connectorsecurityconnectionattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Connectionconnectorsecurityattachment(), this.getConnectionConnectorSecurityAttachment(), null, "connectionconnectorsecurityattachment", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverInputEClass, ServerInput.class, "ServerInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverOuputEClass, ServerOuput.class, "ServerOuput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionManagerEClass, ConnectionManager.class, "ConnectionManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionManager_Serverconfiginput(), this.getServerConfigInput(), null, "serverconfiginput", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Serverconfigoutput(), this.getServerConfigOutput(), null, "serverconfigoutput", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Connectionoutputtosecurityport(), this.getConnectionOutputToSecurityPort(), null, "connectionoutputtosecurityport", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Connectioninputfromsecurityport(), this.getConnectionInputFromSecurityPort(), null, "connectioninputfromsecurityport", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Connectioninputfromdatabaseport(), this.getConnectionInputFromDataBasePort(), null, "connectioninputfromdatabaseport", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Connectionouputtodatabaseport(), this.getConnectionOuputToDataBasePort(), null, "connectionouputtodatabaseport", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityManagerEClass, cOSA_m1.SecurityManager.class, "SecurityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityManager_Securityinputfromconnectionport(), this.getSecurityInputFromConnectionPort(), null, "securityinputfromconnectionport", null, 1, 1, cOSA_m1.SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Securityouputtoconnectionport(), this.getSecurityOuputToConnectionPort(), null, "securityouputtoconnectionport", null, 1, 1, cOSA_m1.SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Securityoutputtodatabaseport(), this.getSecurityOutputToDatabasePort(), null, "securityoutputtodatabaseport", null, 1, 1, cOSA_m1.SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Securityinputfromdatabaseport(), this.getSecurityInputFromDatabasePort(), null, "securityinputfromdatabaseport", null, 1, 1, cOSA_m1.SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBase_Databaseinputfromconnectionport(), this.getDatabaseInputFromConnectionPort(), null, "databaseinputfromconnectionport", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBase_Databaseoutputtoconnectionport(), this.getDatabaseOutputToConnectionPort(), null, "databaseoutputtoconnectionport", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBase_Databaseoutputtosecurityport(), this.getDatabaseOutputToSecurityPort(), null, "databaseoutputtosecurityport", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBase_Databaseinputfromsecurityport(), this.getDatabaseInputFromSecurityPort(), null, "databaseinputfromsecurityport", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverConfigInputEClass, ServerConfigInput.class, "ServerConfigInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverConfigOutputEClass, ServerConfigOutput.class, "ServerConfigOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputBindingEClass, InputBinding.class, "InputBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputBinding_Serverinput(), this.getServerInput(), null, "serverinput", null, 1, 1, InputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputBinding_Serverconfiginput(), this.getServerConfigInput(), null, "serverconfiginput", null, 1, 1, InputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputBindingEClass, OutputBinding.class, "OutputBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputBinding_Serverconfigoutput(), this.getServerConfigOutput(), null, "serverconfigoutput", null, 1, 1, OutputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputBinding_Serverouput(), this.getServerOuput(), null, "serverouput", null, 1, 1, OutputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionOutputToSecurityPortEClass, ConnectionOutputToSecurityPort.class, "ConnectionOutputToSecurityPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionInputFromSecurityPortEClass, ConnectionInputFromSecurityPort.class, "ConnectionInputFromSecurityPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionOuputToDataBasePortEClass, ConnectionOuputToDataBasePort.class, "ConnectionOuputToDataBasePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionInputFromDataBasePortEClass, ConnectionInputFromDataBasePort.class, "ConnectionInputFromDataBasePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionDatabaseConnectorEClass, ConnectionDatabaseConnector.class, "ConnectionDatabaseConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionDatabaseConnector_Connectiondbinrole(), this.getConnectionDBInRole(), null, "connectiondbinrole", null, 1, 1, ConnectionDatabaseConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionDatabaseConnector_Dbconnectionoutrole(), this.getDBConnectionOutRole(), null, "dbconnectionoutrole", null, 1, 1, ConnectionDatabaseConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionDatabaseConnector_Connectiondboutrole(), this.getConnectionDBOutRole(), null, "connectiondboutrole", null, 1, 1, ConnectionDatabaseConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionDatabaseConnector_Dbconnectioninrole(), this.getDBConnectionInRole(), null, "dbconnectioninrole", null, 1, 1, ConnectionDatabaseConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbConnectionOutRoleEClass, DBConnectionOutRole.class, "DBConnectionOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionDBInRoleEClass, ConnectionDBInRole.class, "ConnectionDBInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionConnectorDatabaseAttachmentEClass, ConnectionConnectorDatabaseAttachment.class, "ConnectionConnectorDatabaseAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionConnectorDatabaseAttachment_From(), this.getConnectionOuputToDataBasePort(), null, "from", null, 1, 1, ConnectionConnectorDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionConnectorDatabaseAttachment_To(), this.getConnectionDBInRole(), null, "to", null, 1, 1, ConnectionConnectorDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorDatabaseConnectionAttachmentEClass, ConnectorDatabaseConnectionAttachment.class, "ConnectorDatabaseConnectionAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorDatabaseConnectionAttachment_To(), this.getConnectionInputFromDataBasePort(), null, "to", null, 1, 1, ConnectorDatabaseConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorDatabaseConnectionAttachment_From(), this.getDBConnectionOutRole(), null, "from", null, 1, 1, ConnectorDatabaseConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionDBOutRoleEClass, ConnectionDBOutRole.class, "ConnectionDBOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbConnectionInRoleEClass, DBConnectionInRole.class, "DBConnectionInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorConnectionDatabaseAttachmentEClass, ConnectorConnectionDatabaseAttachment.class, "ConnectorConnectionDatabaseAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorConnectionDatabaseAttachment_From(), this.getConnectionDBOutRole(), null, "from", null, 1, 1, ConnectorConnectionDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorConnectionDatabaseAttachment_To(), this.getDatabaseInputFromConnectionPort(), null, "to", null, 1, 1, ConnectorConnectionDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseConnectorConnectionAttachmentEClass, DatabaseConnectorConnectionAttachment.class, "DatabaseConnectorConnectionAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseConnectorConnectionAttachment_To(), this.getDBConnectionInRole(), null, "to", null, 1, 1, DatabaseConnectorConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseConnectorConnectionAttachment_From(), this.getDatabaseOutputToConnectionPort(), null, "from", null, 1, 1, DatabaseConnectorConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseInputFromConnectionPortEClass, DatabaseInputFromConnectionPort.class, "DatabaseInputFromConnectionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseOutputToConnectionPortEClass, DatabaseOutputToConnectionPort.class, "DatabaseOutputToConnectionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionSecurityConnectorEClass, ConnectionSecurityConnector.class, "ConnectionSecurityConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionSecurityConnector_Connectionsecurityinrole(), this.getConnectionSecurityInRole(), null, "connectionsecurityinrole", null, 1, 1, ConnectionSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionSecurityConnector_Securityconnectionoutrole(), this.getSecurityConnectionOutRole(), null, "securityconnectionoutrole", null, 1, 1, ConnectionSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionSecurityConnector_Connectionsecurityoutrole(), this.getConnectionSecurityOutRole(), null, "connectionsecurityoutrole", null, 1, 1, ConnectionSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionSecurityConnector_Securityconnectioninrole(), this.getSecurityConnectionInRole(), null, "securityconnectioninrole", null, 1, 1, ConnectionSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionSecurityInRoleEClass, ConnectionSecurityInRole.class, "ConnectionSecurityInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionSecurityOutRoleEClass, ConnectionSecurityOutRole.class, "ConnectionSecurityOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityConnectionOutRoleEClass, SecurityConnectionOutRole.class, "SecurityConnectionOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityConnectionInRoleEClass, SecurityConnectionInRole.class, "SecurityConnectionInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionConnectorSecurityAttachmentEClass, ConnectionConnectorSecurityAttachment.class, "ConnectionConnectorSecurityAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionConnectorSecurityAttachment_From(), this.getConnectionOutputToSecurityPort(), null, "from", null, 1, 1, ConnectionConnectorSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionConnectorSecurityAttachment_To(), this.getConnectionSecurityInRole(), null, "to", null, 1, 1, ConnectionConnectorSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorSecurityConnectionAttachmentEClass, ConnectorSecurityConnectionAttachment.class, "ConnectorSecurityConnectionAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorSecurityConnectionAttachment_To(), this.getConnectionInputFromSecurityPort(), null, "to", null, 1, 1, ConnectorSecurityConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorSecurityConnectionAttachment_From(), this.getSecurityConnectionOutRole(), null, "from", null, 1, 1, ConnectorSecurityConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityInputFromConnectionPortEClass, SecurityInputFromConnectionPort.class, "SecurityInputFromConnectionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityOuputToConnectionPortEClass, SecurityOuputToConnectionPort.class, "SecurityOuputToConnectionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorConnectionSecurityAttachmentEClass, ConnectorConnectionSecurityAttachment.class, "ConnectorConnectionSecurityAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorConnectionSecurityAttachment_From(), this.getConnectionSecurityOutRole(), null, "from", null, 1, 1, ConnectorConnectionSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorConnectionSecurityAttachment_To(), this.getSecurityInputFromConnectionPort(), null, "to", null, 1, 1, ConnectorConnectionSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityConnectorConnectionAttachmentEClass, SecurityConnectorConnectionAttachment.class, "SecurityConnectorConnectionAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityConnectorConnectionAttachment_From(), this.getSecurityOuputToConnectionPort(), null, "from", null, 1, 1, SecurityConnectorConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConnectorConnectionAttachment_To(), this.getSecurityConnectionInRole(), null, "to", null, 1, 1, SecurityConnectorConnectionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseOutputToSecurityPortEClass, DatabaseOutputToSecurityPort.class, "DatabaseOutputToSecurityPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseInputFromSecurityPortEClass, DatabaseInputFromSecurityPort.class, "DatabaseInputFromSecurityPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityOutputToDatabasePortEClass, SecurityOutputToDatabasePort.class, "SecurityOutputToDatabasePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityInputFromDatabasePortEClass, SecurityInputFromDatabasePort.class, "SecurityInputFromDatabasePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseSecurityConnectorEClass, DatabaseSecurityConnector.class, "DatabaseSecurityConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseSecurityConnector_Decuritydatabaseoutrole(), this.getDecurityDatabaseOutRole(), null, "decuritydatabaseoutrole", null, 1, 1, DatabaseSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseSecurityConnector_Databasesecurityinrole(), this.getDatabaseSecurityInRole(), null, "databasesecurityinrole", null, 1, 1, DatabaseSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseSecurityConnector_Securitydatabaseinrole(), this.getSecurityDatabaseInRole(), null, "securitydatabaseinrole", null, 1, 1, DatabaseSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseSecurityConnector_Databasesecurityoutrole(), this.getDatabaseSecurityOutRole(), null, "databasesecurityoutrole", null, 1, 1, DatabaseSecurityConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseSecurityInRoleEClass, DatabaseSecurityInRole.class, "DatabaseSecurityInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decurityDatabaseOutRoleEClass, DecurityDatabaseOutRole.class, "DecurityDatabaseOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityDatabaseInRoleEClass, SecurityDatabaseInRole.class, "SecurityDatabaseInRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseSecurityOutRoleEClass, DatabaseSecurityOutRole.class, "DatabaseSecurityOutRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseConnectorSecurityAttachmentEClass, DatabaseConnectorSecurityAttachment.class, "DatabaseConnectorSecurityAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseConnectorSecurityAttachment_From(), this.getDatabaseOutputToSecurityPort(), null, "from", null, 1, 1, DatabaseConnectorSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseConnectorSecurityAttachment_To(), this.getDatabaseSecurityInRole(), null, "to", null, 1, 1, DatabaseConnectorSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorSecurityDatabaseAttachmentEClass, ConnectorSecurityDatabaseAttachment.class, "ConnectorSecurityDatabaseAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorSecurityDatabaseAttachment_From(), this.getDecurityDatabaseOutRole(), null, "from", null, 1, 1, ConnectorSecurityDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorSecurityDatabaseAttachment_To(), this.getDatabaseInputFromSecurityPort(), null, "to", null, 1, 1, ConnectorSecurityDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityConnectorDatabaseAttachmentEClass, SecurityConnectorDatabaseAttachment.class, "SecurityConnectorDatabaseAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityConnectorDatabaseAttachment_From(), this.getSecurityOutputToDatabasePort(), null, "from", null, 1, 1, SecurityConnectorDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConnectorDatabaseAttachment_To(), this.getSecurityDatabaseInRole(), null, "to", null, 1, 1, SecurityConnectorDatabaseAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorDatabaseSecurityAttachmentEClass, ConnectorDatabaseSecurityAttachment.class, "ConnectorDatabaseSecurityAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorDatabaseSecurityAttachment_From(), this.getDatabaseSecurityOutRole(), null, "from", null, 1, 1, ConnectorDatabaseSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorDatabaseSecurityAttachment_To(), this.getSecurityInputFromDatabasePort(), null, "to", null, 1, 1, ConnectorDatabaseSecurityAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdConnectorGlueEClass, CDConnectorGlue.class, "CDConnectorGlue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDConnectorGlue_Connectionoutput(), this.getConnectionDBInRole(), null, "connectionoutput", null, 1, 1, CDConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDConnectorGlue_Connectioninput(), this.getDBConnectionOutRole(), null, "connectioninput", null, 1, 1, CDConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDConnectorGlue_Databaseinput(), this.getConnectionDBOutRole(), null, "databaseinput", null, 1, 1, CDConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDConnectorGlue_Databaseoutput(), this.getDBConnectionInRole(), null, "databaseoutput", null, 1, 1, CDConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cscOnnectorGlueEClass, CSCOnnectorGlue.class, "CSCOnnectorGlue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSCOnnectorGlue_Connectionoutput(), this.getConnectionSecurityInRole(), null, "connectionoutput", null, 1, 1, CSCOnnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSCOnnectorGlue_Connectioninput(), this.getSecurityConnectionOutRole(), null, "connectioninput", null, 1, 1, CSCOnnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSCOnnectorGlue_Securityinput(), this.getConnectionSecurityOutRole(), null, "securityinput", null, 1, 1, CSCOnnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSCOnnectorGlue_Securityoutput(), this.getSecurityConnectionInRole(), null, "securityoutput", null, 1, 1, CSCOnnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsConnectorGlueEClass, DSConnectorGlue.class, "DSConnectorGlue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSConnectorGlue_Databaseinput(), this.getDecurityDatabaseOutRole(), null, "databaseinput", null, 1, 1, DSConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSConnectorGlue_Databaseoutput(), this.getDatabaseSecurityInRole(), null, "databaseoutput", null, 1, 1, DSConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSConnectorGlue_Securityinput(), this.getDatabaseSecurityOutRole(), null, "securityinput", null, 1, 1, DSConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSConnectorGlue_Securityoutput(), this.getSecurityDatabaseInRole(), null, "securityoutput", null, 1, 1, DSConnectorGlue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //COSA_m1PackageImpl
