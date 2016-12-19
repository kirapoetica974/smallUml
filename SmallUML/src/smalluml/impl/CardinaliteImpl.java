/**
 */
package smalluml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import smalluml.Cardinalite;
import smalluml.Classe;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinalite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.CardinaliteImpl#getMultipliciteInf <em>Multiplicite Inf</em>}</li>
 *   <li>{@link smalluml.impl.CardinaliteImpl#getMultipliciteSup <em>Multiplicite Sup</em>}</li>
 *   <li>{@link smalluml.impl.CardinaliteImpl#getClasse <em>Classe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinaliteImpl extends ElementNommeImpl implements Cardinalite {
	/**
	 * The default value of the '{@link #getMultipliciteInf() <em>Multiplicite Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipliciteInf()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITE_INF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipliciteInf() <em>Multiplicite Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipliciteInf()
	 * @generated
	 * @ordered
	 */
	protected String multipliciteInf = MULTIPLICITE_INF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipliciteSup() <em>Multiplicite Sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipliciteSup()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITE_SUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipliciteSup() <em>Multiplicite Sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipliciteSup()
	 * @generated
	 * @ordered
	 */
	protected String multipliciteSup = MULTIPLICITE_SUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected Classe classe;

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
	public String getMultipliciteInf() {
		return multipliciteInf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipliciteInf(String newMultipliciteInf) {
		String oldMultipliciteInf = multipliciteInf;
		multipliciteInf = newMultipliciteInf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CARDINALITE__MULTIPLICITE_INF, oldMultipliciteInf, multipliciteInf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultipliciteSup() {
		return multipliciteSup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipliciteSup(String newMultipliciteSup) {
		String oldMultipliciteSup = multipliciteSup;
		multipliciteSup = newMultipliciteSup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CARDINALITE__MULTIPLICITE_SUP, oldMultipliciteSup, multipliciteSup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe getClasse() {
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClasse(Classe newClasse, NotificationChain msgs) {
		Classe oldClasse = classe;
		classe = newClasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.CARDINALITE__CLASSE, oldClasse, newClasse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasse(Classe newClasse) {
		if (newClasse != classe) {
			NotificationChain msgs = null;
			if (classe != null)
				msgs = ((InternalEObject)classe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.CARDINALITE__CLASSE, null, msgs);
			if (newClasse != null)
				msgs = ((InternalEObject)newClasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.CARDINALITE__CLASSE, null, msgs);
			msgs = basicSetClasse(newClasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CARDINALITE__CLASSE, newClasse, newClasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.CARDINALITE__CLASSE:
				return basicSetClasse(null, msgs);
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
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_INF:
				return getMultipliciteInf();
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_SUP:
				return getMultipliciteSup();
			case SmallumlPackage.CARDINALITE__CLASSE:
				return getClasse();
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
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_INF:
				setMultipliciteInf((String)newValue);
				return;
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_SUP:
				setMultipliciteSup((String)newValue);
				return;
			case SmallumlPackage.CARDINALITE__CLASSE:
				setClasse((Classe)newValue);
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
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_INF:
				setMultipliciteInf(MULTIPLICITE_INF_EDEFAULT);
				return;
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_SUP:
				setMultipliciteSup(MULTIPLICITE_SUP_EDEFAULT);
				return;
			case SmallumlPackage.CARDINALITE__CLASSE:
				setClasse((Classe)null);
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
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_INF:
				return MULTIPLICITE_INF_EDEFAULT == null ? multipliciteInf != null : !MULTIPLICITE_INF_EDEFAULT.equals(multipliciteInf);
			case SmallumlPackage.CARDINALITE__MULTIPLICITE_SUP:
				return MULTIPLICITE_SUP_EDEFAULT == null ? multipliciteSup != null : !MULTIPLICITE_SUP_EDEFAULT.equals(multipliciteSup);
			case SmallumlPackage.CARDINALITE__CLASSE:
				return classe != null;
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
		result.append(" (multipliciteInf: ");
		result.append(multipliciteInf);
		result.append(", multipliciteSup: ");
		result.append(multipliciteSup);
		result.append(')');
		return result.toString();
	}

} //CardinaliteImpl
