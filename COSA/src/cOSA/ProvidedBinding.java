/**
 */
package cOSA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.ProvidedBinding#getComponentPort <em>Component Port</em>}</li>
 *   <li>{@link cOSA.ProvidedBinding#getConfigPort <em>Config Port</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getProvidedBinding()
 * @model
 * @generated
 */
public interface ProvidedBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Port</em>' reference.
	 * @see #setComponentPort(ProvidedPort)
	 * @see cOSA.COSAPackage#getProvidedBinding_ComponentPort()
	 * @model required="true"
	 * @generated
	 */
	ProvidedPort getComponentPort();

	/**
	 * Sets the value of the '{@link cOSA.ProvidedBinding#getComponentPort <em>Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Port</em>' reference.
	 * @see #getComponentPort()
	 * @generated
	 */
	void setComponentPort(ProvidedPort value);

	/**
	 * Returns the value of the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Port</em>' reference.
	 * @see #setConfigPort(ProvidedPort)
	 * @see cOSA.COSAPackage#getProvidedBinding_ConfigPort()
	 * @model required="true"
	 * @generated
	 */
	ProvidedPort getConfigPort();

	/**
	 * Sets the value of the '{@link cOSA.ProvidedBinding#getConfigPort <em>Config Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Port</em>' reference.
	 * @see #getConfigPort()
	 * @generated
	 */
	void setConfigPort(ProvidedPort value);

} // ProvidedBinding
