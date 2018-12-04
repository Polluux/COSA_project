/**
 */
package cOSA;

import java.util.Observable;
import java.util.Observer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cOSA.COSAPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends InterfaceConfig, InterfaceCompo, Observer {
	public String getValue();
	
	public void setValue(String s);
	
	public Observable getObs();
	
	public void startBeingObservedBy(Observer o);
	
	public void stopBeingObservedBy(Observer o);
} // Port
