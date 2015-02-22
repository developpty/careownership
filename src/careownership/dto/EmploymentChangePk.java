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
 * This class represents the primary key of the employment_change table.
 */
public class EmploymentChangePk implements Serializable
{
	protected int employmentChangeId;

	/** 
	 * This attribute represents whether the primitive attribute employmentChangeId is null.
	 */
	protected boolean employmentChangeIdNull;

	/** 
	 * Sets the value of employmentChangeId
	 */
	public void setEmploymentChangeId(int employmentChangeId)
	{
		this.employmentChangeId = employmentChangeId;
	}

	/** 
	 * Gets the value of employmentChangeId
	 */
	public int getEmploymentChangeId()
	{
		return employmentChangeId;
	}

	/**
	 * Method 'EmploymentChangePk'
	 * 
	 */
	public EmploymentChangePk()
	{
	}

	/**
	 * Method 'EmploymentChangePk'
	 * 
	 * @param employmentChangeId
	 */
	public EmploymentChangePk(final int employmentChangeId)
	{
		this.employmentChangeId = employmentChangeId;
	}

	/** 
	 * Sets the value of employmentChangeIdNull
	 */
	public void setEmploymentChangeIdNull(boolean employmentChangeIdNull)
	{
		this.employmentChangeIdNull = employmentChangeIdNull;
	}

	/** 
	 * Gets the value of employmentChangeIdNull
	 */
	public boolean isEmploymentChangeIdNull()
	{
		return employmentChangeIdNull;
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
		
		if (!(_other instanceof EmploymentChangePk)) {
			return false;
		}
		
		final EmploymentChangePk _cast = (EmploymentChangePk) _other;
		if (employmentChangeId != _cast.employmentChangeId) {
			return false;
		}
		
		if (employmentChangeIdNull != _cast.employmentChangeIdNull) {
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
		_hashCode = 29 * _hashCode + employmentChangeId;
		_hashCode = 29 * _hashCode + (employmentChangeIdNull ? 1 : 0);
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
		ret.append( "careownership.dto.EmploymentChangePk: " );
		ret.append( "employmentChangeId=" + employmentChangeId );
		return ret.toString();
	}

}
