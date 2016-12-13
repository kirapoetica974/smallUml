/**
 */
package smalluml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smalluml.SmallumlFactory
 * @model kind="package"
 * @generated
 */
public interface SmallumlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smalluml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univ-nantes.fr/smalluml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smalluml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmallumlPackage eINSTANCE = smalluml.impl.SmallumlPackageImpl.init();

	/**
	 * The meta object id for the '{@link smalluml.impl.ClasseImpl <em>Classe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.ClasseImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getClasse()
	 * @generated
	 */
	int CLASSE = 0;

	/**
	 * The feature id for the '<em><b>Nom Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NOM_CLASSE = 0;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ATTRIBUTS = 1;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__METHODES = 2;

	/**
	 * The feature id for the '<em><b>Abstrait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ABSTRAIT = 3;

	/**
	 * The feature id for the '<em><b>Cardinalites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__CARDINALITES = 4;

	/**
	 * The feature id for the '<em><b>Sous Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__SOUS_CLASSES = 5;

	/**
	 * The feature id for the '<em><b>Super Classe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__SUPER_CLASSE = 6;

	/**
	 * The number of structural features of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.AttributImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 1;

	/**
	 * The feature id for the '<em><b>Nom Attribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__NOM_ATTRIBUT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.TypeImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The feature id for the '<em><b>Nom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NOM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.EnumerationImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>Nom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NOM_TYPE = TYPE__NOM_TYPE;

	/**
	 * The feature id for the '<em><b>Nom Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NOM_ENUMERATION = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ELEMENTS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.MethodeImpl <em>Methode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.MethodeImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getMethode()
	 * @generated
	 */
	int METHODE = 3;

	/**
	 * The feature id for the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__NOM_METHODE = 0;

	/**
	 * The feature id for the '<em><b>Type De Retour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__TYPE_DE_RETOUR = 1;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__PARAMETRES = 2;

	/**
	 * The feature id for the '<em><b>Abstrait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__ABSTRAIT = 3;

	/**
	 * The number of structural features of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.TypeDonneeImpl <em>Type Donnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.TypeDonneeImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getTypeDonnee()
	 * @generated
	 */
	int TYPE_DONNEE = 5;

	/**
	 * The feature id for the '<em><b>Nom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__NOM_TYPE = TYPE__NOM_TYPE;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__ATTRIBUTS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.ElementImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Nom Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOM_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.AssociationImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 7;

	/**
	 * The feature id for the '<em><b>Nom Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NOM_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Cardinalites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CARDINALITES = 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.CardinaliteImpl <em>Cardinalite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.CardinaliteImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getCardinalite()
	 * @generated
	 */
	int CARDINALITE = 8;

	/**
	 * The feature id for the '<em><b>Multiplicite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE__MULTIPLICITE = 0;

	/**
	 * The number of structural features of the '<em>Cardinalite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cardinalite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.ChaineImpl <em>Chaine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.ChaineImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getChaine()
	 * @generated
	 */
	int CHAINE = 9;

	/**
	 * The feature id for the '<em><b>Nom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINE__NOM_TYPE = TYPE__NOM_TYPE;

	/**
	 * The number of structural features of the '<em>Chaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.EntierImpl <em>Entier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.EntierImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getEntier()
	 * @generated
	 */
	int ENTIER = 10;

	/**
	 * The feature id for the '<em><b>Nom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER__NOM_TYPE = TYPE__NOM_TYPE;

	/**
	 * The number of structural features of the '<em>Entier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.BooleenImpl <em>Booleen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.BooleenImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getBooleen()
	 * @generated
	 */
	int BOOLEEN = 11;

	/**
	 * The feature id for the '<em><b>Nom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEEN__NOM_TYPE = TYPE__NOM_TYPE;

	/**
	 * The number of structural features of the '<em>Booleen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEEN_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Booleen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEEN_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link smalluml.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classe</em>'.
	 * @see smalluml.Classe
	 * @generated
	 */
	EClass getClasse();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Classe#getNomClasse <em>Nom Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Classe</em>'.
	 * @see smalluml.Classe#getNomClasse()
	 * @see #getClasse()
	 * @generated
	 */
	EAttribute getClasse_NomClasse();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Classe#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributs</em>'.
	 * @see smalluml.Classe#getAttributs()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_Attributs();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Classe#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodes</em>'.
	 * @see smalluml.Classe#getMethodes()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_Methodes();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Classe#isAbstrait <em>Abstrait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstrait</em>'.
	 * @see smalluml.Classe#isAbstrait()
	 * @see #getClasse()
	 * @generated
	 */
	EAttribute getClasse_Abstrait();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Classe#getCardinalites <em>Cardinalites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardinalites</em>'.
	 * @see smalluml.Classe#getCardinalites()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_Cardinalites();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Classe#getSousClasses <em>Sous Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sous Classes</em>'.
	 * @see smalluml.Classe#getSousClasses()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_SousClasses();

	/**
	 * Returns the meta object for the reference '{@link smalluml.Classe#getSuperClasse <em>Super Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Classe</em>'.
	 * @see smalluml.Classe#getSuperClasse()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_SuperClasse();

	/**
	 * Returns the meta object for class '{@link smalluml.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut</em>'.
	 * @see smalluml.Attribut
	 * @generated
	 */
	EClass getAttribut();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Attribut#getNomAttribut <em>Nom Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Attribut</em>'.
	 * @see smalluml.Attribut#getNomAttribut()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_NomAttribut();

	/**
	 * Returns the meta object for the reference '{@link smalluml.Attribut#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see smalluml.Attribut#getType()
	 * @see #getAttribut()
	 * @generated
	 */
	EReference getAttribut_Type();

	/**
	 * Returns the meta object for class '{@link smalluml.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see smalluml.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Enumeration#getNomEnumeration <em>Nom Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Enumeration</em>'.
	 * @see smalluml.Enumeration#getNomEnumeration()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_NomEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Enumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see smalluml.Enumeration#getElements()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link smalluml.Methode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methode</em>'.
	 * @see smalluml.Methode
	 * @generated
	 */
	EClass getMethode();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Methode#getNomMethode <em>Nom Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Methode</em>'.
	 * @see smalluml.Methode#getNomMethode()
	 * @see #getMethode()
	 * @generated
	 */
	EAttribute getMethode_NomMethode();

	/**
	 * Returns the meta object for the reference '{@link smalluml.Methode#getTypeDeRetour <em>Type De Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type De Retour</em>'.
	 * @see smalluml.Methode#getTypeDeRetour()
	 * @see #getMethode()
	 * @generated
	 */
	EReference getMethode_TypeDeRetour();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Methode#getParametres <em>Parametres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametres</em>'.
	 * @see smalluml.Methode#getParametres()
	 * @see #getMethode()
	 * @generated
	 */
	EReference getMethode_Parametres();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Methode#isAbstrait <em>Abstrait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstrait</em>'.
	 * @see smalluml.Methode#isAbstrait()
	 * @see #getMethode()
	 * @generated
	 */
	EAttribute getMethode_Abstrait();

	/**
	 * Returns the meta object for class '{@link smalluml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see smalluml.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Type#getNomType <em>Nom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Type</em>'.
	 * @see smalluml.Type#getNomType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_NomType();

	/**
	 * Returns the meta object for class '{@link smalluml.TypeDonnee <em>Type Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Donnee</em>'.
	 * @see smalluml.TypeDonnee
	 * @generated
	 */
	EClass getTypeDonnee();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.TypeDonnee#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributs</em>'.
	 * @see smalluml.TypeDonnee#getAttributs()
	 * @see #getTypeDonnee()
	 * @generated
	 */
	EReference getTypeDonnee_Attributs();

	/**
	 * Returns the meta object for class '{@link smalluml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see smalluml.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Element#getNomElement <em>Nom Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Element</em>'.
	 * @see smalluml.Element#getNomElement()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_NomElement();

	/**
	 * Returns the meta object for class '{@link smalluml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see smalluml.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Association#getNomAssociation <em>Nom Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Association</em>'.
	 * @see smalluml.Association#getNomAssociation()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_NomAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Association#getCardinalites <em>Cardinalites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardinalites</em>'.
	 * @see smalluml.Association#getCardinalites()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Cardinalites();

	/**
	 * Returns the meta object for class '{@link smalluml.Cardinalite <em>Cardinalite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinalite</em>'.
	 * @see smalluml.Cardinalite
	 * @generated
	 */
	EClass getCardinalite();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Cardinalite#getMultiplicite <em>Multiplicite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicite</em>'.
	 * @see smalluml.Cardinalite#getMultiplicite()
	 * @see #getCardinalite()
	 * @generated
	 */
	EAttribute getCardinalite_Multiplicite();

	/**
	 * Returns the meta object for class '{@link smalluml.Chaine <em>Chaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chaine</em>'.
	 * @see smalluml.Chaine
	 * @generated
	 */
	EClass getChaine();

	/**
	 * Returns the meta object for class '{@link smalluml.Entier <em>Entier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entier</em>'.
	 * @see smalluml.Entier
	 * @generated
	 */
	EClass getEntier();

	/**
	 * Returns the meta object for class '{@link smalluml.Booleen <em>Booleen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booleen</em>'.
	 * @see smalluml.Booleen
	 * @generated
	 */
	EClass getBooleen();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmallumlFactory getSmallumlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smalluml.impl.ClasseImpl <em>Classe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.ClasseImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getClasse()
		 * @generated
		 */
		EClass CLASSE = eINSTANCE.getClasse();

		/**
		 * The meta object literal for the '<em><b>Nom Classe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSE__NOM_CLASSE = eINSTANCE.getClasse_NomClasse();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__ATTRIBUTS = eINSTANCE.getClasse_Attributs();

		/**
		 * The meta object literal for the '<em><b>Methodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__METHODES = eINSTANCE.getClasse_Methodes();

		/**
		 * The meta object literal for the '<em><b>Abstrait</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSE__ABSTRAIT = eINSTANCE.getClasse_Abstrait();

		/**
		 * The meta object literal for the '<em><b>Cardinalites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__CARDINALITES = eINSTANCE.getClasse_Cardinalites();

		/**
		 * The meta object literal for the '<em><b>Sous Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__SOUS_CLASSES = eINSTANCE.getClasse_SousClasses();

		/**
		 * The meta object literal for the '<em><b>Super Classe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__SUPER_CLASSE = eINSTANCE.getClasse_SuperClasse();

		/**
		 * The meta object literal for the '{@link smalluml.impl.AttributImpl <em>Attribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.AttributImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getAttribut()
		 * @generated
		 */
		EClass ATTRIBUT = eINSTANCE.getAttribut();

		/**
		 * The meta object literal for the '<em><b>Nom Attribut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__NOM_ATTRIBUT = eINSTANCE.getAttribut_NomAttribut();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUT__TYPE = eINSTANCE.getAttribut_Type();

		/**
		 * The meta object literal for the '{@link smalluml.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.EnumerationImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Nom Enumeration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__NOM_ENUMERATION = eINSTANCE.getEnumeration_NomEnumeration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__ELEMENTS = eINSTANCE.getEnumeration_Elements();

		/**
		 * The meta object literal for the '{@link smalluml.impl.MethodeImpl <em>Methode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.MethodeImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getMethode()
		 * @generated
		 */
		EClass METHODE = eINSTANCE.getMethode();

		/**
		 * The meta object literal for the '<em><b>Nom Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODE__NOM_METHODE = eINSTANCE.getMethode_NomMethode();

		/**
		 * The meta object literal for the '<em><b>Type De Retour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODE__TYPE_DE_RETOUR = eINSTANCE.getMethode_TypeDeRetour();

		/**
		 * The meta object literal for the '<em><b>Parametres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODE__PARAMETRES = eINSTANCE.getMethode_Parametres();

		/**
		 * The meta object literal for the '<em><b>Abstrait</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODE__ABSTRAIT = eINSTANCE.getMethode_Abstrait();

		/**
		 * The meta object literal for the '{@link smalluml.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.TypeImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Nom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NOM_TYPE = eINSTANCE.getType_NomType();

		/**
		 * The meta object literal for the '{@link smalluml.impl.TypeDonneeImpl <em>Type Donnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.TypeDonneeImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getTypeDonnee()
		 * @generated
		 */
		EClass TYPE_DONNEE = eINSTANCE.getTypeDonnee();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DONNEE__ATTRIBUTS = eINSTANCE.getTypeDonnee_Attributs();

		/**
		 * The meta object literal for the '{@link smalluml.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.ElementImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Nom Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NOM_ELEMENT = eINSTANCE.getElement_NomElement();

		/**
		 * The meta object literal for the '{@link smalluml.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.AssociationImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Nom Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NOM_ASSOCIATION = eINSTANCE.getAssociation_NomAssociation();

		/**
		 * The meta object literal for the '<em><b>Cardinalites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__CARDINALITES = eINSTANCE.getAssociation_Cardinalites();

		/**
		 * The meta object literal for the '{@link smalluml.impl.CardinaliteImpl <em>Cardinalite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.CardinaliteImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getCardinalite()
		 * @generated
		 */
		EClass CARDINALITE = eINSTANCE.getCardinalite();

		/**
		 * The meta object literal for the '<em><b>Multiplicite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITE__MULTIPLICITE = eINSTANCE.getCardinalite_Multiplicite();

		/**
		 * The meta object literal for the '{@link smalluml.impl.ChaineImpl <em>Chaine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.ChaineImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getChaine()
		 * @generated
		 */
		EClass CHAINE = eINSTANCE.getChaine();

		/**
		 * The meta object literal for the '{@link smalluml.impl.EntierImpl <em>Entier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.EntierImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getEntier()
		 * @generated
		 */
		EClass ENTIER = eINSTANCE.getEntier();

		/**
		 * The meta object literal for the '{@link smalluml.impl.BooleenImpl <em>Booleen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.BooleenImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getBooleen()
		 * @generated
		 */
		EClass BOOLEEN = eINSTANCE.getBooleen();

	}

} //SmallumlPackage
