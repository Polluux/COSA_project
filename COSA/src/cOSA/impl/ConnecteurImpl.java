/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.Connecteur;
import cOSA.Glue;
import cOSA.InterfaceConnect;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA.impl.ConnecteurImpl#getInterfaceconnect <em>Interfaceconnect</em>}</li>
 *   <li>{@link cOSA.impl.ConnecteurImpl#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnecteurImpl extends ElementImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getInterfaceconnect() <em>Interfaceconnect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconnect()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnect> interfaceconnect;

	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnect> getInterfaceconnect() {
		if (interfaceconnect == null) {
			interfaceconnect = new EObjectContainmentEList<InterfaceConnect>(InterfaceConnect.class, this, COSAPackage.CONNECTEUR__INTERFACECONNECT);
		}
		return interfaceconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSAPackage.CONNECTEUR__GLUE, oldGlue, newGlue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject)glue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSAPackage.CONNECTEUR__GLUE, null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject)newGlue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSAPackage.CONNECTEUR__GLUE, null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSAPackage.CONNECTEUR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSAPackage.CONNECTEUR__INTERFACECONNECT:
				return ((InternalEList<?>)getInterfaceconnect()).basicRemove(otherEnd, msgs);
			case COSAPackage.CONNECTEUR__GLUE:
				return basicSetGlue(null, msgs);
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
			case COSAPackage.CONNECTEUR__INTERFACECONNECT:
				return getInterfaceconnect();
			case COSAPackage.CONNECTEUR__GLUE:
				return getGlue();
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
			case COSAPackage.CONNECTEUR__INTERFACECONNECT:
				getInterfaceconnect().clear();
				getInterfaceconnect().addAll((Collection<? extends InterfaceConnect>)newValue);
				return;
			case COSAPackage.CONNECTEUR__GLUE:
				setGlue((Glue)newValue);
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
			case COSAPackage.CONNECTEUR__INTERFACECONNECT:
				getInterfaceconnect().clear();
				return;
			case COSAPackage.CONNECTEUR__GLUE:
				setGlue((Glue)null);
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
			case COSAPackage.CONNECTEUR__INTERFACECONNECT:
				return interfaceconnect != null && !interfaceconnect.isEmpty();
			case COSAPackage.CONNECTEUR__GLUE:
				return glue != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnecteurImpl
