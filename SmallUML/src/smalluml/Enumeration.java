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
 *   <li>{@link smalluml.Enumeration#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type, ElementDiagramme, ElementNomme {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute list.
	 * @see smalluml.SmallumlPackage#getEnumeration_Elements()
	 * @model
	 * @generated
	 */
	EList<String> getElements();

} // Enumeration
