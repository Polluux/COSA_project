/**
 */
package cOSA_m1;

import cOSA.Glue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD Connector Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.CDConnectorGlue#getConnectionoutput <em>Connectionoutput</em>}</li>
 *   <li>{@link cOSA_m1.CDConnectorGlue#getConnectioninput <em>Connectioninput</em>}</li>
 *   <li>{@link cOSA_m1.CDConnectorGlue#getDatabaseinput <em>Databaseinput</em>}</li>
 *   <li>{@link cOSA_m1.CDConnectorGlue#getDatabaseoutput <em>Databaseoutput</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getCDConnectorGlue()
 * @model
 * @generated
 */
public interface CDConnectorGlue extends Glue {
	/**
	 * Returns the value of the '<em><b>Connectionoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionoutput</em>' reference.
	 * @see #setConnectionoutput(ConnectionDBInRole)
	 * @see cOSA_m1.COSA_m1Package#getCDConnectorGlue_Connectionoutput()
	 * @model required="true"
	 * @generated
	 */
	ConnectionDBInRole getConnectionoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CDConnectorGlue#getConnectionoutput <em>Connectionoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionoutput</em>' reference.
	 * @see #getConnectionoutput()
	 * @generated
	 */
	void setConnectionoutput(ConnectionDBInRole value);

	/**
	 * Returns the value of the '<em><b>Connectioninput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectioninput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectioninput</em>' reference.
	 * @see #setConnectioninput(DBConnectionOutRole)
	 * @see cOSA_m1.COSA_m1Package#getCDConnectorGlue_Connectioninput()
	 * @model required="true"
	 * @generated
	 */
	DBConnectionOutRole getConnectioninput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CDConnectorGlue#getConnectioninput <em>Connectioninput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectioninput</em>' reference.
	 * @see #getConnectioninput()
	 * @generated
	 */
	void setConnectioninput(DBConnectionOutRole value);

	/**
	 * Returns the value of the '<em><b>Databaseinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseinput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseinput</em>' reference.
	 * @see #setDatabaseinput(ConnectionDBOutRole)
	 * @see cOSA_m1.COSA_m1Package#getCDConnectorGlue_Databaseinput()
	 * @model required="true"
	 * @generated
	 */
	ConnectionDBOutRole getDatabaseinput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CDConnectorGlue#getDatabaseinput <em>Databaseinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseinput</em>' reference.
	 * @see #getDatabaseinput()
	 * @generated
	 */
	void setDatabaseinput(ConnectionDBOutRole value);

	/**
	 * Returns the value of the '<em><b>Databaseoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databaseoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databaseoutput</em>' reference.
	 * @see #setDatabaseoutput(DBConnectionInRole)
	 * @see cOSA_m1.COSA_m1Package#getCDConnectorGlue_Databaseoutput()
	 * @model required="true"
	 * @generated
	 */
	DBConnectionInRole getDatabaseoutput();

	/**
	 * Sets the value of the '{@link cOSA_m1.CDConnectorGlue#getDatabaseoutput <em>Databaseoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databaseoutput</em>' reference.
	 * @see #getDatabaseoutput()
	 * @generated
	 */
	void setDatabaseoutput(DBConnectionInRole value);

} // CDConnectorGlue
