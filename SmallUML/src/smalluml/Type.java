/**
 */
package smalluml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Type#getNomType <em>Nom Type</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Type</em>' attribute.
	 * @see #setNomType(String)
	 * @see smalluml.SmallumlPackage#getType_NomType()
	 * @model
	 * @generated
	 */
	String getNomType();

	/**
	 * Sets the value of the '{@link smalluml.Type#getNomType <em>Nom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Type</em>' attribute.
	 * @see #getNomType()
	 * @generated
	 */
	void setNomType(String value);

} // Type
