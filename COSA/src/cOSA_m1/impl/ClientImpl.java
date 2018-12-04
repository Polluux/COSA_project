/**
 */
package cOSA_m1.impl;

import cOSA.impl.ComposantImpl;

import cOSA_m1.COSA_m1Package;
import cOSA_m1.Client;
import cOSA_m1.ConfigInput;
import cOSA_m1.ConfigOutput;
import cOSA_m1.RequestPortRPC;
import cOSA_m1.ResponsePortRPC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.impl.ClientImpl#getResponseportrpc <em>Responseportrpc</em>}</li>
 *   <li>{@link cOSA_m1.impl.ClientImpl#getRequestportrpc <em>Requestportrpc</em>}</li>
 *   <li>{@link cOSA_m1.impl.ClientImpl#getConfigoutput <em>Configoutput</em>}</li>
 *   <li>{@link cOSA_m1.impl.ClientImpl#getConfiginput <em>Configinput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends ComposantImpl implements Client {
	/**
	 * The cached value of the '{@link #getResponseportrpc() <em>Responseportrpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseportrpc()
	 * @generated
	 * @ordered
	 */
	protected ResponsePortRPC responseportrpc;

	/**
	 * The cached value of the '{@link #getRequestportrpc() <em>Requestportrpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestportrpc()
	 * @generated
	 * @ordered
	 */
	protected RequestPortRPC requestportrpc;

	/**
	 * The cached value of the '{@link #getConfigoutput() <em>Configoutput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigoutput()
	 * @generated
	 * @ordered
	 */
	protected ConfigOutput configoutput;

	/**
	 * The cached value of the '{@link #getConfiginput() <em>Configinput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiginput()
	 * @generated
	 * @ordered
	 */
	protected ConfigInput configinput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}
	
	@Override
	public void init() {
		if(configoutput != null && requestportrpc != null && responseportrpc != null && configinput != null) {
			configinput.startBeingObservedBy(requestportrpc);
			responseportrpc.startBeingObservedBy(configoutput);
		}else{
			System.out.println("-- [ERROR] Init not launched at the right moment in "+this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSA_m1Package.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePortRPC getResponseportrpc() {
		return responseportrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseportrpc(ResponsePortRPC newResponseportrpc, NotificationChain msgs) {
		ResponsePortRPC oldResponseportrpc = responseportrpc;
		responseportrpc = newResponseportrpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__RESPONSEPORTRPC, oldResponseportrpc, newResponseportrpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseportrpc(ResponsePortRPC newResponseportrpc) {
		if (newResponseportrpc != responseportrpc) {
			NotificationChain msgs = null;
			if (responseportrpc != null)
				msgs = ((InternalEObject)responseportrpc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__RESPONSEPORTRPC, null, msgs);
			if (newResponseportrpc != null)
				msgs = ((InternalEObject)newResponseportrpc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__RESPONSEPORTRPC, null, msgs);
			msgs = basicSetResponseportrpc(newResponseportrpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__RESPONSEPORTRPC, newResponseportrpc, newResponseportrpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPortRPC getRequestportrpc() {
		return requestportrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestportrpc(RequestPortRPC newRequestportrpc, NotificationChain msgs) {
		RequestPortRPC oldRequestportrpc = requestportrpc;
		requestportrpc = newRequestportrpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__REQUESTPORTRPC, oldRequestportrpc, newRequestportrpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestportrpc(RequestPortRPC newRequestportrpc) {
		if (newRequestportrpc != requestportrpc) {
			NotificationChain msgs = null;
			if (requestportrpc != null)
				msgs = ((InternalEObject)requestportrpc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__REQUESTPORTRPC, null, msgs);
			if (newRequestportrpc != null)
				msgs = ((InternalEObject)newRequestportrpc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__REQUESTPORTRPC, null, msgs);
			msgs = basicSetRequestportrpc(newRequestportrpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__REQUESTPORTRPC, newRequestportrpc, newRequestportrpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigOutput getConfigoutput() {
		return configoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigoutput(ConfigOutput newConfigoutput, NotificationChain msgs) {
		ConfigOutput oldConfigoutput = configoutput;
		configoutput = newConfigoutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__CONFIGOUTPUT, oldConfigoutput, newConfigoutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigoutput(ConfigOutput newConfigoutput) {
		if (newConfigoutput != configoutput) {
			NotificationChain msgs = null;
			if (configoutput != null)
				msgs = ((InternalEObject)configoutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__CONFIGOUTPUT, null, msgs);
			if (newConfigoutput != null)
				msgs = ((InternalEObject)newConfigoutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__CONFIGOUTPUT, null, msgs);
			msgs = basicSetConfigoutput(newConfigoutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__CONFIGOUTPUT, newConfigoutput, newConfigoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigInput getConfiginput() {
		return configinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiginput(ConfigInput newConfiginput, NotificationChain msgs) {
		ConfigInput oldConfiginput = configinput;
		configinput = newConfiginput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__CONFIGINPUT, oldConfiginput, newConfiginput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiginput(ConfigInput newConfiginput) {
		if (newConfiginput != configinput) {
			NotificationChain msgs = null;
			if (configinput != null)
				msgs = ((InternalEObject)configinput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__CONFIGINPUT, null, msgs);
			if (newConfiginput != null)
				msgs = ((InternalEObject)newConfiginput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSA_m1Package.CLIENT__CONFIGINPUT, null, msgs);
			msgs = basicSetConfiginput(newConfiginput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSA_m1Package.CLIENT__CONFIGINPUT, newConfiginput, newConfiginput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSA_m1Package.CLIENT__RESPONSEPORTRPC:
				return basicSetResponseportrpc(null, msgs);
			case COSA_m1Package.CLIENT__REQUESTPORTRPC:
				return basicSetRequestportrpc(null, msgs);
			case COSA_m1Package.CLIENT__CONFIGOUTPUT:
				return basicSetConfigoutput(null, msgs);
			case COSA_m1Package.CLIENT__CONFIGINPUT:
				return basicSetConfiginput(null, msgs);
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
			case COSA_m1Package.CLIENT__RESPONSEPORTRPC:
				return getResponseportrpc();
			case COSA_m1Package.CLIENT__REQUESTPORTRPC:
				return getRequestportrpc();
			case COSA_m1Package.CLIENT__CONFIGOUTPUT:
				return getConfigoutput();
			case COSA_m1Package.CLIENT__CONFIGINPUT:
				return getConfiginput();
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
			case COSA_m1Package.CLIENT__RESPONSEPORTRPC:
				setResponseportrpc((ResponsePortRPC)newValue);
				return;
			case COSA_m1Package.CLIENT__REQUESTPORTRPC:
				setRequestportrpc((RequestPortRPC)newValue);
				return;
			case COSA_m1Package.CLIENT__CONFIGOUTPUT:
				setConfigoutput((ConfigOutput)newValue);
				return;
			case COSA_m1Package.CLIENT__CONFIGINPUT:
				setConfiginput((ConfigInput)newValue);
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
			case COSA_m1Package.CLIENT__RESPONSEPORTRPC:
				setResponseportrpc((ResponsePortRPC)null);
				return;
			case COSA_m1Package.CLIENT__REQUESTPORTRPC:
				setRequestportrpc((RequestPortRPC)null);
				return;
			case COSA_m1Package.CLIENT__CONFIGOUTPUT:
				setConfigoutput((ConfigOutput)null);
				return;
			case COSA_m1Package.CLIENT__CONFIGINPUT:
				setConfiginput((ConfigInput)null);
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
			case COSA_m1Package.CLIENT__RESPONSEPORTRPC:
				return responseportrpc != null;
			case COSA_m1Package.CLIENT__REQUESTPORTRPC:
				return requestportrpc != null;
			case COSA_m1Package.CLIENT__CONFIGOUTPUT:
				return configoutput != null;
			case COSA_m1Package.CLIENT__CONFIGINPUT:
				return configinput != null;
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
