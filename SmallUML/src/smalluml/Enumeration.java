/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Enumeration#getNomEnumeration <em>Nom Enumeration</em>}</li>
 *   <li>{@link smalluml.Enumeration#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type {
	/**
	 * Returns the value of the '<em><b>Nom Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Enumeration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Enumeration</em>' attribute.
	 * @see #setNomEnumeration(String)
	 * @see smalluml.SmallumlPackage#getEnumeration_NomEnumeration()
	 * @model
	 * @generated
	 */
	String getNomEnumeration();

	/**
	 * Sets the value of the '{@link smalluml.Enumeration#getNomEnumeration <em>Nom Enumeration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Enumeration</em>' attribute.
	 * @see #getNomEnumeration()
	 * @generated
	 */
	void setNomEnumeration(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getEnumeration_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Enumeration
