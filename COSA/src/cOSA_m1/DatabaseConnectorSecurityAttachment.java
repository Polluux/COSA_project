/**
 */
package cOSA_m1;

import cOSA.AComposantConnecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Connector Security Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA_m1.DatabaseConnectorSecurityAttachment#getFrom <em>From</em>}</li>
 *   <li>{@link cOSA_m1.DatabaseConnectorSecurityAttachment#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see cOSA_m1.COSA_m1Package#getDatabaseConnectorSecurityAttachment()
 * @model
 * @generated
 */
public interface DatabaseConnectorSecurityAttachment extends AComposantConnecteur {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DatabaseOutputToSecurityPort)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseConnectorSecurityAttachment_From()
	 * @model required="true"
	 * @generated
	 */
	DatabaseOutputToSecurityPort getFrom();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseConnectorSecurityAttachment#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DatabaseOutputToSecurityPort value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DatabaseSecurityInRole)
	 * @see cOSA_m1.COSA_m1Package#getDatabaseConnectorSecurityAttachment_To()
	 * @model required="true"
	 * @generated
	 */
	DatabaseSecurityInRole getTo();

	/**
	 * Sets the value of the '{@link cOSA_m1.DatabaseConnectorSecurityAttachment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DatabaseSecurityInRole value);

} // DatabaseConnectorSecurityAttachment
