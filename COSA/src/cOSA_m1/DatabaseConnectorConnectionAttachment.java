/**
 */
package cOSA_m1;

import cOSA.AComposantConnecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Connector Connection Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.DatabaseConnectorConnectionAttachment#getTo <em>To</em>}</li>
 *   <li>{@link cOSA_m1.DatabaseConnectorConnectionAttachment#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getDatabaseConnectorConnectionAttachment()
 * @model
 * @generated
 */
public interface DatabaseConnectorConnectionAttachment extends AComposantConnecteur {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DBConnectionInRole)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseConnectorConnectionAttachment_To()
	 * @model required="true"
	 * @generated
	 */
	DBConnectionInRole getTo();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseConnectorConnectionAttachment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DBConnectionInRole value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DatabaseOutputToConnectionPort)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseConnectorConnectionAttachment_From()
	 * @model required="true"
	 * @generated
	 */
	DatabaseOutputToConnectionPort getFrom();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseConnectorConnectionAttachment#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DatabaseOutputToConnectionPort value);

} // DatabaseConnectorConnectionAttachment
