/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.Composant;
import cOSA.InterfaceCompo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.ComposantImpl#getInterfacecompo <em>Interfacecompo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends ElementImpl implements Composant {
	/**
	 * The cached value of the '{@link #getInterfacecompo() <em>Interfacecompo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacecompo()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceCompo> interfacecompo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceCompo> getInterfacecompo() {
		if (interfacecompo == null) {
			interfacecompo = new EObjectContainmentEList<InterfaceCompo>(InterfaceCompo.class, this, COSAPackage.COMPOSANT__INTERFACECOMPO);
		}
		return interfacecompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSAPackage.COMPOSANT__INTERFACECOMPO:
				return ((InternalEList<?>)getInterfacecompo()).basicRemove(otherEnd, msgs);
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
			case COSAPackage.COMPOSANT__INTERFACECOMPO:
				return getInterfacecompo();
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
			case COSAPackage.COMPOSANT__INTERFACECOMPO:
				getInterfacecompo().clear();
				getInterfacecompo().addAll((Collection<? extends InterfaceCompo>)newValue);
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
			case COSAPackage.COMPOSANT__INTERFACECOMPO:
				getInterfacecompo().clear();
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
			case COSAPackage.COMPOSANT__INTERFACECOMPO:
				return interfacecompo != null && !interfacecompo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposantImpl
