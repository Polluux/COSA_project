/**
 */
package cOSA_m1;

import cOSA.ProvidedBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.OutputBinding#getServerconfigoutput <em>Serverconfigoutput</em>}</li>
 *   <li>{@link cOSA_m1.OutputBinding#getServerouput <em>Serverouput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getOutputBinding()
 * @model
 * @generated
 */
public interface OutputBinding extends ProvidedBinding {
	/**
	 * Returns the value of the '<em><b>Serverconfigoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverconfigoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverconfigoutput</em>' reference.
	 * @see #setServerconfigoutput(ServerConfigOutput)
	 * @see cOSA_m1.COSA_m1Package#getOutputBinding_Serverconfigoutput()
	 * @model required="true"
	 * @generated
	 */
	ServerConfigOutput getServerconfigoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.OutputBinding#getServerconfigoutput <em>Serverconfigoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverconfigoutput</em>' reference.
	 * @see #getServerconfigoutput()
	 * @generated
	 */
	void setServerconfigoutput(ServerConfigOutput value);

	/**
	 * Returns the value of the '<em><b>Serverouput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverouput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverouput</em>' reference.
	 * @see #setServerouput(ServerOuput)
	 * @see cOSA_m1.COSA_m1Package#getOutputBinding_Serverouput()
	 * @model required="true"
	 * @generated
	 */
	ServerOuput getServerouput();

	/**
	 * Sets the value of the '{@link cOSA_m1.OutputBinding#getServerouput <em>Serverouput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverouput</em>' reference.
	 * @see #getServerouput()
	 * @generated
	 */
	void setServerouput(ServerOuput value);

} // OutputBinding
