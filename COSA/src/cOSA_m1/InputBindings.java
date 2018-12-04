/**
 */
package cOSA_m1;

import cOSA.RequiredBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Bindings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.InputBindings#getConfiginput <em>Configinput</em>}</li>
 *   <li>{@link cOSA_m1.InputBindings#getClientinput <em>Clientinput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getInputBindings()
 * @model
 * @generated
 */
public interface InputBindings extends RequiredBinding {
	/**
	 * Returns the value of the '<em><b>Configinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configinput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configinput</em>' reference.
	 * @see #setConfiginput(CSQueryPorts)
	 * @see cOSA_m1.COSA_m1Package#getInputBindings_Configinput()
	 * @model required="true"
	 * @generated
	 */
	CSQueryPorts getConfiginput();

	/**
	 * Sets the value of the '{@link cOSA_m1.InputBindings#getConfiginput <em>Configinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configinput</em>' reference.
	 * @see #getConfiginput()
	 * @generated
	 */
	void setConfiginput(CSQueryPorts value);

	/**
	 * Returns the value of the '<em><b>Clientinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientinput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientinput</em>' reference.
	 * @see #setClientinput(ConfigInput)
	 * @see cOSA_m1.COSA_m1Package#getInputBindings_Clientinput()
	 * @model required="true"
	 * @generated
	 */
	ConfigInput getClientinput();

	/**
	 * Sets the value of the '{@link cOSA_m1.InputBindings#getClientinput <em>Clientinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clientinput</em>' reference.
	 * @see #getClientinput()
	 * @generated
	 */
	void setClientinput(ConfigInput value);

} // InputBindings
