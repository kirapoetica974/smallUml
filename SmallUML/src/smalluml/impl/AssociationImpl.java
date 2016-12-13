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

import smalluml.Association;
import smalluml.Cardinalite;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.AssociationImpl#getNomAssociation <em>Nom Association</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getCardinalites <em>Cardinalites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association {
	/**
	 * The default value of the '{@link #getNomAssociation() <em>Nom Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAssociation()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ASSOCIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomAssociation() <em>Nom Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAssociation()
	 * @generated
	 * @ordered
	 */
	protected String nomAssociation = NOM_ASSOCIATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardinalites() <em>Cardinalites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalites()
	 * @generated
	 * @ordered
	 */
	protected EList<Cardinalite> cardinalites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomAssociation() {
		return nomAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomAssociation(String newNomAssociation) {
		String oldNomAssociation = nomAssociation;
		nomAssociation = newNomAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__NOM_ASSOCIATION, oldNomAssociation, nomAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cardinalite> getCardinalites() {
		if (cardinalites == null) {
			cardinalites = new EObjectContainmentEList<Cardinalite>(Cardinalite.class, this, SmallumlPackage.ASSOCIATION__CARDINALITES);
		}
		return cardinalites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.ASSOCIATION__CARDINALITES:
				return ((InternalEList<?>)getCardinalites()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.ASSOCIATION__NOM_ASSOCIATION:
				return getNomAssociation();
			case SmallumlPackage.ASSOCIATION__CARDINALITES:
				return getCardinalites();
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
			case SmallumlPackage.ASSOCIATION__NOM_ASSOCIATION:
				setNomAssociation((String)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__CARDINALITES:
				getCardinalites().clear();
				getCardinalites().addAll((Collection<? extends Cardinalite>)newValue);
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
			case SmallumlPackage.ASSOCIATION__NOM_ASSOCIATION:
				setNomAssociation(NOM_ASSOCIATION_EDEFAULT);
				return;
			case SmallumlPackage.ASSOCIATION__CARDINALITES:
				getCardinalites().clear();
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
			case SmallumlPackage.ASSOCIATION__NOM_ASSOCIATION:
				return NOM_ASSOCIATION_EDEFAULT == null ? nomAssociation != null : !NOM_ASSOCIATION_EDEFAULT.equals(nomAssociation);
			case SmallumlPackage.ASSOCIATION__CARDINALITES:
				return cardinalites != null && !cardinalites.isEmpty();
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
		result.append(" (nomAssociation: ");
		result.append(nomAssociation);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
