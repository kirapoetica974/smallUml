/**
 */
package smalluml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smalluml.Attribut;
import smalluml.SmallumlPackage;
import smalluml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.AttributImpl#getNomAttribut <em>Nom Attribut</em>}</li>
 *   <li>{@link smalluml.impl.AttributImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributImpl extends MinimalEObjectImpl.Container implements Attribut {
	/**
	 * The default value of the '{@link #getNomAttribut() <em>Nom Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAttribut()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ATTRIBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomAttribut() <em>Nom Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAttribut()
	 * @generated
	 * @ordered
	 */
	protected String nomAttribut = NOM_ATTRIBUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.ATTRIBUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomAttribut() {
		return nomAttribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomAttribut(String newNomAttribut) {
		String oldNomAttribut = nomAttribut;
		nomAttribut = newNomAttribut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ATTRIBUT__NOM_ATTRIBUT, oldNomAttribut, nomAttribut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallumlPackage.ATTRIBUT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ATTRIBUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmallumlPackage.ATTRIBUT__NOM_ATTRIBUT:
				return getNomAttribut();
			case SmallumlPackage.ATTRIBUT__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmallumlPackage.ATTRIBUT__NOM_ATTRIBUT:
				setNomAttribut((String)newValue);
				return;
			case SmallumlPackage.ATTRIBUT__TYPE:
				setType((Type)newValue);
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
			case SmallumlPackage.ATTRIBUT__NOM_ATTRIBUT:
				setNomAttribut(NOM_ATTRIBUT_EDEFAULT);
				return;
			case SmallumlPackage.ATTRIBUT__TYPE:
				setType((Type)null);
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
			case SmallumlPackage.ATTRIBUT__NOM_ATTRIBUT:
				return NOM_ATTRIBUT_EDEFAULT == null ? nomAttribut != null : !NOM_ATTRIBUT_EDEFAULT.equals(nomAttribut);
			case SmallumlPackage.ATTRIBUT__TYPE:
				return type != null;
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
		result.append(" (nomAttribut: ");
		result.append(nomAttribut);
		result.append(')');
		return result.toString();
	}

} //AttributImpl
