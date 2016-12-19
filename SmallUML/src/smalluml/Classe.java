/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Classe#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link smalluml.Classe#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link smalluml.Classe#isAbstrait <em>Abstrait</em>}</li>
 *   <li>{@link smalluml.Classe#getSousClasses <em>Sous Classes</em>}</li>
 *   <li>{@link smalluml.Classe#getSuperClasse <em>Super Classe</em>}</li>
 *   <li>{@link smalluml.Classe#isClasseAbstraite <em>Classe Abstraite</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getClasse()
 * @model
 * @generated
 */
public interface Classe extends ElementDiagramme, ElementNomme {
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
	 * @see smalluml.SmallumlPackage#getClasse_Attributs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribut> getAttributs();

	/**
	 * Returns the value of the '<em><b>Methodes</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Methode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodes</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getClasse_Methodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Methode> getMethodes();

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
	 * @see smalluml.SmallumlPackage#getClasse_Abstrait()
	 * @model
	 * @generated
	 */
	boolean isAbstrait();

	/**
	 * Sets the value of the '{@link smalluml.Classe#isAbstrait <em>Abstrait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstrait</em>' attribute.
	 * @see #isAbstrait()
	 * @generated
	 */
	void setAbstrait(boolean value);

	/**
	 * Returns the value of the '<em><b>Sous Classes</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Classe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Classes</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getClasse_SousClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classe> getSousClasses();

	/**
	 * Returns the value of the '<em><b>Super Classe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classe</em>' reference.
	 * @see #setSuperClasse(Classe)
	 * @see smalluml.SmallumlPackage#getClasse_SuperClasse()
	 * @model
	 * @generated
	 */
	Classe getSuperClasse();

	/**
	 * Sets the value of the '{@link smalluml.Classe#getSuperClasse <em>Super Classe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Classe</em>' reference.
	 * @see #getSuperClasse()
	 * @generated
	 */
	void setSuperClasse(Classe value);

	/**
	 * Returns the value of the '<em><b>Classe Abstraite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Abstraite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Abstraite</em>' attribute.
	 * @see #setClasseAbstraite(boolean)
	 * @see smalluml.SmallumlPackage#getClasse_ClasseAbstraite()
	 * @model
	 * @generated
	 */
	boolean isClasseAbstraite();

	/**
	 * Sets the value of the '{@link smalluml.Classe#isClasseAbstraite <em>Classe Abstraite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Abstraite</em>' attribute.
	 * @see #isClasseAbstraite()
	 * @generated
	 */
	void setClasseAbstraite(boolean value);

} // Classe
