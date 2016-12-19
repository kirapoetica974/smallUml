/**
 */
package smalluml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import smalluml.Association;
import smalluml.Classe;
import smalluml.ElementDiagramme;
import smalluml.ElementNomme;
import smalluml.Enumeration;
import smalluml.SmallumlPackage;
import smalluml.TypeDonnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.EnumerationImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link smalluml.impl.EnumerationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link smalluml.impl.EnumerationImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link smalluml.impl.EnumerationImpl#getTypeDonnee <em>Type Donnee</em>}</li>
 *   <li>{@link smalluml.impl.EnumerationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link smalluml.impl.EnumerationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends TypeImpl implements Enumeration {
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
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classe> getClasse() {
		if (classe == null) {
			classe = new EObjectContainmentEList<Classe>(Classe.class, this, SmallumlPackage.ENUMERATION__CLASSE);
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
			association = new EObjectContainmentEList<Association>(Association.class, this, SmallumlPackage.ENUMERATION__ASSOCIATION);
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
			enumeration = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, SmallumlPackage.ENUMERATION__ENUMERATION);
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
			typeDonnee = new EObjectContainmentEList<TypeDonnee>(TypeDonnee.class, this, SmallumlPackage.ENUMERATION__TYPE_DONNEE);
		}
		return typeDonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ENUMERATION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getElements() {
		if (elements == null) {
			elements = new EDataTypeUniqueEList<String>(String.class, this, SmallumlPackage.ENUMERATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.ENUMERATION__CLASSE:
				return ((InternalEList<?>)getClasse()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.ENUMERATION__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.ENUMERATION__ENUMERATION:
				return ((InternalEList<?>)getEnumeration()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.ENUMERATION__TYPE_DONNEE:
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
			case SmallumlPackage.ENUMERATION__CLASSE:
				return getClasse();
			case SmallumlPackage.ENUMERATION__ASSOCIATION:
				return getAssociation();
			case SmallumlPackage.ENUMERATION__ENUMERATION:
				return getEnumeration();
			case SmallumlPackage.ENUMERATION__TYPE_DONNEE:
				return getTypeDonnee();
			case SmallumlPackage.ENUMERATION__NOM:
				return getNom();
			case SmallumlPackage.ENUMERATION__ELEMENTS:
				return getElements();
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
			case SmallumlPackage.ENUMERATION__CLASSE:
				getClasse().clear();
				getClasse().addAll((Collection<? extends Classe>)newValue);
				return;
			case SmallumlPackage.ENUMERATION__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case SmallumlPackage.ENUMERATION__ENUMERATION:
				getEnumeration().clear();
				getEnumeration().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case SmallumlPackage.ENUMERATION__TYPE_DONNEE:
				getTypeDonnee().clear();
				getTypeDonnee().addAll((Collection<? extends TypeDonnee>)newValue);
				return;
			case SmallumlPackage.ENUMERATION__NOM:
				setNom((String)newValue);
				return;
			case SmallumlPackage.ENUMERATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends String>)newValue);
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
			case SmallumlPackage.ENUMERATION__CLASSE:
				getClasse().clear();
				return;
			case SmallumlPackage.ENUMERATION__ASSOCIATION:
				getAssociation().clear();
				return;
			case SmallumlPackage.ENUMERATION__ENUMERATION:
				getEnumeration().clear();
				return;
			case SmallumlPackage.ENUMERATION__TYPE_DONNEE:
				getTypeDonnee().clear();
				return;
			case SmallumlPackage.ENUMERATION__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SmallumlPackage.ENUMERATION__ELEMENTS:
				getElements().clear();
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
			case SmallumlPackage.ENUMERATION__CLASSE:
				return classe != null && !classe.isEmpty();
			case SmallumlPackage.ENUMERATION__ASSOCIATION:
				return association != null && !association.isEmpty();
			case SmallumlPackage.ENUMERATION__ENUMERATION:
				return enumeration != null && !enumeration.isEmpty();
			case SmallumlPackage.ENUMERATION__TYPE_DONNEE:
				return typeDonnee != null && !typeDonnee.isEmpty();
			case SmallumlPackage.ENUMERATION__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SmallumlPackage.ENUMERATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElementDiagramme.class) {
			switch (derivedFeatureID) {
				case SmallumlPackage.ENUMERATION__CLASSE: return SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE;
				case SmallumlPackage.ENUMERATION__ASSOCIATION: return SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION;
				case SmallumlPackage.ENUMERATION__ENUMERATION: return SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION;
				case SmallumlPackage.ENUMERATION__TYPE_DONNEE: return SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE;
				default: return -1;
			}
		}
		if (baseClass == ElementNomme.class) {
			switch (derivedFeatureID) {
				case SmallumlPackage.ENUMERATION__NOM: return SmallumlPackage.ELEMENT_NOMME__NOM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElementDiagramme.class) {
			switch (baseFeatureID) {
				case SmallumlPackage.ELEMENT_DIAGRAMME__CLASSE: return SmallumlPackage.ENUMERATION__CLASSE;
				case SmallumlPackage.ELEMENT_DIAGRAMME__ASSOCIATION: return SmallumlPackage.ENUMERATION__ASSOCIATION;
				case SmallumlPackage.ELEMENT_DIAGRAMME__ENUMERATION: return SmallumlPackage.ENUMERATION__ENUMERATION;
				case SmallumlPackage.ELEMENT_DIAGRAMME__TYPE_DONNEE: return SmallumlPackage.ENUMERATION__TYPE_DONNEE;
				default: return -1;
			}
		}
		if (baseClass == ElementNomme.class) {
			switch (baseFeatureID) {
				case SmallumlPackage.ELEMENT_NOMME__NOM: return SmallumlPackage.ENUMERATION__NOM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", elements: ");
		result.append(elements);
		result.append(')');
		return result.toString();
	}

} //EnumerationImpl
