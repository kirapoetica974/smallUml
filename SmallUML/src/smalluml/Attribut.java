/**
 */
package smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Attribut#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see smalluml.SmallumlPackage#getAttribut_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link smalluml.Attribut#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Attribut
