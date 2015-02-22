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

public class Mentors implements Serializable
{
	/** 
	 * This attribute maps to the column mentor_id in the mentors table.
	 */
	protected int mentorId;

	/** 
	 * This attribute maps to the column login_name in the mentors table.
	 */
	protected String loginName;

	/** 
	 * This attribute maps to the column password in the mentors table.
	 */
	protected String password;

	/** 
	 * This attribute maps to the column first_name in the mentors table.
	 */
	protected String firstName;

	/** 
	 * This attribute maps to the column last_name in the mentors table.
	 */
	protected String lastName;

	/** 
	 * This attribute maps to the column middle_initial in the mentors table.
	 */
	protected String middleInitial;

	/** 
	 * This attribute maps to the column age in the mentors table.
	 */
	protected int age;

	/** 
	 * This attribute represents whether the primitive attribute age is null.
	 */
	protected boolean ageNull = true;

	/** 
	 * This attribute maps to the column address in the mentors table.
	 */
	protected String address;

	/** 
	 * This attribute maps to the column apt# in the mentors table.
	 */
	protected String apt;

	/** 
	 * This attribute maps to the column city in the mentors table.
	 */
	protected String city;

	/** 
	 * This attribute maps to the column state in the mentors table.
	 */
	protected String state;

	/** 
	 * This attribute maps to the column zipcode in the mentors table.
	 */
	protected String zipcode;

	/** 
	 * This attribute maps to the column sex in the mentors table.
	 */
	protected String sex;

	/** 
	 * This attribute maps to the column highest_education_level in the mentors table.
	 */
	protected String highestEducationLevel;

	/** 
	 * This attribute maps to the column notes in the mentors table.
	 */
	protected String notes;

	/** 
	 * This attribute maps to the column birth_date in the mentors table.
	 */
	protected Date birthDate;

	/** 
	 * This attribute maps to the column emergency_contact in the mentors table.
	 */
	protected String emergencyContact;

	/** 
	 * This attribute maps to the column emergency_contact_description in the mentors table.
	 */
	protected String emergencyContactDescription;

	/** 
	 * This attribute maps to the column emergency_contact_contact_info in the mentors table.
	 */
	protected String emergencyContactContactInfo;

	/**
	 * Method 'Mentors'
	 * 
	 */
	public Mentors()
	{
	}

	/**
	 * Method 'getMentorId'
	 * 
	 * @return int
	 */
	public int getMentorId()
	{
		return mentorId;
	}

	/**
	 * Method 'setMentorId'
	 * 
	 * @param mentorId
	 */
	public void setMentorId(int mentorId)
	{
		this.mentorId = mentorId;
	}

	/**
	 * Method 'getLoginName'
	 * 
	 * @return String
	 */
	public String getLoginName()
	{
		return loginName;
	}

	/**
	 * Method 'setLoginName'
	 * 
	 * @param loginName
	 */
	public void setLoginName(String loginName)
	{
		this.loginName = loginName;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Method 'getFirstName'
	 * 
	 * @return String
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * Method 'setFirstName'
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * Method 'getLastName'
	 * 
	 * @return String
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * Method 'setLastName'
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * Method 'getMiddleInitial'
	 * 
	 * @return String
	 */
	public String getMiddleInitial()
	{
		return middleInitial;
	}

	/**
	 * Method 'setMiddleInitial'
	 * 
	 * @param middleInitial
	 */
	public void setMiddleInitial(String middleInitial)
	{
		this.middleInitial = middleInitial;
	}

	/**
	 * Method 'getAge'
	 * 
	 * @return int
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * Method 'setAge'
	 * 
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
		this.ageNull = false;
	}

	/**
	 * Method 'setAgeNull'
	 * 
	 * @param value
	 */
	public void setAgeNull(boolean value)
	{
		this.ageNull = value;
	}

	/**
	 * Method 'isAgeNull'
	 * 
	 * @return boolean
	 */
	public boolean isAgeNull()
	{
		return ageNull;
	}

	/**
	 * Method 'getAddress'
	 * 
	 * @return String
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * Method 'setAddress'
	 * 
	 * @param address
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * Method 'getApt'
	 * 
	 * @return String
	 */
	public String getApt()
	{
		return apt;
	}

	/**
	 * Method 'setApt'
	 * 
	 * @param apt
	 */
	public void setApt(String apt)
	{
		this.apt = apt;
	}

	/**
	 * Method 'getCity'
	 * 
	 * @return String
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * Method 'setCity'
	 * 
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * Method 'getState'
	 * 
	 * @return String
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * Method 'setState'
	 * 
	 * @param state
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * Method 'getZipcode'
	 * 
	 * @return String
	 */
	public String getZipcode()
	{
		return zipcode;
	}

	/**
	 * Method 'setZipcode'
	 * 
	 * @param zipcode
	 */
	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}

