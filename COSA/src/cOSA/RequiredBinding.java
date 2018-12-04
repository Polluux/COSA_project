/**
 */
package cOSA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.RequiredBinding#getConfigPort <em>Config Port</em>}</li>
 *   <li>{@link cOSA.RequiredBinding#getComponentPort <em>Component Port</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getRequiredBinding()
 * @model
 * @generated
 */
public interface RequiredBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Config Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Port</em>' reference.
	 * @see #setConfigPort(RequiredPort)
	 * @see cOSA.COSAPackage#getRequiredBinding_ConfigPort()
	 * @model required="true"
	 * @generated
	 */
	RequiredPort getConfigPort();

	/**
	 * Sets the value of the '{@link cOSA.RequiredBinding#getConfigPort <em>Config Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Port</em>' reference.
	 * @see #getConfigPort()
	 * @generated
	 */
	void setConfigPort(RequiredPort value);

	/**
	 * Returns the value of the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Port</em>' reference.
	 * @see #setComponentPort(RequiredPort)
	 * @see cOSA.COSAPackage#getRequiredBinding_ComponentPort()
	 * @model required="true"
	 * @generated
	 */
	RequiredPort getComponentPort();

	/**
	 * Sets the value of the '{@link cOSA.RequiredBinding#getComponentPort <em>Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Port</em>' reference.
	 * @see #getComponentPort()
	 * @generated
	 */
	void setComponentPort(RequiredPort value);

} // RequiredBinding
