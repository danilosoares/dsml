/**
 */
package index;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Ship Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link index.RelationShipLink#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link index.RelationShipLink#getIsIndentifier <em>Is Indentifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see index.IndexPackage#getRelationShipLink()
 * @model
 * @generated
 */
public interface RelationShipLink extends Link {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see index.IndexPackage#getRelationShipLink_Cardinality()
	 * @model
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link index.RelationShipLink#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Is Indentifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Indentifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Indentifier</em>' attribute.
	 * @see #setIsIndentifier(Boolean)
	 * @see index.IndexPackage#getRelationShipLink_IsIndentifier()
	 * @model
	 * @generated
	 */
	Boolean getIsIndentifier();

	/**
	 * Sets the value of the '{@link index.RelationShipLink#getIsIndentifier <em>Is Indentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indentifier</em>' attribute.
	 * @see #getIsIndentifier()
	 * @generated
	 */
	void setIsIndentifier(Boolean value);

} // RelationShipLink
