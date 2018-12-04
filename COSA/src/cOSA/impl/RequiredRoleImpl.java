/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.Glue;
import cOSA.RequiredRole;

import java.util.Observer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RequiredRoleImpl extends RoleImpl implements RequiredRole {
	

	private Glue glue = null;
	private int glueMode;
	
	
	@Override
	public void setValue(String s) {
		this.value = s;
		this.observat.setValue( (glueMode == 0 ? glue.traitementInOut(s) : glue.traitementOutIn(s)) );
	}
	
	@Override
	public void startBeingObservedBy(Observer o, Glue g, int mode) {
		this.glue = g;
		this.glueMode = mode;
		observat.addObserver(o);
	}
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.REQUIRED_ROLE;
	}

} //RequiredRoleImpl
