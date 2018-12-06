/**
 */
package cOSA_m1.impl;

import cOSA.impl.AComposantConnecteurImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ConnectionConnectorDatabaseAttachment;
import cOSA_m1.ConnectionDBInRole;
import cOSA_m1.ConnectionOuputToDataBasePort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Connector Database Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ConnectionConnectorDatabaseAttachmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.impl.ConnectionConnectorDatabaseAttachmentImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionConnectorDatabaseAttachmentImpl extends AComposantConnecteurImpl implements ConnectionConnectorDatabaseAttachment {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected ConnectionOuputToDataBasePort from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ConnectionDBInRole to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionConnectorDatabaseAttachmentImpl() {
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
		return COSA_m1Package.Literals.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOuputToDataBasePort getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (ConnectionOuputToDataBasePort)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOuputToDataBasePort basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(ConnectionOuputToDataBasePort newFrom) {
		ConnectionOuputToDataBasePort oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBInRole getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (ConnectionDBInRole)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDBInRole basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ConnectionDBInRole newTo) {
		ConnectionDBInRole oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO:
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
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM:
				setFrom((ConnectionOuputToDataBasePort)newValue);
				return;
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO:
				setTo((ConnectionDBInRole)newValue);
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
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM:
				setFrom((ConnectionOuputToDataBasePort)null);
				return;
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO:
				setTo((ConnectionDBInRole)null);
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
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__FROM:
				return from != null;
			case COSA_m1Package.CONNECTION_CONNECTOR_DATABASE_ATTACHMENT__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionConnectorDatabaseAttachmentImpl
