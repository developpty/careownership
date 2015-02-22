/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package careownership.dao;

import java.util.Date;
import careownership.dto.*;
import careownership.exceptions.*;

public interface MentorsDao
{
	/** 
	 * Inserts a new row in the mentors table.
	 */
	public MentorsPk insert(Mentors dto) throws MentorsDaoException;

	/** 
	 * Updates a single row in the mentors table.
	 */
	public void update(MentorsPk pk, Mentors dto) throws MentorsDaoException;

	/** 
	 * Deletes a single row in the mentors table.
	 */
	public void delete(MentorsPk pk) throws MentorsDaoException;

	/** 
	 * Returns the rows from the mentors table that matches the specified primary-key value.
	 */
	public Mentors findByPrimaryKey(MentorsPk pk) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'mentor_id = :mentorId'.
	 */
	public Mentors findByPrimaryKey(int mentorId) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'full_name = :fullName'.
	 */
	public Mentors[] findWhereFullNameEquals(String fullName) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria ''.
	 */
	public Mentors[] findAll() throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'mentor_id = :mentorId'.
	 */
	public Mentors[] findWhereMentorIdEquals(int mentorId) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'first_name = :firstName'.
	 */
	public Mentors[] findWhereFirstNameEquals(String firstName) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'last_name = :lastName'.
	 */
	public Mentors[] findWhereLastNameEquals(String lastName) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'middle_initial = :middleInitial'.
	 */
	public Mentors[] findWhereMiddleInitialEquals(String middleInitial) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'age = :age'.
	 */
	public Mentors[] findWhereAgeEquals(int age) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'address = :address'.
	 */
	public Mentors[] findWhereAddressEquals(String address) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'apt# = :apt'.
	 */
	public Mentors[] findWhereAptEquals(String apt) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'city = :city'.
	 */
	public Mentors[] findWhereCityEquals(String city) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'state = :state'.
	 */
	public Mentors[] findWhereStateEquals(String state) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'zipcode = :zipcode'.
	 */
	public Mentors[] findWhereZipcodeEquals(String zipcode) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'sex = :sex'.
	 */
	public Mentors[] findWhereSexEquals(String sex) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'highest_education_level = :highestEducationLevel'.
	 */
	public Mentors[] findWhereHighestEducationLevelEquals(String highestEducationLevel) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'notes = :notes'.
	 */
	public Mentors[] findWhereNotesEquals(String notes) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'birth_date = :birthDate'.
	 */
	public Mentors[] findWhereBirthDateEquals(Date birthDate) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'emergency_contact = :emergencyContact'.
	 */
	public Mentors[] findWhereEmergencyContactEquals(String emergencyContact) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'emergency_contact_description = :emergencyContactDescription'.
	 */
	public Mentors[] findWhereEmergencyContactDescriptionEquals(String emergencyContactDescription) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'emergency_contact_contact_info = :emergencyContactContactInfo'.
	 */
	public Mentors[] findWhereEmergencyContactContactInfoEquals(String emergencyContactContactInfo) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'login_name = :loginName'.
	 */
	public Mentors[] findWhereLoginNameEquals(String loginName) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the criteria 'password = :password'.
	 */
	public Mentors[] findWherePasswordEquals(String password) throws MentorsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the mentors table that match the specified arbitrary SQL statement
	 */
	public Mentors[] findByDynamicSelect(String sql, Object[] sqlParams) throws MentorsDaoException;

	/** 
	 * Returns all rows from the mentors table that match the specified arbitrary SQL statement
	 */
	public Mentors[] findByDynamicWhere(String sql, Object[] sqlParams) throws MentorsDaoException;

}
