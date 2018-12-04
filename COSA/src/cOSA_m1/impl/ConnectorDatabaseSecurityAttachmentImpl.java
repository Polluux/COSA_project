/**
 */
package cOSA_m1.impl;

import cOSA.impl.AConnecteurComposantImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectorDatabaseSecurityAttachment;
import cOSA_m1.DatabaseSecurityOutRole;
import cOSA_m1.SecurityInputFromDatabasePort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Database Security Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ConnectorDatabaseSecurityAttachmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectorDatabaseSecurityAttachmentImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorDatabaseSecurityAttachmentImpl extends AConnecteurComposantImpl implements ConnectorDatabaseSecurityAttachment {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSecurityOutRole from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected SecurityInputFromDatabasePort to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorDatabaseSecurityAttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CONNECTOR_DATABASE_SECURITY_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityOutRole getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DatabaseSecurityOutRole)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityOutRole basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(DatabaseSecurityOutRole newFrom) {
		DatabaseSecurityOutRole oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityInputFromDatabasePort getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (SecurityInputFromDatabasePort)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityInputFromDatabasePort basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(SecurityInputFromDatabasePort newTo) {
		SecurityInputFromDatabasePort oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO:
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
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM:
				setFrom((DatabaseSecurityOutRole)newValue);
				return;
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO:
				setTo((SecurityInputFromDatabasePort)newValue);
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
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM:
				setFrom((DatabaseSecurityOutRole)null);
				return;
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO:
				setTo((SecurityInputFromDatabasePort)null);
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
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__FROM:
				return from != null;
			case COSA_m1Package.CONNECTOR_DATABASE_SECURITY_ATTACHMENT__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorDatabaseSecurityAttachmentImpl
