/**
 */
package cOSA_m1.impl;

import cOSA.impl.AComposantConnecteurImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.SecurityConnectionInRole;
import cOSA_m1.SecurityConnectorConnectionAttachment;
import cOSA_m1.SecurityOuputToConnectionPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Connector Connection Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.SecurityConnectorConnectionAttachmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.impl.SecurityConnectorConnectionAttachmentImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityConnectorConnectionAttachmentImpl extends AComposantConnecteurImpl implements SecurityConnectorConnectionAttachment {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected SecurityOuputToConnectionPort from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectionInRole to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConnectorConnectionAttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityOuputToConnectionPort getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (SecurityOuputToConnectionPort)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityOuputToConnectionPort basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(SecurityOuputToConnectionPort newFrom) {
		SecurityOuputToConnectionPort oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionInRole getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (SecurityConnectionInRole)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionInRole basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(SecurityConnectionInRole newTo) {
		SecurityConnectionInRole oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO:
				if (resolve) return getTo();
				return basicGetTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM:
				setFrom((SecurityOuputToConnectionPort)newValue);
				return;
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO:
				setTo((SecurityConnectionInRole)newValue);
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
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM:
				setFrom((SecurityOuputToConnectionPort)null);
				return;
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO:
				setTo((SecurityConnectionInRole)null);
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
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__FROM:
				return from != null;
			case COSA_m1Package.SECURITY_CONNECTOR_CONNECTION_ATTACHMENT__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityConnectorConnectionAttachmentImpl
