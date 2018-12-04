/**
 */
package cOSA_m1;

import cOSA.Composant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.Client#getResponseportrpc <em>Responseportrpc</em>}</li>
 *   <li>{@link cOSA_m1.Client#getRequestportrpc <em>Requestportrpc</em>}</li>
 *   <li>{@link cOSA_m1.Client#getConfigoutput <em>Configoutput</em>}</li>
 *   <li>{@link cOSA_m1.Client#getConfiginput <em>Configinput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getClient()
 * @model
 * @generated
 */
public interface Client extends Composant {
	/**
	 * Returns the value of the '<em><b>Responseportrpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responseportrpc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responseportrpc</em>' containment reference.
	 * @see #setResponseportrpc(ResponsePortRPC)
	 * @see cOSA_m1.COSA_m1Package#getClient_Responseportrpc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResponsePortRPC getResponseportrpc();

	/**
	 * Sets the value of the '{@link cOSA_m1.Client#getResponseportrpc <em>Responseportrpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responseportrpc</em>' containment reference.
	 * @see #getResponseportrpc()
	 * @generated
	 */
	void setResponseportrpc(ResponsePortRPC value);

	/**
	 * Returns the value of the '<em><b>Requestportrpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requestportrpc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestportrpc</em>' containment reference.
	 * @see #setRequestportrpc(RequestPortRPC)
	 * @see cOSA_m1.COSA_m1Package#getClient_Requestportrpc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequestPortRPC getRequestportrpc();

	/**
	 * Sets the value of the '{@link cOSA_m1.Client#getRequestportrpc <em>Requestportrpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestportrpc</em>' containment reference.
	 * @see #getRequestportrpc()
	 * @generated
	 */
	void setRequestportrpc(RequestPortRPC value);

	/**
	 * Returns the value of the '<em><b>Configoutput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configoutput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configoutput</em>' containment reference.
	 * @see #setConfigoutput(ConfigOutput)
	 * @see cOSA_m1.COSA_m1Package#getClient_Configoutput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigOutput getConfigoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.Client#getConfigoutput <em>Configoutput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configoutput</em>' containment reference.
	 * @see #getConfigoutput()
	 * @generated
	 */
	void setConfigoutput(ConfigOutput value);

	/**
	 * Returns the value of the '<em><b>Configinput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configinput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configinput</em>' containment reference.
	 * @see #setConfiginput(ConfigInput)
	 * @see cOSA_m1.COSA_m1Package#getClient_Configinput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigInput getConfiginput();

	/**
	 * Sets the value of the '{@link cOSA_m1.Client#getConfiginput <em>Configinput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configinput</em>' containment reference.
	 * @see #getConfiginput()
	 * @generated
	 */
	void setConfiginput(ConfigInput value);

} // Client
