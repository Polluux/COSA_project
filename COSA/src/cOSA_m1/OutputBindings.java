/**
 */
package cOSA_m1;

import cOSA.ProvidedBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Bindings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.OutputBindings#getClientoutput <em>Clientoutput</em>}</li>
 *   <li>{@link cOSA_m1.OutputBindings#getConfigoutput <em>Configoutput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getOutputBindings()
 * @model
 * @generated
 */
public interface OutputBindings extends ProvidedBinding {
	/**
	 * Returns the value of the '<em><b>Clientoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientoutput</em>' reference.
	 * @see #setClientoutput(ConfigOutput)
	 * @see cOSA_m1.COSA_m1Package#getOutputBindings_Clientoutput()
	 * @model required="true"
	 * @generated
	 */
	ConfigOutput getClientoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.OutputBindings#getClientoutput <em>Clientoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clientoutput</em>' reference.
	 * @see #getClientoutput()
	 * @generated
	 */
	void setClientoutput(ConfigOutput value);

	/**
	 * Returns the value of the '<em><b>Configoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configoutput</em>' reference.
	 * @see #setConfigoutput(CSResponsePorts)
	 * @see cOSA_m1.COSA_m1Package#getOutputBindings_Configoutput()
	 * @model required="true"
	 * @generated
	 */
	CSResponsePorts getConfigoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.OutputBindings#getConfigoutput <em>Configoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configoutput</em>' reference.
	 * @see #getConfigoutput()
	 * @generated
	 */
	void setConfigoutput(CSResponsePorts value);

} // OutputBindings
