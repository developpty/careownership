/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package careownership.dto;

import careownership.dao.*;
import careownership.factory.*;
import careownership.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class InitialEmployment implements Serializable
{
	/** 
	 * This attribute maps to the column initial_employment_id in the initial_employment table.
	 */
	protected int initialEmploymentId;

	/** 
	 * This attribute maps to the column initial_employment_position in the initial_employment table.
	 */
	protected String initialEmploymentPosition;

	/** 
	 * This attribute maps to the column initial_employer in the initial_employment table.
	 */
	protected String initialEmployer;

	/** 
	 * This attribute maps to the column initial_employment_earnings in the initial_employment table.
	 */
	protected int initialEmploymentEarnings;

	/** 
	 * This attribute represents whether the primitive attribute initialEmploymentEarnings is null.
	 */
	protected boolean initialEmploymentEarningsNull = true;

	/** 
	 * This attribute maps to the column initial_employment_contact_person in the initial_employment table.
	 */
	protected String initialEmploymentContactPerson;

	/** 
	 * This attribute maps to the column initial_employmen_contact_person_contact_info in the initial_employment table.
	 */
	protected String initialEmploymenContactPersonContactInfo;

	/** 
	 * This attribute maps to the column initial_employment_contact_person_contact_permission in the initial_employment table.
	 */
	protected String initialEmploymentContactPersonContactPermission;

	/** 
	 * This attribute maps to the column initial_employment_description in the initial_employment table.
	 */
	protected String initialEmploymentDescription;

	/** 
	 * This attribute maps to the column initial_employment_duration_months in the initial_employment table.
	 */
	protected int initialEmploymentDurationMonths;

	/** 
	 * This attribute represents whether the primitive attribute initialEmploymentDurationMonths is null.
	 */
	protected boolean initialEmploymentDurationMonthsNull = true;

	/** 
	 * This attribute maps to the column mentee_id in the initial_employment table.
	 */
	protected int menteeId;

	/**
	 * Method 'InitialEmployment'
	 * 
	 */
	public InitialEmployment()
	{
	}

	/**
	 * Method 'getInitialEmploymentId'
	 * 
	 * @return int
	 */
	public int getInitialEmploymentId()
	{
		return initialEmploymentId;
	}

	/**
	 * Method 'setInitialEmploymentId'
	 * 
	 * @param initialEmploymentId
	 */
	public void setInitialEmploymentId(int initialEmploymentId)
	{
		this.initialEmploymentId = initialEmploymentId;
	}

	/**
	 * Method 'getInitialEmploymentPosition'
	 * 
	 * @return String
	 */
	public String getInitialEmploymentPosition()
	{
		return initialEmploymentPosition;
	}

	/**
	 * Method 'setInitialEmploymentPosition'
	 * 
	 * @param initialEmploymentPosition
	 */
	public void setInitialEmploymentPosition(String initialEmploymentPosition)
	{
		this.initialEmploymentPosition = initialEmploymentPosition;
	}

	/**
	 * Method 'getInitialEmployer'
	 * 
	 * @return String
	 */
	public String getInitialEmployer()
	{
		return initialEmployer;
	}

	/**
	 * Method 'setInitialEmployer'
	 * 
	 * @param initialEmployer
	 */
	public void setInitialEmployer(String initialEmployer)
	{
		this.initialEmployer = initialEmployer;
	}

	/**
	 * Method 'getInitialEmploymentEarnings'
	 * 
	 * @return int
	 */
	public int getInitialEmploymentEarnings()
	{
		return initialEmploymentEarnings;
	}

	/**
	 * Method 'setInitialEmploymentEarnings'
	 * 
	 * @param initialEmploymentEarnings
	 */
	public void setInitialEmploymentEarnings(int initialEmploymentEarnings)
	{
		this.initialEmploymentEarnings = initialEmploymentEarnings;
		this.initialEmploymentEarningsNull = false;
	}

	/**
	 * Method 'setInitialEmploymentEarningsNull'
	 * 
	 * @param value
	 */
	public void setInitialEmploymentEarningsNull(boolean value)
	{
		this.initialEmploymentEarningsNull = value;
	}

	/**
	 * Method 'isInitialEmploymentEarningsNull'
	 * 
	 * @return boolean
	 */
	public boolean isInitialEmploymentEarningsNull()
	{
		return initialEmploymentEarningsNull;
	}

	/**
	 * Method 'getInitialEmploymentContactPerson'
	 * 
	 * @return String
	 */
	public String getInitialEmploymentContactPerson()
	{
		return initialEmploymentContactPerson;
	}

	/**
	 * Method 'setInitialEmploymentContactPerson'
	 * 
	 * @param initialEmploymentContactPerson
	 */
	public void setInitialEmploymentContactPerson(String initialEmploymentContactPerson)
	{
		this.initialEmploymentContactPerson = initialEmploymentContactPerson;
	}

	/**
	 * Method 'getInitialEmploymenContactPersonContactInfo'
	 * 
	 * @return String
	 */
	public String getInitialEmploymenContactPersonContactInfo()
	{
		return initialEmploymenContactPersonContactInfo;
	}

	/**
	 * Method 'setInitialEmploymenContactPersonContactInfo'
	 * 
	 * @param initialEmploymenContactPersonContactInfo
	 */
	public void setInitialEmploymenContactPersonContactInfo(String initialEmploymenContactPersonContactInfo)
	{
		this.initialEmploymenContactPersonContactInfo = initialEmploymenContactPersonContactInfo;
	}

	/**
	 * Method 'getInitialEmploymentContactPersonContactPermission'
	 * 
	 * @return String
	 */
	public String getInitialEmploymentContactPersonContactPermission()
	{
		return initialEmploymentContactPersonContactPermission;
	}

	/**
	 * Method 'setInitialEmploymentContactPersonContactPermission'
	 * 
	 * @param initialEmploymentContactPersonContactPermission
	 */
	public void setInitialEmploymentContactPersonContactPermission(String initialEmploymentContactPersonContactPermission)
	{
		this.initialEmploymentContactPersonContactPermission = initialEmploymentContactPersonContactPermission;
	}

	/**
	 * Method 'getInitialEmploymentDescription'
	 * 
	 * @return String
	 */
	public String getInitialEmploymentDescription()
	{
		return initialEmploymentDescription;
	}

	/**
	 * Method 'setInitialEmploymentDescription'
	 * 
	 * @param initialEmploymentDescription
	 */
	public void setInitialEmploymentDescription(String initialEmploymentDescription)
	{
		this.initialEmploymentDescription = initialEmploymentDescription;
	}

	/**
	 * Method 'getInitialEmploymentDurationMonths'
	 * 
	 * @return int
	 */
	public int getInitialEmploymentDurationMonths()
	{
		return initialEmploymentDurationMonths;
	}

	/**
	 * Method 'setInitialEmploymentDurationMonths'
	 * 
	 * @param initialEmploymentDurationMonths
	 */
	public void setInitialEmploymentDurationMonths(int initialEmploymentDurationMonths)
	{
		this.initialEmploymentDurationMonths = initialEmploymentDurationMonths;
		this.initialEmploymentDurationMonthsNull = false;
	}

	/**
	 * Method 'setInitialEmploymentDurationMonthsNull'
	 * 
	 * @param value
	 */
	public void setInitialEmploymentDurationMonthsNull(boolean value)
	{
		this.initialEmploymentDurationMonthsNull = value;
	}

	/**
	 * Method 'isInitialEmploymentDurationMonthsNull'
	 * 
	 * @return boolean
	 */
	public boolean isInitialEmploymentDurationMonthsNull()
	{
		return initialEmploymentDurationMonthsNull;
	}

	/**
	 * Method 'getMenteeId'
	 * 
	 * @return int
	 */
	public int getMenteeId()
	{
		return menteeId;
	}

	/**
	 * Method 'setMenteeId'
	 * 
	 * @param menteeId
	 */
	public void setMenteeId(int menteeId)
	{
		this.menteeId = menteeId;
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
		
		if (!(_other instanceof InitialEmployment)) {
			return false;
		}
		
		final InitialEmployment _cast = (InitialEmployment) _other;
		if (initialEmploymentId != _cast.initialEmploymentId) {
			return false;
		}
		
		if (initialEmploymentPosition == null ? _cast.initialEmploymentPosition != initialEmploymentPosition : !initialEmploymentPosition.equals( _cast.initialEmploymentPosition )) {
			return false;
		}
		
		if (initialEmployer == null ? _cast.initialEmployer != initialEmployer : !initialEmployer.equals( _cast.initialEmployer )) {
			return false;
		}
		
		if (initialEmploymentEarnings != _cast.initialEmploymentEarnings) {
			return false;
		}
		
		if (initialEmploymentEarningsNull != _cast.initialEmploymentEarningsNull) {
			return false;
		}
		
		if (initialEmploymentContactPerson == null ? _cast.initialEmploymentContactPerson != initialEmploymentContactPerson : !initialEmploymentContactPerson.equals( _cast.initialEmploymentContactPerson )) {
			return false;
		}
		
		if (initialEmploymenContactPersonContactInfo == null ? _cast.initialEmploymenContactPersonContactInfo != initialEmploymenContactPersonContactInfo : !initialEmploymenContactPersonContactInfo.equals( _cast.initialEmploymenContactPersonContactInfo )) {
			return false;
		}
		
		if (initialEmploymentContactPersonContactPermission == null ? _cast.initialEmploymentContactPersonContactPermission != initialEmploymentContactPersonContactPermission : !initialEmploymentContactPersonContactPermission.equals( _cast.initialEmploymentContactPersonContactPermission )) {
			return false;
		}
		
		if (initialEmploymentDescription == null ? _cast.initialEmploymentDescription != initialEmploymentDescription : !initialEmploymentDescription.equals( _cast.initialEmploymentDescription )) {
			return false;
		}
		
		if (initialEmploymentDurationMonths != _cast.initialEmploymentDurationMonths) {
			return false;
		}
		
		if (initialEmploymentDurationMonthsNull != _cast.initialEmploymentDurationMonthsNull) {
			return false;
		}
		
		if (menteeId != _cast.menteeId) {
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
		if (initialEmploymentPosition != null) {
			_hashCode = 29 * _hashCode + initialEmploymentPosition.hashCode();
		}
		
		if (initialEmployer != null) {
			_hashCode = 29 * _hashCode + initialEmployer.hashCode();
		}
		
		_hashCode = 29 * _hashCode + initialEmploymentEarnings;
		_hashCode = 29 * _hashCode + (initialEmploymentEarningsNull ? 1 : 0);
		if (initialEmploymentContactPerson != null) {
			_hashCode = 29 * _hashCode + initialEmploymentContactPerson.hashCode();
		}
		
		if (initialEmploymenContactPersonContactInfo != null) {
			_hashCode = 29 * _hashCode + initialEmploymenContactPersonContactInfo.hashCode();
		}
		
		if (initialEmploymentContactPersonContactPermission != null) {
			_hashCode = 29 * _hashCode + initialEmploymentContactPersonContactPermission.hashCode();
		}
		
		if (initialEmploymentDescription != null) {
			_hashCode = 29 * _hashCode + initialEmploymentDescription.hashCode();
		}
		
		_hashCode = 29 * _hashCode + initialEmploymentDurationMonths;
		_hashCode = 29 * _hashCode + (initialEmploymentDurationMonthsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + menteeId;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InitialEmploymentPk
	 */
	public InitialEmploymentPk createPk()
	{
		return new InitialEmploymentPk(initialEmploymentId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "careownership.dto.InitialEmployment: " );
		ret.append( "initialEmploymentId=" + initialEmploymentId );
		ret.append( ", initialEmploymentPosition=" + initialEmploymentPosition );
		ret.append( ", initialEmployer=" + initialEmployer );
		ret.append( ", initialEmploymentEarnings=" + initialEmploymentEarnings );
		ret.append( ", initialEmploymentContactPerson=" + initialEmploymentContactPerson );
		ret.append( ", initialEmploymenContactPersonContactInfo=" + initialEmploymenContactPersonContactInfo );
		ret.append( ", initialEmploymentContactPersonContactPermission=" + initialEmploymentContactPersonContactPermission );
		ret.append( ", initialEmploymentDescription=" + initialEmploymentDescription );
		ret.append( ", initialEmploymentDurationMonths=" + initialEmploymentDurationMonths );
		ret.append( ", menteeId=" + menteeId );
		return ret.toString();
	}

}
