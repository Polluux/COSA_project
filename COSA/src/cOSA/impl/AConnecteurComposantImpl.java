/**
 */
package cOSA.impl;

import cOSA.AConnecteurComposant;
import cOSA.COSAPackage;
import cOSA.ProvidedRole;
import cOSA.RequiredPort;
import cOSA.RequiredService;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AConnecteur Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.AConnecteurComposantImpl#getRequiredport <em>Requiredport</em>}</li>
 *   <li>{@link cOSA.impl.AConnecteurComposantImpl#getRequiredservice <em>Requiredservice</em>}</li>
 *   <li>{@link cOSA.impl.AConnecteurComposantImpl#getProvidedrole <em>Providedrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AConnecteurComposantImpl extends AttachementImpl implements AConnecteurComposant {
	/**
	 * The cached value of the '{@link #getRequiredport() <em>Requiredport</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredport()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredPort> requiredport;

	/**
	 * The cached value of the '{@link #getRequiredservice() <em>Requiredservice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredservice()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredService> requiredservice;

	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AConnecteurComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.ACONNECTEUR_COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredPort> getRequiredport() {
		if (requiredport == null) {
			requiredport = new EObjectResolvingEList<RequiredPort>(RequiredPort.class, this, COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT);
		}
		return requiredport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredService> getRequiredservice() {
		if (requiredservice == null) {
			requiredservice = new EObjectResolvingEList<RequiredService>(RequiredService.class, this, COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE);
		}
		return requiredservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedrole() {
		if (providedrole == null) {
			providedrole = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE);
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT:
				return getRequiredport();
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE:
				return getRequiredservice();
			case COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE:
				return getProvidedrole();
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
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT:
				getRequiredport().clear();
				getRequiredport().addAll((Collection<? extends RequiredPort>)newValue);
				return;
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE:
				getRequiredservice().clear();
				getRequiredservice().addAll((Collection<? extends RequiredService>)newValue);
				return;
			case COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE:
				getProvidedrole().clear();
				getProvidedrole().addAll((Collection<? extends ProvidedRole>)newValue);
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
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT:
				getRequiredport().clear();
				return;
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE:
				getRequiredservice().clear();
				return;
			case COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE:
				getProvidedrole().clear();
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
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDPORT:
				return requiredport != null && !requiredport.isEmpty();
			case COSAPackage.ACONNECTEUR_COMPOSANT__REQUIREDSERVICE:
				return requiredservice != null && !requiredservice.isEmpty();
			case COSAPackage.ACONNECTEUR_COMPOSANT__PROVIDEDROLE:
				return providedrole != null && !providedrole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AConnecteurComposantImpl
