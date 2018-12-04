/**
 */
package cOSA_m1;

import cOSA.Glue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Connector Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.DSConnectorGlue#getDatabaseinput <em>Databaseinput</em>}</li>
 *   <li>{@link cOSA_m1.DSConnectorGlue#getDatabaseoutput <em>Databaseoutput</em>}</li>
 *   <li>{@link cOSA_m1.DSConnectorGlue#getSecurityinput <em>Securityinput</em>}</li>
 *   <li>{@link cOSA_m1.DSConnectorGlue#getSecurityoutput <em>Securityoutput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getDSConnectorGlue()
 * @model
 * @generated
 */
public interface DSConnectorGlue extends Glue {
	/**
	 * Returns the value of the '<em><b>Databaseinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseinput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseinput</em>' reference.
	 * @see #setDatabaseinput(DecurityDatabaseOutRole)
	 * @see cOSA_m1.COSA_m1Package#getDSConnectorGlue_Databaseinput()
	 * @model required="true"
	 * @generated
	 */
	DecurityDatabaseOutRole getDatabaseinput();

	/**
	 * Sets the value of the '{@link cOSA_m1.DSConnectorGlue#getDatabaseinput <em>Databaseinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseinput</em>' reference.
	 * @see #getDatabaseinput()
	 * @generated
	 */
	void setDatabaseinput(DecurityDatabaseOutRole value);

	/**
	 * Returns the value of the '<em><b>Databaseoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseoutput</em>' reference.
	 * @see #setDatabaseoutput(DatabaseSecurityInRole)
	 * @see cOSA_m1.COSA_m1Package#getDSConnectorGlue_Databaseoutput()
	 * @model required="true"
	 * @generated
	 */
	DatabaseSecurityInRole getDatabaseoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.DSConnectorGlue#getDatabaseoutput <em>Databaseoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseoutput</em>' reference.
	 * @see #getDatabaseoutput()
	 * @generated
	 */
	void setDatabaseoutput(DatabaseSecurityInRole value);

	/**
	 * Returns the value of the '<em><b>Securityinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityinput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityinput</em>' reference.
	 * @see #setSecurityinput(DatabaseSecurityOutRole)
	 * @see cOSA_m1.COSA_m1Package#getDSConnectorGlue_Securityinput()
	 * @model required="true"
	 * @generated
	 */
	DatabaseSecurityOutRole getSecurityinput();

	/**
	 * Sets the value of the '{@link cOSA_m1.DSConnectorGlue#getSecurityinput <em>Securityinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityinput</em>' reference.
	 * @see #getSecurityinput()
	 * @generated
	 */
	void setSecurityinput(DatabaseSecurityOutRole value);

	/**
	 * Returns the value of the '<em><b>Securityoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityoutput</em>' reference.
	 * @see #setSecurityoutput(SecurityDatabaseInRole)
	 * @see cOSA_m1.COSA_m1Package#getDSConnectorGlue_Securityoutput()
	 * @model required="true"
	 * @generated
	 */
	SecurityDatabaseInRole getSecurityoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.DSConnectorGlue#getSecurityoutput <em>Securityoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityoutput</em>' reference.
	 * @see #getSecurityoutput()
	 * @generated
	 */
	void setSecurityoutput(SecurityDatabaseInRole value);

} // DSConnectorGlue