	/**
	 * Method 'getSex'
	 * 
	 * @return String
	 */
	public String getSex()
	{
		return sex;
	}

	/**
	 * Method 'setSex'
	 * 
	 * @param sex
	 */
	public void setSex(String sex)
	{
		this.sex = sex;
	}

	/**
	 * Method 'getHighestEducationLevel'
	 * 
	 * @return String
	 */
	public String getHighestEducationLevel()
	{
		return highestEducationLevel;
	}

	/**
	 * Method 'setHighestEducationLevel'
	 * 
	 * @param highestEducationLevel
	 */
	public void setHighestEducationLevel(String highestEducationLevel)
	{
		this.highestEducationLevel = highestEducationLevel;
	}

	/**
	 * Method 'getNotes'
	 * 
	 * @return String
	 */
	public String getNotes()
	{
		return notes;
	}

	/**
	 * Method 'setNotes'
	 * 
	 * @param notes
	 */
	public void setNotes(String notes)
	{
		this.notes = notes;
	}

	/**
	 * Method 'getBirthDate'
	 * 
	 * @return Date
	 */
	public Date getBirthDate()
	{
		return birthDate;
	}

	/**
	 * Method 'setBirthDate'
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}

	/**
	 * Method 'getEmergencyContact'
	 * 
	 * @return String
	 */
	public String getEmergencyContact()
	{
		return emergencyContact;
	}

	/**
	 * Method 'setEmergencyContact'
	 * 
	 * @param emergencyContact
	 */
	public void setEmergencyContact(String emergencyContact)
	{
		this.emergencyContact = emergencyContact;
	}

	/**
	 * Method 'getEmergencyContactDescription'
	 * 
	 * @return String
	 */
	public String getEmergencyContactDescription()
	{
		return emergencyContactDescription;
	}

	/**
	 * Method 'setEmergencyContactDescription'
	 * 
	 * @param emergencyContactDescription
	 */
	public void setEmergencyContactDescription(String emergencyContactDescription)
	{
		this.emergencyContactDescription = emergencyContactDescription;
	}

	/**
	 * Method 'getEmergencyContactContactInfo'
	 * 
	 * @return String
	 */
	public String getEmergencyContactContactInfo()
	{
		return emergencyContactContactInfo;
	}

