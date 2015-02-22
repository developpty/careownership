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

public interface ApplicationDao
{
	/** 
	 * Inserts a new row in the application table.
	 */
	public ApplicationPk insert(Application dto) throws ApplicationDaoException;

	/** 
	 * Updates a single row in the application table.
	 */
	public void update(ApplicationPk pk, Application dto) throws ApplicationDaoException;

	/** 
	 * Deletes a single row in the application table.
	 */
	public void delete(ApplicationPk pk) throws ApplicationDaoException;

	/** 
	 * Returns the rows from the application table that matches the specified primary-key value.
	 */
	public Application findByPrimaryKey(ApplicationPk pk) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'mentee_id = :menteeId'.
	 */
	public Application findByPrimaryKey(int menteeId) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria ''.
	 */
	public Application[] findAll() throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'mentee_id = :menteeId'.
	 */
	public Application[] findByMentees(int menteeId) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'mentee_id = :menteeId'.
	 */
	public Application[] findWhereMenteeIdEquals(int menteeId) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'contact_type = :contactType'.
	 */
	public Application[] findWhereContactTypeEquals(String contactType) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'initial_contact_made = :initialContactMade'.
	 */
	public Application[] findWhereInitialContactMadeEquals(String initialContactMade) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_highest_education_level = :applicationHighestEducationLevel'.
	 */
	public Application[] findWhereApplicationHighestEducationLevelEquals(String applicationHighestEducationLevel) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'drug_abuse_history = :drugAbuseHistory'.
	 */
	public Application[] findWhereDrugAbuseHistoryEquals(String drugAbuseHistory) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'drug_abuse_history_description = :drugAbuseHistoryDescription'.
	 */
	public Application[] findWhereDrugAbuseHistoryDescriptionEquals(String drugAbuseHistoryDescription) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'homeless_history = :homelessHistory'.
	 */
	public Application[] findWhereHomelessHistoryEquals(String homelessHistory) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'homeless_history_description = :homelessHistoryDescription'.
	 */
	public Application[] findWhereHomelessHistoryDescriptionEquals(String homelessHistoryDescription) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'alcohol_abuse_history = :alcoholAbuseHistory'.
	 */
	public Application[] findWhereAlcoholAbuseHistoryEquals(String alcoholAbuseHistory) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'alcohol_abuse_history_description = :alcoholAbuseHistoryDescription'.
	 */
	public Application[] findWhereAlcoholAbuseHistoryDescriptionEquals(String alcoholAbuseHistoryDescription) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'religious_background = :religiousBackground'.
	 */
	public Application[] findWhereReligiousBackgroundEquals(String religiousBackground) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'mental_illness_history = :mentalIllnessHistory'.
	 */
	public Application[] findWhereMentalIllnessHistoryEquals(String mentalIllnessHistory) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'mental_illness_history_description = :mentalIllnessHistoryDescription'.
	 */
	public Application[] findWhereMentalIllnessHistoryDescriptionEquals(String mentalIllnessHistoryDescription) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'criminal_history = :criminalHistory'.
	 */
	public Application[] findWhereCriminalHistoryEquals(String criminalHistory) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'criminal_history_description = :criminalHistoryDescription'.
	 */
	public Application[] findWhereCriminalHistoryDescriptionEquals(String criminalHistoryDescription) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'date_of_most_recent_criminal_offence = :dateOfMostRecentCriminalOffence'.
	 */
	public Application[] findWhereDateOfMostRecentCriminalOffenceEquals(Date dateOfMostRecentCriminalOffence) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'probation_end_date = :probationEndDate'.
	 */
	public Application[] findWhereProbationEndDateEquals(Date probationEndDate) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'other_initial_conditions = :otherInitialConditions'.
	 */
	public Application[] findWhereOtherInitialConditionsEquals(String otherInitialConditions) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_notes = :applicationNotes'.
	 */
	public Application[] findWhereApplicationNotesEquals(String applicationNotes) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_received_date = :applicationReceivedDate'.
	 */
	public Application[] findWhereApplicationReceivedDateEquals(Date applicationReceivedDate) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_recieved_method = :applicationRecievedMethod'.
	 */
	public Application[] findWhereApplicationRecievedMethodEquals(String applicationRecievedMethod) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'previous_home_ownership = :previousHomeOwnership'.
	 */
	public Application[] findWherePreviousHomeOwnershipEquals(String previousHomeOwnership) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_status = :applicationStatus'.
	 */
	public Application[] findWhereApplicationStatusEquals(String applicationStatus) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'interview_description = :interviewDescription'.
	 */
	public Application[] findWhereInterviewDescriptionEquals(String interviewDescription) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_approved_date = :applicationApprovedDate'.
	 */
	public Application[] findWhereApplicationApprovedDateEquals(Date applicationApprovedDate) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'date_begins_program = :dateBeginsProgram'.
	 */
	public Application[] findWhereDateBeginsProgramEquals(Date dateBeginsProgram) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_reference = :applicationReference'.
	 */
	public Application[] findWhereApplicationReferenceEquals(String applicationReference) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_reference_affliation = :applicationReferenceAffliation'.
	 */
	public Application[] findWhereApplicationReferenceAffliationEquals(String applicationReferenceAffliation) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the criteria 'application_reference_contact_info = :applicationReferenceContactInfo'.
	 */
	public Application[] findWhereApplicationReferenceContactInfoEquals(String applicationReferenceContactInfo) throws ApplicationDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the application table that match the specified arbitrary SQL statement
	 */
	public Application[] findByDynamicSelect(String sql, Object[] sqlParams) throws ApplicationDaoException;

	/** 
	 * Returns all rows from the application table that match the specified arbitrary SQL statement
	 */
	public Application[] findByDynamicWhere(String sql, Object[] sqlParams) throws ApplicationDaoException;

}