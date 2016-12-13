/**
 */
package smalluml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Attribut#getNomAttribut <em>Nom Attribut</em>}</li>
 *   <li>{@link smalluml.Attribut#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Attribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Attribut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Attribut</em>' attribute.
	 * @see #setNomAttribut(String)
	 * @see smalluml.SmallumlPackage#getAttribut_NomAttribut()
	 * @model
	 * @generated
	 */
	String getNomAttribut();

	/**
	 * Sets the value of the '{@link smalluml.Attribut#getNomAttribut <em>Nom Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Attribut</em>' attribute.
	 * @see #getNomAttribut()
	 * @generated
	 */
	void setNomAttribut(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see smalluml.SmallumlPackage#getAttribut_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link smalluml.Attribut#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Attribut
