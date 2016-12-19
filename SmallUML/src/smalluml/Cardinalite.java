/**
 */
package smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinalite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Cardinalite#getMultipliciteInf <em>Multiplicite Inf</em>}</li>
 *   <li>{@link smalluml.Cardinalite#getMultipliciteSup <em>Multiplicite Sup</em>}</li>
 *   <li>{@link smalluml.Cardinalite#getClasse <em>Classe</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getCardinalite()
 * @model
 * @generated
 */
public interface Cardinalite extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Multiplicite Inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicite Inf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicite Inf</em>' attribute.
	 * @see #setMultipliciteInf(String)
	 * @see smalluml.SmallumlPackage#getCardinalite_MultipliciteInf()
	 * @model
	 * @generated
	 */
	String getMultipliciteInf();

	/**
	 * Sets the value of the '{@link smalluml.Cardinalite#getMultipliciteInf <em>Multiplicite Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicite Inf</em>' attribute.
	 * @see #getMultipliciteInf()
	 * @generated
	 */
	void setMultipliciteInf(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicite Sup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicite Sup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicite Sup</em>' attribute.
	 * @see #setMultipliciteSup(String)
	 * @see smalluml.SmallumlPackage#getCardinalite_MultipliciteSup()
	 * @model
	 * @generated
	 */
	String getMultipliciteSup();

	/**
	 * Sets the value of the '{@link smalluml.Cardinalite#getMultipliciteSup <em>Multiplicite Sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicite Sup</em>' attribute.
	 * @see #getMultipliciteSup()
	 * @generated
	 */
	void setMultipliciteSup(String value);

	/**
	 * Returns the value of the '<em><b>Classe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' containment reference.
	 * @see #setClasse(Classe)
	 * @see smalluml.SmallumlPackage#getCardinalite_Classe()
	 * @model containment="true"
	 * @generated
	 */
	Classe getClasse();

	/**
	 * Sets the value of the '{@link smalluml.Cardinalite#getClasse <em>Classe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe</em>' containment reference.
	 * @see #getClasse()
	 * @generated
	 */
	void setClasse(Classe value);

} // Cardinalite
