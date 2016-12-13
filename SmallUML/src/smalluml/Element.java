/**
 */
package smalluml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Element#getNomElement <em>Nom Element</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Element</em>' attribute.
	 * @see #setNomElement(String)
	 * @see smalluml.SmallumlPackage#getElement_NomElement()
	 * @model
	 * @generated
	 */
	String getNomElement();

	/**
	 * Sets the value of the '{@link smalluml.Element#getNomElement <em>Nom Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Element</em>' attribute.
	 * @see #getNomElement()
	 * @generated
	 */
	void setNomElement(String value);

} // Element
