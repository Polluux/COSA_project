/**
 */
package cOSA.impl;

import cOSA.AComposantConnecteur;
import cOSA.AConnecteurComposant;
import cOSA.Attachement;
import cOSA.Binding;
import cOSA.COSAFactory;
import cOSA.COSAPackage;
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
import cOSA.ProvidedService;
import cOSA.RequiredBinding;
import cOSA.RequiredPort;
import cOSA.RequiredRole;
import cOSA.RequiredService;
import cOSA.Role;
import cOSA.Service;

import cOSA_m1.COSA_m1Package;

import cOSA_m1.impl.COSA_m1PackageImpl;

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
public class COSAPackageImpl extends EPackageImpl implements COSAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceCompoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aComposantConnecteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aConnecteurComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

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
	 * @see cOSA.COSAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private COSAPackageImpl() {
		super(eNS_URI, COSAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link COSAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static COSAPackage init() {
		if (isInited) return (COSAPackage)EPackage.Registry.INSTANCE.getEPackage(COSAPackage.eNS_URI);

		// Obtain or create and register package
		COSAPackageImpl theCOSAPackage = (COSAPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof COSAPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new COSAPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		COSA_m1PackageImpl theCOSA_m1Package = (COSA_m1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSA_m1Package.eNS_URI) instanceof COSA_m1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSA_m1Package.eNS_URI) : COSA_m1Package.eINSTANCE);

		// Create package meta-data objects
		theCOSAPackage.createPackageContents();
		theCOSA_m1Package.createPackageContents();

		// Initialize created meta-data
		theCOSAPackage.initializePackageContents();
		theCOSA_m1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCOSAPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(COSAPackage.eNS_URI, theCOSAPackage);
		return theCOSAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Element() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Iconfiguration() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Biding() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnecteur() {
		return connecteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteur_Interfaceconnect() {
		return (EReference)connecteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteur_Glue() {
		return (EReference)connecteurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposant() {
		return composantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Interfacecompo() {
		return (EReference)composantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachement() {
		return attachementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConfig() {
		return interfaceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceCompo() {
		return interfaceCompoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnect() {
		return interfaceConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlue() {
		return glueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_Providedrole() {
		return (EReference)glueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_Requiredrole() {
		return (EReference)glueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedRole() {
		return providedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredRole() {
		return requiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPort() {
		return requiredPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedPort() {
		return providedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredService() {
		return requiredServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedService() {
		return providedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAComposantConnecteur() {
		return aComposantConnecteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAComposantConnecteur_Providedport() {
		return (EReference)aComposantConnecteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAComposantConnecteur_Providedservice() {
		return (EReference)aComposantConnecteurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAComposantConnecteur_Requiredrole() {
		return (EReference)aComposantConnecteurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAConnecteurComposant() {
		return aConnecteurComposantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAConnecteurComposant_Requiredport() {
		return (EReference)aConnecteurComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAConnecteurComposant_Requiredservice() {
		return (EReference)aConnecteurComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAConnecteurComposant_Providedrole() {
		return (EReference)aConnecteurComposantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedBinding() {
		return providedBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedBinding_ComponentPort() {
		return (EReference)providedBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedBinding_ConfigPort() {
		return (EReference)providedBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredBinding() {
		return requiredBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredBinding_ConfigPort() {
		return (EReference)requiredBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredBinding_ComponentPort() {
		return (EReference)requiredBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSAFactory getCOSAFactory() {
		return (COSAFactory)getEFactoryInstance();
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
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__ELEMENT);
		createEReference(configurationEClass, CONFIGURATION__ICONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__BIDING);

		elementEClass = createEClass(ELEMENT);

		connecteurEClass = createEClass(CONNECTEUR);
		createEReference(connecteurEClass, CONNECTEUR__INTERFACECONNECT);
		createEReference(connecteurEClass, CONNECTEUR__GLUE);

		composantEClass = createEClass(COMPOSANT);
		createEReference(composantEClass, COMPOSANT__INTERFACECOMPO);

		attachementEClass = createEClass(ATTACHEMENT);

		interfaceConfigEClass = createEClass(INTERFACE_CONFIG);

		interfaceCompoEClass = createEClass(INTERFACE_COMPO);

		interfaceConnectEClass = createEClass(INTERFACE_CONNECT);

		glueEClass = createEClass(GLUE);
		createEReference(glueEClass, GLUE__PROVIDEDROLE);
		createEReference(glueEClass, GLUE__REQUIREDROLE);

		roleEClass = createEClass(ROLE);

		providedRoleEClass = createEClass(PROVIDED_ROLE);

		requiredRoleEClass = createEClass(REQUIRED_ROLE);

		portEClass = createEClass(PORT);

		serviceEClass = createEClass(SERVICE);

		requiredPortEClass = createEClass(REQUIRED_PORT);

		providedPortEClass = createEClass(PROVIDED_PORT);

		requiredServiceEClass = createEClass(REQUIRED_SERVICE);

		providedServiceEClass = createEClass(PROVIDED_SERVICE);

		aComposantConnecteurEClass = createEClass(ACOMPOSANT_CONNECTEUR);
		createEReference(aComposantConnecteurEClass, ACOMPOSANT_CONNECTEUR__PROVIDEDPORT);
		createEReference(aComposantConnecteurEClass, ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE);
		createEReference(aComposantConnecteurEClass, ACOMPOSANT_CONNECTEUR__REQUIREDROLE);

		aConnecteurComposantEClass = createEClass(ACONNECTEUR_COMPOSANT);
		createEReference(aConnecteurComposantEClass, ACONNECTEUR_COMPOSANT__REQUIREDPORT);
		createEReference(aConnecteurComposantEClass, ACONNECTEUR_COMPOSANT__REQUIREDSERVICE);
		createEReference(aConnecteurComposantEClass, ACONNECTEUR_COMPOSANT__PROVIDEDROLE);

		providedBindingEClass = createEClass(PROVIDED_BINDING);
		createEReference(providedBindingEClass, PROVIDED_BINDING__COMPONENT_PORT);
		createEReference(providedBindingEClass, PROVIDED_BINDING__CONFIG_PORT);

		requiredBindingEClass = createEClass(REQUIRED_BINDING);
		createEReference(requiredBindingEClass, REQUIRED_BINDING__CONFIG_PORT);
		createEReference(requiredBindingEClass, REQUIRED_BINDING__COMPONENT_PORT);

		bindingEClass = createEClass(BINDING);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationEClass.getESuperTypes().add(this.getElement());
		connecteurEClass.getESuperTypes().add(this.getElement());
		composantEClass.getESuperTypes().add(this.getElement());
		attachementEClass.getESuperTypes().add(this.getElement());
		roleEClass.getESuperTypes().add(this.getInterfaceConnect());
		providedRoleEClass.getESuperTypes().add(this.getRole());
		requiredRoleEClass.getESuperTypes().add(this.getRole());
		portEClass.getESuperTypes().add(this.getInterfaceConfig());
		portEClass.getESuperTypes().add(this.getInterfaceCompo());
		serviceEClass.getESuperTypes().add(this.getInterfaceCompo());
		requiredPortEClass.getESuperTypes().add(this.getPort());
		providedPortEClass.getESuperTypes().add(this.getPort());
		requiredServiceEClass.getESuperTypes().add(this.getService());
		providedServiceEClass.getESuperTypes().add(this.getService());
		aComposantConnecteurEClass.getESuperTypes().add(this.getAttachement());
		aConnecteurComposantEClass.getESuperTypes().add(this.getAttachement());
		providedBindingEClass.getESuperTypes().add(this.getBinding());
		requiredBindingEClass.getESuperTypes().add(this.getBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Element(), this.getElement(), null, "element", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Iconfiguration(), this.getInterfaceConfig(), null, "iconfiguration", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Biding(), this.getBinding(), null, "biding", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connecteurEClass, Connecteur.class, "Connecteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnecteur_Interfaceconnect(), this.getInterfaceConnect(), null, "interfaceconnect", null, 1, -1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteur_Glue(), this.getGlue(), null, "glue", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantEClass, Composant.class, "Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposant_Interfacecompo(), this.getInterfaceCompo(), null, "interfacecompo", null, 1, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementEClass, Attachement.class, "Attachement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceConfigEClass, InterfaceConfig.class, "InterfaceConfig", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceCompoEClass, InterfaceCompo.class, "InterfaceCompo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceConnectEClass, InterfaceConnect.class, "InterfaceConnect", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glueEClass, Glue.class, "Glue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlue_Providedrole(), this.getProvidedRole(), null, "providedrole", null, 1, -1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlue_Requiredrole(), this.getRequiredRole(), null, "requiredrole", null, 1, -1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedRoleEClass, ProvidedRole.class, "ProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredRoleEClass, RequiredRole.class, "RequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredPortEClass, RequiredPort.class, "RequiredPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedPortEClass, ProvidedPort.class, "ProvidedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredServiceEClass, RequiredService.class, "RequiredService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedServiceEClass, ProvidedService.class, "ProvidedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aComposantConnecteurEClass, AComposantConnecteur.class, "AComposantConnecteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAComposantConnecteur_Providedport(), this.getProvidedPort(), null, "providedport", null, 0, -1, AComposantConnecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAComposantConnecteur_Providedservice(), this.getProvidedService(), null, "providedservice", null, 0, -1, AComposantConnecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAComposantConnecteur_Requiredrole(), this.getRequiredRole(), null, "requiredrole", null, 0, -1, AComposantConnecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aConnecteurComposantEClass, AConnecteurComposant.class, "AConnecteurComposant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAConnecteurComposant_Requiredport(), this.getRequiredPort(), null, "requiredport", null, 0, -1, AConnecteurComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAConnecteurComposant_Requiredservice(), this.getRequiredService(), null, "requiredservice", null, 0, -1, AConnecteurComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAConnecteurComposant_Providedrole(), this.getProvidedRole(), null, "providedrole", null, 0, -1, AConnecteurComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedBindingEClass, ProvidedBinding.class, "ProvidedBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedBinding_ComponentPort(), this.getProvidedPort(), null, "componentPort", null, 1, 1, ProvidedBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedBinding_ConfigPort(), this.getProvidedPort(), null, "configPort", null, 1, 1, ProvidedBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredBindingEClass, RequiredBinding.class, "RequiredBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredBinding_ConfigPort(), this.getRequiredPort(), null, "configPort", null, 1, 1, RequiredBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredBinding_ComponentPort(), this.getRequiredPort(), null, "componentPort", null, 1, 1, RequiredBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //COSAPackageImpl
