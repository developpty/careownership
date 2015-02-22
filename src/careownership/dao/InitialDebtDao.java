/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package careownership.dao;

import careownership.dto.*;
import careownership.exceptions.*;

public interface InitialDebtDao
{
	/** 
	 * Inserts a new row in the initial_debt table.
	 */
	public InitialDebtPk insert(InitialDebt dto) throws InitialDebtDaoException;

	/** 
	 * Updates a single row in the initial_debt table.
	 */
	public void update(InitialDebtPk pk, InitialDebt dto) throws InitialDebtDaoException;

	/** 
	 * Deletes a single row in the initial_debt table.
	 */
	public void delete(InitialDebtPk pk) throws InitialDebtDaoException;

	/** 
	 * Returns the rows from the initial_debt table that matches the specified primary-key value.
	 */
	public InitialDebt findByPrimaryKey(InitialDebtPk pk) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'initial_debt_id = :initialDebtId'.
	 */
	public InitialDebt findByPrimaryKey(int initialDebtId) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria ''.
	 */
	public InitialDebt[] findAll() throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'mentee_id = :menteeId'.
	 */
	public InitialDebt[] findByMentees(int menteeId) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'initial_debt_id = :initialDebtId'.
	 */
	public InitialDebt[] findWhereInitialDebtIdEquals(int initialDebtId) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'initial_debt_total = :initialDebtTotal'.
	 */
	public InitialDebt[] findWhereInitialDebtTotalEquals(int initialDebtTotal) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'initial_debt_type = :initialDebtType'.
	 */
	public InitialDebt[] findWhereInitialDebtTypeEquals(String initialDebtType) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'initial_debt_amount = :initialDebtAmount'.
	 */
	public InitialDebt[] findWhereInitialDebtAmountEquals(int initialDebtAmount) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'initial_debt_description = :initialDebtDescription'.
	 */
	public InitialDebt[] findWhereInitialDebtDescriptionEquals(String initialDebtDescription) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the criteria 'mentee_id = :menteeId'.
	 */
	public InitialDebt[] findWhereMenteeIdEquals(int menteeId) throws InitialDebtDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the initial_debt table that match the specified arbitrary SQL statement
	 */
	public InitialDebt[] findByDynamicSelect(String sql, Object[] sqlParams) throws InitialDebtDaoException;

	/** 
	 * Returns all rows from the initial_debt table that match the specified arbitrary SQL statement
	 */
	public InitialDebt[] findByDynamicWhere(String sql, Object[] sqlParams) throws InitialDebtDaoException;

}
