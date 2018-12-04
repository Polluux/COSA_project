/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.Glue;
import cOSA.Role;

import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RoleImpl extends MinimalEObjectImpl.Container implements Role {
	
	String value = null;
	Obs observat = null;
	
	@Override
	public String getValue() {
		return value;
	}
	
	@Override
	public void setValue(String s) {
		value = s;
		observat.setValue(s);
	}
	
	@Override
	public Observable getObs() {
		return (Observable)observat;
	}
	
	@Override
	public void startBeingObservedBy(Observer o) {
		observat.addObserver(o);
	}
	
	@Override
	public void stopBeingObservedBy(Observer o) {
		observat.deleteObserver(o);
	}
	
	@Override
	public void update(Observable o, Object value) {
		this.setValue((String)value);
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
		observat = new Obs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSAPackage.Literals.ROLE;
	}
	
	class Obs extends Observable{
		public void setValue(String s) {
			setChanged();
			notifyObservers(s);
		}
	}


} //RoleImpl
