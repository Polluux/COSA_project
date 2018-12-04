/**
 */
package cOSA_m1;

import cOSA.Connecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Database Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.ConnectionDatabaseConnector#getConnectiondbinrole <em>Connectiondbinrole</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionDatabaseConnector#getDbconnectionoutrole <em>Dbconnectionoutrole</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionDatabaseConnector#getConnectiondboutrole <em>Connectiondboutrole</em>}</li>
 *   <li>{@link cOSA_m1.ConnectionDatabaseConnector#getDbconnectioninrole <em>Dbconnectioninrole</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getConnectionDatabaseConnector()
 * @model
 * @generated
 */
public interface ConnectionDatabaseConnector extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Connectiondbinrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectiondbinrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectiondbinrole</em>' containment reference.
	 * @see #setConnectiondbinrole(ConnectionDBInRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionDatabaseConnector_Connectiondbinrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionDBInRole getConnectiondbinrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionDatabaseConnector#getConnectiondbinrole <em>Connectiondbinrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectiondbinrole</em>' containment reference.
	 * @see #getConnectiondbinrole()
	 * @generated
	 */
	void setConnectiondbinrole(ConnectionDBInRole value);

	/**
	 * Returns the value of the '<em><b>Dbconnectionoutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbconnectionoutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbconnectionoutrole</em>' containment reference.
	 * @see #setDbconnectionoutrole(DBConnectionOutRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionDatabaseConnector_Dbconnectionoutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DBConnectionOutRole getDbconnectionoutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionDatabaseConnector#getDbconnectionoutrole <em>Dbconnectionoutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbconnectionoutrole</em>' containment reference.
	 * @see #getDbconnectionoutrole()
	 * @generated
	 */
	void setDbconnectionoutrole(DBConnectionOutRole value);

	/**
	 * Returns the value of the '<em><b>Connectiondboutrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectiondboutrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectiondboutrole</em>' containment reference.
	 * @see #setConnectiondboutrole(ConnectionDBOutRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionDatabaseConnector_Connectiondboutrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionDBOutRole getConnectiondboutrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionDatabaseConnector#getConnectiondboutrole <em>Connectiondboutrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectiondboutrole</em>' containment reference.
	 * @see #getConnectiondboutrole()
	 * @generated
	 */
	void setConnectiondboutrole(ConnectionDBOutRole value);

	/**
	 * Returns the value of the '<em><b>Dbconnectioninrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbconnectioninrole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbconnectioninrole</em>' containment reference.
	 * @see #setDbconnectioninrole(DBConnectionInRole)
	 * @see cOSA_m1.COSA_m1Package#getConnectionDatabaseConnector_Dbconnectioninrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DBConnectionInRole getDbconnectioninrole();

	/**
	 * Sets the value of the '{@link cOSA_m1.ConnectionDatabaseConnector#getDbconnectioninrole <em>Dbconnectioninrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbconnectioninrole</em>' containment reference.
	 * @see #getDbconnectioninrole()
	 * @generated
	 */
	void setDbconnectioninrole(DBConnectionInRole value);

} // ConnectionDatabaseConnector
