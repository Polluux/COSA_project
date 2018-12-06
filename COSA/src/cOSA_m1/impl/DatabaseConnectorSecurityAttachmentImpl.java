/**
 */
package cOSA_m1.impl;

import cOSA.impl.AComposantConnecteurImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.DatabaseConnectorSecurityAttachment;
import cOSA_m1.DatabaseOutputToSecurityPort;
import cOSA_m1.DatabaseSecurityInRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Connector Security Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.DatabaseConnectorSecurityAttachmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.impl.DatabaseConnectorSecurityAttachmentImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseConnectorSecurityAttachmentImpl extends AComposantConnecteurImpl implements DatabaseConnectorSecurityAttachment {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DatabaseOutputToSecurityPort from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSecurityInRole to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseConnectorSecurityAttachmentImpl() {
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
		return COSA_m1Package.Literals.DATABASE_CONNECTOR_SECURITY_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseOutputToSecurityPort getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DatabaseOutputToSecurityPort)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseOutputToSecurityPort basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(DatabaseOutputToSecurityPort newFrom) {
		DatabaseOutputToSecurityPort oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityInRole getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (DatabaseSecurityInRole)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSecurityInRole basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(DatabaseSecurityInRole newTo) {
		DatabaseSecurityInRole oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO:
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
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				setFrom((DatabaseOutputToSecurityPort)newValue);
				return;
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO:
				setTo((DatabaseSecurityInRole)newValue);
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
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				setFrom((DatabaseOutputToSecurityPort)null);
				return;
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO:
				setTo((DatabaseSecurityInRole)null);
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
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__FROM:
				return from != null;
			case COSA_m1Package.DATABASE_CONNECTOR_SECURITY_ATTACHMENT__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseConnectorSecurityAttachmentImpl
