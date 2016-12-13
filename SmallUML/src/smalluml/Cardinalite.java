/**
 */
package smalluml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinalite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Cardinalite#getMultiplicite <em>Multiplicite</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getCardinalite()
 * @model
 * @generated
 */
public interface Cardinalite extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicite</em>' attribute.
	 * @see #setMultiplicite(String)
	 * @see smalluml.SmallumlPackage#getCardinalite_Multiplicite()
	 * @model
	 * @generated
	 */
	String getMultiplicite();

	/**
	 * Sets the value of the '{@link smalluml.Cardinalite#getMultiplicite <em>Multiplicite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicite</em>' attribute.
	 * @see #getMultiplicite()
	 * @generated
	 */
	void setMultiplicite(String value);

} // Cardinalite
