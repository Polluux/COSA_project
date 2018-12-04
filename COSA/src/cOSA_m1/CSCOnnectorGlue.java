/**
 */
package cOSA_m1;

import cOSA.Glue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSC Onnector Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.CSCOnnectorGlue#getConnectionoutput <em>Connectionoutput</em>}</li>
 *   <li>{@link cOSA_m1.CSCOnnectorGlue#getConnectioninput <em>Connectioninput</em>}</li>
 *   <li>{@link cOSA_m1.CSCOnnectorGlue#getSecurityinput <em>Securityinput</em>}</li>
 *   <li>{@link cOSA_m1.CSCOnnectorGlue#getSecurityoutput <em>Securityoutput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getCSCOnnectorGlue()
 * @model
 * @generated
 */
public interface CSCOnnectorGlue extends Glue {
	/**
	 * Returns the value of the '<em><b>Connectionoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionoutput</em>' reference.
	 * @see #setConnectionoutput(ConnectionSecurityInRole)
	 * @see cOSA_m1.COSA_m1Package#getCSCOnnectorGlue_Connectionoutput()
	 * @model required="true"
	 * @generated
	 */
	ConnectionSecurityInRole getConnectionoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CSCOnnectorGlue#getConnectionoutput <em>Connectionoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionoutput</em>' reference.
	 * @see #getConnectionoutput()
	 * @generated
	 */
	void setConnectionoutput(ConnectionSecurityInRole value);

	/**
	 * Returns the value of the '<em><b>Connectioninput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectioninput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectioninput</em>' reference.
	 * @see #setConnectioninput(SecurityConnectionOutRole)
	 * @see cOSA_m1.COSA_m1Package#getCSCOnnectorGlue_Connectioninput()
	 * @model required="true"
	 * @generated
	 */
	SecurityConnectionOutRole getConnectioninput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CSCOnnectorGlue#getConnectioninput <em>Connectioninput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectioninput</em>' reference.
	 * @see #getConnectioninput()
	 * @generated
	 */
	void setConnectioninput(SecurityConnectionOutRole value);

	/**
	 * Returns the value of the '<em><b>Securityinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityinput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityinput</em>' reference.
	 * @see #setSecurityinput(ConnectionSecurityOutRole)
	 * @see cOSA_m1.COSA_m1Package#getCSCOnnectorGlue_Securityinput()
	 * @model required="true"
	 * @generated
	 */
	ConnectionSecurityOutRole getSecurityinput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CSCOnnectorGlue#getSecurityinput <em>Securityinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityinput</em>' reference.
	 * @see #getSecurityinput()
	 * @generated
	 */
	void setSecurityinput(ConnectionSecurityOutRole value);

	/**
	 * Returns the value of the '<em><b>Securityoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityoutput</em>' reference.
	 * @see #setSecurityoutput(SecurityConnectionInRole)
	 * @see cOSA_m1.COSA_m1Package#getCSCOnnectorGlue_Securityoutput()
	 * @model required="true"
	 * @generated
	 */
	SecurityConnectionInRole getSecurityoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CSCOnnectorGlue#getSecurityoutput <em>Securityoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityoutput</em>' reference.
	 * @see #getSecurityoutput()
	 * @generated
	 */
	void setSecurityoutput(SecurityConnectionInRole value);

} // CSCOnnectorGlue
