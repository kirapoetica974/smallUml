/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagramme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Diagramme#getElementsDiagramme <em>Elements Diagramme</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getDiagramme()
 * @model
 * @generated
 */
public interface Diagramme extends ElementDiagramme, ElementNomme {
	/**
	 * Returns the value of the '<em><b>Elements Diagramme</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.ElementDiagramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements Diagramme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Diagramme</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getDiagramme_ElementsDiagramme()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDiagramme> getElementsDiagramme();

} // Diagramme
