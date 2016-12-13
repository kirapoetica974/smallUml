/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Donnee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.TypeDonnee#getAttributs <em>Attributs</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getTypeDonnee()
 * @model
 * @generated
 */
public interface TypeDonnee extends Type {
	/**
	 * Returns the value of the '<em><b>Attributs</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Attribut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributs</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getTypeDonnee_Attributs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribut> getAttributs();

} // TypeDonnee
