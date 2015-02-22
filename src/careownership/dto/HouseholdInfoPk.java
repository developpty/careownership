/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package careownership.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the household_info table.
 */
public class HouseholdInfoPk implements Serializable
{
	protected int householdInfoId;

	/** 
	 * This attribute represents whether the primitive attribute householdInfoId is null.
	 */
	protected boolean householdInfoIdNull;

	/** 
	 * Sets the value of householdInfoId
	 */
	public void setHouseholdInfoId(int householdInfoId)
	{
		this.householdInfoId = householdInfoId;
	}

	/** 
	 * Gets the value of householdInfoId
	 */
	public int getHouseholdInfoId()
	{
		return householdInfoId;
	}

	/**
	 * Method 'HouseholdInfoPk'
	 * 
	 */
	public HouseholdInfoPk()
	{
	}

	/**
	 * Method 'HouseholdInfoPk'
	 * 
	 * @param householdInfoId
	 */
	public HouseholdInfoPk(final int householdInfoId)
	{
		this.householdInfoId = householdInfoId;
	}

	/** 
	 * Sets the value of householdInfoIdNull
	 */
	public void setHouseholdInfoIdNull(boolean householdInfoIdNull)
	{
		this.householdInfoIdNull = householdInfoIdNull;
	}

	/** 
	 * Gets the value of householdInfoIdNull
	 */
	public boolean isHouseholdInfoIdNull()
	{
		return householdInfoIdNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof HouseholdInfoPk)) {
			return false;
		}
		
		final HouseholdInfoPk _cast = (HouseholdInfoPk) _other;
		if (householdInfoId != _cast.householdInfoId) {
			return false;
		}
		
		if (householdInfoIdNull != _cast.householdInfoIdNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + householdInfoId;
		_hashCode = 29 * _hashCode + (householdInfoIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "careownership.dto.HouseholdInfoPk: " );
		ret.append( "householdInfoId=" + householdInfoId );
		return ret.toString();
	}

}
