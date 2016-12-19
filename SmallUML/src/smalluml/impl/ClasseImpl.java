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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import smalluml.Attribut;
import smalluml.Classe;
import smalluml.ElementNomme;
import smalluml.Methode;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.ClasseImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link smalluml.impl.ClasseImpl#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link smalluml.impl.ClasseImpl#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link smalluml.impl.ClasseImpl#isAbstrait <em>Abstrait</em>}</li>
 *   <li>{@link smalluml.impl.ClasseImpl#getSousClasses <em>Sous Classes</em>}</li>
 *   <li>{@link smalluml.impl.ClasseImpl#getSuperClasse <em>Super Classe</em>}</li>
 *   <li>{@link smalluml.impl.ClasseImpl#isClasseAbstraite <em>Classe Abstraite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClasseImpl extends ElementDiagrammeImpl implements Classe {
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
	 * The cached value of the '{@link #getAttributs() <em>Attributs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributs()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribut> attributs;

	/**
	 * The cached value of the '{@link #getMethodes() <em>Methodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Methode> methodes;

	/**
	 * The default value of the '{@link #isAbstrait() <em>Abstrait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstrait()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRAIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstrait() <em>Abstrait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstrait()
	 * @generated
	 * @ordered
	 */
	protected boolean abstrait = ABSTRAIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSousClasses() <em>Sous Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Classe> sousClasses;

	/**
	 * The cached value of the '{@link #getSuperClasse() <em>Super Classe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasse()
	 * @generated
	 * @ordered
	 */
	protected Classe superClasse;

	/**
	 * The default value of the '{@link #isClasseAbstraite() <em>Classe Abstraite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClasseAbstraite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLASSE_ABSTRAITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClasseAbstraite() <em>Classe Abstraite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClasseAbstraite()
	 * @generated
	 * @ordered
	 */
	protected boolean classeAbstraite = CLASSE_ABSTRAITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClasseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.CLASSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CLASSE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribut> getAttributs() {
		if (attributs == null) {
			attributs = new EObjectContainmentEList<Attribut>(Attribut.class, this, SmallumlPackage.CLASSE__ATTRIBUTS);
		}
		return attributs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Methode> getMethodes() {
		if (methodes == null) {
			methodes = new EObjectContainmentEList<Methode>(Methode.class, this, SmallumlPackage.CLASSE__METHODES);
		}
		return methodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstrait() {
		return abstrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstrait(boolean newAbstrait) {
		boolean oldAbstrait = abstrait;
		abstrait = newAbstrait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CLASSE__ABSTRAIT, oldAbstrait, abstrait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classe> getSousClasses() {
		if (sousClasses == null) {
			sousClasses = new EObjectContainmentEList<Classe>(Classe.class, this, SmallumlPackage.CLASSE__SOUS_CLASSES);
		}
		return sousClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe getSuperClasse() {
		if (superClasse != null && superClasse.eIsProxy()) {
			InternalEObject oldSuperClasse = (InternalEObject)superClasse;
			superClasse = (Classe)eResolveProxy(oldSuperClasse);
			if (superClasse != oldSuperClasse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallumlPackage.CLASSE__SUPER_CLASSE, oldSuperClasse, superClasse));
			}
		}
		return superClasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe basicGetSuperClasse() {
		return superClasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClasse(Classe newSuperClasse) {
		Classe oldSuperClasse = superClasse;
		superClasse = newSuperClasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CLASSE__SUPER_CLASSE, oldSuperClasse, superClasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClasseAbstraite() {
		return classeAbstraite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseAbstraite(boolean newClasseAbstraite) {
		boolean oldClasseAbstraite = classeAbstraite;
		classeAbstraite = newClasseAbstraite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CLASSE__CLASSE_ABSTRAITE, oldClasseAbstraite, classeAbstraite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.CLASSE__ATTRIBUTS:
				return ((InternalEList<?>)getAttributs()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.CLASSE__METHODES:
				return ((InternalEList<?>)getMethodes()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.CLASSE__SOUS_CLASSES:
				return ((InternalEList<?>)getSousClasses()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.CLASSE__NOM:
				return getNom();
			case SmallumlPackage.CLASSE__ATTRIBUTS:
				return getAttributs();
			case SmallumlPackage.CLASSE__METHODES:
				return getMethodes();
			case SmallumlPackage.CLASSE__ABSTRAIT:
				return isAbstrait();
			case SmallumlPackage.CLASSE__SOUS_CLASSES:
				return getSousClasses();
			case SmallumlPackage.CLASSE__SUPER_CLASSE:
				if (resolve) return getSuperClasse();
				return basicGetSuperClasse();
			case SmallumlPackage.CLASSE__CLASSE_ABSTRAITE:
				return isClasseAbstraite();
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
			case SmallumlPackage.CLASSE__NOM:
				setNom((String)newValue);
				return;
			case SmallumlPackage.CLASSE__ATTRIBUTS:
				getAttributs().clear();
				getAttributs().addAll((Collection<? extends Attribut>)newValue);
				return;
			case SmallumlPackage.CLASSE__METHODES:
				getMethodes().clear();
				getMethodes().addAll((Collection<? extends Methode>)newValue);
				return;
			case SmallumlPackage.CLASSE__ABSTRAIT:
				setAbstrait((Boolean)newValue);
				return;
			case SmallumlPackage.CLASSE__SOUS_CLASSES:
				getSousClasses().clear();
				getSousClasses().addAll((Collection<? extends Classe>)newValue);
				return;
			case SmallumlPackage.CLASSE__SUPER_CLASSE:
				setSuperClasse((Classe)newValue);
				return;
			case SmallumlPackage.CLASSE__CLASSE_ABSTRAITE:
				setClasseAbstraite((Boolean)newValue);
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
			case SmallumlPackage.CLASSE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SmallumlPackage.CLASSE__ATTRIBUTS:
				getAttributs().clear();
				return;
			case SmallumlPackage.CLASSE__METHODES:
				getMethodes().clear();
				return;
			case SmallumlPackage.CLASSE__ABSTRAIT:
				setAbstrait(ABSTRAIT_EDEFAULT);
				return;
			case SmallumlPackage.CLASSE__SOUS_CLASSES:
				getSousClasses().clear();
				return;
			case SmallumlPackage.CLASSE__SUPER_CLASSE:
				setSuperClasse((Classe)null);
				return;
			case SmallumlPackage.CLASSE__CLASSE_ABSTRAITE:
				setClasseAbstraite(CLASSE_ABSTRAITE_EDEFAULT);
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
			case SmallumlPackage.CLASSE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SmallumlPackage.CLASSE__ATTRIBUTS:
				return attributs != null && !attributs.isEmpty();
			case SmallumlPackage.CLASSE__METHODES:
				return methodes != null && !methodes.isEmpty();
			case SmallumlPackage.CLASSE__ABSTRAIT:
				return abstrait != ABSTRAIT_EDEFAULT;
			case SmallumlPackage.CLASSE__SOUS_CLASSES:
				return sousClasses != null && !sousClasses.isEmpty();
			case SmallumlPackage.CLASSE__SUPER_CLASSE:
				return superClasse != null;
			case SmallumlPackage.CLASSE__CLASSE_ABSTRAITE:
				return classeAbstraite != CLASSE_ABSTRAITE_EDEFAULT;
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
		if (baseClass == ElementNomme.class) {
			switch (derivedFeatureID) {
				case SmallumlPackage.CLASSE__NOM: return SmallumlPackage.ELEMENT_NOMME__NOM;
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
		if (baseClass == ElementNomme.class) {
			switch (baseFeatureID) {
				case SmallumlPackage.ELEMENT_NOMME__NOM: return SmallumlPackage.CLASSE__NOM;
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
		result.append(", abstrait: ");
		result.append(abstrait);
		result.append(", classeAbstraite: ");
		result.append(classeAbstraite);
		result.append(')');
		return result.toString();
	}

} //ClasseImpl
