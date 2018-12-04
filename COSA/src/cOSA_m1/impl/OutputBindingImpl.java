/**
 */
package cOSA_m1.impl;

import cOSA.impl.ProvidedBindingImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.OutputBinding;
import cOSA_m1.ServerConfigOutput;
import cOSA_m1.ServerOuput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.OutputBindingImpl#getServerconfigoutput <em>Serverconfigoutput</em>}</li>
 *   <li>{@link cOSA_m1.impl.OutputBindingImpl#getServerouput <em>Serverouput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputBindingImpl extends ProvidedBindingImpl implements OutputBinding {
	/**
	 * The cached value of the '{@link #getServerconfigoutput() <em>Serverconfigoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerconfigoutput()
	 * @generated
	 * @ordered
	 */
	protected ServerConfigOutput serverconfigoutput;

	/**
	 * The cached value of the '{@link #getServerouput() <em>Serverouput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerouput()
	 * @generated
	 * @ordered
	 */
	protected ServerOuput serverouput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputBindingImpl() {
		super();
	}
	
	protected void init() {
		if(serverconfigoutput != null && serverouput != null) {
			serverconfigoutput.startBeingObservedBy(serverouput);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.OUTPUT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigOutput getServerconfigoutput() {
		if (serverconfigoutput != null && serverconfigoutput.eIsProxy()) {
			InternalEObject oldServerconfigoutput = (InternalEObject)serverconfigoutput;
			serverconfigoutput = (ServerConfigOutput)eResolveProxy(oldServerconfigoutput);
			if (serverconfigoutput != oldServerconfigoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.OUTPUT_BINDING__SERVERCONFIGOUTPUT, oldServerconfigoutput, serverconfigoutput));
			}
		}
		return serverconfigoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigOutput basicGetServerconfigoutput() {
		return serverconfigoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerconfigoutput(ServerConfigOutput newServerconfigoutput) {
		ServerConfigOutput oldServerconfigoutput = serverconfigoutput;
		serverconfigoutput = newServerconfigoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.OUTPUT_BINDING__SERVERCONFIGOUTPUT, oldServerconfigoutput, serverconfigoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOuput getServerouput() {
		if (serverouput != null && serverouput.eIsProxy()) {
			InternalEObject oldServerouput = (InternalEObject)serverouput;
			serverouput = (ServerOuput)eResolveProxy(oldServerouput);
			if (serverouput != oldServerouput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSA_m1Package.OUTPUT_BINDING__SERVEROUPUT, oldServerouput, serverouput));
			}
		}
		return serverouput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOuput basicGetServerouput() {
		return serverouput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerouput(ServerOuput newServerouput) {
		ServerOuput oldServerouput = serverouput;
		serverouput = newServerouput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.OUTPUT_BINDING__SERVEROUPUT, oldServerouput, serverouput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSA_m1Package.OUTPUT_BINDING__SERVERCONFIGOUTPUT:
				if (resolve) return getServerconfigoutput();
				return basicGetServerconfigoutput();
			case COSA_m1Package.OUTPUT_BINDING__SERVEROUPUT:
				if (resolve) return getServerouput();
				return basicGetServerouput();
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
			case COSA_m1Package.OUTPUT_BINDING__SERVERCONFIGOUTPUT:
				setServerconfigoutput((ServerConfigOutput)newValue);
				return;
			case COSA_m1Package.OUTPUT_BINDING__SERVEROUPUT:
				setServerouput((ServerOuput)newValue);
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
			case COSA_m1Package.OUTPUT_BINDING__SERVERCONFIGOUTPUT:
				setServerconfigoutput((ServerConfigOutput)null);
				return;
			case COSA_m1Package.OUTPUT_BINDING__SERVEROUPUT:
				setServerouput((ServerOuput)null);
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
			case COSA_m1Package.OUTPUT_BINDING__SERVERCONFIGOUTPUT:
				return serverconfigoutput != null;
			case COSA_m1Package.OUTPUT_BINDING__SERVEROUPUT:
				return serverouput != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputBindingImpl
