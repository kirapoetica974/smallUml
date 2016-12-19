/**
 */
package smalluml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import smalluml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smalluml.SmallumlPackage
 * @generated
 */
public class SmallumlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmallumlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmallumlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmallumlSwitch<Adapter> modelSwitch =
		new SmallumlSwitch<Adapter>() {
			@Override
			public Adapter caseClasse(Classe object) {
				return createClasseAdapter();
			}
			@Override
			public Adapter caseAttribut(Attribut object) {
				return createAttributAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseMethode(Methode object) {
				return createMethodeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeDonnee(TypeDonnee object) {
				return createTypeDonneeAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseCardinalite(Cardinalite object) {
				return createCardinaliteAdapter();
			}
			@Override
			public Adapter caseChaine(Chaine object) {
				return createChaineAdapter();
			}
			@Override
			public Adapter caseEntier(Entier object) {
				return createEntierAdapter();
			}
			@Override
			public Adapter caseBooleen(Booleen object) {
				return createBooleenAdapter();
			}
			@Override
			public Adapter caseDiagramme(Diagramme object) {
				return createDiagrammeAdapter();
			}
			@Override
			public Adapter caseElementDiagramme(ElementDiagramme object) {
				return createElementDiagrammeAdapter();
			}
			@Override
			public Adapter caseElementNomme(ElementNomme object) {
				return createElementNommeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Classe
	 * @generated
	 */
	public Adapter createClasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Attribut
	 * @generated
	 */
	public Adapter createAttributAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Methode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Methode
	 * @generated
	 */
	public Adapter createMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.TypeDonnee <em>Type Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.TypeDonnee
	 * @generated
	 */
	public Adapter createTypeDonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Cardinalite <em>Cardinalite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Cardinalite
	 * @generated
	 */
	public Adapter createCardinaliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Chaine <em>Chaine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Chaine
	 * @generated
	 */
	public Adapter createChaineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Entier <em>Entier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Entier
	 * @generated
	 */
	public Adapter createEntierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Booleen <em>Booleen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Booleen
	 * @generated
	 */
	public Adapter createBooleenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.Diagramme <em>Diagramme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.Diagramme
	 * @generated
	 */
	public Adapter createDiagrammeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.ElementDiagramme <em>Element Diagramme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.ElementDiagramme
	 * @generated
	 */
	public Adapter createElementDiagrammeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smalluml.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smalluml.ElementNomme
	 * @generated
	 */
	public Adapter createElementNommeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SmallumlAdapterFactory
