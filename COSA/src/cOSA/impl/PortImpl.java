/**
 */
package cOSA.impl;

import cOSA.COSAPackage;
import cOSA.Port;

import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PortImpl extends MinimalEObjectImpl.Container implements Port {
	
	private String value = null;
	private Obs observat = null;
	
	@Override
	public String getValue() {
		return value;
	}
	
	@Override
	public void setValue(String s) {
		value = s;
		observat.setValue(value);
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
	protected PortImpl() {
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
		return COSAPackage.Literals.PORT;
	}
	
	private class Obs extends Observable{
		public void setValue(String s) {
			setChanged();
			notifyObservers(s);
		}
	}

} //PortImpl
