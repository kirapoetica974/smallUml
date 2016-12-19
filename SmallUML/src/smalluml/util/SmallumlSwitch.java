/**
 */
package smalluml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import smalluml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see smalluml.SmallumlPackage
 * @generated
 */
public class SmallumlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmallumlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlSwitch() {
		if (modelPackage == null) {
			modelPackage = SmallumlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SmallumlPackage.CLASSE: {
				Classe classe = (Classe)theEObject;
				T result = caseClasse(classe);
				if (result == null) result = caseElementDiagramme(classe);
				if (result == null) result = caseElementNomme(classe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.ATTRIBUT: {
				Attribut attribut = (Attribut)theEObject;
				T result = caseAttribut(attribut);
				if (result == null) result = caseElementNomme(attribut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseElementDiagramme(enumeration);
				if (result == null) result = caseElementNomme(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.METHODE: {
				Methode methode = (Methode)theEObject;
				T result = caseMethode(methode);
				if (result == null) result = caseElementNomme(methode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.TYPE_DONNEE: {
				TypeDonnee typeDonnee = (TypeDonnee)theEObject;
				T result = caseTypeDonnee(typeDonnee);
				if (result == null) result = caseType(typeDonnee);
				if (result == null) result = caseElementDiagramme(typeDonnee);
				if (result == null) result = caseElementNomme(typeDonnee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseElementDiagramme(association);
				if (result == null) result = caseElementNomme(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.CARDINALITE: {
				Cardinalite cardinalite = (Cardinalite)theEObject;
				T result = caseCardinalite(cardinalite);
				if (result == null) result = caseElementNomme(cardinalite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.CHAINE: {
				Chaine chaine = (Chaine)theEObject;
				T result = caseChaine(chaine);
				if (result == null) result = caseType(chaine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.ENTIER: {
				Entier entier = (Entier)theEObject;
				T result = caseEntier(entier);
				if (result == null) result = caseType(entier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.BOOLEEN: {
				Booleen booleen = (Booleen)theEObject;
				T result = caseBooleen(booleen);
				if (result == null) result = caseType(booleen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.DIAGRAMME: {
				Diagramme diagramme = (Diagramme)theEObject;
				T result = caseDiagramme(diagramme);
				if (result == null) result = caseElementDiagramme(diagramme);
				if (result == null) result = caseElementNomme(diagramme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.ELEMENT_DIAGRAMME: {
				ElementDiagramme elementDiagramme = (ElementDiagramme)theEObject;
				T result = caseElementDiagramme(elementDiagramme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmallumlPackage.ELEMENT_NOMME: {
				ElementNomme elementNomme = (ElementNomme)theEObject;
				T result = caseElementNomme(elementNomme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasse(Classe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribut(Attribut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethode(Methode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Donnee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Donnee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDonnee(TypeDonnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinalite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinalite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalite(Cardinalite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chaine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chaine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChaine(Chaine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntier(Entier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booleen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booleen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleen(Booleen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagramme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagramme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramme(Diagramme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Diagramme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Diagramme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDiagramme(ElementDiagramme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Nomme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Nomme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementNomme(ElementNomme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SmallumlSwitch
