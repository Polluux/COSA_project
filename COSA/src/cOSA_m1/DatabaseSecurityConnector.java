/**
 */
package cOSA_m1;

import cOSA.Connecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Security Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.DatabaseSecurityConnector#getDecuritydatabaseoutrole <em>Decuritydatabaseoutrole</em>}</li>
 *   <li>{@link cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityinrole <em>Databasesecurityinrole</em>}</li>
 *   <li>{@link cOSA_m1.DatabaseSecurityConnector#getSecuritydatabaseinrole <em>Securitydatabaseinrole</em>}</li>
 *   <li>{@link cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityoutrole <em>Databasesecurityoutrole</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getDatabaseSecurityConnector()
 * @model
 * @generated
 */
public interface DatabaseSecurityConnector extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Decuritydatabaseoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decuritydatabaseoutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decuritydatabaseoutrole</em>' containment reference.
	 * @see #setDecuritydatabaseoutrole(DecurityDatabaseOutRole)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseSecurityConnector_Decuritydatabaseoutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DecurityDatabaseOutRole getDecuritydatabaseoutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseSecurityConnector#getDecuritydatabaseoutrole <em>Decuritydatabaseoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decuritydatabaseoutrole</em>' containment reference.
	 * @see #getDecuritydatabaseoutrole()
	 * @generated
	 */
	void setDecuritydatabaseoutrole(DecurityDatabaseOutRole value);

	/**
	 * Returns the value of the '<em><b>Databasesecurityinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databasesecurityinrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databasesecurityinrole</em>' containment reference.
	 * @see #setDatabasesecurityinrole(DatabaseSecurityInRole)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseSecurityConnector_Databasesecurityinrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseSecurityInRole getDatabasesecurityinrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityinrole <em>Databasesecurityinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databasesecurityinrole</em>' containment reference.
	 * @see #getDatabasesecurityinrole()
	 * @generated
	 */
	void setDatabasesecurityinrole(DatabaseSecurityInRole value);

	/**
	 * Returns the value of the '<em><b>Securitydatabaseinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitydatabaseinrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitydatabaseinrole</em>' containment reference.
	 * @see #setSecuritydatabaseinrole(SecurityDatabaseInRole)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseSecurityConnector_Securitydatabaseinrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityDatabaseInRole getSecuritydatabaseinrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseSecurityConnector#getSecuritydatabaseinrole <em>Securitydatabaseinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitydatabaseinrole</em>' containment reference.
	 * @see #getSecuritydatabaseinrole()
	 * @generated
	 */
	void setSecuritydatabaseinrole(SecurityDatabaseInRole value);

	/**
	 * Returns the value of the '<em><b>Databasesecurityoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databasesecurityoutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databasesecurityoutrole</em>' containment reference.
	 * @see #setDatabasesecurityoutrole(DatabaseSecurityOutRole)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseSecurityConnector_Databasesecurityoutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseSecurityOutRole getDatabasesecurityoutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseSecurityConnector#getDatabasesecurityoutrole <em>Databasesecurityoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databasesecurityoutrole</em>' containment reference.
	 * @see #getDatabasesecurityoutrole()
	 * @generated
	 */
	void setDatabasesecurityoutrole(DatabaseSecurityOutRole value);

} // DatabaseSecurityConnector
