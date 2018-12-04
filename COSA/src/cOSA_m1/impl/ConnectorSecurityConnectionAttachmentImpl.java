/**
 */
package cOSA_m1.impl;

import cOSA.impl.AConnecteurComposantImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectionInputFromSecurityPort;
import cOSA_m1.ConnectorSecurityConnectionAttachment;
import cOSA_m1.SecurityConnectionOutRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Security Connection Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ConnectorSecurityConnectionAttachmentImpl#getTo <em>To</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectorSecurityConnectionAttachmentImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorSecurityConnectionAttachmentImpl extends AConnecteurComposantImpl implements ConnectorSecurityConnectionAttachment {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ConnectionInputFromSecurityPort to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected SecurityConnectionOutRole from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorSecurityConnectionAttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInputFromSecurityPort getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (ConnectionInputFromSecurityPort)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInputFromSecurityPort basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ConnectionInputFromSecurityPort newTo) {
		ConnectionInputFromSecurityPort oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionOutRole getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (SecurityConnectionOutRole)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConnectionOutRole basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(SecurityConnectionOutRole newFrom) {
		SecurityConnectionOutRole oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
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
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO:
				setTo((ConnectionInputFromSecurityPort)newValue);
				return;
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM:
				setFrom((SecurityConnectionOutRole)newValue);
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
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO:
				setTo((ConnectionInputFromSecurityPort)null);
				return;
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM:
				setFrom((SecurityConnectionOutRole)null);
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
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__TO:
				return to != null;
			case COSA_m1Package.CONNECTOR_SECURITY_CONNECTION_ATTACHMENT__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorSecurityConnectionAttachmentImpl
