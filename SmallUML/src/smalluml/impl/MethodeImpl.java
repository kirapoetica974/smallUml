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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smalluml.Attribut;
import smalluml.Methode;
import smalluml.SmallumlPackage;
import smalluml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.MethodeImpl#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link smalluml.impl.MethodeImpl#getTypeDeRetour <em>Type De Retour</em>}</li>
 *   <li>{@link smalluml.impl.MethodeImpl#getParametres <em>Parametres</em>}</li>
 *   <li>{@link smalluml.impl.MethodeImpl#isAbstrait <em>Abstrait</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodeImpl extends MinimalEObjectImpl.Container implements Methode {
	/**
	 * The default value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_METHODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected String nomMethode = NOM_METHODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeDeRetour() <em>Type De Retour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeRetour()
	 * @generated
	 * @ordered
	 */
	protected Type typeDeRetour;

	/**
	 * The cached value of the '{@link #getParametres() <em>Parametres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametres()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribut> parametres;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.METHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomMethode() {
		return nomMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomMethode(String newNomMethode) {
		String oldNomMethode = nomMethode;
		nomMethode = newNomMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.METHODE__NOM_METHODE, oldNomMethode, nomMethode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTypeDeRetour() {
		if (typeDeRetour != null && typeDeRetour.eIsProxy()) {
			InternalEObject oldTypeDeRetour = (InternalEObject)typeDeRetour;
			typeDeRetour = (Type)eResolveProxy(oldTypeDeRetour);
			if (typeDeRetour != oldTypeDeRetour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallumlPackage.METHODE__TYPE_DE_RETOUR, oldTypeDeRetour, typeDeRetour));
			}
		}
		return typeDeRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetTypeDeRetour() {
		return typeDeRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeRetour(Type newTypeDeRetour) {
		Type oldTypeDeRetour = typeDeRetour;
		typeDeRetour = newTypeDeRetour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.METHODE__TYPE_DE_RETOUR, oldTypeDeRetour, typeDeRetour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribut> getParametres() {
		if (parametres == null) {
			parametres = new EObjectContainmentEList<Attribut>(Attribut.class, this, SmallumlPackage.METHODE__PARAMETRES);
		}
		return parametres;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.METHODE__ABSTRAIT, oldAbstrait, abstrait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.METHODE__PARAMETRES:
				return ((InternalEList<?>)getParametres()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.METHODE__NOM_METHODE:
				return getNomMethode();
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				if (resolve) return getTypeDeRetour();
				return basicGetTypeDeRetour();
			case SmallumlPackage.METHODE__PARAMETRES:
				return getParametres();
			case SmallumlPackage.METHODE__ABSTRAIT:
				return isAbstrait();
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
			case SmallumlPackage.METHODE__NOM_METHODE:
				setNomMethode((String)newValue);
				return;
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				setTypeDeRetour((Type)newValue);
				return;
			case SmallumlPackage.METHODE__PARAMETRES:
				getParametres().clear();
				getParametres().addAll((Collection<? extends Attribut>)newValue);
				return;
			case SmallumlPackage.METHODE__ABSTRAIT:
				setAbstrait((Boolean)newValue);
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
			case SmallumlPackage.METHODE__NOM_METHODE:
				setNomMethode(NOM_METHODE_EDEFAULT);
				return;
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				setTypeDeRetour((Type)null);
				return;
			case SmallumlPackage.METHODE__PARAMETRES:
				getParametres().clear();
				return;
			case SmallumlPackage.METHODE__ABSTRAIT:
				setAbstrait(ABSTRAIT_EDEFAULT);
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
			case SmallumlPackage.METHODE__NOM_METHODE:
				return NOM_METHODE_EDEFAULT == null ? nomMethode != null : !NOM_METHODE_EDEFAULT.equals(nomMethode);
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				return typeDeRetour != null;
			case SmallumlPackage.METHODE__PARAMETRES:
				return parametres != null && !parametres.isEmpty();
			case SmallumlPackage.METHODE__ABSTRAIT:
				return abstrait != ABSTRAIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (nomMethode: ");
		result.append(nomMethode);
		result.append(", abstrait: ");
		result.append(abstrait);
		result.append(')');
		return result.toString();
	}

} //MethodeImpl
