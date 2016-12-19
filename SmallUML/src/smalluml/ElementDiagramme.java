/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Diagramme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.ElementDiagramme#getClasse <em>Classe</em>}</li>
 *   <li>{@link smalluml.ElementDiagramme#getAssociation <em>Association</em>}</li>
 *   <li>{@link smalluml.ElementDiagramme#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link smalluml.ElementDiagramme#getTypeDonnee <em>Type Donnee</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getElementDiagramme()
 * @model abstract="true"
 * @generated
 */
public interface ElementDiagramme extends EObject {
	/**
	 * Returns the value of the '<em><b>Classe</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Classe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getElementDiagramme_Classe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classe> getClasse();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getElementDiagramme_Association()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getElementDiagramme_Enumeration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumeration();

	/**
	 * Returns the value of the '<em><b>Type Donnee</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.TypeDonnee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Donnee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Donnee</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getElementDiagramme_TypeDonnee()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDonnee> getTypeDonnee();

} // ElementDiagramme
