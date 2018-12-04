/**
 */
package cOSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.Composant#getInterfacecompo <em>Interfacecompo</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getComposant()
 * @model
 * @generated
 */
public interface Composant extends Element {
	/**
	 * Returns the value of the '<em><b>Interfacecompo</b></em>' containment reference list.
	 * The list contents are of type {@link cOSA.InterfaceCompo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacecompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacecompo</em>' containment reference list.
	 * @see cOSA.COSAPackage#getComposant_Interfacecompo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceCompo> getInterfacecompo();

} // Composant
