/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Package#getElementsPackage <em>Elements Package</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ElementPackage, ElementNomme {
	/**
	 * Returns the value of the '<em><b>Elements Package</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.ElementPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Package</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getPackage_ElementsPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementPackage> getElementsPackage();

} // Package
