/**
 */
package cOSA.impl;

import cOSA.*;

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
public class COSAFactoryImpl extends EFactoryImpl implements COSAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COSAFactory init() {
		try {
			COSAFactory theCOSAFactory = (COSAFactory)EPackage.Registry.INSTANCE.getEFactory(COSAPackage.eNS_URI);
			if (theCOSAFactory != null) {
				return theCOSAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new COSAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSAFactoryImpl() {
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
			case COSAPackage.CONFIGURATION: return createConfiguration();
			case COSAPackage.CONNECTEUR: return createConnecteur();
			case COSAPackage.COMPOSANT: return createComposant();
			case COSAPackage.GLUE: return createGlue();
			case COSAPackage.PROVIDED_ROLE: return createProvidedRole();
			case COSAPackage.REQUIRED_ROLE: return createRequiredRole();
			case COSAPackage.REQUIRED_PORT: return createRequiredPort();
			case COSAPackage.PROVIDED_PORT: return createProvidedPort();
			case COSAPackage.REQUIRED_SERVICE: return createRequiredService();
			case COSAPackage.PROVIDED_SERVICE: return createProvidedService();
			case COSAPackage.ACOMPOSANT_CONNECTEUR: return createAComposantConnecteur();
			case COSAPackage.ACONNECTEUR_COMPOSANT: return createAConnecteurComposant();
			case COSAPackage.PROVIDED_BINDING: return createProvidedBinding();
			case COSAPackage.REQUIRED_BINDING: return createRequiredBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createConnecteur() {
		ConnecteurImpl connecteur = new ConnecteurImpl();
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole createProvidedRole() {
		ProvidedRoleImpl providedRole = new ProvidedRoleImpl();
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole createRequiredRole() {
		RequiredRoleImpl requiredRole = new RequiredRoleImpl();
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort createRequiredPort() {
		RequiredPortImpl requiredPort = new RequiredPortImpl();
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort createProvidedPort() {
		ProvidedPortImpl providedPort = new ProvidedPortImpl();
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredService createRequiredService() {
		RequiredServiceImpl requiredService = new RequiredServiceImpl();
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedService createProvidedService() {
		ProvidedServiceImpl providedService = new ProvidedServiceImpl();
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AComposantConnecteur createAComposantConnecteur() {
		AComposantConnecteurImpl aComposantConnecteur = new AComposantConnecteurImpl();
		return aComposantConnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnecteurComposant createAConnecteurComposant() {
		AConnecteurComposantImpl aConnecteurComposant = new AConnecteurComposantImpl();
		return aConnecteurComposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedBinding createProvidedBinding() {
		ProvidedBindingImpl providedBinding = new ProvidedBindingImpl();
		return providedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBinding createRequiredBinding() {
		RequiredBindingImpl requiredBinding = new RequiredBindingImpl();
		return requiredBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSAPackage getCOSAPackage() {
		return (COSAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static COSAPackage getPackage() {
		return COSAPackage.eINSTANCE;
	}

} //COSAFactoryImpl
