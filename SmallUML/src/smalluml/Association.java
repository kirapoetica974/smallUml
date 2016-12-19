/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Association#getCardinalites <em>Cardinalites</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends ElementDiagramme, ElementNomme {
	/**
	 * Returns the value of the '<em><b>Cardinalites</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Cardinalite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinalites</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getAssociation_Cardinalites()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Cardinalite> getCardinalites();

} // Association
