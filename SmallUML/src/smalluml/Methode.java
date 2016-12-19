/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Methode#getTypeDeRetour <em>Type De Retour</em>}</li>
 *   <li>{@link smalluml.Methode#getParametres <em>Parametres</em>}</li>
 *   <li>{@link smalluml.Methode#isMethodeAbstraite <em>Methode Abstraite</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getMethode()
 * @model
 * @generated
 */
public interface Methode extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Type De Retour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type De Retour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type De Retour</em>' containment reference.
	 * @see #setTypeDeRetour(Type)
	 * @see smalluml.SmallumlPackage#getMethode_TypeDeRetour()
	 * @model containment="true"
	 * @generated
	 */
	Type getTypeDeRetour();

	/**
	 * Sets the value of the '{@link smalluml.Methode#getTypeDeRetour <em>Type De Retour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type De Retour</em>' containment reference.
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
	 * Returns the value of the '<em><b>Methode Abstraite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methode Abstraite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode Abstraite</em>' attribute.
	 * @see #setMethodeAbstraite(boolean)
	 * @see smalluml.SmallumlPackage#getMethode_MethodeAbstraite()
	 * @model
	 * @generated
	 */
	boolean isMethodeAbstraite();

	/**
	 * Sets the value of the '{@link smalluml.Methode#isMethodeAbstraite <em>Methode Abstraite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode Abstraite</em>' attribute.
	 * @see #isMethodeAbstraite()
	 * @generated
	 */
	void setMethodeAbstraite(boolean value);

} // Methode
