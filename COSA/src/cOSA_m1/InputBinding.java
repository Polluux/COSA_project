/**
 */
package cOSA_m1;

import cOSA.RequiredBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.InputBinding#getServerinput <em>Serverinput</em>}</li>
 *   <li>{@link cOSA_m1.InputBinding#getServerconfiginput <em>Serverconfiginput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getInputBinding()
 * @model
 * @generated
 */
public interface InputBinding extends RequiredBinding {
	/**
	 * Returns the value of the '<em><b>Serverinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverinput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverinput</em>' reference.
	 * @see #setServerinput(ServerInput)
	 * @see cOSA_m1.COSA_m1Package#getInputBinding_Serverinput()
	 * @model required="true"
	 * @generated
	 */
	ServerInput getServerinput();

	/**
	 * Sets the value of the '{@link cOSA_m1.InputBinding#getServerinput <em>Serverinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverinput</em>' reference.
	 * @see #getServerinput()
	 * @generated
	 */
	void setServerinput(ServerInput value);

	/**
	 * Returns the value of the '<em><b>Serverconfiginput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverconfiginput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverconfiginput</em>' reference.
	 * @see #setServerconfiginput(ServerConfigInput)
	 * @see cOSA_m1.COSA_m1Package#getInputBinding_Serverconfiginput()
	 * @model required="true"
	 * @generated
	 */
	ServerConfigInput getServerconfiginput();

	/**
	 * Sets the value of the '{@link cOSA_m1.InputBinding#getServerconfiginput <em>Serverconfiginput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverconfiginput</em>' reference.
	 * @see #getServerconfiginput()
	 * @generated
	 */
	void setServerconfiginput(ServerConfigInput value);

} // InputBinding
