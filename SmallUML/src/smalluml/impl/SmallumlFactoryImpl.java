/**
 */
package smalluml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import smalluml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallumlFactoryImpl extends EFactoryImpl implements SmallumlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmallumlFactory init() {
		try {
			SmallumlFactory theSmallumlFactory = (SmallumlFactory)EPackage.Registry.INSTANCE.getEFactory(SmallumlPackage.eNS_URI);
			if (theSmallumlFactory != null) {
				return theSmallumlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmallumlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmallumlPackage.CLASSE: return createClasse();
			case SmallumlPackage.ATTRIBUT: return createAttribut();
			case SmallumlPackage.ENUMERATION: return createEnumeration();
			case SmallumlPackage.METHODE: return createMethode();
			case SmallumlPackage.TYPE_DONNEE: return createTypeDonnee();
			case SmallumlPackage.ASSOCIATION: return createAssociation();
			case SmallumlPackage.CARDINALITE: return createCardinalite();
			case SmallumlPackage.CHAINE: return createChaine();
			case SmallumlPackage.ENTIER: return createEntier();
			case SmallumlPackage.BOOLEEN: return createBooleen();
			case SmallumlPackage.DIAGRAMME: return createDiagramme();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe createClasse() {
		ClasseImpl classe = new ClasseImpl();
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribut createAttribut() {
		AttributImpl attribut = new AttributImpl();
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Methode createMethode() {
		MethodeImpl methode = new MethodeImpl();
		return methode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDonnee createTypeDonnee() {
		TypeDonneeImpl typeDonnee = new TypeDonneeImpl();
		return typeDonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinalite createCardinalite() {
		CardinaliteImpl cardinalite = new CardinaliteImpl();
		return cardinalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chaine createChaine() {
		ChaineImpl chaine = new ChaineImpl();
		return chaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entier createEntier() {
		EntierImpl entier = new EntierImpl();
		return entier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booleen createBooleen() {
		BooleenImpl booleen = new BooleenImpl();
		return booleen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagramme createDiagramme() {
		DiagrammeImpl diagramme = new DiagrammeImpl();
		return diagramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlPackage getSmallumlPackage() {
		return (SmallumlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmallumlPackage getPackage() {
		return SmallumlPackage.eINSTANCE;
	}

} //SmallumlFactoryImpl
