/**
 */
package cOSA_m1;

import cOSA.Composant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.DataBase#getDatabaseinputfromconnectionport <em>Databaseinputfromconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.DataBase#getDatabaseoutputtoconnectionport <em>Databaseoutputtoconnectionport</em>}</li>
 *   <li>{@link cOSA_m1.DataBase#getDatabaseoutputtosecurityport <em>Databaseoutputtosecurityport</em>}</li>
 *   <li>{@link cOSA_m1.DataBase#getDatabaseinputfromsecurityport <em>Databaseinputfromsecurityport</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends Composant {
	/**
	 * Returns the value of the '<em><b>Databaseinputfromconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseinputfromconnectionport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseinputfromconnectionport</em>' containment reference.
	 * @see #setDatabaseinputfromconnectionport(DatabaseInputFromConnectionPort)
	 * @see cOSA_m1.COSA_m1Package#getDataBase_Databaseinputfromconnectionport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseInputFromConnectionPort getDatabaseinputfromconnectionport();

	/**
	 * Sets the value of the '{@link cOSA_m1.DataBase#getDatabaseinputfromconnectionport <em>Databaseinputfromconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseinputfromconnectionport</em>' containment reference.
	 * @see #getDatabaseinputfromconnectionport()
	 * @generated
	 */
	void setDatabaseinputfromconnectionport(DatabaseInputFromConnectionPort value);

	/**
	 * Returns the value of the '<em><b>Databaseoutputtoconnectionport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseoutputtoconnectionport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseoutputtoconnectionport</em>' containment reference.
	 * @see #setDatabaseoutputtoconnectionport(DatabaseOutputToConnectionPort)
	 * @see cOSA_m1.COSA_m1Package#getDataBase_Databaseoutputtoconnectionport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseOutputToConnectionPort getDatabaseoutputtoconnectionport();

	/**
	 * Sets the value of the '{@link cOSA_m1.DataBase#getDatabaseoutputtoconnectionport <em>Databaseoutputtoconnectionport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseoutputtoconnectionport</em>' containment reference.
	 * @see #getDatabaseoutputtoconnectionport()
	 * @generated
	 */
	void setDatabaseoutputtoconnectionport(DatabaseOutputToConnectionPort value);

	/**
	 * Returns the value of the '<em><b>Databaseoutputtosecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseoutputtosecurityport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseoutputtosecurityport</em>' containment reference.
	 * @see #setDatabaseoutputtosecurityport(DatabaseOutputToSecurityPort)
	 * @see cOSA_m1.COSA_m1Package#getDataBase_Databaseoutputtosecurityport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseOutputToSecurityPort getDatabaseoutputtosecurityport();

	/**
	 * Sets the value of the '{@link cOSA_m1.DataBase#getDatabaseoutputtosecurityport <em>Databaseoutputtosecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseoutputtosecurityport</em>' containment reference.
	 * @see #getDatabaseoutputtosecurityport()
	 * @generated
	 */
	void setDatabaseoutputtosecurityport(DatabaseOutputToSecurityPort value);

	/**
	 * Returns the value of the '<em><b>Databaseinputfromsecurityport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseinputfromsecurityport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseinputfromsecurityport</em>' containment reference.
	 * @see #setDatabaseinputfromsecurityport(DatabaseInputFromSecurityPort)
	 * @see cOSA_m1.COSA_m1Package#getDataBase_Databaseinputfromsecurityport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatabaseInputFromSecurityPort getDatabaseinputfromsecurityport();

	/**
	 * Sets the value of the '{@link cOSA_m1.DataBase#getDatabaseinputfromsecurityport <em>Databaseinputfromsecurityport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseinputfromsecurityport</em>' containment reference.
	 * @see #getDatabaseinputfromsecurityport()
	 * @generated
	 */
	void setDatabaseinputfromsecurityport(DatabaseInputFromSecurityPort value);

} // DataBase
