/**
 */
package cOSA_m1.impl;

import cOSA.impl.AComposantConnecteurImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectionConnectorSecurityAttachment;
import cOSA_m1.ConnectionOutputToSecurityPort;
import cOSA_m1.ConnectionSecurityInRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Connector Security Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ConnectionConnectorSecurityAttachmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionConnectorSecurityAttachmentImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionConnectorSecurityAttachmentImpl extends AComposantConnecteurImpl implements ConnectionConnectorSecurityAttachment {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected ConnectionOutputToSecurityPort from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ConnectionSecurityInRole to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionConnectorSecurityAttachmentImpl() {
		super();
	}

	public void init() {
		if(from != null && to != null) {
			from.startBeingObservedBy(to);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOutputToSecurityPort getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (ConnectionOutputToSecurityPort)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOutputToSecurityPort basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(ConnectionOutputToSecurityPort newFrom) {
		ConnectionOutputToSecurityPort oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityInRole getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (ConnectionSecurityInRole)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSecurityInRole basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ConnectionSecurityInRole newTo) {
		ConnectionSecurityInRole oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO:
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
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				setFrom((ConnectionOutputToSecurityPort)newValue);
				return;
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO:
				setTo((ConnectionSecurityInRole)newValue);
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
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				setFrom((ConnectionOutputToSecurityPort)null);
				return;
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO:
				setTo((ConnectionSecurityInRole)null);
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
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				return from != null;
			case COSA_m1Package.CONNECTION_CONNECTOR_SECURITY_ATTACHMENT__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionConnectorSecurityAttachmentImpl
