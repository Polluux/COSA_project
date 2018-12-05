/**
 */
package cOSA_m1.impl;

import cOSA.impl.AComposantConnecteurImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.ServerOuput;
import cOSA_m1.ServerRpcAttachment;
import cOSA_m1.ServeurOutRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Rpc Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ServerRpcAttachmentImpl#getTo <em>To</em>}</li>
 *   <li>{@link cOSA_m1.impl.ServerRpcAttachmentImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerRpcAttachmentImpl extends AComposantConnecteurImpl implements ServerRpcAttachment {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ServeurOutRole to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected ServerOuput from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerRpcAttachmentImpl() {
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
		return COSA_m1Package.Literals.SERVER_RPC_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurOutRole getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (ServeurOutRole)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.SERVER_RPC_ATTACHMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurOutRole basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ServeurOutRole newTo) {
		ServeurOutRole oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER_RPC_ATTACHMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOuput getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (ServerOuput)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.SERVER_RPC_ATTACHMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOuput basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(ServerOuput newFrom) {
		ServerOuput oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.SERVER_RPC_ATTACHMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__FROM:
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
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__TO:
				setTo((ServeurOutRole)newValue);
				return;
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__FROM:
				setFrom((ServerOuput)newValue);
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
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__TO:
				setTo((ServeurOutRole)null);
				return;
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__FROM:
				setFrom((ServerOuput)null);
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
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__TO:
				return to != null;
			case COSA_m1Package.SERVER_RPC_ATTACHMENT__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //ServerRpcAttachmentImpl
