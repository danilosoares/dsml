/**
 */
package index.impl;

import index.IndexPackage;
import index.RelationShipLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Ship Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link index.impl.RelationShipLinkImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link index.impl.RelationShipLinkImpl#getIsIndentifier <em>Is Indentifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationShipLinkImpl extends LinkImpl implements RelationShipLink {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsIndentifier() <em>Is Indentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIndentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsIndentifier() <em>Is Indentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIndentifier()
	 * @generated
	 * @ordered
	 */
	protected Boolean isIndentifier = IS_INDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationShipLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndexPackage.Literals.RELATION_SHIP_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndexPackage.RELATION_SHIP_LINK__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsIndentifier() {
		return isIndentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndentifier(Boolean newIsIndentifier) {
		Boolean oldIsIndentifier = isIndentifier;
		isIndentifier = newIsIndentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndexPackage.RELATION_SHIP_LINK__IS_INDENTIFIER, oldIsIndentifier, isIndentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IndexPackage.RELATION_SHIP_LINK__CARDINALITY:
				return getCardinality();
			case IndexPackage.RELATION_SHIP_LINK__IS_INDENTIFIER:
				return getIsIndentifier();
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
			case IndexPackage.RELATION_SHIP_LINK__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case IndexPackage.RELATION_SHIP_LINK__IS_INDENTIFIER:
				setIsIndentifier((Boolean)newValue);
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
			case IndexPackage.RELATION_SHIP_LINK__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case IndexPackage.RELATION_SHIP_LINK__IS_INDENTIFIER:
				setIsIndentifier(IS_INDENTIFIER_EDEFAULT);
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
			case IndexPackage.RELATION_SHIP_LINK__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case IndexPackage.RELATION_SHIP_LINK__IS_INDENTIFIER:
				return IS_INDENTIFIER_EDEFAULT == null ? isIndentifier != null : !IS_INDENTIFIER_EDEFAULT.equals(isIndentifier);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", isIndentifier: ");
		result.append(isIndentifier);
		result.append(')');
		return result.toString();
	}

} //RelationShipLinkImpl
