/**
 */
package smalluml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smalluml.Association;
import smalluml.Classe;
import smalluml.ElementDiagramme;
import smalluml.Enumeration;
import smalluml.SmallumlPackage;
import smalluml.TypeDonnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Diagramme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.ElementDiagrammeImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link smalluml.impl.ElementDiagrammeImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link smalluml.impl.ElementDiagrammeImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link smalluml.impl.ElementDiagrammeImpl#getTypeDonnee <em>Type Donnee</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementDiagrammeImpl extends MinimalEObjectImpl.Container implements ElementDiagramme {
	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected EList<Classe> classe;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumeration;

	/**
	 * The cached value of the '{@link #getTypeDonnee() <em>Type Donnee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDonnee()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDonnee> typeDonnee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDiagrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.ELEMENT_DIAGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classe> getClasse() {
		if (classe == null) {
			classe = new EObjectContainmentEList<Classe>(Classe.class, this, SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE);
		}
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<Association>(Association.class, this, SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumeration() {
		if (enumeration == null) {
			enumeration = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION);
		}
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDonnee> getTypeDonnee() {
		if (typeDonnee == null) {
			typeDonnee = new EObjectContainmentEList<TypeDonnee>(TypeDonnee.class, this, SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE);
		}
		return typeDonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE:
				return ((InternalEList<?>)getClasse()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION:
				return ((InternalEList<?>)getEnumeration()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE:
				return ((InternalEList<?>)getTypeDonnee()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE:
				return getClasse();
			case SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION:
				return getAssociation();
			case SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION:
				return getEnumeration();
			case SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE:
				return getTypeDonnee();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE:
				getClasse().clear();
				getClasse().addAll((Collection<? extends Classe>)newValue);
				return;
			case SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION:
				getEnumeration().clear();
				getEnumeration().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE:
				getTypeDonnee().clear();
				getTypeDonnee().addAll((Collection<? extends TypeDonnee>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE:
				getClasse().clear();
				return;
			case SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION:
				getAssociation().clear();
				return;
			case SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION:
				getEnumeration().clear();
				return;
			case SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE:
				getTypeDonnee().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE:
				return classe != null && !classe.isEmpty();
			case SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION:
				return association != null && !association.isEmpty();
			case SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION:
				return enumeration != null && !enumeration.isEmpty();
			case SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE:
				return typeDonnee != null && !typeDonnee.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementDiagrammeImpl
