/**
 */
package cOSA.impl;

import cOSA.AComposantConnecteur;
import cOSA.COSAPackage;
import cOSA.ProvidedPort;
import cOSA.ProvidedService;
import cOSA.RequiredRole;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AComposant Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.AComposantConnecteurImpl#getProvidedport <em>Providedport</em>}</li>
 *   <li>{@link cOSA.impl.AComposantConnecteurImpl#getProvidedservice <em>Providedservice</em>}</li>
 *   <li>{@link cOSA.impl.AComposantConnecteurImpl#getRequiredrole <em>Requiredrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AComposantConnecteurImpl extends AttachementImpl implements AComposantConnecteur {
	/**
	 * The cached value of the '{@link #getProvidedport() <em>Providedport</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedport()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedPort> providedport;

	/**
	 * The cached value of the '{@link #getProvidedservice() <em>Providedservice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedservice()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedService> providedservice;

	/**
	 * The cached value of the '{@link #getRequiredrole() <em>Requiredrole</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredrole()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AComposantConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.ACOMPOSANT_CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedPort> getProvidedport() {
		if (providedport == null) {
			providedport = new EObjectResolvingEList<ProvidedPort>(ProvidedPort.class, this, COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT);
		}
		return providedport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedService> getProvidedservice() {
		if (providedservice == null) {
			providedservice = new EObjectResolvingEList<ProvidedService>(ProvidedService.class, this, COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE);
		}
		return providedservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredRole> getRequiredrole() {
		if (requiredrole == null) {
			requiredrole = new EObjectResolvingEList<RequiredRole>(RequiredRole.class, this, COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE);
		}
		return requiredrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT:
				return getProvidedport();
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE:
				return getProvidedservice();
			case COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE:
				return getRequiredrole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT:
				getProvidedport().clear();
				getProvidedport().addAll((Collection<? extends ProvidedPort>)newValue);
				return;
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE:
				getProvidedservice().clear();
				getProvidedservice().addAll((Collection<? extends ProvidedService>)newValue);
				return;
			case COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE:
				getRequiredrole().clear();
				getRequiredrole().addAll((Collection<? extends RequiredRole>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT:
				getProvidedport().clear();
				return;
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE:
				getProvidedservice().clear();
				return;
			case COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE:
				getRequiredrole().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDPORT:
				return providedport != null && !providedport.isEmpty();
			case COSAPackage.ACOMPOSANT_CONNECTEUR__PROVIDEDSERVICE:
				return providedservice != null && !providedservice.isEmpty();
			case COSAPackage.ACOMPOSANT_CONNECTEUR__REQUIREDROLE:
				return requiredrole != null && !requiredrole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AComposantConnecteurImpl
