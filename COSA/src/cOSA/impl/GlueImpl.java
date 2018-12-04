/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.Glue;
import cOSA.ProvidedRole;
import cOSA.RequiredRole;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.GlueImpl#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link cOSA.impl.GlueImpl#getRequiredrole <em>Requiredrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueImpl extends MinimalEObjectImpl.Container implements Glue {
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
	protected GlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedrole() {
		if (providedrole == null) {
			providedrole = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, COSAPackage.GLUE__PROVIDEDROLE);
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredRole> getRequiredrole() {
		if (requiredrole == null) {
			requiredrole = new EObjectResolvingEList<RequiredRole>(RequiredRole.class, this, COSAPackage.GLUE__REQUIREDROLE);
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
			case COSAPackage.GLUE__PROVIDEDROLE:
				return getProvidedrole();
			case COSAPackage.GLUE__REQUIREDROLE:
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
			case COSAPackage.GLUE__PROVIDEDROLE:
				getProvidedrole().clear();
				getProvidedrole().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case COSAPackage.GLUE__REQUIREDROLE:
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
			case COSAPackage.GLUE__PROVIDEDROLE:
				getProvidedrole().clear();
				return;
			case COSAPackage.GLUE__REQUIREDROLE:
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
			case COSAPackage.GLUE__PROVIDEDROLE:
				return providedrole != null && !providedrole.isEmpty();
			case COSAPackage.GLUE__REQUIREDROLE:
				return requiredrole != null && !requiredrole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String traitementInOut(String s) {
		System.out.println("-- [WARNING] Traitment IN-OUT method from "+this+" not Overrided");
		return null;
	}

	@Override
	public String traitementOutIn(String s) {
		System.out.println("-- [WARNING] Traitment OUT-IN method from "+this+" not Overrided");
		return null;
	}

} //GlueImpl