	/**
	 * Method 'setEmergencyContactContactInfo'
	 * 
	 * @param emergencyContactContactInfo
	 */
	public void setEmergencyContactContactInfo(String emergencyContactContactInfo)
	{
		this.emergencyContactContactInfo = emergencyContactContactInfo;
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
		
		if (!(_other instanceof Mentors)) {
			return false;
		}
		
		final Mentors _cast = (Mentors) _other;
		if (mentorId != _cast.mentorId) {
			return false;
		}
		
		if (loginName == null ? _cast.loginName != loginName : !loginName.equals( _cast.loginName )) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		if (firstName == null ? _cast.firstName != firstName : !firstName.equals( _cast.firstName )) {
			return false;
		}
		
		if (lastName == null ? _cast.lastName != lastName : !lastName.equals( _cast.lastName )) {
			return false;
		}
		
		if (middleInitial == null ? _cast.middleInitial != middleInitial : !middleInitial.equals( _cast.middleInitial )) {
			return false;
		}
		
		if (age != _cast.age) {
			return false;
		}
		
		if (ageNull != _cast.ageNull) {
			return false;
		}
		
		if (address == null ? _cast.address != address : !address.equals( _cast.address )) {
			return false;
		}
		
		if (apt == null ? _cast.apt != apt : !apt.equals( _cast.apt )) {
			return false;
		}
		
		if (city == null ? _cast.city != city : !city.equals( _cast.city )) {
			return false;
		}
		
		if (state == null ? _cast.state != state : !state.equals( _cast.state )) {
			return false;
		}
		
		if (zipcode == null ? _cast.zipcode != zipcode : !zipcode.equals( _cast.zipcode )) {
			return false;
		}
		
		if (sex == null ? _cast.sex != sex : !sex.equals( _cast.sex )) {
			return false;
		}
		
		if (highestEducationLevel == null ? _cast.highestEducationLevel != highestEducationLevel : !highestEducationLevel.equals( _cast.highestEducationLevel )) {
			return false;
		}
		
		if (notes == null ? _cast.notes != notes : !notes.equals( _cast.notes )) {
			return false;
		}
		
		if (birthDate == null ? _cast.birthDate != birthDate : !birthDate.equals( _cast.birthDate )) {
			return false;
		}
		
		if (emergencyContact == null ? _cast.emergencyContact != emergencyContact : !emergencyContact.equals( _cast.emergencyContact )) {
			return false;
		}
		
		if (emergencyContactDescription == null ? _cast.emergencyContactDescription != emergencyContactDescription : !emergencyContactDescription.equals( _cast.emergencyContactDescription )) {
			return false;
		}
		
		if (emergencyContactContactInfo == null ? _cast.emergencyContactContactInfo != emergencyContactContactInfo : !emergencyContactContactInfo.equals( _cast.emergencyContactContactInfo )) {
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
		_hashCode = 29 * _hashCode + mentorId;
		if (loginName != null) {
			_hashCode = 29 * _hashCode + loginName.hashCode();
		}
		
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		if (firstName != null) {
			_hashCode = 29 * _hashCode + firstName.hashCode();
		}
		
		if (lastName != null) {
			_hashCode = 29 * _hashCode + lastName.hashCode();
		}
		
		if (middleInitial != null) {
			_hashCode = 29 * _hashCode + middleInitial.hashCode();
		}
		
		_hashCode = 29 * _hashCode + age;
		_hashCode = 29 * _hashCode + (ageNull ? 1 : 0);
		if (address != null) {
			_hashCode = 29 * _hashCode + address.hashCode();
		}
		
		if (apt != null) {
			_hashCode = 29 * _hashCode + apt.hashCode();
		}
		
		if (city != null) {
			_hashCode = 29 * _hashCode + city.hashCode();
		}
		
		if (state != null) {
			_hashCode = 29 * _hashCode + state.hashCode();
		}
		
		if (zipcode != null) {
			_hashCode = 29 * _hashCode + zipcode.hashCode();
		}
		
		if (sex != null) {
			_hashCode = 29 * _hashCode + sex.hashCode();
		}
		
		if (highestEducationLevel != null) {
			_hashCode = 29 * _hashCode + highestEducationLevel.hashCode();
		}
		
		if (notes != null) {
			_hashCode = 29 * _hashCode + notes.hashCode();
		}
		
		if (birthDate != null) {
			_hashCode = 29 * _hashCode + birthDate.hashCode();
		}
		
		if (emergencyContact != null) {
			_hashCode = 29 * _hashCode + emergencyContact.hashCode();
		}
		
		if (emergencyContactDescription != null) {
			_hashCode = 29 * _hashCode + emergencyContactDescription.hashCode();
		}
		
		if (emergencyContactContactInfo != null) {
			_hashCode = 29 * _hashCode + emergencyContactContactInfo.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return MentorsPk
	 */
	public MentorsPk createPk()
	{
		return new MentorsPk(mentorId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "careownership.dto.Mentors: " );
		ret.append( "mentorId=" + mentorId );
		ret.append( ", loginName=" + loginName );
		ret.append( ", password=" + password );
		ret.append( ", firstName=" + firstName );
		ret.append( ", lastName=" + lastName );
		ret.append( ", middleInitial=" + middleInitial );
		ret.append( ", age=" + age );
		ret.append( ", address=" + address );
		ret.append( ", apt=" + apt );
		ret.append( ", city=" + city );
		ret.append( ", state=" + state );
		ret.append( ", zipcode=" + zipcode );
		ret.append( ", sex=" + sex );
		ret.append( ", highestEducationLevel=" + highestEducationLevel );
		ret.append( ", notes=" + notes );
		ret.append( ", birthDate=" + birthDate );
		ret.append( ", emergencyContact=" + emergencyContact );
		ret.append( ", emergencyContactDescription=" + emergencyContactDescription );
		ret.append( ", emergencyContactContactInfo=" + emergencyContactContactInfo );
		return ret.toString();
	}

}
