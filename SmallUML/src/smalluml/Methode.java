/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Methode#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link smalluml.Methode#getTypeDeRetour <em>Type De Retour</em>}</li>
 *   <li>{@link smalluml.Methode#getParametres <em>Parametres</em>}</li>
 *   <li>{@link smalluml.Methode#isAbstrait <em>Abstrait</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getMethode()
 * @model
 * @generated
 */
public interface Methode extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Methode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Methode</em>' attribute.
	 * @see #setNomMethode(String)
	 * @see smalluml.SmallumlPackage#getMethode_NomMethode()
	 * @model
	 * @generated
	 */
	String getNomMethode();

	/**
	 * Sets the value of the '{@link smalluml.Methode#getNomMethode <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Methode</em>' attribute.
	 * @see #getNomMethode()
	 * @generated
	 */
	void setNomMethode(String value);

	/**
	 * Returns the value of the '<em><b>Type De Retour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type De Retour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type De Retour</em>' reference.
	 * @see #setTypeDeRetour(Type)
	 * @see smalluml.SmallumlPackage#getMethode_TypeDeRetour()
	 * @model
	 * @generated
	 */
	Type getTypeDeRetour();

	/**
	 * Sets the value of the '{@link smalluml.Methode#getTypeDeRetour <em>Type De Retour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type De Retour</em>' reference.
	 * @see #getTypeDeRetour()
	 * @generated
	 */
	void setTypeDeRetour(Type value);

	/**
	 * Returns the value of the '<em><b>Parametres</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Attribut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametres</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametres</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getMethode_Parametres()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribut> getParametres();

	/**
	 * Returns the value of the '<em><b>Abstrait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstrait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstrait</em>' attribute.
	 * @see #setAbstrait(boolean)
	 * @see smalluml.SmallumlPackage#getMethode_Abstrait()
	 * @model
	 * @generated
	 */
	boolean isAbstrait();

	/**
	 * Sets the value of the '{@link smalluml.Methode#isAbstrait <em>Abstrait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstrait</em>' attribute.
	 * @see #isAbstrait()
	 * @generated
	 */
	void setAbstrait(boolean value);

} // Methode
