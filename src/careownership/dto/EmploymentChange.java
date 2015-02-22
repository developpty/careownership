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
import java.util.Date;

public class EmploymentChange implements Serializable
{
	/** 
	 * This attribute maps to the column employment_change_id in the employment_change table.
	 */
	protected int employmentChangeId;

	/** 
	 * This attribute maps to the column current_position in the employment_change table.
	 */
	protected String currentPosition;

	/** 
	 * This attribute maps to the column current_monthly_earnings in the employment_change table.
	 */
	protected int currentMonthlyEarnings;

	/** 
	 * This attribute represents whether the primitive attribute currentMonthlyEarnings is null.
	 */
	protected boolean currentMonthlyEarningsNull = true;

	/** 
	 * This attribute maps to the column current_employer in the employment_change table.
	 */
	protected String currentEmployer;

	/** 
	 * This attribute maps to the column date_of_change in the employment_change table.
	 */
	protected Date dateOfChange;

	/** 
	 * This attribute maps to the column current_notes in the employment_change table.
	 */
	protected String currentNotes;

	/** 
	 * This attribute maps to the column mentee_id in the employment_change table.
	 */
	protected int menteeId;

	/**
	 * Method 'EmploymentChange'
	 * 
	 */
	public EmploymentChange()
	{
	}

	/**
	 * Method 'getEmploymentChangeId'
	 * 
	 * @return int
	 */
	public int getEmploymentChangeId()
	{
		return employmentChangeId;
	}

	/**
	 * Method 'setEmploymentChangeId'
	 * 
	 * @param employmentChangeId
	 */
	public void setEmploymentChangeId(int employmentChangeId)
	{
		this.employmentChangeId = employmentChangeId;
	}

	/**
	 * Method 'getCurrentPosition'
	 * 
	 * @return String
	 */
	public String getCurrentPosition()
	{
		return currentPosition;
	}

	/**
	 * Method 'setCurrentPosition'
	 * 
	 * @param currentPosition
	 */
	public void setCurrentPosition(String currentPosition)
	{
		this.currentPosition = currentPosition;
	}

	/**
	 * Method 'getCurrentMonthlyEarnings'
	 * 
	 * @return int
	 */
	public int getCurrentMonthlyEarnings()
	{
		return currentMonthlyEarnings;
	}

	/**
	 * Method 'setCurrentMonthlyEarnings'
	 * 
	 * @param currentMonthlyEarnings
	 */
	public void setCurrentMonthlyEarnings(int currentMonthlyEarnings)
	{
		this.currentMonthlyEarnings = currentMonthlyEarnings;
		this.currentMonthlyEarningsNull = false;
	}

	/**
	 * Method 'setCurrentMonthlyEarningsNull'
	 * 
	 * @param value
	 */
	public void setCurrentMonthlyEarningsNull(boolean value)
	{
		this.currentMonthlyEarningsNull = value;
	}

	/**
	 * Method 'isCurrentMonthlyEarningsNull'
	 * 
	 * @return boolean
	 */
	public boolean isCurrentMonthlyEarningsNull()
	{
		return currentMonthlyEarningsNull;
	}

	/**
	 * Method 'getCurrentEmployer'
	 * 
	 * @return String
	 */
	public String getCurrentEmployer()
	{
		return currentEmployer;
	}

	/**
	 * Method 'setCurrentEmployer'
	 * 
	 * @param currentEmployer
	 */
	public void setCurrentEmployer(String currentEmployer)
	{
		this.currentEmployer = currentEmployer;
	}

	/**
	 * Method 'getDateOfChange'
	 * 
	 * @return Date
	 */
	public Date getDateOfChange()
	{
		return dateOfChange;
	}

	/**
	 * Method 'setDateOfChange'
	 * 
	 * @param dateOfChange
	 */
	public void setDateOfChange(Date dateOfChange)
	{
		this.dateOfChange = dateOfChange;
	}

	/**
	 * Method 'getCurrentNotes'
	 * 
	 * @return String
	 */
	public String getCurrentNotes()
	{
		return currentNotes;
	}

	/**
	 * Method 'setCurrentNotes'
	 * 
	 * @param currentNotes
	 */
	public void setCurrentNotes(String currentNotes)
	{
		this.currentNotes = currentNotes;
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
		
		if (!(_other instanceof EmploymentChange)) {
			return false;
		}
		
		final EmploymentChange _cast = (EmploymentChange) _other;
		if (employmentChangeId != _cast.employmentChangeId) {
			return false;
		}
		
		if (currentPosition == null ? _cast.currentPosition != currentPosition : !currentPosition.equals( _cast.currentPosition )) {
			return false;
		}
		
		if (currentMonthlyEarnings != _cast.currentMonthlyEarnings) {
			return false;
		}
		
		if (currentMonthlyEarningsNull != _cast.currentMonthlyEarningsNull) {
			return false;
		}
		
		if (currentEmployer == null ? _cast.currentEmployer != currentEmployer : !currentEmployer.equals( _cast.currentEmployer )) {
			return false;
		}
		
		if (dateOfChange == null ? _cast.dateOfChange != dateOfChange : !dateOfChange.equals( _cast.dateOfChange )) {
			return false;
		}
		
		if (currentNotes == null ? _cast.currentNotes != currentNotes : !currentNotes.equals( _cast.currentNotes )) {
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
		_hashCode = 29 * _hashCode + employmentChangeId;
		if (currentPosition != null) {
			_hashCode = 29 * _hashCode + currentPosition.hashCode();
		}
		
		_hashCode = 29 * _hashCode + currentMonthlyEarnings;
		_hashCode = 29 * _hashCode + (currentMonthlyEarningsNull ? 1 : 0);
		if (currentEmployer != null) {
			_hashCode = 29 * _hashCode + currentEmployer.hashCode();
		}
		
		if (dateOfChange != null) {
			_hashCode = 29 * _hashCode + dateOfChange.hashCode();
		}
		
		if (currentNotes != null) {
			_hashCode = 29 * _hashCode + currentNotes.hashCode();
		}
		
		_hashCode = 29 * _hashCode + menteeId;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmploymentChangePk
	 */
	public EmploymentChangePk createPk()
	{
		return new EmploymentChangePk(employmentChangeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "careownership.dto.EmploymentChange: " );
		ret.append( "employmentChangeId=" + employmentChangeId );
		ret.append( ", currentPosition=" + currentPosition );
		ret.append( ", currentMonthlyEarnings=" + currentMonthlyEarnings );
		ret.append( ", currentEmployer=" + currentEmployer );
		ret.append( ", dateOfChange=" + dateOfChange );
		ret.append( ", currentNotes=" + currentNotes );
		ret.append( ", menteeId=" + menteeId );
		return ret.toString();
	}

}