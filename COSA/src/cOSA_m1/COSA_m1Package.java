/**
 */
package cOSA_m1;

import cOSA.COSAPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cOSA_m1.COSA_m1Factory
 * @model kind="package"
 * @generated
 */
public interface COSA_m1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cOSA_m1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cOSA_m1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cOSA_m1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	COSA_m1Package eINSTANCE = cOSA_m1.impl.COSA_m1PackageImpl.init();

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ClientImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Interfacecompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACECOMPO = COSAPackage.COMPOSANT__INTERFACECOMPO;

	/**
	 * The feature id for the '<em><b>Responseportrpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__RESPONSEPORTRPC = COSAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requestportrpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__REQUESTPORTRPC = COSAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configoutput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONFIGOUTPUT = COSAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configinput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONFIGINPUT = COSAPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = COSAPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = COSAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ResponsePortRPCImpl <em>Response Port RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ResponsePortRPCImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getResponsePortRPC()
	 * @generated
	 */
	int RESPONSE_PORT_RPC = 1;

	/**
	 * The number of structural features of the '<em>Response Port RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PORT_RPC_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Port RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PORT_RPC_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.RequestPortRPCImpl <em>Request Port RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.RequestPortRPCImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRequestPortRPC()
	 * @generated
	 */
	int REQUEST_PORT_RPC = 2;

	/**
	 * The number of structural features of the '<em>Request Port RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_RPC_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Port RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_RPC_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.CSConfImpl <em>CS Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.CSConfImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSConf()
	 * @generated
	 */
	int CS_CONF = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__ELEMENT = COSAPackage.CONFIGURATION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Iconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__ICONFIGURATION = COSAPackage.CONFIGURATION__ICONFIGURATION;

	/**
	 * The feature id for the '<em><b>Biding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__BIDING = COSAPackage.CONFIGURATION__BIDING;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__CLIENTS = COSAPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csqueryports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__CSQUERYPORTS = COSAPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csresponseports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__CSRESPONSEPORTS = COSAPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rpcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__RPCS = COSAPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clientrpcattachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__CLIENTRPCATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rpcclientattachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__RPCCLIENTATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outputbindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__OUTPUTBINDINGS = COSAPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inputbindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__INPUTBINDINGS = COSAPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Serverrpcattachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__SERVERRPCATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rpcserverattachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__RPCSERVERATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF__SERVER = COSAPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>CS Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF_FEATURE_COUNT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>CS Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONF_OPERATION_COUNT = COSAPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.CSQueryPortsImpl <em>CS Query Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.CSQueryPortsImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSQueryPorts()
	 * @generated
	 */
	int CS_QUERY_PORTS = 4;

	/**
	 * The number of structural features of the '<em>CS Query Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_QUERY_PORTS_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CS Query Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_QUERY_PORTS_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.CSResponsePortsImpl <em>CS Response Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.CSResponsePortsImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSResponsePorts()
	 * @generated
	 */
	int CS_RESPONSE_PORTS = 5;

	/**
	 * The number of structural features of the '<em>CS Response Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_RESPONSE_PORTS_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CS Response Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_RESPONSE_PORTS_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.RPCImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 6;

	/**
	 * The feature id for the '<em><b>Interfaceconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__INTERFACECONNECT = COSAPackage.CONNECTEUR__INTERFACECONNECT;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUE = COSAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Clientoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CLIENTOUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clientinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CLIENTINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serverinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__SERVERINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serveuroutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__SERVEUROUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rpcglue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__RPCGLUE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = COSAPackage.CONNECTEUR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = COSAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ClientOutRoleImpl <em>Client Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ClientOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClientOutRole()
	 * @generated
	 */
	int CLIENT_OUT_ROLE = 7;

	/**
	 * The number of structural features of the '<em>Client Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OUT_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OUT_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ClientInRoleImpl <em>Client In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ClientInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClientInRole()
	 * @generated
	 */
	int CLIENT_IN_ROLE = 8;

	/**
	 * The number of structural features of the '<em>Client In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_IN_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_IN_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServerInRoleImpl <em>Server In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServerInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerInRole()
	 * @generated
	 */
	int SERVER_IN_ROLE = 9;

	/**
	 * The number of structural features of the '<em>Server In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_IN_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_IN_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServeurOutRoleImpl <em>Serveur Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServeurOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServeurOutRole()
	 * @generated
	 */
	int SERVEUR_OUT_ROLE = 10;

	/**
	 * The number of structural features of the '<em>Serveur Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_OUT_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Serveur Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_OUT_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ClientRpcAttachmentImpl <em>Client Rpc Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ClientRpcAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClientRpcAttachment()
	 * @generated
	 */
	int CLIENT_RPC_ATTACHMENT = 11;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_RPC_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_RPC_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_RPC_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_RPC_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_RPC_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client Rpc Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_RPC_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client Rpc Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_RPC_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.RpcClientAttachmentImpl <em>Rpc Client Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.RpcClientAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRpcClientAttachment()
	 * @generated
	 */
	int RPC_CLIENT_ATTACHMENT = 12;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CLIENT_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CLIENT_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CLIENT_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CLIENT_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CLIENT_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rpc Client Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CLIENT_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rpc Client Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CLIENT_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConfigInputImpl <em>Config Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConfigInputImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConfigInput()
	 * @generated
	 */
	int CONFIG_INPUT = 13;

	/**
	 * The number of structural features of the '<em>Config Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INPUT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Config Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INPUT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConfigOutputImpl <em>Config Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConfigOutputImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConfigOutput()
	 * @generated
	 */
	int CONFIG_OUTPUT = 14;

	/**
	 * The number of structural features of the '<em>Config Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OUTPUT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Config Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OUTPUT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.InputBindingsImpl <em>Input Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.InputBindingsImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getInputBindings()
	 * @generated
	 */
	int INPUT_BINDINGS = 15;

	/**
	 * The feature id for the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDINGS__CONFIG_PORT = COSAPackage.REQUIRED_BINDING__CONFIG_PORT;

	/**
	 * The feature id for the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDINGS__COMPONENT_PORT = COSAPackage.REQUIRED_BINDING__COMPONENT_PORT;

	/**
	 * The feature id for the '<em><b>Configinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDINGS__CONFIGINPUT = COSAPackage.REQUIRED_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clientinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDINGS__CLIENTINPUT = COSAPackage.REQUIRED_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDINGS_FEATURE_COUNT = COSAPackage.REQUIRED_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDINGS_OPERATION_COUNT = COSAPackage.REQUIRED_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.OutputBindingsImpl <em>Output Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.OutputBindingsImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getOutputBindings()
	 * @generated
	 */
	int OUTPUT_BINDINGS = 16;

	/**
	 * The feature id for the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDINGS__COMPONENT_PORT = COSAPackage.PROVIDED_BINDING__COMPONENT_PORT;

	/**
	 * The feature id for the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDINGS__CONFIG_PORT = COSAPackage.PROVIDED_BINDING__CONFIG_PORT;

	/**
	 * The feature id for the '<em><b>Clientoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDINGS__CLIENTOUTPUT = COSAPackage.PROVIDED_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDINGS__CONFIGOUTPUT = COSAPackage.PROVIDED_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDINGS_FEATURE_COUNT = COSAPackage.PROVIDED_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDINGS_OPERATION_COUNT = COSAPackage.PROVIDED_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.RpcGlueImpl <em>Rpc Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.RpcGlueImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRpcGlue()
	 * @generated
	 */
	int RPC_GLUE = 17;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE__PROVIDEDROLE = COSAPackage.GLUE__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE__REQUIREDROLE = COSAPackage.GLUE__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>Clientout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE__CLIENTOUT = COSAPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clientin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE__CLIENTIN = COSAPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serverin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE__SERVERIN = COSAPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serveurout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE__SERVEUROUT = COSAPackage.GLUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rpc Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE_FEATURE_COUNT = COSAPackage.GLUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rpc Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_GLUE_OPERATION_COUNT = COSAPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.RpcServerAttachmentImpl <em>Rpc Server Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.RpcServerAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRpcServerAttachment()
	 * @generated
	 */
	int RPC_SERVER_ATTACHMENT = 18;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_SERVER_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_SERVER_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_SERVER_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_SERVER_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_SERVER_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rpc Server Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_SERVER_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rpc Server Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_SERVER_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServerRpcAttachmentImpl <em>Server Rpc Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServerRpcAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerRpcAttachment()
	 * @generated
	 */
	int SERVER_RPC_ATTACHMENT = 19;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RPC_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RPC_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RPC_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RPC_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RPC_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Rpc Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RPC_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Server Rpc Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RPC_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServerImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 20;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ELEMENT = COSAPackage.CONFIGURATION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Iconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ICONFIGURATION = COSAPackage.CONFIGURATION__ICONFIGURATION;

	/**
	 * The feature id for the '<em><b>Biding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__BIDING = COSAPackage.CONFIGURATION__BIDING;

	/**
	 * The feature id for the '<em><b>Serverinput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVERINPUT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serverouput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVEROUPUT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OUTPUTBINDING = COSAPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__INPUTBINDING = COSAPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectionmanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTIONMANAGER = COSAPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connectordatabaseconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTORDATABASECONNECTIONATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connectionconnectordatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connectiondatabaseconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTIONDATABASECONNECTOR = COSAPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Databaseconnectorconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DATABASECONNECTORCONNECTIONATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Connectorconnectiondatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DATABASE = COSAPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connectorsecuritydatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTORSECURITYDATABASEATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Databaseconnectorsecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DATABASECONNECTORSECURITYATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Databasesecurityconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DATABASESECURITYCONNECTOR = COSAPackage.CONFIGURATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connectordatabasesecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTORDATABASESECURITYATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Securityconnectordatabaseattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SECURITYCONNECTORDATABASEATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Securitymanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SECURITYMANAGER = COSAPackage.CONFIGURATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Securityconnectorconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Connectorconnectionsecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Connectionsecurityconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTIONSECURITYCONNECTOR = COSAPackage.CONFIGURATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Connectorsecurityconnectionattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Connectionconnectorsecurityattachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = COSAPackage.CONFIGURATION_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = COSAPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServerInputImpl <em>Server Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServerInputImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerInput()
	 * @generated
	 */
	int SERVER_INPUT = 21;

	/**
	 * The number of structural features of the '<em>Server Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_INPUT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_INPUT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServerOuputImpl <em>Server Ouput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServerOuputImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerOuput()
	 * @generated
	 */
	int SERVER_OUPUT = 22;

	/**
	 * The number of structural features of the '<em>Server Ouput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OUPUT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Ouput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OUPUT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionManagerImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 23;

	/**
	 * The feature id for the '<em><b>Interfacecompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACECOMPO = COSAPackage.COMPOSANT__INTERFACECOMPO;

	/**
	 * The feature id for the '<em><b>Serverconfiginput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__SERVERCONFIGINPUT = COSAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serverconfigoutput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__SERVERCONFIGOUTPUT = COSAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectionoutputtosecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connectioninputfromsecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectioninputfromdatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connectionouputtodatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = COSAPackage.COMPOSANT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATION_COUNT = COSAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityManagerImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityManager()
	 * @generated
	 */
	int SECURITY_MANAGER = 24;

	/**
	 * The feature id for the '<em><b>Interfacecompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACECOMPO = COSAPackage.COMPOSANT__INTERFACECOMPO;

	/**
	 * The feature id for the '<em><b>Securityinputfromconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityouputtoconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Securityoutputtodatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Securityinputfromdatabaseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_FEATURE_COUNT = COSAPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_OPERATION_COUNT = COSAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DataBaseImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 25;

	/**
	 * The feature id for the '<em><b>Interfacecompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__INTERFACECOMPO = COSAPackage.COMPOSANT__INTERFACECOMPO;

	/**
	 * The feature id for the '<em><b>Databaseinputfromconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Databaseoutputtoconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Databaseoutputtosecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__DATABASEOUTPUTTOSECURITYPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Databaseinputfromsecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__DATABASEINPUTFROMSECURITYPORT = COSAPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = COSAPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_OPERATION_COUNT = COSAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServerConfigInputImpl <em>Server Config Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServerConfigInputImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerConfigInput()
	 * @generated
	 */
	int SERVER_CONFIG_INPUT = 26;

	/**
	 * The number of structural features of the '<em>Server Config Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INPUT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Config Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INPUT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ServerConfigOutputImpl <em>Server Config Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ServerConfigOutputImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerConfigOutput()
	 * @generated
	 */
	int SERVER_CONFIG_OUTPUT = 27;

	/**
	 * The number of structural features of the '<em>Server Config Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_OUTPUT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Config Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_OUTPUT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.InputBindingImpl <em>Input Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.InputBindingImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getInputBinding()
	 * @generated
	 */
	int INPUT_BINDING = 28;

	/**
	 * The feature id for the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__CONFIG_PORT = COSAPackage.REQUIRED_BINDING__CONFIG_PORT;

	/**
	 * The feature id for the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__COMPONENT_PORT = COSAPackage.REQUIRED_BINDING__COMPONENT_PORT;

	/**
	 * The feature id for the '<em><b>Serverinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__SERVERINPUT = COSAPackage.REQUIRED_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serverconfiginput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__SERVERCONFIGINPUT = COSAPackage.REQUIRED_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING_FEATURE_COUNT = COSAPackage.REQUIRED_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING_OPERATION_COUNT = COSAPackage.REQUIRED_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.OutputBindingImpl <em>Output Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.OutputBindingImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getOutputBinding()
	 * @generated
	 */
	int OUTPUT_BINDING = 29;

	/**
	 * The feature id for the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__COMPONENT_PORT = COSAPackage.PROVIDED_BINDING__COMPONENT_PORT;

	/**
	 * The feature id for the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__CONFIG_PORT = COSAPackage.PROVIDED_BINDING__CONFIG_PORT;

	/**
	 * The feature id for the '<em><b>Serverconfigoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__SERVERCONFIGOUTPUT = COSAPackage.PROVIDED_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serverouput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__SERVEROUPUT = COSAPackage.PROVIDED_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING_FEATURE_COUNT = COSAPackage.PROVIDED_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING_OPERATION_COUNT = COSAPackage.PROVIDED_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionOutputToSecurityPortImpl <em>Connection Output To Security Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionOutputToSecurityPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionOutputToSecurityPort()
	 * @generated
	 */
	int CONNECTION_OUTPUT_TO_SECURITY_PORT = 30;

	/**
	 * The number of structural features of the '<em>Connection Output To Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OUTPUT_TO_SECURITY_PORT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Output To Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OUTPUT_TO_SECURITY_PORT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionInputFromSecurityPortImpl <em>Connection Input From Security Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionInputFromSecurityPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionInputFromSecurityPort()
	 * @generated
	 */
	int CONNECTION_INPUT_FROM_SECURITY_PORT = 31;

	/**
	 * The number of structural features of the '<em>Connection Input From Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INPUT_FROM_SECURITY_PORT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Input From Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INPUT_FROM_SECURITY_PORT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionOuputToDataBasePortImpl <em>Connection Ouput To Data Base Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionOuputToDataBasePortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionOuputToDataBasePort()
	 * @generated
	 */
	int CONNECTION_OUPUT_TO_DATA_BASE_PORT = 32;

	/**
	 * The number of structural features of the '<em>Connection Ouput To Data Base Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OUPUT_TO_DATA_BASE_PORT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Ouput To Data Base Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OUPUT_TO_DATA_BASE_PORT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionInputFromDataBasePortImpl <em>Connection Input From Data Base Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionInputFromDataBasePortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionInputFromDataBasePort()
	 * @generated
	 */
	int CONNECTION_INPUT_FROM_DATA_BASE_PORT = 33;

	/**
	 * The number of structural features of the '<em>Connection Input From Data Base Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INPUT_FROM_DATA_BASE_PORT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Input From Data Base Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INPUT_FROM_DATA_BASE_PORT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionDatabaseConnectorImpl <em>Connection Database Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionDatabaseConnectorImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionDatabaseConnector()
	 * @generated
	 */
	int CONNECTION_DATABASE_CONNECTOR = 34;

	/**
	 * The feature id for the '<em><b>Interfaceconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR__INTERFACECONNECT = COSAPackage.CONNECTEUR__INTERFACECONNECT;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR__GLUE = COSAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Connectiondbinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dbconnectionoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectiondboutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dbconnectioninrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection Database Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR_FEATURE_COUNT = COSAPackage.CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connection Database Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DATABASE_CONNECTOR_OPERATION_COUNT = COSAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DBConnectionOutRoleImpl <em>DB Connection Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DBConnectionOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDBConnectionOutRole()
	 * @generated
	 */
	int DB_CONNECTION_OUT_ROLE = 35;

	/**
	 * The number of structural features of the '<em>DB Connection Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_CONNECTION_OUT_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DB Connection Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_CONNECTION_OUT_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionDBInRoleImpl <em>Connection DB In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionDBInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionDBInRole()
	 * @generated
	 */
	int CONNECTION_DB_IN_ROLE = 36;

	/**
	 * The number of structural features of the '<em>Connection DB In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DB_IN_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection DB In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DB_IN_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionConnectorDatabaseAttachmentImpl <em>Connection Connector Database Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionConnectorDatabaseAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionConnectorDatabaseAttachment()
	 * @generated
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT = 37;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Connector Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection Connector Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_DATABASE_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectorDatabaseConnectionAttachmentImpl <em>Connector Database Connection Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectorDatabaseConnectionAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorDatabaseConnectionAttachment()
	 * @generated
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT = 38;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector Database Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector Database Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_CONNECTION_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionDBOutRoleImpl <em>Connection DB Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionDBOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionDBOutRole()
	 * @generated
	 */
	int CONNECTION_DB_OUT_ROLE = 39;

	/**
	 * The number of structural features of the '<em>Connection DB Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DB_OUT_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection DB Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DB_OUT_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DBConnectionInRoleImpl <em>DB Connection In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DBConnectionInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDBConnectionInRole()
	 * @generated
	 */
	int DB_CONNECTION_IN_ROLE = 40;

	/**
	 * The number of structural features of the '<em>DB Connection In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_CONNECTION_IN_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DB Connection In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_CONNECTION_IN_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectorConnectionDatabaseAttachmentImpl <em>Connector Connection Database Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectorConnectionDatabaseAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorConnectionDatabaseAttachment()
	 * @generated
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT = 41;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector Connection Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector Connection Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_DATABASE_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseConnectorConnectionAttachmentImpl <em>Database Connector Connection Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseConnectorConnectionAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseConnectorConnectionAttachment()
	 * @generated
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT = 42;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Database Connector Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Database Connector Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_CONNECTION_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseInputFromConnectionPortImpl <em>Database Input From Connection Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseInputFromConnectionPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseInputFromConnectionPort()
	 * @generated
	 */
	int DATABASE_INPUT_FROM_CONNECTION_PORT = 43;

	/**
	 * The number of structural features of the '<em>Database Input From Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INPUT_FROM_CONNECTION_PORT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Input From Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INPUT_FROM_CONNECTION_PORT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseOutputToConnectionPortImpl <em>Database Output To Connection Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseOutputToConnectionPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseOutputToConnectionPort()
	 * @generated
	 */
	int DATABASE_OUTPUT_TO_CONNECTION_PORT = 44;

	/**
	 * The number of structural features of the '<em>Database Output To Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OUTPUT_TO_CONNECTION_PORT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Output To Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OUTPUT_TO_CONNECTION_PORT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionSecurityConnectorImpl <em>Connection Security Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionSecurityConnectorImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionSecurityConnector()
	 * @generated
	 */
	int CONNECTION_SECURITY_CONNECTOR = 45;

	/**
	 * The feature id for the '<em><b>Interfaceconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR__INTERFACECONNECT = COSAPackage.CONNECTEUR__INTERFACECONNECT;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR__GLUE = COSAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Connectionsecurityinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityconnectionoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectionsecurityoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Securityconnectioninrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection Security Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR_FEATURE_COUNT = COSAPackage.CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connection Security Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_CONNECTOR_OPERATION_COUNT = COSAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionSecurityInRoleImpl <em>Connection Security In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionSecurityInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionSecurityInRole()
	 * @generated
	 */
	int CONNECTION_SECURITY_IN_ROLE = 46;

	/**
	 * The number of structural features of the '<em>Connection Security In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_IN_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Security In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_IN_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionSecurityOutRoleImpl <em>Connection Security Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionSecurityOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionSecurityOutRole()
	 * @generated
	 */
	int CONNECTION_SECURITY_OUT_ROLE = 47;

	/**
	 * The number of structural features of the '<em>Connection Security Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_OUT_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Security Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SECURITY_OUT_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityConnectionOutRoleImpl <em>Security Connection Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityConnectionOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectionOutRole()
	 * @generated
	 */
	int SECURITY_CONNECTION_OUT_ROLE = 48;

	/**
	 * The number of structural features of the '<em>Security Connection Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTION_OUT_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Connection Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTION_OUT_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityConnectionInRoleImpl <em>Security Connection In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityConnectionInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectionInRole()
	 * @generated
	 */
	int SECURITY_CONNECTION_IN_ROLE = 49;

	/**
	 * The number of structural features of the '<em>Security Connection In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTION_IN_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Connection In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTION_IN_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectionConnectorSecurityAttachmentImpl <em>Connection Connector Security Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectionConnectorSecurityAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionConnectorSecurityAttachment()
	 * @generated
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT = 50;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Connector Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection Connector Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTOR_SECURITY_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectorSecurityConnectionAttachmentImpl <em>Connector Security Connection Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectorSecurityConnectionAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorSecurityConnectionAttachment()
	 * @generated
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT = 51;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector Security Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector Security Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_CONNECTION_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityInputFromConnectionPortImpl <em>Security Input From Connection Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityInputFromConnectionPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityInputFromConnectionPort()
	 * @generated
	 */
	int SECURITY_INPUT_FROM_CONNECTION_PORT = 52;

	/**
	 * The number of structural features of the '<em>Security Input From Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INPUT_FROM_CONNECTION_PORT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Input From Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INPUT_FROM_CONNECTION_PORT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityOuputToConnectionPortImpl <em>Security Ouput To Connection Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityOuputToConnectionPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityOuputToConnectionPort()
	 * @generated
	 */
	int SECURITY_OUPUT_TO_CONNECTION_PORT = 53;

	/**
	 * The number of structural features of the '<em>Security Ouput To Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OUPUT_TO_CONNECTION_PORT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Ouput To Connection Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OUPUT_TO_CONNECTION_PORT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectorConnectionSecurityAttachmentImpl <em>Connector Connection Security Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectorConnectionSecurityAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorConnectionSecurityAttachment()
	 * @generated
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT = 54;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector Connection Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector Connection Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONNECTION_SECURITY_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityConnectorConnectionAttachmentImpl <em>Security Connector Connection Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityConnectorConnectionAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectorConnectionAttachment()
	 * @generated
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT = 55;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Connector Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Connector Connection Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_CONNECTION_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseOutputToSecurityPortImpl <em>Database Output To Security Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseOutputToSecurityPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseOutputToSecurityPort()
	 * @generated
	 */
	int DATABASE_OUTPUT_TO_SECURITY_PORT = 56;

	/**
	 * The number of structural features of the '<em>Database Output To Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OUTPUT_TO_SECURITY_PORT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Output To Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OUTPUT_TO_SECURITY_PORT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseInputFromSecurityPortImpl <em>Database Input From Security Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseInputFromSecurityPortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseInputFromSecurityPort()
	 * @generated
	 */
	int DATABASE_INPUT_FROM_SECURITY_PORT = 57;

	/**
	 * The number of structural features of the '<em>Database Input From Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INPUT_FROM_SECURITY_PORT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Input From Security Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INPUT_FROM_SECURITY_PORT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityOutputToDatabasePortImpl <em>Security Output To Database Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityOutputToDatabasePortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityOutputToDatabasePort()
	 * @generated
	 */
	int SECURITY_OUTPUT_TO_DATABASE_PORT = 58;

	/**
	 * The number of structural features of the '<em>Security Output To Database Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OUTPUT_TO_DATABASE_PORT_FEATURE_COUNT = COSAPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Output To Database Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OUTPUT_TO_DATABASE_PORT_OPERATION_COUNT = COSAPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityInputFromDatabasePortImpl <em>Security Input From Database Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityInputFromDatabasePortImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityInputFromDatabasePort()
	 * @generated
	 */
	int SECURITY_INPUT_FROM_DATABASE_PORT = 59;

	/**
	 * The number of structural features of the '<em>Security Input From Database Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INPUT_FROM_DATABASE_PORT_FEATURE_COUNT = COSAPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Input From Database Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INPUT_FROM_DATABASE_PORT_OPERATION_COUNT = COSAPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseSecurityConnectorImpl <em>Database Security Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseSecurityConnectorImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseSecurityConnector()
	 * @generated
	 */
	int DATABASE_SECURITY_CONNECTOR = 60;

	/**
	 * The feature id for the '<em><b>Interfaceconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR__INTERFACECONNECT = COSAPackage.CONNECTEUR__INTERFACECONNECT;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR__GLUE = COSAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Decuritydatabaseoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Databasesecurityinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Securitydatabaseinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Databasesecurityoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE = COSAPackage.CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Database Security Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR_FEATURE_COUNT = COSAPackage.CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Database Security Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_CONNECTOR_OPERATION_COUNT = COSAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseSecurityInRoleImpl <em>Database Security In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseSecurityInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseSecurityInRole()
	 * @generated
	 */
	int DATABASE_SECURITY_IN_ROLE = 61;

	/**
	 * The number of structural features of the '<em>Database Security In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_IN_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Security In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_IN_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DecurityDatabaseOutRoleImpl <em>Decurity Database Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DecurityDatabaseOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDecurityDatabaseOutRole()
	 * @generated
	 */
	int DECURITY_DATABASE_OUT_ROLE = 62;

	/**
	 * The number of structural features of the '<em>Decurity Database Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECURITY_DATABASE_OUT_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decurity Database Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECURITY_DATABASE_OUT_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityDatabaseInRoleImpl <em>Security Database In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityDatabaseInRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityDatabaseInRole()
	 * @generated
	 */
	int SECURITY_DATABASE_IN_ROLE = 63;

	/**
	 * The number of structural features of the '<em>Security Database In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DATABASE_IN_ROLE_FEATURE_COUNT = COSAPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Database In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DATABASE_IN_ROLE_OPERATION_COUNT = COSAPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseSecurityOutRoleImpl <em>Database Security Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseSecurityOutRoleImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseSecurityOutRole()
	 * @generated
	 */
	int DATABASE_SECURITY_OUT_ROLE = 64;

	/**
	 * The number of structural features of the '<em>Database Security Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_OUT_ROLE_FEATURE_COUNT = COSAPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Security Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_SECURITY_OUT_ROLE_OPERATION_COUNT = COSAPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DatabaseConnectorSecurityAttachmentImpl <em>Database Connector Security Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DatabaseConnectorSecurityAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseConnectorSecurityAttachment()
	 * @generated
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT = 65;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Database Connector Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Database Connector Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTOR_SECURITY_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectorSecurityDatabaseAttachmentImpl <em>Connector Security Database Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectorSecurityDatabaseAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorSecurityDatabaseAttachment()
	 * @generated
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT = 66;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector Security Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector Security Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SECURITY_DATABASE_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.SecurityConnectorDatabaseAttachmentImpl <em>Security Connector Database Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.SecurityConnectorDatabaseAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectorDatabaseAttachment()
	 * @generated
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT = 67;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT__PROVIDEDPORT = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT__PROVIDEDSERVICE = COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT__REQUIREDROLE = COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT__FROM = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT__TO = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Connector Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Connector Database Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONNECTOR_DATABASE_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACOMPOSANT_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.ConnectorDatabaseSecurityAttachmentImpl <em>Connector Database Security Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.ConnectorDatabaseSecurityAttachmentImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorDatabaseSecurityAttachment()
	 * @generated
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT = 68;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT__REQUIREDPORT = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT__REQUIREDSERVICE = COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT__PROVIDEDROLE = COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector Database Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT_FEATURE_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector Database Security Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DATABASE_SECURITY_ATTACHMENT_OPERATION_COUNT = COSAPackage.ACONNECTEUR_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.CDConnectorGlueImpl <em>CD Connector Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.CDConnectorGlueImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCDConnectorGlue()
	 * @generated
	 */
	int CD_CONNECTOR_GLUE = 69;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE__PROVIDEDROLE = COSAPackage.GLUE__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE__REQUIREDROLE = COSAPackage.GLUE__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>Connectionoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE__CONNECTIONOUTPUT = COSAPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectioninput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE__CONNECTIONINPUT = COSAPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Databaseinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE__DATABASEINPUT = COSAPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Databaseoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE__DATABASEOUTPUT = COSAPackage.GLUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CD Connector Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE_FEATURE_COUNT = COSAPackage.GLUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CD Connector Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONNECTOR_GLUE_OPERATION_COUNT = COSAPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.CSCOnnectorGlueImpl <em>CSC Onnector Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.CSCOnnectorGlueImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSCOnnectorGlue()
	 * @generated
	 */
	int CSC_ONNECTOR_GLUE = 70;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE__PROVIDEDROLE = COSAPackage.GLUE__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE__REQUIREDROLE = COSAPackage.GLUE__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>Connectionoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT = COSAPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectioninput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE__CONNECTIONINPUT = COSAPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Securityinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE__SECURITYINPUT = COSAPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Securityoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE__SECURITYOUTPUT = COSAPackage.GLUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CSC Onnector Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE_FEATURE_COUNT = COSAPackage.GLUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CSC Onnector Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_ONNECTOR_GLUE_OPERATION_COUNT = COSAPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA_m1.impl.DSConnectorGlueImpl <em>DS Connector Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA_m1.impl.DSConnectorGlueImpl
	 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDSConnectorGlue()
	 * @generated
	 */
	int DS_CONNECTOR_GLUE = 71;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE__PROVIDEDROLE = COSAPackage.GLUE__PROVIDEDROLE;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE__REQUIREDROLE = COSAPackage.GLUE__REQUIREDROLE;

	/**
	 * The feature id for the '<em><b>Databaseinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE__DATABASEINPUT = COSAPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Databaseoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE__DATABASEOUTPUT = COSAPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Securityinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE__SECURITYINPUT = COSAPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Securityoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE__SECURITYOUTPUT = COSAPackage.GLUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DS Connector Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE_FEATURE_COUNT = COSAPackage.GLUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DS Connector Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_CONNECTOR_GLUE_OPERATION_COUNT = COSAPackage.GLUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cOSA_m1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see cOSA_m1.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Client#getResponseportrpc <em>Responseportrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responseportrpc</em>'.
	 * @see cOSA_m1.Client#getResponseportrpc()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Responseportrpc();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Client#getRequestportrpc <em>Requestportrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requestportrpc</em>'.
	 * @see cOSA_m1.Client#getRequestportrpc()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Requestportrpc();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Client#getConfigoutput <em>Configoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configoutput</em>'.
	 * @see cOSA_m1.Client#getConfigoutput()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Configoutput();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Client#getConfiginput <em>Configinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configinput</em>'.
	 * @see cOSA_m1.Client#getConfiginput()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Configinput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ResponsePortRPC <em>Response Port RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Port RPC</em>'.
	 * @see cOSA_m1.ResponsePortRPC
	 * @generated
	 */
	EClass getResponsePortRPC();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.RequestPortRPC <em>Request Port RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Port RPC</em>'.
	 * @see cOSA_m1.RequestPortRPC
	 * @generated
	 */
	EClass getRequestPortRPC();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.CSConf <em>CS Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Conf</em>'.
	 * @see cOSA_m1.CSConf
	 * @generated
	 */
	EClass getCSConf();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see cOSA_m1.CSConf#getClients()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Clients();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getCsqueryports <em>Csqueryports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csqueryports</em>'.
	 * @see cOSA_m1.CSConf#getCsqueryports()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Csqueryports();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getCsresponseports <em>Csresponseports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csresponseports</em>'.
	 * @see cOSA_m1.CSConf#getCsresponseports()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Csresponseports();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getRpcs <em>Rpcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rpcs</em>'.
	 * @see cOSA_m1.CSConf#getRpcs()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Rpcs();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getClientrpcattachment <em>Clientrpcattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clientrpcattachment</em>'.
	 * @see cOSA_m1.CSConf#getClientrpcattachment()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Clientrpcattachment();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getRpcclientattachment <em>Rpcclientattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rpcclientattachment</em>'.
	 * @see cOSA_m1.CSConf#getRpcclientattachment()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Rpcclientattachment();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getOutputbindings <em>Outputbindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputbindings</em>'.
	 * @see cOSA_m1.CSConf#getOutputbindings()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Outputbindings();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getInputbindings <em>Inputbindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputbindings</em>'.
	 * @see cOSA_m1.CSConf#getInputbindings()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Inputbindings();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getServerrpcattachment <em>Serverrpcattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serverrpcattachment</em>'.
	 * @see cOSA_m1.CSConf#getServerrpcattachment()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Serverrpcattachment();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA_m1.CSConf#getRpcserverattachment <em>Rpcserverattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rpcserverattachment</em>'.
	 * @see cOSA_m1.CSConf#getRpcserverattachment()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Rpcserverattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.CSConf#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see cOSA_m1.CSConf#getServer()
	 * @see #getCSConf()
	 * @generated
	 */
	EReference getCSConf_Server();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.CSQueryPorts <em>CS Query Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Query Ports</em>'.
	 * @see cOSA_m1.CSQueryPorts
	 * @generated
	 */
	EClass getCSQueryPorts();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.CSResponsePorts <em>CS Response Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Response Ports</em>'.
	 * @see cOSA_m1.CSResponsePorts
	 * @generated
	 */
	EClass getCSResponsePorts();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see cOSA_m1.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.RPC#getClientoutrole <em>Clientoutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clientoutrole</em>'.
	 * @see cOSA_m1.RPC#getClientoutrole()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Clientoutrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.RPC#getClientinrole <em>Clientinrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clientinrole</em>'.
	 * @see cOSA_m1.RPC#getClientinrole()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Clientinrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.RPC#getServerinrole <em>Serverinrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serverinrole</em>'.
	 * @see cOSA_m1.RPC#getServerinrole()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Serverinrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.RPC#getServeuroutrole <em>Serveuroutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serveuroutrole</em>'.
	 * @see cOSA_m1.RPC#getServeuroutrole()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Serveuroutrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.RPC#getRpcglue <em>Rpcglue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpcglue</em>'.
	 * @see cOSA_m1.RPC#getRpcglue()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Rpcglue();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ClientOutRole <em>Client Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Out Role</em>'.
	 * @see cOSA_m1.ClientOutRole
	 * @generated
	 */
	EClass getClientOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ClientInRole <em>Client In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client In Role</em>'.
	 * @see cOSA_m1.ClientInRole
	 * @generated
	 */
	EClass getClientInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ServerInRole <em>Server In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server In Role</em>'.
	 * @see cOSA_m1.ServerInRole
	 * @generated
	 */
	EClass getServerInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ServeurOutRole <em>Serveur Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Out Role</em>'.
	 * @see cOSA_m1.ServeurOutRole
	 * @generated
	 */
	EClass getServeurOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ClientRpcAttachment <em>Client Rpc Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Rpc Attachment</em>'.
	 * @see cOSA_m1.ClientRpcAttachment
	 * @generated
	 */
	EClass getClientRpcAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ClientRpcAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ClientRpcAttachment#getFrom()
	 * @see #getClientRpcAttachment()
	 * @generated
	 */
	EReference getClientRpcAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ClientRpcAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ClientRpcAttachment#getTo()
	 * @see #getClientRpcAttachment()
	 * @generated
	 */
	EReference getClientRpcAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.RpcClientAttachment <em>Rpc Client Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rpc Client Attachment</em>'.
	 * @see cOSA_m1.RpcClientAttachment
	 * @generated
	 */
	EClass getRpcClientAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcClientAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.RpcClientAttachment#getTo()
	 * @see #getRpcClientAttachment()
	 * @generated
	 */
	EReference getRpcClientAttachment_To();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcClientAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.RpcClientAttachment#getFrom()
	 * @see #getRpcClientAttachment()
	 * @generated
	 */
	EReference getRpcClientAttachment_From();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConfigInput <em>Config Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Input</em>'.
	 * @see cOSA_m1.ConfigInput
	 * @generated
	 */
	EClass getConfigInput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConfigOutput <em>Config Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Output</em>'.
	 * @see cOSA_m1.ConfigOutput
	 * @generated
	 */
	EClass getConfigOutput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.InputBindings <em>Input Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Bindings</em>'.
	 * @see cOSA_m1.InputBindings
	 * @generated
	 */
	EClass getInputBindings();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.InputBindings#getConfiginput <em>Configinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configinput</em>'.
	 * @see cOSA_m1.InputBindings#getConfiginput()
	 * @see #getInputBindings()
	 * @generated
	 */
	EReference getInputBindings_Configinput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.InputBindings#getClientinput <em>Clientinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clientinput</em>'.
	 * @see cOSA_m1.InputBindings#getClientinput()
	 * @see #getInputBindings()
	 * @generated
	 */
	EReference getInputBindings_Clientinput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.OutputBindings <em>Output Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Bindings</em>'.
	 * @see cOSA_m1.OutputBindings
	 * @generated
	 */
	EClass getOutputBindings();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.OutputBindings#getClientoutput <em>Clientoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clientoutput</em>'.
	 * @see cOSA_m1.OutputBindings#getClientoutput()
	 * @see #getOutputBindings()
	 * @generated
	 */
	EReference getOutputBindings_Clientoutput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.OutputBindings#getConfigoutput <em>Configoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configoutput</em>'.
	 * @see cOSA_m1.OutputBindings#getConfigoutput()
	 * @see #getOutputBindings()
	 * @generated
	 */
	EReference getOutputBindings_Configoutput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.RpcGlue <em>Rpc Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rpc Glue</em>'.
	 * @see cOSA_m1.RpcGlue
	 * @generated
	 */
	EClass getRpcGlue();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcGlue#getClientout <em>Clientout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clientout</em>'.
	 * @see cOSA_m1.RpcGlue#getClientout()
	 * @see #getRpcGlue()
	 * @generated
	 */
	EReference getRpcGlue_Clientout();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcGlue#getClientin <em>Clientin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clientin</em>'.
	 * @see cOSA_m1.RpcGlue#getClientin()
	 * @see #getRpcGlue()
	 * @generated
	 */
	EReference getRpcGlue_Clientin();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcGlue#getServerin <em>Serverin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serverin</em>'.
	 * @see cOSA_m1.RpcGlue#getServerin()
	 * @see #getRpcGlue()
	 * @generated
	 */
	EReference getRpcGlue_Serverin();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcGlue#getServeurout <em>Serveurout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveurout</em>'.
	 * @see cOSA_m1.RpcGlue#getServeurout()
	 * @see #getRpcGlue()
	 * @generated
	 */
	EReference getRpcGlue_Serveurout();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.RpcServerAttachment <em>Rpc Server Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rpc Server Attachment</em>'.
	 * @see cOSA_m1.RpcServerAttachment
	 * @generated
	 */
	EClass getRpcServerAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcServerAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.RpcServerAttachment#getFrom()
	 * @see #getRpcServerAttachment()
	 * @generated
	 */
	EReference getRpcServerAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.RpcServerAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.RpcServerAttachment#getTo()
	 * @see #getRpcServerAttachment()
	 * @generated
	 */
	EReference getRpcServerAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ServerRpcAttachment <em>Server Rpc Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Rpc Attachment</em>'.
	 * @see cOSA_m1.ServerRpcAttachment
	 * @generated
	 */
	EClass getServerRpcAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ServerRpcAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ServerRpcAttachment#getTo()
	 * @see #getServerRpcAttachment()
	 * @generated
	 */
	EReference getServerRpcAttachment_To();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ServerRpcAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ServerRpcAttachment#getFrom()
	 * @see #getServerRpcAttachment()
	 * @generated
	 */
	EReference getServerRpcAttachment_From();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see cOSA_m1.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getServerinput <em>Serverinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serverinput</em>'.
	 * @see cOSA_m1.Server#getServerinput()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Serverinput();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getServerouput <em>Serverouput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serverouput</em>'.
	 * @see cOSA_m1.Server#getServerouput()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Serverouput();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getOutputbinding <em>Outputbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputbinding</em>'.
	 * @see cOSA_m1.Server#getOutputbinding()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Outputbinding();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getInputbinding <em>Inputbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputbinding</em>'.
	 * @see cOSA_m1.Server#getInputbinding()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Inputbinding();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectionmanager <em>Connectionmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionmanager</em>'.
	 * @see cOSA_m1.Server#getConnectionmanager()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectionmanager();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectordatabaseconnectionattachment <em>Connectordatabaseconnectionattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectordatabaseconnectionattachment</em>'.
	 * @see cOSA_m1.Server#getConnectordatabaseconnectionattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectordatabaseconnectionattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectionconnectordatabaseattachment <em>Connectionconnectordatabaseattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionconnectordatabaseattachment</em>'.
	 * @see cOSA_m1.Server#getConnectionconnectordatabaseattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectionconnectordatabaseattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectiondatabaseconnector <em>Connectiondatabaseconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectiondatabaseconnector</em>'.
	 * @see cOSA_m1.Server#getConnectiondatabaseconnector()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectiondatabaseconnector();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getDatabaseconnectorconnectionattachment <em>Databaseconnectorconnectionattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databaseconnectorconnectionattachment</em>'.
	 * @see cOSA_m1.Server#getDatabaseconnectorconnectionattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Databaseconnectorconnectionattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectorconnectiondatabaseattachment <em>Connectorconnectiondatabaseattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectorconnectiondatabaseattachment</em>'.
	 * @see cOSA_m1.Server#getConnectorconnectiondatabaseattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectorconnectiondatabaseattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see cOSA_m1.Server#getDatabase()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Database();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectorsecuritydatabaseattachment <em>Connectorsecuritydatabaseattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectorsecuritydatabaseattachment</em>'.
	 * @see cOSA_m1.Server#getConnectorsecuritydatabaseattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectorsecuritydatabaseattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getDatabaseconnectorsecurityattachment <em>Databaseconnectorsecurityattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databaseconnectorsecurityattachment</em>'.
	 * @see cOSA_m1.Server#getDatabaseconnectorsecurityattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Databaseconnectorsecurityattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getDatabasesecurityconnector <em>Databasesecurityconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databasesecurityconnector</em>'.
	 * @see cOSA_m1.Server#getDatabasesecurityconnector()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Databasesecurityconnector();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectordatabasesecurityattachment <em>Connectordatabasesecurityattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectordatabasesecurityattachment</em>'.
	 * @see cOSA_m1.Server#getConnectordatabasesecurityattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectordatabasesecurityattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getSecurityconnectordatabaseattachment <em>Securityconnectordatabaseattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityconnectordatabaseattachment</em>'.
	 * @see cOSA_m1.Server#getSecurityconnectordatabaseattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Securityconnectordatabaseattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getSecuritymanager <em>Securitymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanager</em>'.
	 * @see cOSA_m1.Server#getSecuritymanager()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Securitymanager();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getSecurityconnectorconnectionattachment <em>Securityconnectorconnectionattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityconnectorconnectionattachment</em>'.
	 * @see cOSA_m1.Server#getSecurityconnectorconnectionattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Securityconnectorconnectionattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectorconnectionsecurityattachment <em>Connectorconnectionsecurityattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectorconnectionsecurityattachment</em>'.
	 * @see cOSA_m1.Server#getConnectorconnectionsecurityattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectorconnectionsecurityattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectionsecurityconnector <em>Connectionsecurityconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionsecurityconnector</em>'.
	 * @see cOSA_m1.Server#getConnectionsecurityconnector()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectionsecurityconnector();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectorsecurityconnectionattachment <em>Connectorsecurityconnectionattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectorsecurityconnectionattachment</em>'.
	 * @see cOSA_m1.Server#getConnectorsecurityconnectionattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectorsecurityconnectionattachment();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.Server#getConnectionconnectorsecurityattachment <em>Connectionconnectorsecurityattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionconnectorsecurityattachment</em>'.
	 * @see cOSA_m1.Server#getConnectionconnectorsecurityattachment()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Connectionconnectorsecurityattachment();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ServerInput <em>Server Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Input</em>'.
	 * @see cOSA_m1.ServerInput
	 * @generated
	 */
	EClass getServerInput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ServerOuput <em>Server Ouput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Ouput</em>'.
	 * @see cOSA_m1.ServerOuput
	 * @generated
	 */
	EClass getServerOuput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see cOSA_m1.ConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionManager#getServerconfiginput <em>Serverconfiginput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serverconfiginput</em>'.
	 * @see cOSA_m1.ConnectionManager#getServerconfiginput()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Serverconfiginput();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionManager#getServerconfigoutput <em>Serverconfigoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serverconfigoutput</em>'.
	 * @see cOSA_m1.ConnectionManager#getServerconfigoutput()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Serverconfigoutput();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionManager#getConnectionoutputtosecurityport <em>Connectionoutputtosecurityport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionoutputtosecurityport</em>'.
	 * @see cOSA_m1.ConnectionManager#getConnectionoutputtosecurityport()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Connectionoutputtosecurityport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionManager#getConnectioninputfromsecurityport <em>Connectioninputfromsecurityport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectioninputfromsecurityport</em>'.
	 * @see cOSA_m1.ConnectionManager#getConnectioninputfromsecurityport()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Connectioninputfromsecurityport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionManager#getConnectioninputfromdatabaseport <em>Connectioninputfromdatabaseport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectioninputfromdatabaseport</em>'.
	 * @see cOSA_m1.ConnectionManager#getConnectioninputfromdatabaseport()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Connectioninputfromdatabaseport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionManager#getConnectionouputtodatabaseport <em>Connectionouputtodatabaseport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionouputtodatabaseport</em>'.
	 * @see cOSA_m1.ConnectionManager#getConnectionouputtodatabaseport()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Connectionouputtodatabaseport();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manager</em>'.
	 * @see cOSA_m1.SecurityManager
	 * @generated
	 */
	EClass getSecurityManager();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.SecurityManager#getSecurityinputfromconnectionport <em>Securityinputfromconnectionport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityinputfromconnectionport</em>'.
	 * @see cOSA_m1.SecurityManager#getSecurityinputfromconnectionport()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Securityinputfromconnectionport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.SecurityManager#getSecurityouputtoconnectionport <em>Securityouputtoconnectionport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityouputtoconnectionport</em>'.
	 * @see cOSA_m1.SecurityManager#getSecurityouputtoconnectionport()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Securityouputtoconnectionport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.SecurityManager#getSecurityoutputtodatabaseport <em>Securityoutputtodatabaseport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityoutputtodatabaseport</em>'.
	 * @see cOSA_m1.SecurityManager#getSecurityoutputtodatabaseport()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Securityoutputtodatabaseport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.SecurityManager#getSecurityinputfromdatabaseport <em>Securityinputfromdatabaseport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityinputfromdatabaseport</em>'.
	 * @see cOSA_m1.SecurityManager#getSecurityinputfromdatabaseport()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Securityinputfromdatabaseport();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see cOSA_m1.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DataBase#getDatabaseinputfromconnectionport <em>Databaseinputfromconnectionport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databaseinputfromconnectionport</em>'.
	 * @see cOSA_m1.DataBase#getDatabaseinputfromconnectionport()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Databaseinputfromconnectionport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DataBase#getDatabaseoutputtoconnectionport <em>Databaseoutputtoconnectionport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databaseoutputtoconnectionport</em>'.
	 * @see cOSA_m1.DataBase#getDatabaseoutputtoconnectionport()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Databaseoutputtoconnectionport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DataBase#getDatabaseoutputtosecurityport <em>Databaseoutputtosecurityport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databaseoutputtosecurityport</em>'.
	 * @see cOSA_m1.DataBase#getDatabaseoutputtosecurityport()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Databaseoutputtosecurityport();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DataBase#getDatabaseinputfromsecurityport <em>Databaseinputfromsecurityport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databaseinputfromsecurityport</em>'.
	 * @see cOSA_m1.DataBase#getDatabaseinputfromsecurityport()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Databaseinputfromsecurityport();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ServerConfigInput <em>Server Config Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Config Input</em>'.
	 * @see cOSA_m1.ServerConfigInput
	 * @generated
	 */
	EClass getServerConfigInput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ServerConfigOutput <em>Server Config Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Config Output</em>'.
	 * @see cOSA_m1.ServerConfigOutput
	 * @generated
	 */
	EClass getServerConfigOutput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.InputBinding <em>Input Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Binding</em>'.
	 * @see cOSA_m1.InputBinding
	 * @generated
	 */
	EClass getInputBinding();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.InputBinding#getServerinput <em>Serverinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serverinput</em>'.
	 * @see cOSA_m1.InputBinding#getServerinput()
	 * @see #getInputBinding()
	 * @generated
	 */
	EReference getInputBinding_Serverinput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.InputBinding#getServerconfiginput <em>Serverconfiginput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serverconfiginput</em>'.
	 * @see cOSA_m1.InputBinding#getServerconfiginput()
	 * @see #getInputBinding()
	 * @generated
	 */
	EReference getInputBinding_Serverconfiginput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.OutputBinding <em>Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Binding</em>'.
	 * @see cOSA_m1.OutputBinding
	 * @generated
	 */
	EClass getOutputBinding();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.OutputBinding#getServerconfigoutput <em>Serverconfigoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serverconfigoutput</em>'.
	 * @see cOSA_m1.OutputBinding#getServerconfigoutput()
	 * @see #getOutputBinding()
	 * @generated
	 */
	EReference getOutputBinding_Serverconfigoutput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.OutputBinding#getServerouput <em>Serverouput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serverouput</em>'.
	 * @see cOSA_m1.OutputBinding#getServerouput()
	 * @see #getOutputBinding()
	 * @generated
	 */
	EReference getOutputBinding_Serverouput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionOutputToSecurityPort <em>Connection Output To Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Output To Security Port</em>'.
	 * @see cOSA_m1.ConnectionOutputToSecurityPort
	 * @generated
	 */
	EClass getConnectionOutputToSecurityPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionInputFromSecurityPort <em>Connection Input From Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Input From Security Port</em>'.
	 * @see cOSA_m1.ConnectionInputFromSecurityPort
	 * @generated
	 */
	EClass getConnectionInputFromSecurityPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionOuputToDataBasePort <em>Connection Ouput To Data Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Ouput To Data Base Port</em>'.
	 * @see cOSA_m1.ConnectionOuputToDataBasePort
	 * @generated
	 */
	EClass getConnectionOuputToDataBasePort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionInputFromDataBasePort <em>Connection Input From Data Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Input From Data Base Port</em>'.
	 * @see cOSA_m1.ConnectionInputFromDataBasePort
	 * @generated
	 */
	EClass getConnectionInputFromDataBasePort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionDatabaseConnector <em>Connection Database Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Database Connector</em>'.
	 * @see cOSA_m1.ConnectionDatabaseConnector
	 * @generated
	 */
	EClass getConnectionDatabaseConnector();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionDatabaseConnector#getConnectiondbinrole <em>Connectiondbinrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectiondbinrole</em>'.
	 * @see cOSA_m1.ConnectionDatabaseConnector#getConnectiondbinrole()
	 * @see #getConnectionDatabaseConnector()
	 * @generated
	 */
	EReference getConnectionDatabaseConnector_Connectiondbinrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionDatabaseConnector#getDbconnectionoutrole <em>Dbconnectionoutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbconnectionoutrole</em>'.
	 * @see cOSA_m1.ConnectionDatabaseConnector#getDbconnectionoutrole()
	 * @see #getConnectionDatabaseConnector()
	 * @generated
	 */
	EReference getConnectionDatabaseConnector_Dbconnectionoutrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionDatabaseConnector#getConnectiondboutrole <em>Connectiondboutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectiondboutrole</em>'.
	 * @see cOSA_m1.ConnectionDatabaseConnector#getConnectiondboutrole()
	 * @see #getConnectionDatabaseConnector()
	 * @generated
	 */
	EReference getConnectionDatabaseConnector_Connectiondboutrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionDatabaseConnector#getDbconnectioninrole <em>Dbconnectioninrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbconnectioninrole</em>'.
	 * @see cOSA_m1.ConnectionDatabaseConnector#getDbconnectioninrole()
	 * @see #getConnectionDatabaseConnector()
	 * @generated
	 */
	EReference getConnectionDatabaseConnector_Dbconnectioninrole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DBConnectionOutRole <em>DB Connection Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Connection Out Role</em>'.
	 * @see cOSA_m1.DBConnectionOutRole
	 * @generated
	 */
	EClass getDBConnectionOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionDBInRole <em>Connection DB In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection DB In Role</em>'.
	 * @see cOSA_m1.ConnectionDBInRole
	 * @generated
	 */
	EClass getConnectionDBInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionConnectorDatabaseAttachment <em>Connection Connector Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Connector Database Attachment</em>'.
	 * @see cOSA_m1.ConnectionConnectorDatabaseAttachment
	 * @generated
	 */
	EClass getConnectionConnectorDatabaseAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectionConnectorDatabaseAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectionConnectorDatabaseAttachment#getFrom()
	 * @see #getConnectionConnectorDatabaseAttachment()
	 * @generated
	 */
	EReference getConnectionConnectorDatabaseAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectionConnectorDatabaseAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectionConnectorDatabaseAttachment#getTo()
	 * @see #getConnectionConnectorDatabaseAttachment()
	 * @generated
	 */
	EReference getConnectionConnectorDatabaseAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectorDatabaseConnectionAttachment <em>Connector Database Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Database Connection Attachment</em>'.
	 * @see cOSA_m1.ConnectorDatabaseConnectionAttachment
	 * @generated
	 */
	EClass getConnectorDatabaseConnectionAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorDatabaseConnectionAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectorDatabaseConnectionAttachment#getTo()
	 * @see #getConnectorDatabaseConnectionAttachment()
	 * @generated
	 */
	EReference getConnectorDatabaseConnectionAttachment_To();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorDatabaseConnectionAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectorDatabaseConnectionAttachment#getFrom()
	 * @see #getConnectorDatabaseConnectionAttachment()
	 * @generated
	 */
	EReference getConnectorDatabaseConnectionAttachment_From();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionDBOutRole <em>Connection DB Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection DB Out Role</em>'.
	 * @see cOSA_m1.ConnectionDBOutRole
	 * @generated
	 */
	EClass getConnectionDBOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DBConnectionInRole <em>DB Connection In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Connection In Role</em>'.
	 * @see cOSA_m1.DBConnectionInRole
	 * @generated
	 */
	EClass getDBConnectionInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectorConnectionDatabaseAttachment <em>Connector Connection Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Connection Database Attachment</em>'.
	 * @see cOSA_m1.ConnectorConnectionDatabaseAttachment
	 * @generated
	 */
	EClass getConnectorConnectionDatabaseAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorConnectionDatabaseAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectorConnectionDatabaseAttachment#getFrom()
	 * @see #getConnectorConnectionDatabaseAttachment()
	 * @generated
	 */
	EReference getConnectorConnectionDatabaseAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorConnectionDatabaseAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectorConnectionDatabaseAttachment#getTo()
	 * @see #getConnectorConnectionDatabaseAttachment()
	 * @generated
	 */
	EReference getConnectorConnectionDatabaseAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseConnectorConnectionAttachment <em>Database Connector Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Connector Connection Attachment</em>'.
	 * @see cOSA_m1.DatabaseConnectorConnectionAttachment
	 * @generated
	 */
	EClass getDatabaseConnectorConnectionAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DatabaseConnectorConnectionAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.DatabaseConnectorConnectionAttachment#getTo()
	 * @see #getDatabaseConnectorConnectionAttachment()
	 * @generated
	 */
	EReference getDatabaseConnectorConnectionAttachment_To();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DatabaseConnectorConnectionAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.DatabaseConnectorConnectionAttachment#getFrom()
	 * @see #getDatabaseConnectorConnectionAttachment()
	 * @generated
	 */
	EReference getDatabaseConnectorConnectionAttachment_From();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseInputFromConnectionPort <em>Database Input From Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Input From Connection Port</em>'.
	 * @see cOSA_m1.DatabaseInputFromConnectionPort
	 * @generated
	 */
	EClass getDatabaseInputFromConnectionPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseOutputToConnectionPort <em>Database Output To Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Output To Connection Port</em>'.
	 * @see cOSA_m1.DatabaseOutputToConnectionPort
	 * @generated
	 */
	EClass getDatabaseOutputToConnectionPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionSecurityConnector <em>Connection Security Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Security Connector</em>'.
	 * @see cOSA_m1.ConnectionSecurityConnector
	 * @generated
	 */
	EClass getConnectionSecurityConnector();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityinrole <em>Connectionsecurityinrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionsecurityinrole</em>'.
	 * @see cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityinrole()
	 * @see #getConnectionSecurityConnector()
	 * @generated
	 */
	EReference getConnectionSecurityConnector_Connectionsecurityinrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionSecurityConnector#getSecurityconnectionoutrole <em>Securityconnectionoutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityconnectionoutrole</em>'.
	 * @see cOSA_m1.ConnectionSecurityConnector#getSecurityconnectionoutrole()
	 * @see #getConnectionSecurityConnector()
	 * @generated
	 */
	EReference getConnectionSecurityConnector_Securityconnectionoutrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityoutrole <em>Connectionsecurityoutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionsecurityoutrole</em>'.
	 * @see cOSA_m1.ConnectionSecurityConnector#getConnectionsecurityoutrole()
	 * @see #getConnectionSecurityConnector()
	 * @generated
	 */
	EReference getConnectionSecurityConnector_Connectionsecurityoutrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.ConnectionSecurityConnector#getSecurityconnectioninrole <em>Securityconnectioninrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityconnectioninrole</em>'.
	 * @see cOSA_m1.ConnectionSecurityConnector#getSecurityconnectioninrole()
	 * @see #getConnectionSecurityConnector()
	 * @generated
	 */
	EReference getConnectionSecurityConnector_Securityconnectioninrole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionSecurityInRole <em>Connection Security In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Security In Role</em>'.
	 * @see cOSA_m1.ConnectionSecurityInRole
	 * @generated
	 */
	EClass getConnectionSecurityInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionSecurityOutRole <em>Connection Security Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Security Out Role</em>'.
	 * @see cOSA_m1.ConnectionSecurityOutRole
	 * @generated
	 */
	EClass getConnectionSecurityOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityConnectionOutRole <em>Security Connection Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Connection Out Role</em>'.
	 * @see cOSA_m1.SecurityConnectionOutRole
	 * @generated
	 */
	EClass getSecurityConnectionOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityConnectionInRole <em>Security Connection In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Connection In Role</em>'.
	 * @see cOSA_m1.SecurityConnectionInRole
	 * @generated
	 */
	EClass getSecurityConnectionInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectionConnectorSecurityAttachment <em>Connection Connector Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Connector Security Attachment</em>'.
	 * @see cOSA_m1.ConnectionConnectorSecurityAttachment
	 * @generated
	 */
	EClass getConnectionConnectorSecurityAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectionConnectorSecurityAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectionConnectorSecurityAttachment#getFrom()
	 * @see #getConnectionConnectorSecurityAttachment()
	 * @generated
	 */
	EReference getConnectionConnectorSecurityAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectionConnectorSecurityAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectionConnectorSecurityAttachment#getTo()
	 * @see #getConnectionConnectorSecurityAttachment()
	 * @generated
	 */
	EReference getConnectionConnectorSecurityAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectorSecurityConnectionAttachment <em>Connector Security Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Security Connection Attachment</em>'.
	 * @see cOSA_m1.ConnectorSecurityConnectionAttachment
	 * @generated
	 */
	EClass getConnectorSecurityConnectionAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorSecurityConnectionAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectorSecurityConnectionAttachment#getTo()
	 * @see #getConnectorSecurityConnectionAttachment()
	 * @generated
	 */
	EReference getConnectorSecurityConnectionAttachment_To();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorSecurityConnectionAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectorSecurityConnectionAttachment#getFrom()
	 * @see #getConnectorSecurityConnectionAttachment()
	 * @generated
	 */
	EReference getConnectorSecurityConnectionAttachment_From();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityInputFromConnectionPort <em>Security Input From Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Input From Connection Port</em>'.
	 * @see cOSA_m1.SecurityInputFromConnectionPort
	 * @generated
	 */
	EClass getSecurityInputFromConnectionPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityOuputToConnectionPort <em>Security Ouput To Connection Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Ouput To Connection Port</em>'.
	 * @see cOSA_m1.SecurityOuputToConnectionPort
	 * @generated
	 */
	EClass getSecurityOuputToConnectionPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectorConnectionSecurityAttachment <em>Connector Connection Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Connection Security Attachment</em>'.
	 * @see cOSA_m1.ConnectorConnectionSecurityAttachment
	 * @generated
	 */
	EClass getConnectorConnectionSecurityAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorConnectionSecurityAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectorConnectionSecurityAttachment#getFrom()
	 * @see #getConnectorConnectionSecurityAttachment()
	 * @generated
	 */
	EReference getConnectorConnectionSecurityAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorConnectionSecurityAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectorConnectionSecurityAttachment#getTo()
	 * @see #getConnectorConnectionSecurityAttachment()
	 * @generated
	 */
	EReference getConnectorConnectionSecurityAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityConnectorConnectionAttachment <em>Security Connector Connection Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Connector Connection Attachment</em>'.
	 * @see cOSA_m1.SecurityConnectorConnectionAttachment
	 * @generated
	 */
	EClass getSecurityConnectorConnectionAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.SecurityConnectorConnectionAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.SecurityConnectorConnectionAttachment#getFrom()
	 * @see #getSecurityConnectorConnectionAttachment()
	 * @generated
	 */
	EReference getSecurityConnectorConnectionAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.SecurityConnectorConnectionAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.SecurityConnectorConnectionAttachment#getTo()
	 * @see #getSecurityConnectorConnectionAttachment()
	 * @generated
	 */
	EReference getSecurityConnectorConnectionAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseOutputToSecurityPort <em>Database Output To Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Output To Security Port</em>'.
	 * @see cOSA_m1.DatabaseOutputToSecurityPort
	 * @generated
	 */
	EClass getDatabaseOutputToSecurityPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseInputFromSecurityPort <em>Database Input From Security Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Input From Security Port</em>'.
	 * @see cOSA_m1.DatabaseInputFromSecurityPort
	 * @generated
	 */
	EClass getDatabaseInputFromSecurityPort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityOutputToDatabasePort <em>Security Output To Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Output To Database Port</em>'.
	 * @see cOSA_m1.SecurityOutputToDatabasePort
	 * @generated
	 */
	EClass getSecurityOutputToDatabasePort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityInputFromDatabasePort <em>Security Input From Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Input From Database Port</em>'.
	 * @see cOSA_m1.SecurityInputFromDatabasePort
	 * @generated
	 */
	EClass getSecurityInputFromDatabasePort();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseSecurityConnector <em>Database Security Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Security Connector</em>'.
	 * @see cOSA_m1.DatabaseSecurityConnector
	 * @generated
	 */
	EClass getDatabaseSecurityConnector();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DatabaseSecurityConnector#getDecuritydatabaseoutrole <em>Decuritydatabaseoutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decuritydatabaseoutrole</em>'.
	 * @see cOSA_m1.DatabaseSecurityConnector#getDecuritydatabaseoutrole()
	 * @see #getDatabaseSecurityConnector()
	 * @generated
	 */
	EReference getDatabaseSecurityConnector_Decuritydatabaseoutrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityinrole <em>Databasesecurityinrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databasesecurityinrole</em>'.
	 * @see cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityinrole()
	 * @see #getDatabaseSecurityConnector()
	 * @generated
	 */
	EReference getDatabaseSecurityConnector_Databasesecurityinrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DatabaseSecurityConnector#getSecuritydatabaseinrole <em>Securitydatabaseinrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitydatabaseinrole</em>'.
	 * @see cOSA_m1.DatabaseSecurityConnector#getSecuritydatabaseinrole()
	 * @see #getDatabaseSecurityConnector()
	 * @generated
	 */
	EReference getDatabaseSecurityConnector_Securitydatabaseinrole();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityoutrole <em>Databasesecurityoutrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databasesecurityoutrole</em>'.
	 * @see cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityoutrole()
	 * @see #getDatabaseSecurityConnector()
	 * @generated
	 */
	EReference getDatabaseSecurityConnector_Databasesecurityoutrole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseSecurityInRole <em>Database Security In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Security In Role</em>'.
	 * @see cOSA_m1.DatabaseSecurityInRole
	 * @generated
	 */
	EClass getDatabaseSecurityInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DecurityDatabaseOutRole <em>Decurity Database Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decurity Database Out Role</em>'.
	 * @see cOSA_m1.DecurityDatabaseOutRole
	 * @generated
	 */
	EClass getDecurityDatabaseOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityDatabaseInRole <em>Security Database In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Database In Role</em>'.
	 * @see cOSA_m1.SecurityDatabaseInRole
	 * @generated
	 */
	EClass getSecurityDatabaseInRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseSecurityOutRole <em>Database Security Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Security Out Role</em>'.
	 * @see cOSA_m1.DatabaseSecurityOutRole
	 * @generated
	 */
	EClass getDatabaseSecurityOutRole();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DatabaseConnectorSecurityAttachment <em>Database Connector Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Connector Security Attachment</em>'.
	 * @see cOSA_m1.DatabaseConnectorSecurityAttachment
	 * @generated
	 */
	EClass getDatabaseConnectorSecurityAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DatabaseConnectorSecurityAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.DatabaseConnectorSecurityAttachment#getFrom()
	 * @see #getDatabaseConnectorSecurityAttachment()
	 * @generated
	 */
	EReference getDatabaseConnectorSecurityAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DatabaseConnectorSecurityAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.DatabaseConnectorSecurityAttachment#getTo()
	 * @see #getDatabaseConnectorSecurityAttachment()
	 * @generated
	 */
	EReference getDatabaseConnectorSecurityAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectorSecurityDatabaseAttachment <em>Connector Security Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Security Database Attachment</em>'.
	 * @see cOSA_m1.ConnectorSecurityDatabaseAttachment
	 * @generated
	 */
	EClass getConnectorSecurityDatabaseAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorSecurityDatabaseAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectorSecurityDatabaseAttachment#getFrom()
	 * @see #getConnectorSecurityDatabaseAttachment()
	 * @generated
	 */
	EReference getConnectorSecurityDatabaseAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorSecurityDatabaseAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectorSecurityDatabaseAttachment#getTo()
	 * @see #getConnectorSecurityDatabaseAttachment()
	 * @generated
	 */
	EReference getConnectorSecurityDatabaseAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.SecurityConnectorDatabaseAttachment <em>Security Connector Database Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Connector Database Attachment</em>'.
	 * @see cOSA_m1.SecurityConnectorDatabaseAttachment
	 * @generated
	 */
	EClass getSecurityConnectorDatabaseAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.SecurityConnectorDatabaseAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.SecurityConnectorDatabaseAttachment#getFrom()
	 * @see #getSecurityConnectorDatabaseAttachment()
	 * @generated
	 */
	EReference getSecurityConnectorDatabaseAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.SecurityConnectorDatabaseAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.SecurityConnectorDatabaseAttachment#getTo()
	 * @see #getSecurityConnectorDatabaseAttachment()
	 * @generated
	 */
	EReference getSecurityConnectorDatabaseAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.ConnectorDatabaseSecurityAttachment <em>Connector Database Security Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Database Security Attachment</em>'.
	 * @see cOSA_m1.ConnectorDatabaseSecurityAttachment
	 * @generated
	 */
	EClass getConnectorDatabaseSecurityAttachment();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorDatabaseSecurityAttachment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cOSA_m1.ConnectorDatabaseSecurityAttachment#getFrom()
	 * @see #getConnectorDatabaseSecurityAttachment()
	 * @generated
	 */
	EReference getConnectorDatabaseSecurityAttachment_From();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.ConnectorDatabaseSecurityAttachment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cOSA_m1.ConnectorDatabaseSecurityAttachment#getTo()
	 * @see #getConnectorDatabaseSecurityAttachment()
	 * @generated
	 */
	EReference getConnectorDatabaseSecurityAttachment_To();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.CDConnectorGlue <em>CD Connector Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Connector Glue</em>'.
	 * @see cOSA_m1.CDConnectorGlue
	 * @generated
	 */
	EClass getCDConnectorGlue();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CDConnectorGlue#getConnectionoutput <em>Connectionoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectionoutput</em>'.
	 * @see cOSA_m1.CDConnectorGlue#getConnectionoutput()
	 * @see #getCDConnectorGlue()
	 * @generated
	 */
	EReference getCDConnectorGlue_Connectionoutput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CDConnectorGlue#getConnectioninput <em>Connectioninput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectioninput</em>'.
	 * @see cOSA_m1.CDConnectorGlue#getConnectioninput()
	 * @see #getCDConnectorGlue()
	 * @generated
	 */
	EReference getCDConnectorGlue_Connectioninput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CDConnectorGlue#getDatabaseinput <em>Databaseinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databaseinput</em>'.
	 * @see cOSA_m1.CDConnectorGlue#getDatabaseinput()
	 * @see #getCDConnectorGlue()
	 * @generated
	 */
	EReference getCDConnectorGlue_Databaseinput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CDConnectorGlue#getDatabaseoutput <em>Databaseoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databaseoutput</em>'.
	 * @see cOSA_m1.CDConnectorGlue#getDatabaseoutput()
	 * @see #getCDConnectorGlue()
	 * @generated
	 */
	EReference getCDConnectorGlue_Databaseoutput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.CSCOnnectorGlue <em>CSC Onnector Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSC Onnector Glue</em>'.
	 * @see cOSA_m1.CSCOnnectorGlue
	 * @generated
	 */
	EClass getCSCOnnectorGlue();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CSCOnnectorGlue#getConnectionoutput <em>Connectionoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectionoutput</em>'.
	 * @see cOSA_m1.CSCOnnectorGlue#getConnectionoutput()
	 * @see #getCSCOnnectorGlue()
	 * @generated
	 */
	EReference getCSCOnnectorGlue_Connectionoutput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CSCOnnectorGlue#getConnectioninput <em>Connectioninput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectioninput</em>'.
	 * @see cOSA_m1.CSCOnnectorGlue#getConnectioninput()
	 * @see #getCSCOnnectorGlue()
	 * @generated
	 */
	EReference getCSCOnnectorGlue_Connectioninput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CSCOnnectorGlue#getSecurityinput <em>Securityinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securityinput</em>'.
	 * @see cOSA_m1.CSCOnnectorGlue#getSecurityinput()
	 * @see #getCSCOnnectorGlue()
	 * @generated
	 */
	EReference getCSCOnnectorGlue_Securityinput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.CSCOnnectorGlue#getSecurityoutput <em>Securityoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securityoutput</em>'.
	 * @see cOSA_m1.CSCOnnectorGlue#getSecurityoutput()
	 * @see #getCSCOnnectorGlue()
	 * @generated
	 */
	EReference getCSCOnnectorGlue_Securityoutput();

	/**
	 * Returns the meta object for class '{@link cOSA_m1.DSConnectorGlue <em>DS Connector Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Connector Glue</em>'.
	 * @see cOSA_m1.DSConnectorGlue
	 * @generated
	 */
	EClass getDSConnectorGlue();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DSConnectorGlue#getDatabaseinput <em>Databaseinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databaseinput</em>'.
	 * @see cOSA_m1.DSConnectorGlue#getDatabaseinput()
	 * @see #getDSConnectorGlue()
	 * @generated
	 */
	EReference getDSConnectorGlue_Databaseinput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DSConnectorGlue#getDatabaseoutput <em>Databaseoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databaseoutput</em>'.
	 * @see cOSA_m1.DSConnectorGlue#getDatabaseoutput()
	 * @see #getDSConnectorGlue()
	 * @generated
	 */
	EReference getDSConnectorGlue_Databaseoutput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DSConnectorGlue#getSecurityinput <em>Securityinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securityinput</em>'.
	 * @see cOSA_m1.DSConnectorGlue#getSecurityinput()
	 * @see #getDSConnectorGlue()
	 * @generated
	 */
	EReference getDSConnectorGlue_Securityinput();

	/**
	 * Returns the meta object for the reference '{@link cOSA_m1.DSConnectorGlue#getSecurityoutput <em>Securityoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securityoutput</em>'.
	 * @see cOSA_m1.DSConnectorGlue#getSecurityoutput()
	 * @see #getDSConnectorGlue()
	 * @generated
	 */
	EReference getDSConnectorGlue_Securityoutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	COSA_m1Factory getCOSA_m1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ClientImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Responseportrpc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__RESPONSEPORTRPC = eINSTANCE.getClient_Responseportrpc();

		/**
		 * The meta object literal for the '<em><b>Requestportrpc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__REQUESTPORTRPC = eINSTANCE.getClient_Requestportrpc();

		/**
		 * The meta object literal for the '<em><b>Configoutput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__CONFIGOUTPUT = eINSTANCE.getClient_Configoutput();

		/**
		 * The meta object literal for the '<em><b>Configinput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__CONFIGINPUT = eINSTANCE.getClient_Configinput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ResponsePortRPCImpl <em>Response Port RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ResponsePortRPCImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getResponsePortRPC()
		 * @generated
		 */
		EClass RESPONSE_PORT_RPC = eINSTANCE.getResponsePortRPC();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.RequestPortRPCImpl <em>Request Port RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.RequestPortRPCImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRequestPortRPC()
		 * @generated
		 */
		EClass REQUEST_PORT_RPC = eINSTANCE.getRequestPortRPC();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.CSConfImpl <em>CS Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.CSConfImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSConf()
		 * @generated
		 */
		EClass CS_CONF = eINSTANCE.getCSConf();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__CLIENTS = eINSTANCE.getCSConf_Clients();

		/**
		 * The meta object literal for the '<em><b>Csqueryports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__CSQUERYPORTS = eINSTANCE.getCSConf_Csqueryports();

		/**
		 * The meta object literal for the '<em><b>Csresponseports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__CSRESPONSEPORTS = eINSTANCE.getCSConf_Csresponseports();

		/**
		 * The meta object literal for the '<em><b>Rpcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__RPCS = eINSTANCE.getCSConf_Rpcs();

		/**
		 * The meta object literal for the '<em><b>Clientrpcattachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__CLIENTRPCATTACHMENT = eINSTANCE.getCSConf_Clientrpcattachment();

		/**
		 * The meta object literal for the '<em><b>Rpcclientattachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__RPCCLIENTATTACHMENT = eINSTANCE.getCSConf_Rpcclientattachment();

		/**
		 * The meta object literal for the '<em><b>Outputbindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__OUTPUTBINDINGS = eINSTANCE.getCSConf_Outputbindings();

		/**
		 * The meta object literal for the '<em><b>Inputbindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__INPUTBINDINGS = eINSTANCE.getCSConf_Inputbindings();

		/**
		 * The meta object literal for the '<em><b>Serverrpcattachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__SERVERRPCATTACHMENT = eINSTANCE.getCSConf_Serverrpcattachment();

		/**
		 * The meta object literal for the '<em><b>Rpcserverattachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__RPCSERVERATTACHMENT = eINSTANCE.getCSConf_Rpcserverattachment();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONF__SERVER = eINSTANCE.getCSConf_Server();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.CSQueryPortsImpl <em>CS Query Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.CSQueryPortsImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSQueryPorts()
		 * @generated
		 */
		EClass CS_QUERY_PORTS = eINSTANCE.getCSQueryPorts();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.CSResponsePortsImpl <em>CS Response Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.CSResponsePortsImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSResponsePorts()
		 * @generated
		 */
		EClass CS_RESPONSE_PORTS = eINSTANCE.getCSResponsePorts();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.RPCImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Clientoutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CLIENTOUTROLE = eINSTANCE.getRPC_Clientoutrole();

		/**
		 * The meta object literal for the '<em><b>Clientinrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CLIENTINROLE = eINSTANCE.getRPC_Clientinrole();

		/**
		 * The meta object literal for the '<em><b>Serverinrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__SERVERINROLE = eINSTANCE.getRPC_Serverinrole();

		/**
		 * The meta object literal for the '<em><b>Serveuroutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__SERVEUROUTROLE = eINSTANCE.getRPC_Serveuroutrole();

		/**
		 * The meta object literal for the '<em><b>Rpcglue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__RPCGLUE = eINSTANCE.getRPC_Rpcglue();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ClientOutRoleImpl <em>Client Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ClientOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClientOutRole()
		 * @generated
		 */
		EClass CLIENT_OUT_ROLE = eINSTANCE.getClientOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ClientInRoleImpl <em>Client In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ClientInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClientInRole()
		 * @generated
		 */
		EClass CLIENT_IN_ROLE = eINSTANCE.getClientInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServerInRoleImpl <em>Server In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServerInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerInRole()
		 * @generated
		 */
		EClass SERVER_IN_ROLE = eINSTANCE.getServerInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServeurOutRoleImpl <em>Serveur Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServeurOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServeurOutRole()
		 * @generated
		 */
		EClass SERVEUR_OUT_ROLE = eINSTANCE.getServeurOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ClientRpcAttachmentImpl <em>Client Rpc Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ClientRpcAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getClientRpcAttachment()
		 * @generated
		 */
		EClass CLIENT_RPC_ATTACHMENT = eINSTANCE.getClientRpcAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_RPC_ATTACHMENT__FROM = eINSTANCE.getClientRpcAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_RPC_ATTACHMENT__TO = eINSTANCE.getClientRpcAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.RpcClientAttachmentImpl <em>Rpc Client Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.RpcClientAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRpcClientAttachment()
		 * @generated
		 */
		EClass RPC_CLIENT_ATTACHMENT = eINSTANCE.getRpcClientAttachment();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_CLIENT_ATTACHMENT__TO = eINSTANCE.getRpcClientAttachment_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_CLIENT_ATTACHMENT__FROM = eINSTANCE.getRpcClientAttachment_From();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConfigInputImpl <em>Config Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConfigInputImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConfigInput()
		 * @generated
		 */
		EClass CONFIG_INPUT = eINSTANCE.getConfigInput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConfigOutputImpl <em>Config Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConfigOutputImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConfigOutput()
		 * @generated
		 */
		EClass CONFIG_OUTPUT = eINSTANCE.getConfigOutput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.InputBindingsImpl <em>Input Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.InputBindingsImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getInputBindings()
		 * @generated
		 */
		EClass INPUT_BINDINGS = eINSTANCE.getInputBindings();

		/**
		 * The meta object literal for the '<em><b>Configinput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BINDINGS__CONFIGINPUT = eINSTANCE.getInputBindings_Configinput();

		/**
		 * The meta object literal for the '<em><b>Clientinput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BINDINGS__CLIENTINPUT = eINSTANCE.getInputBindings_Clientinput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.OutputBindingsImpl <em>Output Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.OutputBindingsImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getOutputBindings()
		 * @generated
		 */
		EClass OUTPUT_BINDINGS = eINSTANCE.getOutputBindings();

		/**
		 * The meta object literal for the '<em><b>Clientoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BINDINGS__CLIENTOUTPUT = eINSTANCE.getOutputBindings_Clientoutput();

		/**
		 * The meta object literal for the '<em><b>Configoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BINDINGS__CONFIGOUTPUT = eINSTANCE.getOutputBindings_Configoutput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.RpcGlueImpl <em>Rpc Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.RpcGlueImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRpcGlue()
		 * @generated
		 */
		EClass RPC_GLUE = eINSTANCE.getRpcGlue();

		/**
		 * The meta object literal for the '<em><b>Clientout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_GLUE__CLIENTOUT = eINSTANCE.getRpcGlue_Clientout();

		/**
		 * The meta object literal for the '<em><b>Clientin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_GLUE__CLIENTIN = eINSTANCE.getRpcGlue_Clientin();

		/**
		 * The meta object literal for the '<em><b>Serverin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_GLUE__SERVERIN = eINSTANCE.getRpcGlue_Serverin();

		/**
		 * The meta object literal for the '<em><b>Serveurout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_GLUE__SERVEUROUT = eINSTANCE.getRpcGlue_Serveurout();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.RpcServerAttachmentImpl <em>Rpc Server Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.RpcServerAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getRpcServerAttachment()
		 * @generated
		 */
		EClass RPC_SERVER_ATTACHMENT = eINSTANCE.getRpcServerAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_SERVER_ATTACHMENT__FROM = eINSTANCE.getRpcServerAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_SERVER_ATTACHMENT__TO = eINSTANCE.getRpcServerAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServerRpcAttachmentImpl <em>Server Rpc Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServerRpcAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerRpcAttachment()
		 * @generated
		 */
		EClass SERVER_RPC_ATTACHMENT = eINSTANCE.getServerRpcAttachment();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_RPC_ATTACHMENT__TO = eINSTANCE.getServerRpcAttachment_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_RPC_ATTACHMENT__FROM = eINSTANCE.getServerRpcAttachment_From();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServerImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Serverinput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVERINPUT = eINSTANCE.getServer_Serverinput();

		/**
		 * The meta object literal for the '<em><b>Serverouput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVEROUPUT = eINSTANCE.getServer_Serverouput();

		/**
		 * The meta object literal for the '<em><b>Outputbinding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__OUTPUTBINDING = eINSTANCE.getServer_Outputbinding();

		/**
		 * The meta object literal for the '<em><b>Inputbinding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__INPUTBINDING = eINSTANCE.getServer_Inputbinding();

		/**
		 * The meta object literal for the '<em><b>Connectionmanager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTIONMANAGER = eINSTANCE.getServer_Connectionmanager();

		/**
		 * The meta object literal for the '<em><b>Connectordatabaseconnectionattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTORDATABASECONNECTIONATTACHMENT = eINSTANCE.getServer_Connectordatabaseconnectionattachment();

		/**
		 * The meta object literal for the '<em><b>Connectionconnectordatabaseattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT = eINSTANCE.getServer_Connectionconnectordatabaseattachment();

		/**
		 * The meta object literal for the '<em><b>Connectiondatabaseconnector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTIONDATABASECONNECTOR = eINSTANCE.getServer_Connectiondatabaseconnector();

		/**
		 * The meta object literal for the '<em><b>Databaseconnectorconnectionattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__DATABASECONNECTORCONNECTIONATTACHMENT = eINSTANCE.getServer_Databaseconnectorconnectionattachment();

		/**
		 * The meta object literal for the '<em><b>Connectorconnectiondatabaseattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT = eINSTANCE.getServer_Connectorconnectiondatabaseattachment();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__DATABASE = eINSTANCE.getServer_Database();

		/**
		 * The meta object literal for the '<em><b>Connectorsecuritydatabaseattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTORSECURITYDATABASEATTACHMENT = eINSTANCE.getServer_Connectorsecuritydatabaseattachment();

		/**
		 * The meta object literal for the '<em><b>Databaseconnectorsecurityattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__DATABASECONNECTORSECURITYATTACHMENT = eINSTANCE.getServer_Databaseconnectorsecurityattachment();

		/**
		 * The meta object literal for the '<em><b>Databasesecurityconnector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__DATABASESECURITYCONNECTOR = eINSTANCE.getServer_Databasesecurityconnector();

		/**
		 * The meta object literal for the '<em><b>Connectordatabasesecurityattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTORDATABASESECURITYATTACHMENT = eINSTANCE.getServer_Connectordatabasesecurityattachment();

		/**
		 * The meta object literal for the '<em><b>Securityconnectordatabaseattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SECURITYCONNECTORDATABASEATTACHMENT = eINSTANCE.getServer_Securityconnectordatabaseattachment();

		/**
		 * The meta object literal for the '<em><b>Securitymanager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SECURITYMANAGER = eINSTANCE.getServer_Securitymanager();

		/**
		 * The meta object literal for the '<em><b>Securityconnectorconnectionattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT = eINSTANCE.getServer_Securityconnectorconnectionattachment();

		/**
		 * The meta object literal for the '<em><b>Connectorconnectionsecurityattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT = eINSTANCE.getServer_Connectorconnectionsecurityattachment();

		/**
		 * The meta object literal for the '<em><b>Connectionsecurityconnector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTIONSECURITYCONNECTOR = eINSTANCE.getServer_Connectionsecurityconnector();

		/**
		 * The meta object literal for the '<em><b>Connectorsecurityconnectionattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT = eINSTANCE.getServer_Connectorsecurityconnectionattachment();

		/**
		 * The meta object literal for the '<em><b>Connectionconnectorsecurityattachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT = eINSTANCE.getServer_Connectionconnectorsecurityattachment();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServerInputImpl <em>Server Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServerInputImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerInput()
		 * @generated
		 */
		EClass SERVER_INPUT = eINSTANCE.getServerInput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServerOuputImpl <em>Server Ouput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServerOuputImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerOuput()
		 * @generated
		 */
		EClass SERVER_OUPUT = eINSTANCE.getServerOuput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionManagerImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '<em><b>Serverconfiginput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__SERVERCONFIGINPUT = eINSTANCE.getConnectionManager_Serverconfiginput();

		/**
		 * The meta object literal for the '<em><b>Serverconfigoutput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__SERVERCONFIGOUTPUT = eINSTANCE.getConnectionManager_Serverconfigoutput();

		/**
		 * The meta object literal for the '<em><b>Connectionoutputtosecurityport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__CONNECTIONOUTPUTTOSECURITYPORT = eINSTANCE.getConnectionManager_Connectionoutputtosecurityport();

		/**
		 * The meta object literal for the '<em><b>Connectioninputfromsecurityport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__CONNECTIONINPUTFROMSECURITYPORT = eINSTANCE.getConnectionManager_Connectioninputfromsecurityport();

		/**
		 * The meta object literal for the '<em><b>Connectioninputfromdatabaseport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__CONNECTIONINPUTFROMDATABASEPORT = eINSTANCE.getConnectionManager_Connectioninputfromdatabaseport();

		/**
		 * The meta object literal for the '<em><b>Connectionouputtodatabaseport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__CONNECTIONOUPUTTODATABASEPORT = eINSTANCE.getConnectionManager_Connectionouputtodatabaseport();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityManagerImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityManager()
		 * @generated
		 */
		EClass SECURITY_MANAGER = eINSTANCE.getSecurityManager();

		/**
		 * The meta object literal for the '<em><b>Securityinputfromconnectionport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__SECURITYINPUTFROMCONNECTIONPORT = eINSTANCE.getSecurityManager_Securityinputfromconnectionport();

		/**
		 * The meta object literal for the '<em><b>Securityouputtoconnectionport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__SECURITYOUPUTTOCONNECTIONPORT = eINSTANCE.getSecurityManager_Securityouputtoconnectionport();

		/**
		 * The meta object literal for the '<em><b>Securityoutputtodatabaseport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__SECURITYOUTPUTTODATABASEPORT = eINSTANCE.getSecurityManager_Securityoutputtodatabaseport();

		/**
		 * The meta object literal for the '<em><b>Securityinputfromdatabaseport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__SECURITYINPUTFROMDATABASEPORT = eINSTANCE.getSecurityManager_Securityinputfromdatabaseport();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DataBaseImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Databaseinputfromconnectionport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__DATABASEINPUTFROMCONNECTIONPORT = eINSTANCE.getDataBase_Databaseinputfromconnectionport();

		/**
		 * The meta object literal for the '<em><b>Databaseoutputtoconnectionport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__DATABASEOUTPUTTOCONNECTIONPORT = eINSTANCE.getDataBase_Databaseoutputtoconnectionport();

		/**
		 * The meta object literal for the '<em><b>Databaseoutputtosecurityport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__DATABASEOUTPUTTOSECURITYPORT = eINSTANCE.getDataBase_Databaseoutputtosecurityport();

		/**
		 * The meta object literal for the '<em><b>Databaseinputfromsecurityport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__DATABASEINPUTFROMSECURITYPORT = eINSTANCE.getDataBase_Databaseinputfromsecurityport();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServerConfigInputImpl <em>Server Config Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServerConfigInputImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerConfigInput()
		 * @generated
		 */
		EClass SERVER_CONFIG_INPUT = eINSTANCE.getServerConfigInput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ServerConfigOutputImpl <em>Server Config Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ServerConfigOutputImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getServerConfigOutput()
		 * @generated
		 */
		EClass SERVER_CONFIG_OUTPUT = eINSTANCE.getServerConfigOutput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.InputBindingImpl <em>Input Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.InputBindingImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getInputBinding()
		 * @generated
		 */
		EClass INPUT_BINDING = eINSTANCE.getInputBinding();

		/**
		 * The meta object literal for the '<em><b>Serverinput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BINDING__SERVERINPUT = eINSTANCE.getInputBinding_Serverinput();

		/**
		 * The meta object literal for the '<em><b>Serverconfiginput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BINDING__SERVERCONFIGINPUT = eINSTANCE.getInputBinding_Serverconfiginput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.OutputBindingImpl <em>Output Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.OutputBindingImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getOutputBinding()
		 * @generated
		 */
		EClass OUTPUT_BINDING = eINSTANCE.getOutputBinding();

		/**
		 * The meta object literal for the '<em><b>Serverconfigoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BINDING__SERVERCONFIGOUTPUT = eINSTANCE.getOutputBinding_Serverconfigoutput();

		/**
		 * The meta object literal for the '<em><b>Serverouput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BINDING__SERVEROUPUT = eINSTANCE.getOutputBinding_Serverouput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionOutputToSecurityPortImpl <em>Connection Output To Security Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionOutputToSecurityPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionOutputToSecurityPort()
		 * @generated
		 */
		EClass CONNECTION_OUTPUT_TO_SECURITY_PORT = eINSTANCE.getConnectionOutputToSecurityPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionInputFromSecurityPortImpl <em>Connection Input From Security Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionInputFromSecurityPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionInputFromSecurityPort()
		 * @generated
		 */
		EClass CONNECTION_INPUT_FROM_SECURITY_PORT = eINSTANCE.getConnectionInputFromSecurityPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionOuputToDataBasePortImpl <em>Connection Ouput To Data Base Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionOuputToDataBasePortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionOuputToDataBasePort()
		 * @generated
		 */
		EClass CONNECTION_OUPUT_TO_DATA_BASE_PORT = eINSTANCE.getConnectionOuputToDataBasePort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionInputFromDataBasePortImpl <em>Connection Input From Data Base Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionInputFromDataBasePortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionInputFromDataBasePort()
		 * @generated
		 */
		EClass CONNECTION_INPUT_FROM_DATA_BASE_PORT = eINSTANCE.getConnectionInputFromDataBasePort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionDatabaseConnectorImpl <em>Connection Database Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionDatabaseConnectorImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionDatabaseConnector()
		 * @generated
		 */
		EClass CONNECTION_DATABASE_CONNECTOR = eINSTANCE.getConnectionDatabaseConnector();

		/**
		 * The meta object literal for the '<em><b>Connectiondbinrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBINROLE = eINSTANCE.getConnectionDatabaseConnector_Connectiondbinrole();

		/**
		 * The meta object literal for the '<em><b>Dbconnectionoutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONOUTROLE = eINSTANCE.getConnectionDatabaseConnector_Dbconnectionoutrole();

		/**
		 * The meta object literal for the '<em><b>Connectiondboutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_DATABASE_CONNECTOR__CONNECTIONDBOUTROLE = eINSTANCE.getConnectionDatabaseConnector_Connectiondboutrole();

		/**
		 * The meta object literal for the '<em><b>Dbconnectioninrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_DATABASE_CONNECTOR__DBCONNECTIONINROLE = eINSTANCE.getConnectionDatabaseConnector_Dbconnectioninrole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DBConnectionOutRoleImpl <em>DB Connection Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DBConnectionOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDBConnectionOutRole()
		 * @generated
		 */
		EClass DB_CONNECTION_OUT_ROLE = eINSTANCE.getDBConnectionOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionDBInRoleImpl <em>Connection DB In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionDBInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionDBInRole()
		 * @generated
		 */
		EClass CONNECTION_DB_IN_ROLE = eINSTANCE.getConnectionDBInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionConnectorDatabaseAttachmentImpl <em>Connection Connector Database Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionConnectorDatabaseAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionConnectorDatabaseAttachment()
		 * @generated
		 */
		EClass CONNECTION_CONNECTOR_DATABASE_ATTACHMENT = eINSTANCE.getConnectionConnectorDatabaseAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM = eINSTANCE.getConnectionConnectorDatabaseAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO = eINSTANCE.getConnectionConnectorDatabaseAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectorDatabaseConnectionAttachmentImpl <em>Connector Database Connection Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectorDatabaseConnectionAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorDatabaseConnectionAttachment()
		 * @generated
		 */
		EClass CONNECTOR_DATABASE_CONNECTION_ATTACHMENT = eINSTANCE.getConnectorDatabaseConnectionAttachment();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__TO = eINSTANCE.getConnectorDatabaseConnectionAttachment_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_DATABASE_CONNECTION_ATTACHMENT__FROM = eINSTANCE.getConnectorDatabaseConnectionAttachment_From();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionDBOutRoleImpl <em>Connection DB Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionDBOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionDBOutRole()
		 * @generated
		 */
		EClass CONNECTION_DB_OUT_ROLE = eINSTANCE.getConnectionDBOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DBConnectionInRoleImpl <em>DB Connection In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DBConnectionInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDBConnectionInRole()
		 * @generated
		 */
		EClass DB_CONNECTION_IN_ROLE = eINSTANCE.getDBConnectionInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectorConnectionDatabaseAttachmentImpl <em>Connector Connection Database Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectorConnectionDatabaseAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorConnectionDatabaseAttachment()
		 * @generated
		 */
		EClass CONNECTOR_CONNECTION_DATABASE_ATTACHMENT = eINSTANCE.getConnectorConnectionDatabaseAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__FROM = eINSTANCE.getConnectorConnectionDatabaseAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_CONNECTION_DATABASE_ATTACHMENT__TO = eINSTANCE.getConnectorConnectionDatabaseAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseConnectorConnectionAttachmentImpl <em>Database Connector Connection Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseConnectorConnectionAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseConnectorConnectionAttachment()
		 * @generated
		 */
		EClass DATABASE_CONNECTOR_CONNECTION_ATTACHMENT = eINSTANCE.getDatabaseConnectorConnectionAttachment();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__TO = eINSTANCE.getDatabaseConnectorConnectionAttachment_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONNECTOR_CONNECTION_ATTACHMENT__FROM = eINSTANCE.getDatabaseConnectorConnectionAttachment_From();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseInputFromConnectionPortImpl <em>Database Input From Connection Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseInputFromConnectionPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseInputFromConnectionPort()
		 * @generated
		 */
		EClass DATABASE_INPUT_FROM_CONNECTION_PORT = eINSTANCE.getDatabaseInputFromConnectionPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseOutputToConnectionPortImpl <em>Database Output To Connection Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseOutputToConnectionPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseOutputToConnectionPort()
		 * @generated
		 */
		EClass DATABASE_OUTPUT_TO_CONNECTION_PORT = eINSTANCE.getDatabaseOutputToConnectionPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionSecurityConnectorImpl <em>Connection Security Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionSecurityConnectorImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionSecurityConnector()
		 * @generated
		 */
		EClass CONNECTION_SECURITY_CONNECTOR = eINSTANCE.getConnectionSecurityConnector();

		/**
		 * The meta object literal for the '<em><b>Connectionsecurityinrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYINROLE = eINSTANCE.getConnectionSecurityConnector_Connectionsecurityinrole();

		/**
		 * The meta object literal for the '<em><b>Securityconnectionoutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONOUTROLE = eINSTANCE.getConnectionSecurityConnector_Securityconnectionoutrole();

		/**
		 * The meta object literal for the '<em><b>Connectionsecurityoutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_SECURITY_CONNECTOR__CONNECTIONSECURITYOUTROLE = eINSTANCE.getConnectionSecurityConnector_Connectionsecurityoutrole();

		/**
		 * The meta object literal for the '<em><b>Securityconnectioninrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_SECURITY_CONNECTOR__SECURITYCONNECTIONINROLE = eINSTANCE.getConnectionSecurityConnector_Securityconnectioninrole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionSecurityInRoleImpl <em>Connection Security In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionSecurityInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionSecurityInRole()
		 * @generated
		 */
		EClass CONNECTION_SECURITY_IN_ROLE = eINSTANCE.getConnectionSecurityInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionSecurityOutRoleImpl <em>Connection Security Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionSecurityOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionSecurityOutRole()
		 * @generated
		 */
		EClass CONNECTION_SECURITY_OUT_ROLE = eINSTANCE.getConnectionSecurityOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityConnectionOutRoleImpl <em>Security Connection Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityConnectionOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectionOutRole()
		 * @generated
		 */
		EClass SECURITY_CONNECTION_OUT_ROLE = eINSTANCE.getSecurityConnectionOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityConnectionInRoleImpl <em>Security Connection In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityConnectionInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectionInRole()
		 * @generated
		 */
		EClass SECURITY_CONNECTION_IN_ROLE = eINSTANCE.getSecurityConnectionInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectionConnectorSecurityAttachmentImpl <em>Connection Connector Security Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectionConnectorSecurityAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectionConnectorSecurityAttachment()
		 * @generated
		 */
		EClass CONNECTION_CONNECTOR_SECURITY_ATTACHMENT = eINSTANCE.getConnectionConnectorSecurityAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM = eINSTANCE.getConnectionConnectorSecurityAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO = eINSTANCE.getConnectionConnectorSecurityAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectorSecurityConnectionAttachmentImpl <em>Connector Security Connection Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectorSecurityConnectionAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorSecurityConnectionAttachment()
		 * @generated
		 */
		EClass CONNECTOR_SECURITY_CONNECTION_ATTACHMENT = eINSTANCE.getConnectorSecurityConnectionAttachment();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO = eINSTANCE.getConnectorSecurityConnectionAttachment_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM = eINSTANCE.getConnectorSecurityConnectionAttachment_From();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityInputFromConnectionPortImpl <em>Security Input From Connection Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityInputFromConnectionPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityInputFromConnectionPort()
		 * @generated
		 */
		EClass SECURITY_INPUT_FROM_CONNECTION_PORT = eINSTANCE.getSecurityInputFromConnectionPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityOuputToConnectionPortImpl <em>Security Ouput To Connection Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityOuputToConnectionPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityOuputToConnectionPort()
		 * @generated
		 */
		EClass SECURITY_OUPUT_TO_CONNECTION_PORT = eINSTANCE.getSecurityOuputToConnectionPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectorConnectionSecurityAttachmentImpl <em>Connector Connection Security Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectorConnectionSecurityAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorConnectionSecurityAttachment()
		 * @generated
		 */
		EClass CONNECTOR_CONNECTION_SECURITY_ATTACHMENT = eINSTANCE.getConnectorConnectionSecurityAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__FROM = eINSTANCE.getConnectorConnectionSecurityAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_CONNECTION_SECURITY_ATTACHMENT__TO = eINSTANCE.getConnectorConnectionSecurityAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityConnectorConnectionAttachmentImpl <em>Security Connector Connection Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityConnectorConnectionAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectorConnectionAttachment()
		 * @generated
		 */
		EClass SECURITY_CONNECTOR_CONNECTION_ATTACHMENT = eINSTANCE.getSecurityConnectorConnectionAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM = eINSTANCE.getSecurityConnectorConnectionAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO = eINSTANCE.getSecurityConnectorConnectionAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseOutputToSecurityPortImpl <em>Database Output To Security Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseOutputToSecurityPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseOutputToSecurityPort()
		 * @generated
		 */
		EClass DATABASE_OUTPUT_TO_SECURITY_PORT = eINSTANCE.getDatabaseOutputToSecurityPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseInputFromSecurityPortImpl <em>Database Input From Security Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseInputFromSecurityPortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseInputFromSecurityPort()
		 * @generated
		 */
		EClass DATABASE_INPUT_FROM_SECURITY_PORT = eINSTANCE.getDatabaseInputFromSecurityPort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityOutputToDatabasePortImpl <em>Security Output To Database Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityOutputToDatabasePortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityOutputToDatabasePort()
		 * @generated
		 */
		EClass SECURITY_OUTPUT_TO_DATABASE_PORT = eINSTANCE.getSecurityOutputToDatabasePort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityInputFromDatabasePortImpl <em>Security Input From Database Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityInputFromDatabasePortImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityInputFromDatabasePort()
		 * @generated
		 */
		EClass SECURITY_INPUT_FROM_DATABASE_PORT = eINSTANCE.getSecurityInputFromDatabasePort();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseSecurityConnectorImpl <em>Database Security Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseSecurityConnectorImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseSecurityConnector()
		 * @generated
		 */
		EClass DATABASE_SECURITY_CONNECTOR = eINSTANCE.getDatabaseSecurityConnector();

		/**
		 * The meta object literal for the '<em><b>Decuritydatabaseoutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_SECURITY_CONNECTOR__DECURITYDATABASEOUTROLE = eINSTANCE.getDatabaseSecurityConnector_Decuritydatabaseoutrole();

		/**
		 * The meta object literal for the '<em><b>Databasesecurityinrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_SECURITY_CONNECTOR__DATABASESECURITYINROLE = eINSTANCE.getDatabaseSecurityConnector_Databasesecurityinrole();

		/**
		 * The meta object literal for the '<em><b>Securitydatabaseinrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_SECURITY_CONNECTOR__SECURITYDATABASEINROLE = eINSTANCE.getDatabaseSecurityConnector_Securitydatabaseinrole();

		/**
		 * The meta object literal for the '<em><b>Databasesecurityoutrole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_SECURITY_CONNECTOR__DATABASESECURITYOUTROLE = eINSTANCE.getDatabaseSecurityConnector_Databasesecurityoutrole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseSecurityInRoleImpl <em>Database Security In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseSecurityInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseSecurityInRole()
		 * @generated
		 */
		EClass DATABASE_SECURITY_IN_ROLE = eINSTANCE.getDatabaseSecurityInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DecurityDatabaseOutRoleImpl <em>Decurity Database Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DecurityDatabaseOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDecurityDatabaseOutRole()
		 * @generated
		 */
		EClass DECURITY_DATABASE_OUT_ROLE = eINSTANCE.getDecurityDatabaseOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityDatabaseInRoleImpl <em>Security Database In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityDatabaseInRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityDatabaseInRole()
		 * @generated
		 */
		EClass SECURITY_DATABASE_IN_ROLE = eINSTANCE.getSecurityDatabaseInRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseSecurityOutRoleImpl <em>Database Security Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseSecurityOutRoleImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseSecurityOutRole()
		 * @generated
		 */
		EClass DATABASE_SECURITY_OUT_ROLE = eINSTANCE.getDatabaseSecurityOutRole();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DatabaseConnectorSecurityAttachmentImpl <em>Database Connector Security Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DatabaseConnectorSecurityAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDatabaseConnectorSecurityAttachment()
		 * @generated
		 */
		EClass DATABASE_CONNECTOR_SECURITY_ATTACHMENT = eINSTANCE.getDatabaseConnectorSecurityAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM = eINSTANCE.getDatabaseConnectorSecurityAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO = eINSTANCE.getDatabaseConnectorSecurityAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectorSecurityDatabaseAttachmentImpl <em>Connector Security Database Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectorSecurityDatabaseAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorSecurityDatabaseAttachment()
		 * @generated
		 */
		EClass CONNECTOR_SECURITY_DATABASE_ATTACHMENT = eINSTANCE.getConnectorSecurityDatabaseAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SECURITY_DATABASE_ATTACHMENT__FROM = eINSTANCE.getConnectorSecurityDatabaseAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SECURITY_DATABASE_ATTACHMENT__TO = eINSTANCE.getConnectorSecurityDatabaseAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.SecurityConnectorDatabaseAttachmentImpl <em>Security Connector Database Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.SecurityConnectorDatabaseAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getSecurityConnectorDatabaseAttachment()
		 * @generated
		 */
		EClass SECURITY_CONNECTOR_DATABASE_ATTACHMENT = eINSTANCE.getSecurityConnectorDatabaseAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONNECTOR_DATABASE_ATTACHMENT__FROM = eINSTANCE.getSecurityConnectorDatabaseAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONNECTOR_DATABASE_ATTACHMENT__TO = eINSTANCE.getSecurityConnectorDatabaseAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.ConnectorDatabaseSecurityAttachmentImpl <em>Connector Database Security Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.ConnectorDatabaseSecurityAttachmentImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getConnectorDatabaseSecurityAttachment()
		 * @generated
		 */
		EClass CONNECTOR_DATABASE_SECURITY_ATTACHMENT = eINSTANCE.getConnectorDatabaseSecurityAttachment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM = eINSTANCE.getConnectorDatabaseSecurityAttachment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO = eINSTANCE.getConnectorDatabaseSecurityAttachment_To();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.CDConnectorGlueImpl <em>CD Connector Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.CDConnectorGlueImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCDConnectorGlue()
		 * @generated
		 */
		EClass CD_CONNECTOR_GLUE = eINSTANCE.getCDConnectorGlue();

		/**
		 * The meta object literal for the '<em><b>Connectionoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_CONNECTOR_GLUE__CONNECTIONOUTPUT = eINSTANCE.getCDConnectorGlue_Connectionoutput();

		/**
		 * The meta object literal for the '<em><b>Connectioninput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_CONNECTOR_GLUE__CONNECTIONINPUT = eINSTANCE.getCDConnectorGlue_Connectioninput();

		/**
		 * The meta object literal for the '<em><b>Databaseinput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_CONNECTOR_GLUE__DATABASEINPUT = eINSTANCE.getCDConnectorGlue_Databaseinput();

		/**
		 * The meta object literal for the '<em><b>Databaseoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_CONNECTOR_GLUE__DATABASEOUTPUT = eINSTANCE.getCDConnectorGlue_Databaseoutput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.CSCOnnectorGlueImpl <em>CSC Onnector Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.CSCOnnectorGlueImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getCSCOnnectorGlue()
		 * @generated
		 */
		EClass CSC_ONNECTOR_GLUE = eINSTANCE.getCSCOnnectorGlue();

		/**
		 * The meta object literal for the '<em><b>Connectionoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSC_ONNECTOR_GLUE__CONNECTIONOUTPUT = eINSTANCE.getCSCOnnectorGlue_Connectionoutput();

		/**
		 * The meta object literal for the '<em><b>Connectioninput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSC_ONNECTOR_GLUE__CONNECTIONINPUT = eINSTANCE.getCSCOnnectorGlue_Connectioninput();

		/**
		 * The meta object literal for the '<em><b>Securityinput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSC_ONNECTOR_GLUE__SECURITYINPUT = eINSTANCE.getCSCOnnectorGlue_Securityinput();

		/**
		 * The meta object literal for the '<em><b>Securityoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSC_ONNECTOR_GLUE__SECURITYOUTPUT = eINSTANCE.getCSCOnnectorGlue_Securityoutput();

		/**
		 * The meta object literal for the '{@link cOSA_m1.impl.DSConnectorGlueImpl <em>DS Connector Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA_m1.impl.DSConnectorGlueImpl
		 * @see cOSA_m1.impl.COSA_m1PackageImpl#getDSConnectorGlue()
		 * @generated
		 */
		EClass DS_CONNECTOR_GLUE = eINSTANCE.getDSConnectorGlue();

		/**
		 * The meta object literal for the '<em><b>Databaseinput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_CONNECTOR_GLUE__DATABASEINPUT = eINSTANCE.getDSConnectorGlue_Databaseinput();

		/**
		 * The meta object literal for the '<em><b>Databaseoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_CONNECTOR_GLUE__DATABASEOUTPUT = eINSTANCE.getDSConnectorGlue_Databaseoutput();

		/**
		 * The meta object literal for the '<em><b>Securityinput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_CONNECTOR_GLUE__SECURITYINPUT = eINSTANCE.getDSConnectorGlue_Securityinput();

		/**
		 * The meta object literal for the '<em><b>Securityoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_CONNECTOR_GLUE__SECURITYOUTPUT = eINSTANCE.getDSConnectorGlue_Securityoutput();

	}

} //COSA_m1Package
