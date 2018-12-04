/**
 */
package cOSA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cOSA.Glue#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link cOSA.Glue#getRequiredrole <em>Requiredrole</em>}</li>
 * </ul>
 *
 * @see cOSA.COSAPackage#getGlue()
 * @model
 * @generated
 */
public interface Glue extends EObject {
	/**
	 * Returns the value of the '<em><b>Providedrole</b></em>' reference list.
	 * The list contents are of type {@link cOSA.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole</em>' reference list.
	 * @see cOSA.COSAPackage#getGlue_Providedrole()
	 * @model required="true"
	 * @generated
	 */
	EList<ProvidedRole> getProvidedrole();

	/**
	 * Returns the value of the '<em><b>Requiredrole</b></em>' reference list.
	 * The list contents are of type {@link cOSA.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredrole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredrole</em>' reference list.
	 * @see cOSA.COSAPackage#getGlue_Requiredrole()
	 * @model required="true"
	 * @generated
	 */
	EList<RequiredRole> getRequiredrole();
	
	public String traitementInOut(String s);
	public String traitementOutIn(String s);

} // Glue
