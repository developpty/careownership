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
 * This class represents the primary key of the initial_employment table.
 */
public class InitialEmploymentPk implements Serializable
{
	protected int initialEmploymentId;

	/** 
	 * This attribute represents whether the primitive attribute initialEmploymentId is null.
	 */
	protected boolean initialEmploymentIdNull;

	/** 
	 * Sets the value of initialEmploymentId
	 */
	public void setInitialEmploymentId(int initialEmploymentId)
	{
		this.initialEmploymentId = initialEmploymentId;
	}

	/** 
	 * Gets the value of initialEmploymentId
	 */
	public int getInitialEmploymentId()
	{
		return initialEmploymentId;
	}

	/**
	 * Method 'InitialEmploymentPk'
	 * 
	 */
	public InitialEmploymentPk()
	{
	}

	/**
	 * Method 'InitialEmploymentPk'
	 * 
	 * @param initialEmploymentId
	 */
	public InitialEmploymentPk(final int initialEmploymentId)
	{
		this.initialEmploymentId = initialEmploymentId;
	}

	/** 
	 * Sets the value of initialEmploymentIdNull
	 */
	public void setInitialEmploymentIdNull(boolean initialEmploymentIdNull)
	{
		this.initialEmploymentIdNull = initialEmploymentIdNull;
	}

	/** 
	 * Gets the value of initialEmploymentIdNull
	 */
	public boolean isInitialEmploymentIdNull()
	{
		return initialEmploymentIdNull;
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
		
		if (!(_other instanceof InitialEmploymentPk)) {
			return false;
		}
		
		final InitialEmploymentPk _cast = (InitialEmploymentPk) _other;
		if (initialEmploymentId != _cast.initialEmploymentId) {
			return false;
		}
		
		if (initialEmploymentIdNull != _cast.initialEmploymentIdNull) {
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
		_hashCode = 29 * _hashCode + initialEmploymentId;
		_hashCode = 29 * _hashCode + (initialEmploymentIdNull ? 1 : 0);
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
		ret.append( "careownership.dto.InitialEmploymentPk: " );
		ret.append( "initialEmploymentId=" + initialEmploymentId );
		return ret.toString();
	}

}
