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
 *   <li>{@link smalluml.impl.MethodeImpl#getTypeDeRetour <em>Type De Retour</em>}</li>
 *   <li>{@link smalluml.impl.MethodeImpl#getParametres <em>Parametres</em>}</li>
 *   <li>{@link smalluml.impl.MethodeImpl#isMethodeAbstraite <em>Methode Abstraite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodeImpl extends ElementNommeImpl implements Methode {
	/**
	 * The cached value of the '{@link #getTypeDeRetour() <em>Type De Retour</em>}' containment reference.
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
	 * The default value of the '{@link #isMethodeAbstraite() <em>Methode Abstraite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMethodeAbstraite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean METHODE_ABSTRAITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMethodeAbstraite() <em>Methode Abstraite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMethodeAbstraite()
	 * @generated
	 * @ordered
	 */
	protected boolean methodeAbstraite = METHODE_ABSTRAITE_EDEFAULT;

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
	public Type getTypeDeRetour() {
		return typeDeRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDeRetour(Type newTypeDeRetour, NotificationChain msgs) {
		Type oldTypeDeRetour = typeDeRetour;
		typeDeRetour = newTypeDeRetour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.METHODE__TYPE_DE_RETOUR, oldTypeDeRetour, newTypeDeRetour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeRetour(Type newTypeDeRetour) {
		if (newTypeDeRetour != typeDeRetour) {
			NotificationChain msgs = null;
			if (typeDeRetour != null)
				msgs = ((InternalEObject)typeDeRetour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.METHODE__TYPE_DE_RETOUR, null, msgs);
			if (newTypeDeRetour != null)
				msgs = ((InternalEObject)newTypeDeRetour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.METHODE__TYPE_DE_RETOUR, null, msgs);
			msgs = basicSetTypeDeRetour(newTypeDeRetour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.METHODE__TYPE_DE_RETOUR, newTypeDeRetour, newTypeDeRetour));
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
	public boolean isMethodeAbstraite() {
		return methodeAbstraite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodeAbstraite(boolean newMethodeAbstraite) {
		boolean oldMethodeAbstraite = methodeAbstraite;
		methodeAbstraite = newMethodeAbstraite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.METHODE__METHODE_ABSTRAITE, oldMethodeAbstraite, methodeAbstraite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				return basicSetTypeDeRetour(null, msgs);
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
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				return getTypeDeRetour();
			case SmallumlPackage.METHODE__PARAMETRES:
				return getParametres();
			case SmallumlPackage.METHODE__METHODE_ABSTRAITE:
				return isMethodeAbstraite();
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
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				setTypeDeRetour((Type)newValue);
				return;
			case SmallumlPackage.METHODE__PARAMETRES:
				getParametres().clear();
				getParametres().addAll((Collection<? extends Attribut>)newValue);
				return;
			case SmallumlPackage.METHODE__METHODE_ABSTRAITE:
				setMethodeAbstraite((Boolean)newValue);
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
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				setTypeDeRetour((Type)null);
				return;
			case SmallumlPackage.METHODE__PARAMETRES:
				getParametres().clear();
				return;
			case SmallumlPackage.METHODE__METHODE_ABSTRAITE:
				setMethodeAbstraite(METHODE_ABSTRAITE_EDEFAULT);
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
			case SmallumlPackage.METHODE__TYPE_DE_RETOUR:
				return typeDeRetour != null;
			case SmallumlPackage.METHODE__PARAMETRES:
				return parametres != null && !parametres.isEmpty();
			case SmallumlPackage.METHODE__METHODE_ABSTRAITE:
				return methodeAbstraite != METHODE_ABSTRAITE_EDEFAULT;
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
		result.append(" (methodeAbstraite: ");
		result.append(methodeAbstraite);
		result.append(')');
		return result.toString();
	}

} //MethodeImpl
