/**
 */
package cOSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.Configuration#getElement <em>Element</em>}</li>
 *   <li>{@link cOSA.Configuration#getIconfiguration <em>Iconfiguration</em>}</li>
 *   <li>{@link cOSA.Configuration#getBiding <em>Biding</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Element {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see cOSA.COSAPackage#getConfiguration_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Iconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA.InterfaceConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iconfiguration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iconfiguration</em>' containment reference list.
	 * @see cOSA.COSAPackage#getConfiguration_Iconfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceConfig> getIconfiguration();

	/**
	 * Returns the value of the '<em><b>Biding</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biding</em>' containment reference list.
	 * @see cOSA.COSAPackage#getConfiguration_Biding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBiding();

} // Configuration
