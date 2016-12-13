/**
 */
package smalluml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smalluml.Attribut;
import smalluml.SmallumlPackage;
import smalluml.TypeDonnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Donnee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.TypeDonneeImpl#getAttributs <em>Attributs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDonneeImpl extends TypeImpl implements TypeDonnee {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDonneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.TYPE_DONNEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribut> getAttributs() {
		if (attributs == null) {
			attributs = new EObjectContainmentEList<Attribut>(Attribut.class, this, SmallumlPackage.TYPE_DONNEE__ATTRIBUTS);
		}
		return attributs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.TYPE_DONNEE__ATTRIBUTS:
				return ((InternalEList<?>)getAttributs()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.TYPE_DONNEE__ATTRIBUTS:
				return getAttributs();
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
			case SmallumlPackage.TYPE_DONNEE__ATTRIBUTS:
				getAttributs().clear();
				getAttributs().addAll((Collection<? extends Attribut>)newValue);
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
			case SmallumlPackage.TYPE_DONNEE__ATTRIBUTS:
				getAttributs().clear();
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
			case SmallumlPackage.TYPE_DONNEE__ATTRIBUTS:
				return attributs != null && !attributs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeDonneeImpl
