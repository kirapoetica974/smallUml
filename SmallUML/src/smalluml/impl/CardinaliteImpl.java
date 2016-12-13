/**
 */
package smalluml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smalluml.Cardinalite;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinalite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.CardinaliteImpl#getMultiplicite <em>Multiplicite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinaliteImpl extends MinimalEObjectImpl.Container implements Cardinalite {
	/**
	 * The default value of the '{@link #getMultiplicite() <em>Multiplicite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicite()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicite() <em>Multiplicite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicite()
	 * @generated
	 * @ordered
	 */
	protected String multiplicite = MULTIPLICITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinaliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.CARDINALITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicite() {
		return multiplicite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicite(String newMultiplicite) {
		String oldMultiplicite = multiplicite;
		multiplicite = newMultiplicite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CARDINALITE__MULTIPLICITE, oldMultiplicite, multiplicite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmallumlPackage.CARDINALITE__MULTIPLICITE:
				return getMultiplicite();
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
			case SmallumlPackage.CARDINALITE__MULTIPLICITE:
				setMultiplicite((String)newValue);
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
			case SmallumlPackage.CARDINALITE__MULTIPLICITE:
				setMultiplicite(MULTIPLICITE_EDEFAULT);
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
			case SmallumlPackage.CARDINALITE__MULTIPLICITE:
				return MULTIPLICITE_EDEFAULT == null ? multiplicite != null : !MULTIPLICITE_EDEFAULT.equals(multiplicite);
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
		result.append(" (multiplicite: ");
		result.append(multiplicite);
		result.append(')');
		return result.toString();
	}

} //CardinaliteImpl
