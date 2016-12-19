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
	 * The meta object id for the '{@link smalluml.impl.ElementDiagrammeImpl <em>Element Diagramme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.ElementDiagrammeImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getElementDiagramme()
	 * @generated
	 */
	int ELEMENT_DIAGRAMME = 12;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIAGRAMME__CLASSE = 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIAGRAMME__ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIAGRAMME__ENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>Type Donnee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIAGRAMME__TYPE_DONNEE = 3;

	/**
	 * The number of structural features of the '<em>Element Diagramme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIAGRAMME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Diagramme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIAGRAMME_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link smalluml.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.AttributImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 1;

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
	 * The meta object id for the '{@link smalluml.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.EnumerationImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 2;

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
	 * The meta object id for the '{@link smalluml.impl.TypeDonneeImpl <em>Type Donnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.TypeDonneeImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getTypeDonnee()
	 * @generated
	 */
	int TYPE_DONNEE = 5;

	/**
	 * The meta object id for the '{@link smalluml.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.AssociationImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 6;

	/**
	 * The meta object id for the '{@link smalluml.impl.CardinaliteImpl <em>Cardinalite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.CardinaliteImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getCardinalite()
	 * @generated
	 */
	int CARDINALITE = 7;

	/**
	 * The meta object id for the '{@link smalluml.impl.ChaineImpl <em>Chaine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.ChaineImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getChaine()
	 * @generated
	 */
	int CHAINE = 8;

	/**
	 * The meta object id for the '{@link smalluml.impl.EntierImpl <em>Entier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.EntierImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getEntier()
	 * @generated
	 */
	int ENTIER = 9;

	/**
	 * The meta object id for the '{@link smalluml.impl.BooleenImpl <em>Booleen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.BooleenImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getBooleen()
	 * @generated
	 */
	int BOOLEEN = 10;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__CLASSE = ELEMENT_DIAGRAMME__CLASSE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ASSOCIATION = ELEMENT_DIAGRAMME__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ENUMERATION = ELEMENT_DIAGRAMME__ENUMERATION;

	/**
	 * The feature id for the '<em><b>Type Donnee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__TYPE_DONNEE = ELEMENT_DIAGRAMME__TYPE_DONNEE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NOM = ELEMENT_DIAGRAMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ATTRIBUTS = ELEMENT_DIAGRAMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__METHODES = ELEMENT_DIAGRAMME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstrait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ABSTRAIT = ELEMENT_DIAGRAMME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sous Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__SOUS_CLASSES = ELEMENT_DIAGRAMME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Super Classe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__SUPER_CLASSE = ELEMENT_DIAGRAMME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classe Abstraite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__CLASSE_ABSTRAITE = ELEMENT_DIAGRAMME_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_FEATURE_COUNT = ELEMENT_DIAGRAMME_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_OPERATION_COUNT = ELEMENT_DIAGRAMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smalluml.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.ElementNommeImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getElementNomme()
	 * @generated
	 */
	int ELEMENT_NOMME = 13;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME__NOM = 0;

	/**
	 * The number of structural features of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__TYPE = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CLASSE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ASSOCIATION = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUMERATION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Donnee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_DONNEE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NOM = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ELEMENTS = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Type De Retour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__TYPE_DE_RETOUR = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__PARAMETRES = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methode Abstraite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__METHODE_ABSTRAITE = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__CLASSE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__ASSOCIATION = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__ENUMERATION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Donnee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__TYPE_DONNEE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__NOM = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE__ATTRIBUTS = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Type Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Type Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DONNEE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CLASSE = ELEMENT_DIAGRAMME__CLASSE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION = ELEMENT_DIAGRAMME__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ENUMERATION = ELEMENT_DIAGRAMME__ENUMERATION;

	/**
	 * The feature id for the '<em><b>Type Donnee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE_DONNEE = ELEMENT_DIAGRAMME__TYPE_DONNEE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NOM = ELEMENT_DIAGRAMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinalites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CARDINALITES = ELEMENT_DIAGRAMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = ELEMENT_DIAGRAMME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = ELEMENT_DIAGRAMME_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Multiplicite Inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE__MULTIPLICITE_INF = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicite Sup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE__MULTIPLICITE_SUP = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE__CLASSE = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cardinalite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cardinalite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link smalluml.impl.DiagrammeImpl <em>Diagramme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smalluml.impl.DiagrammeImpl
	 * @see smalluml.impl.SmallumlPackageImpl#getDiagramme()
	 * @generated
	 */
	int DIAGRAMME = 11;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME__CLASSE = ELEMENT_DIAGRAMME__CLASSE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME__ASSOCIATION = ELEMENT_DIAGRAMME__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME__ENUMERATION = ELEMENT_DIAGRAMME__ENUMERATION;

	/**
	 * The feature id for the '<em><b>Type Donnee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME__TYPE_DONNEE = ELEMENT_DIAGRAMME__TYPE_DONNEE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME__NOM = ELEMENT_DIAGRAMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements Diagramme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME__ELEMENTS_DIAGRAMME = ELEMENT_DIAGRAMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagramme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME_FEATURE_COUNT = ELEMENT_DIAGRAMME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diagramme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMME_OPERATION_COUNT = ELEMENT_DIAGRAMME_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the attribute '{@link smalluml.Classe#isClasseAbstraite <em>Classe Abstraite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classe Abstraite</em>'.
	 * @see smalluml.Classe#isClasseAbstraite()
	 * @see #getClasse()
	 * @generated
	 */
	EAttribute getClasse_ClasseAbstraite();

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
	 * Returns the meta object for the containment reference '{@link smalluml.Attribut#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
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
	 * Returns the meta object for the attribute list '{@link smalluml.Enumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elements</em>'.
	 * @see smalluml.Enumeration#getElements()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Elements();

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
	 * Returns the meta object for the containment reference '{@link smalluml.Methode#getTypeDeRetour <em>Type De Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type De Retour</em>'.
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
	 * Returns the meta object for the attribute '{@link smalluml.Methode#isMethodeAbstraite <em>Methode Abstraite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Methode Abstraite</em>'.
	 * @see smalluml.Methode#isMethodeAbstraite()
	 * @see #getMethode()
	 * @generated
	 */
	EAttribute getMethode_MethodeAbstraite();

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
	 * Returns the meta object for class '{@link smalluml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see smalluml.Association
	 * @generated
	 */
	EClass getAssociation();

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
	 * Returns the meta object for the attribute '{@link smalluml.Cardinalite#getMultipliciteInf <em>Multiplicite Inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicite Inf</em>'.
	 * @see smalluml.Cardinalite#getMultipliciteInf()
	 * @see #getCardinalite()
	 * @generated
	 */
	EAttribute getCardinalite_MultipliciteInf();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.Cardinalite#getMultipliciteSup <em>Multiplicite Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicite Sup</em>'.
	 * @see smalluml.Cardinalite#getMultipliciteSup()
	 * @see #getCardinalite()
	 * @generated
	 */
	EAttribute getCardinalite_MultipliciteSup();

	/**
	 * Returns the meta object for the containment reference '{@link smalluml.Cardinalite#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classe</em>'.
	 * @see smalluml.Cardinalite#getClasse()
	 * @see #getCardinalite()
	 * @generated
	 */
	EReference getCardinalite_Classe();

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
	 * Returns the meta object for class '{@link smalluml.Diagramme <em>Diagramme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagramme</em>'.
	 * @see smalluml.Diagramme
	 * @generated
	 */
	EClass getDiagramme();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.Diagramme#getElementsDiagramme <em>Elements Diagramme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements Diagramme</em>'.
	 * @see smalluml.Diagramme#getElementsDiagramme()
	 * @see #getDiagramme()
	 * @generated
	 */
	EReference getDiagramme_ElementsDiagramme();

	/**
	 * Returns the meta object for class '{@link smalluml.ElementDiagramme <em>Element Diagramme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Diagramme</em>'.
	 * @see smalluml.ElementDiagramme
	 * @generated
	 */
	EClass getElementDiagramme();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.ElementDiagramme#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classe</em>'.
	 * @see smalluml.ElementDiagramme#getClasse()
	 * @see #getElementDiagramme()
	 * @generated
	 */
	EReference getElementDiagramme_Classe();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.ElementDiagramme#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see smalluml.ElementDiagramme#getAssociation()
	 * @see #getElementDiagramme()
	 * @generated
	 */
	EReference getElementDiagramme_Association();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.ElementDiagramme#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see smalluml.ElementDiagramme#getEnumeration()
	 * @see #getElementDiagramme()
	 * @generated
	 */
	EReference getElementDiagramme_Enumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link smalluml.ElementDiagramme#getTypeDonnee <em>Type Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Donnee</em>'.
	 * @see smalluml.ElementDiagramme#getTypeDonnee()
	 * @see #getElementDiagramme()
	 * @generated
	 */
	EReference getElementDiagramme_TypeDonnee();

	/**
	 * Returns the meta object for class '{@link smalluml.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Nomme</em>'.
	 * @see smalluml.ElementNomme
	 * @generated
	 */
	EClass getElementNomme();

	/**
	 * Returns the meta object for the attribute '{@link smalluml.ElementNomme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see smalluml.ElementNomme#getNom()
	 * @see #getElementNomme()
	 * @generated
	 */
	EAttribute getElementNomme_Nom();

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
		 * The meta object literal for the '<em><b>Classe Abstraite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSE__CLASSE_ABSTRAITE = eINSTANCE.getClasse_ClasseAbstraite();

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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__ELEMENTS = eINSTANCE.getEnumeration_Elements();

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
		 * The meta object literal for the '<em><b>Type De Retour</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Methode Abstraite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODE__METHODE_ABSTRAITE = eINSTANCE.getMethode_MethodeAbstraite();

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
		 * The meta object literal for the '{@link smalluml.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.AssociationImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

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
		 * The meta object literal for the '<em><b>Multiplicite Inf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITE__MULTIPLICITE_INF = eINSTANCE.getCardinalite_MultipliciteInf();

		/**
		 * The meta object literal for the '<em><b>Multiplicite Sup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITE__MULTIPLICITE_SUP = eINSTANCE.getCardinalite_MultipliciteSup();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITE__CLASSE = eINSTANCE.getCardinalite_Classe();

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

		/**
		 * The meta object literal for the '{@link smalluml.impl.DiagrammeImpl <em>Diagramme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.DiagrammeImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getDiagramme()
		 * @generated
		 */
		EClass DIAGRAMME = eINSTANCE.getDiagramme();

		/**
		 * The meta object literal for the '<em><b>Elements Diagramme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMME__ELEMENTS_DIAGRAMME = eINSTANCE.getDiagramme_ElementsDiagramme();

		/**
		 * The meta object literal for the '{@link smalluml.impl.ElementDiagrammeImpl <em>Element Diagramme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.ElementDiagrammeImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getElementDiagramme()
		 * @generated
		 */
		EClass ELEMENT_DIAGRAMME = eINSTANCE.getElementDiagramme();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DIAGRAMME__CLASSE = eINSTANCE.getElementDiagramme_Classe();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DIAGRAMME__ASSOCIATION = eINSTANCE.getElementDiagramme_Association();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DIAGRAMME__ENUMERATION = eINSTANCE.getElementDiagramme_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Type Donnee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DIAGRAMME__TYPE_DONNEE = eINSTANCE.getElementDiagramme_TypeDonnee();

		/**
		 * The meta object literal for the '{@link smalluml.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smalluml.impl.ElementNommeImpl
		 * @see smalluml.impl.SmallumlPackageImpl#getElementNomme()
		 * @generated
		 */
		EClass ELEMENT_NOMME = eINSTANCE.getElementNomme();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_NOMME__NOM = eINSTANCE.getElementNomme_Nom();

	}

} //SmallumlPackage
