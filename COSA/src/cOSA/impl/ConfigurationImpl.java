/**
 */
package cOSA.impl;

import cOSA.Binding;
import cOSA.COSAPackage;
import cOSA.Configuration;
import cOSA.Element;
import cOSA.InterfaceConfig;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.ConfigurationImpl#getElement <em>Element</em>}</li>
 *   <li>{@link cOSA.impl.ConfigurationImpl#getIconfiguration <em>Iconfiguration</em>}</li>
 *   <li>{@link cOSA.impl.ConfigurationImpl#getBiding <em>Biding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The cached value of the '{@link #getIconfiguration() <em>Iconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConfig> iconfiguration;

	/**
	 * The cached value of the '{@link #getBiding() <em>Biding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> biding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, COSAPackage.CONFIGURATION__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConfig> getIconfiguration() {
		if (iconfiguration == null) {
			iconfiguration = new EObjectContainmentEList<InterfaceConfig>(InterfaceConfig.class, this, COSAPackage.CONFIGURATION__ICONFIGURATION);
		}
		return iconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBiding() {
		if (biding == null) {
			biding = new EObjectContainmentEList<Binding>(Binding.class, this, COSAPackage.CONFIGURATION__BIDING);
		}
		return biding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSAPackage.CONFIGURATION__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case COSAPackage.CONFIGURATION__ICONFIGURATION:
				return ((InternalEList<?>)getIconfiguration()).basicRemove(otherEnd, msgs);
			case COSAPackage.CONFIGURATION__BIDING:
				return ((InternalEList<?>)getBiding()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSAPackage.CONFIGURATION__ELEMENT:
				return getElement();
			case COSAPackage.CONFIGURATION__ICONFIGURATION:
				return getIconfiguration();
			case COSAPackage.CONFIGURATION__BIDING:
				return getBiding();
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
			case COSAPackage.CONFIGURATION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case COSAPackage.CONFIGURATION__ICONFIGURATION:
				getIconfiguration().clear();
				getIconfiguration().addAll((Collection<? extends InterfaceConfig>)newValue);
				return;
			case COSAPackage.CONFIGURATION__BIDING:
				getBiding().clear();
				getBiding().addAll((Collection<? extends Binding>)newValue);
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
			case COSAPackage.CONFIGURATION__ELEMENT:
				getElement().clear();
				return;
			case COSAPackage.CONFIGURATION__ICONFIGURATION:
				getIconfiguration().clear();
				return;
			case COSAPackage.CONFIGURATION__BIDING:
				getBiding().clear();
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
			case COSAPackage.CONFIGURATION__ELEMENT:
				return element != null && !element.isEmpty();
			case COSAPackage.CONFIGURATION__ICONFIGURATION:
				return iconfiguration != null && !iconfiguration.isEmpty();
			case COSAPackage.CONFIGURATION__BIDING:
				return biding != null && !biding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
