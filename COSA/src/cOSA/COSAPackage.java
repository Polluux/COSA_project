/**
 */
package cOSA;

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
 * @see cOSA.COSAFactory
 * @model kind="package"
 * @generated
 */
public interface COSAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cOSA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cOSA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cOSA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	COSAPackage eINSTANCE = cOSA.impl.COSAPackageImpl.init();

	/**
	 * The meta object id for the '{@link cOSA.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ElementImpl
	 * @see cOSA.impl.COSAPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ConfigurationImpl
	 * @see cOSA.impl.COSAPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ICONFIGURATION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Biding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BIDING = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ConnecteurImpl <em>Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ConnecteurImpl
	 * @see cOSA.impl.COSAPackageImpl#getConnecteur()
	 * @generated
	 */
	int CONNECTEUR = 2;

	/**
	 * The feature id for the '<em><b>Interfaceconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__INTERFACECONNECT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__GLUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ComposantImpl
	 * @see cOSA.impl.COSAPackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 3;

	/**
	 * The feature id for the '<em><b>Interfacecompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__INTERFACECOMPO = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.AttachementImpl <em>Attachement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.AttachementImpl
	 * @see cOSA.impl.COSAPackageImpl#getAttachement()
	 * @generated
	 */
	int ATTACHEMENT = 4;

	/**
	 * The number of structural features of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.InterfaceConfig <em>Interface Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.InterfaceConfig
	 * @see cOSA.impl.COSAPackageImpl#getInterfaceConfig()
	 * @generated
	 */
	int INTERFACE_CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Interface Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cOSA.InterfaceCompo <em>Interface Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.InterfaceCompo
	 * @see cOSA.impl.COSAPackageImpl#getInterfaceCompo()
	 * @generated
	 */
	int INTERFACE_COMPO = 6;

	/**
	 * The number of structural features of the '<em>Interface Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cOSA.InterfaceConnect <em>Interface Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.InterfaceConnect
	 * @see cOSA.impl.COSAPackageImpl#getInterfaceConnect()
	 * @generated
	 */
	int INTERFACE_CONNECT = 7;

	/**
	 * The number of structural features of the '<em>Interface Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.GlueImpl
	 * @see cOSA.impl.COSAPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 8;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__PROVIDEDROLE = 0;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__REQUIREDROLE = 1;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.RoleImpl
	 * @see cOSA.impl.COSAPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 9;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = INTERFACE_CONNECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = INTERFACE_CONNECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ProvidedRoleImpl
	 * @see cOSA.impl.COSAPackageImpl#getProvidedRole()
	 * @generated
	 */
	int PROVIDED_ROLE = 10;

	/**
	 * The number of structural features of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.RequiredRoleImpl <em>Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.RequiredRoleImpl
	 * @see cOSA.impl.COSAPackageImpl#getRequiredRole()
	 * @generated
	 */
	int REQUIRED_ROLE = 11;

	/**
	 * The number of structural features of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.PortImpl
	 * @see cOSA.impl.COSAPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 12;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERFACE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERFACE_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ServiceImpl
	 * @see cOSA.impl.COSAPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 13;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = INTERFACE_COMPO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = INTERFACE_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.RequiredPortImpl <em>Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.RequiredPortImpl
	 * @see cOSA.impl.COSAPackageImpl#getRequiredPort()
	 * @generated
	 */
	int REQUIRED_PORT = 14;

	/**
	 * The number of structural features of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ProvidedPortImpl
	 * @see cOSA.impl.COSAPackageImpl#getProvidedPort()
	 * @generated
	 */
	int PROVIDED_PORT = 15;

	/**
	 * The number of structural features of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.RequiredServiceImpl <em>Required Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.RequiredServiceImpl
	 * @see cOSA.impl.COSAPackageImpl#getRequiredService()
	 * @generated
	 */
	int REQUIRED_SERVICE = 16;

	/**
	 * The number of structural features of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ProvidedServiceImpl
	 * @see cOSA.impl.COSAPackageImpl#getProvidedService()
	 * @generated
	 */
	int PROVIDED_SERVICE = 17;

	/**
	 * The number of structural features of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.AComposantConnecteurImpl <em>AComposant Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.AComposantConnecteurImpl
	 * @see cOSA.impl.COSAPackageImpl#getAComposantConnecteur()
	 * @generated
	 */
	int ACOMPOSANT_CONNECTEUR = 18;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPOSANT_CONNECTEUR__PROVIDEDPORT = ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE = ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPOSANT_CONNECTEUR__REQUIREDROLE = ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AComposant Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPOSANT_CONNECTEUR_FEATURE_COUNT = ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>AComposant Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPOSANT_CONNECTEUR_OPERATION_COUNT = ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.AConnecteurComposantImpl <em>AConnecteur Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.AConnecteurComposantImpl
	 * @see cOSA.impl.COSAPackageImpl#getAConnecteurComposant()
	 * @generated
	 */
	int ACONNECTEUR_COMPOSANT = 19;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTEUR_COMPOSANT__REQUIREDPORT = ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requiredservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTEUR_COMPOSANT__REQUIREDSERVICE = ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTEUR_COMPOSANT__PROVIDEDROLE = ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AConnecteur Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTEUR_COMPOSANT_FEATURE_COUNT = ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>AConnecteur Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTEUR_COMPOSANT_OPERATION_COUNT = ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.BindingImpl
	 * @see cOSA.impl.COSAPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 22;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.ProvidedBindingImpl <em>Provided Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.ProvidedBindingImpl
	 * @see cOSA.impl.COSAPackageImpl#getProvidedBinding()
	 * @generated
	 */
	int PROVIDED_BINDING = 20;

	/**
	 * The feature id for the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_BINDING__COMPONENT_PORT = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_BINDING__CONFIG_PORT = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provided Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_BINDING_OPERATION_COUNT = BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cOSA.impl.RequiredBindingImpl <em>Required Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cOSA.impl.RequiredBindingImpl
	 * @see cOSA.impl.COSAPackageImpl#getRequiredBinding()
	 * @generated
	 */
	int REQUIRED_BINDING = 21;

	/**
	 * The feature id for the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BINDING__CONFIG_PORT = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BINDING__COMPONENT_PORT = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Required Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Required Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BINDING_OPERATION_COUNT = BINDING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cOSA.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see cOSA.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA.Configuration#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see cOSA.Configuration#getElement()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA.Configuration#getIconfiguration <em>Iconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iconfiguration</em>'.
	 * @see cOSA.Configuration#getIconfiguration()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Iconfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA.Configuration#getBiding <em>Biding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Biding</em>'.
	 * @see cOSA.Configuration#getBiding()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Biding();

	/**
	 * Returns the meta object for class '{@link cOSA.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see cOSA.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link cOSA.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur</em>'.
	 * @see cOSA.Connecteur
	 * @generated
	 */
	EClass getConnecteur();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA.Connecteur#getInterfaceconnect <em>Interfaceconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceconnect</em>'.
	 * @see cOSA.Connecteur#getInterfaceconnect()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Interfaceconnect();

	/**
	 * Returns the meta object for the containment reference '{@link cOSA.Connecteur#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glue</em>'.
	 * @see cOSA.Connecteur#getGlue()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Glue();

	/**
	 * Returns the meta object for class '{@link cOSA.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see cOSA.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the containment reference list '{@link cOSA.Composant#getInterfacecompo <em>Interfacecompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacecompo</em>'.
	 * @see cOSA.Composant#getInterfacecompo()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Interfacecompo();

	/**
	 * Returns the meta object for class '{@link cOSA.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement</em>'.
	 * @see cOSA.Attachement
	 * @generated
	 */
	EClass getAttachement();

	/**
	 * Returns the meta object for class '{@link cOSA.InterfaceConfig <em>Interface Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Config</em>'.
	 * @see cOSA.InterfaceConfig
	 * @generated
	 */
	EClass getInterfaceConfig();

	/**
	 * Returns the meta object for class '{@link cOSA.InterfaceCompo <em>Interface Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Compo</em>'.
	 * @see cOSA.InterfaceCompo
	 * @generated
	 */
	EClass getInterfaceCompo();

	/**
	 * Returns the meta object for class '{@link cOSA.InterfaceConnect <em>Interface Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connect</em>'.
	 * @see cOSA.InterfaceConnect
	 * @generated
	 */
	EClass getInterfaceConnect();

	/**
	 * Returns the meta object for class '{@link cOSA.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see cOSA.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.Glue#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providedrole</em>'.
	 * @see cOSA.Glue#getProvidedrole()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_Providedrole();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.Glue#getRequiredrole <em>Requiredrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requiredrole</em>'.
	 * @see cOSA.Glue#getRequiredrole()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_Requiredrole();

	/**
	 * Returns the meta object for class '{@link cOSA.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cOSA.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link cOSA.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Role</em>'.
	 * @see cOSA.ProvidedRole
	 * @generated
	 */
	EClass getProvidedRole();

	/**
	 * Returns the meta object for class '{@link cOSA.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Role</em>'.
	 * @see cOSA.RequiredRole
	 * @generated
	 */
	EClass getRequiredRole();

	/**
	 * Returns the meta object for class '{@link cOSA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see cOSA.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link cOSA.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see cOSA.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link cOSA.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port</em>'.
	 * @see cOSA.RequiredPort
	 * @generated
	 */
	EClass getRequiredPort();

	/**
	 * Returns the meta object for class '{@link cOSA.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port</em>'.
	 * @see cOSA.ProvidedPort
	 * @generated
	 */
	EClass getProvidedPort();

	/**
	 * Returns the meta object for class '{@link cOSA.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Service</em>'.
	 * @see cOSA.RequiredService
	 * @generated
	 */
	EClass getRequiredService();

	/**
	 * Returns the meta object for class '{@link cOSA.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Service</em>'.
	 * @see cOSA.ProvidedService
	 * @generated
	 */
	EClass getProvidedService();

	/**
	 * Returns the meta object for class '{@link cOSA.AComposantConnecteur <em>AComposant Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AComposant Connecteur</em>'.
	 * @see cOSA.AComposantConnecteur
	 * @generated
	 */
	EClass getAComposantConnecteur();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.AComposantConnecteur#getProvidedport <em>Providedport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providedport</em>'.
	 * @see cOSA.AComposantConnecteur#getProvidedport()
	 * @see #getAComposantConnecteur()
	 * @generated
	 */
	EReference getAComposantConnecteur_Providedport();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.AComposantConnecteur#getProvidedservice <em>Providedservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providedservice</em>'.
	 * @see cOSA.AComposantConnecteur#getProvidedservice()
	 * @see #getAComposantConnecteur()
	 * @generated
	 */
	EReference getAComposantConnecteur_Providedservice();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.AComposantConnecteur#getRequiredrole <em>Requiredrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requiredrole</em>'.
	 * @see cOSA.AComposantConnecteur#getRequiredrole()
	 * @see #getAComposantConnecteur()
	 * @generated
	 */
	EReference getAComposantConnecteur_Requiredrole();

	/**
	 * Returns the meta object for class '{@link cOSA.AConnecteurComposant <em>AConnecteur Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AConnecteur Composant</em>'.
	 * @see cOSA.AConnecteurComposant
	 * @generated
	 */
	EClass getAConnecteurComposant();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.AConnecteurComposant#getRequiredport <em>Requiredport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requiredport</em>'.
	 * @see cOSA.AConnecteurComposant#getRequiredport()
	 * @see #getAConnecteurComposant()
	 * @generated
	 */
	EReference getAConnecteurComposant_Requiredport();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.AConnecteurComposant#getRequiredservice <em>Requiredservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requiredservice</em>'.
	 * @see cOSA.AConnecteurComposant#getRequiredservice()
	 * @see #getAConnecteurComposant()
	 * @generated
	 */
	EReference getAConnecteurComposant_Requiredservice();

	/**
	 * Returns the meta object for the reference list '{@link cOSA.AConnecteurComposant#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providedrole</em>'.
	 * @see cOSA.AConnecteurComposant#getProvidedrole()
	 * @see #getAConnecteurComposant()
	 * @generated
	 */
	EReference getAConnecteurComposant_Providedrole();

	/**
	 * Returns the meta object for class '{@link cOSA.ProvidedBinding <em>Provided Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Binding</em>'.
	 * @see cOSA.ProvidedBinding
	 * @generated
	 */
	EClass getProvidedBinding();

	/**
	 * Returns the meta object for the reference '{@link cOSA.ProvidedBinding#getComponentPort <em>Component Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Port</em>'.
	 * @see cOSA.ProvidedBinding#getComponentPort()
	 * @see #getProvidedBinding()
	 * @generated
	 */
	EReference getProvidedBinding_ComponentPort();

	/**
	 * Returns the meta object for the reference '{@link cOSA.ProvidedBinding#getConfigPort <em>Config Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Port</em>'.
	 * @see cOSA.ProvidedBinding#getConfigPort()
	 * @see #getProvidedBinding()
	 * @generated
	 */
	EReference getProvidedBinding_ConfigPort();

	/**
	 * Returns the meta object for class '{@link cOSA.RequiredBinding <em>Required Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Binding</em>'.
	 * @see cOSA.RequiredBinding
	 * @generated
	 */
	EClass getRequiredBinding();

	/**
	 * Returns the meta object for the reference '{@link cOSA.RequiredBinding#getConfigPort <em>Config Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Port</em>'.
	 * @see cOSA.RequiredBinding#getConfigPort()
	 * @see #getRequiredBinding()
	 * @generated
	 */
	EReference getRequiredBinding_ConfigPort();

	/**
	 * Returns the meta object for the reference '{@link cOSA.RequiredBinding#getComponentPort <em>Component Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Port</em>'.
	 * @see cOSA.RequiredBinding#getComponentPort()
	 * @see #getRequiredBinding()
	 * @generated
	 */
	EReference getRequiredBinding_ComponentPort();

	/**
	 * Returns the meta object for class '{@link cOSA.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see cOSA.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	COSAFactory getCOSAFactory();

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
		 * The meta object literal for the '{@link cOSA.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ConfigurationImpl
		 * @see cOSA.impl.COSAPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ELEMENT = eINSTANCE.getConfiguration_Element();

		/**
		 * The meta object literal for the '<em><b>Iconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ICONFIGURATION = eINSTANCE.getConfiguration_Iconfiguration();

		/**
		 * The meta object literal for the '<em><b>Biding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BIDING = eINSTANCE.getConfiguration_Biding();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ElementImpl
		 * @see cOSA.impl.COSAPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ConnecteurImpl <em>Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ConnecteurImpl
		 * @see cOSA.impl.COSAPackageImpl#getConnecteur()
		 * @generated
		 */
		EClass CONNECTEUR = eINSTANCE.getConnecteur();

		/**
		 * The meta object literal for the '<em><b>Interfaceconnect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__INTERFACECONNECT = eINSTANCE.getConnecteur_Interfaceconnect();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__GLUE = eINSTANCE.getConnecteur_Glue();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ComposantImpl
		 * @see cOSA.impl.COSAPackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Interfacecompo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__INTERFACECOMPO = eINSTANCE.getComposant_Interfacecompo();

		/**
		 * The meta object literal for the '{@link cOSA.impl.AttachementImpl <em>Attachement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.AttachementImpl
		 * @see cOSA.impl.COSAPackageImpl#getAttachement()
		 * @generated
		 */
		EClass ATTACHEMENT = eINSTANCE.getAttachement();

		/**
		 * The meta object literal for the '{@link cOSA.InterfaceConfig <em>Interface Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.InterfaceConfig
		 * @see cOSA.impl.COSAPackageImpl#getInterfaceConfig()
		 * @generated
		 */
		EClass INTERFACE_CONFIG = eINSTANCE.getInterfaceConfig();

		/**
		 * The meta object literal for the '{@link cOSA.InterfaceCompo <em>Interface Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.InterfaceCompo
		 * @see cOSA.impl.COSAPackageImpl#getInterfaceCompo()
		 * @generated
		 */
		EClass INTERFACE_COMPO = eINSTANCE.getInterfaceCompo();

		/**
		 * The meta object literal for the '{@link cOSA.InterfaceConnect <em>Interface Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.InterfaceConnect
		 * @see cOSA.impl.COSAPackageImpl#getInterfaceConnect()
		 * @generated
		 */
		EClass INTERFACE_CONNECT = eINSTANCE.getInterfaceConnect();

		/**
		 * The meta object literal for the '{@link cOSA.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.GlueImpl
		 * @see cOSA.impl.COSAPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__PROVIDEDROLE = eINSTANCE.getGlue_Providedrole();

		/**
		 * The meta object literal for the '<em><b>Requiredrole</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__REQUIREDROLE = eINSTANCE.getGlue_Requiredrole();

		/**
		 * The meta object literal for the '{@link cOSA.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.RoleImpl
		 * @see cOSA.impl.COSAPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ProvidedRoleImpl
		 * @see cOSA.impl.COSAPackageImpl#getProvidedRole()
		 * @generated
		 */
		EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

		/**
		 * The meta object literal for the '{@link cOSA.impl.RequiredRoleImpl <em>Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.RequiredRoleImpl
		 * @see cOSA.impl.COSAPackageImpl#getRequiredRole()
		 * @generated
		 */
		EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

		/**
		 * The meta object literal for the '{@link cOSA.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.PortImpl
		 * @see cOSA.impl.COSAPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ServiceImpl
		 * @see cOSA.impl.COSAPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link cOSA.impl.RequiredPortImpl <em>Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.RequiredPortImpl
		 * @see cOSA.impl.COSAPackageImpl#getRequiredPort()
		 * @generated
		 */
		EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ProvidedPortImpl
		 * @see cOSA.impl.COSAPackageImpl#getProvidedPort()
		 * @generated
		 */
		EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

		/**
		 * The meta object literal for the '{@link cOSA.impl.RequiredServiceImpl <em>Required Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.RequiredServiceImpl
		 * @see cOSA.impl.COSAPackageImpl#getRequiredService()
		 * @generated
		 */
		EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ProvidedServiceImpl
		 * @see cOSA.impl.COSAPackageImpl#getProvidedService()
		 * @generated
		 */
		EClass PROVIDED_SERVICE = eINSTANCE.getProvidedService();

		/**
		 * The meta object literal for the '{@link cOSA.impl.AComposantConnecteurImpl <em>AComposant Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.AComposantConnecteurImpl
		 * @see cOSA.impl.COSAPackageImpl#getAComposantConnecteur()
		 * @generated
		 */
		EClass ACOMPOSANT_CONNECTEUR = eINSTANCE.getAComposantConnecteur();

		/**
		 * The meta object literal for the '<em><b>Providedport</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOMPOSANT_CONNECTEUR__PROVIDEDPORT = eINSTANCE.getAComposantConnecteur_Providedport();

		/**
		 * The meta object literal for the '<em><b>Providedservice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE = eINSTANCE.getAComposantConnecteur_Providedservice();

		/**
		 * The meta object literal for the '<em><b>Requiredrole</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOMPOSANT_CONNECTEUR__REQUIREDROLE = eINSTANCE.getAComposantConnecteur_Requiredrole();

		/**
		 * The meta object literal for the '{@link cOSA.impl.AConnecteurComposantImpl <em>AConnecteur Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.AConnecteurComposantImpl
		 * @see cOSA.impl.COSAPackageImpl#getAConnecteurComposant()
		 * @generated
		 */
		EClass ACONNECTEUR_COMPOSANT = eINSTANCE.getAConnecteurComposant();

		/**
		 * The meta object literal for the '<em><b>Requiredport</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONNECTEUR_COMPOSANT__REQUIREDPORT = eINSTANCE.getAConnecteurComposant_Requiredport();

		/**
		 * The meta object literal for the '<em><b>Requiredservice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONNECTEUR_COMPOSANT__REQUIREDSERVICE = eINSTANCE.getAConnecteurComposant_Requiredservice();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONNECTEUR_COMPOSANT__PROVIDEDROLE = eINSTANCE.getAConnecteurComposant_Providedrole();

		/**
		 * The meta object literal for the '{@link cOSA.impl.ProvidedBindingImpl <em>Provided Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.ProvidedBindingImpl
		 * @see cOSA.impl.COSAPackageImpl#getProvidedBinding()
		 * @generated
		 */
		EClass PROVIDED_BINDING = eINSTANCE.getProvidedBinding();

		/**
		 * The meta object literal for the '<em><b>Component Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_BINDING__COMPONENT_PORT = eINSTANCE.getProvidedBinding_ComponentPort();

		/**
		 * The meta object literal for the '<em><b>Config Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_BINDING__CONFIG_PORT = eINSTANCE.getProvidedBinding_ConfigPort();

		/**
		 * The meta object literal for the '{@link cOSA.impl.RequiredBindingImpl <em>Required Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.RequiredBindingImpl
		 * @see cOSA.impl.COSAPackageImpl#getRequiredBinding()
		 * @generated
		 */
		EClass REQUIRED_BINDING = eINSTANCE.getRequiredBinding();

		/**
		 * The meta object literal for the '<em><b>Config Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_BINDING__CONFIG_PORT = eINSTANCE.getRequiredBinding_ConfigPort();

		/**
		 * The meta object literal for the '<em><b>Component Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_BINDING__COMPONENT_PORT = eINSTANCE.getRequiredBinding_ComponentPort();

		/**
		 * The meta object literal for the '{@link cOSA.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cOSA.impl.BindingImpl
		 * @see cOSA.impl.COSAPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

	}

} //COSAPackage
