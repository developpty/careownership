/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package jdbc;

import dao.*;
import factory.*;
import dto.*;
import exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class MenteesDaoImpl extends AbstractDAO implements MenteesDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT mentee_id, first_name, last_name, SSN, sex, age, maritial_status, address, zipcode, highest_education_level FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( mentee_id, first_name, last_name, SSN, sex, age, maritial_status, address, zipcode, highest_education_level ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET mentee_id = ?, first_name = ?, last_name = ?, SSN = ?, sex = ?, age = ?, maritial_status = ?, address = ?, zipcode = ?, highest_education_level = ? WHERE mentee_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE mentee_id = ?";

	/** 
	 * Index of column mentee_id
	 */
	protected static final int COLUMN_MENTEE_ID = 1;

	/** 
	 * Index of column first_name
	 */
	protected static final int COLUMN_FIRST_NAME = 2;

	/** 
	 * Index of column last_name
	 */
	protected static final int COLUMN_LAST_NAME = 3;

	/** 
	 * Index of column SSN
	 */
	protected static final int COLUMN_SSN = 4;

	/** 
	 * Index of column sex
	 */
	protected static final int COLUMN_SEX = 5;

	/** 
	 * Index of column age
	 */
	protected static final int COLUMN_AGE = 6;

	/** 
	 * Index of column maritial_status
	 */
	protected static final int COLUMN_MARITIAL_STATUS = 7;

	/** 
	 * Index of column address
	 */
	protected static final int COLUMN_ADDRESS = 8;

	/** 
	 * Index of column zipcode
	 */
	protected static final int COLUMN_ZIPCODE = 9;

	/** 
	 * Index of column highest_education_level
	 */
	protected static final int COLUMN_HIGHEST_EDUCATION_LEVEL = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Index of primary-key column mentee_id
	 */
	protected static final int PK_COLUMN_MENTEE_ID = 1;

	/** 
	 * Inserts a new row in the mentees table.
	 */
	public MenteesPk insert(Mentees dto) throws MenteesDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getMenteeId() );
			stmt.setString( index++, dto.getFirstName() );
			stmt.setString( index++, dto.getLastName() );
			stmt.setString( index++, dto.getSsn() );
			stmt.setString( index++, dto.getSex() );
			if (dto.isAgeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getAge() );
			}
		
			stmt.setString( index++, dto.getMaritialStatus() );
			stmt.setString( index++, dto.getAddress() );
			stmt.setString( index++, dto.getZipcode() );
			stmt.setString( index++, dto.getHighestEducationLevel() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MenteesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the mentees table.
	 */
	public void update(MenteesPk pk, Mentees dto) throws MenteesDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getMenteeId() );
			stmt.setString( index++, dto.getFirstName() );
			stmt.setString( index++, dto.getLastName() );
			stmt.setString( index++, dto.getSsn() );
			stmt.setString( index++, dto.getSex() );
			if (dto.isAgeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getAge() );
			}
		
			stmt.setString( index++, dto.getMaritialStatus() );
			stmt.setString( index++, dto.getAddress() );
			stmt.setString( index++, dto.getZipcode() );
			stmt.setString( index++, dto.getHighestEducationLevel() );
			stmt.setInt( 11, pk.getMenteeId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MenteesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the mentees table.
	 */
	public void delete(MenteesPk pk) throws MenteesDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getMenteeId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MenteesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the mentees table that matches the specified primary-key value.
	 */
	public Mentees findByPrimaryKey(MenteesPk pk) throws MenteesDaoException
	{
		return findByPrimaryKey( pk.getMenteeId() );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'mentee_id = :menteeId'.
	 */
	public Mentees findByPrimaryKey(int menteeId) throws MenteesDaoException
	{
		Mentees ret[] = findByDynamicSelect( SQL_SELECT + " WHERE mentee_id = ?", new Object[] {  new Integer(menteeId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria ''.
	 */
	public Mentees[] findAll() throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY mentee_id", null );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'mentee_id = :menteeId'.
	 */
	public Mentees[] findWhereMenteeIdEquals(int menteeId) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE mentee_id = ? ORDER BY mentee_id", new Object[] {  new Integer(menteeId) } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'first_name = :firstName'.
	 */
	public Mentees[] findWhereFirstNameEquals(String firstName) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE first_name = ? ORDER BY first_name", new Object[] { firstName } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'last_name = :lastName'.
	 */
	public Mentees[] findWhereLastNameEquals(String lastName) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE last_name = ? ORDER BY last_name", new Object[] { lastName } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'SSN = :ssn'.
	 */
	public Mentees[] findWhereSsnEquals(String ssn) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SSN = ? ORDER BY SSN", new Object[] { ssn } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'sex = :sex'.
	 */
	public Mentees[] findWhereSexEquals(String sex) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sex = ? ORDER BY sex", new Object[] { sex } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'age = :age'.
	 */
	public Mentees[] findWhereAgeEquals(int age) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE age = ? ORDER BY age", new Object[] {  new Integer(age) } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'maritial_status = :maritialStatus'.
	 */
	public Mentees[] findWhereMaritialStatusEquals(String maritialStatus) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE maritial_status = ? ORDER BY maritial_status", new Object[] { maritialStatus } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'address = :address'.
	 */
	public Mentees[] findWhereAddressEquals(String address) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE address = ? ORDER BY address", new Object[] { address } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'zipcode = :zipcode'.
	 */
	public Mentees[] findWhereZipcodeEquals(String zipcode) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE zipcode = ? ORDER BY zipcode", new Object[] { zipcode } );
	}

	/** 
	 * Returns all rows from the mentees table that match the criteria 'highest_education_level = :highestEducationLevel'.
	 */
	public Mentees[] findWhereHighestEducationLevelEquals(String highestEducationLevel) throws MenteesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE highest_education_level = ? ORDER BY highest_education_level", new Object[] { highestEducationLevel } );
	}

	/**
	 * Method 'MenteesDaoImpl'
	 * 
	 */
	public MenteesDaoImpl()
	{
	}

	/**
	 * Method 'MenteesDaoImpl'
	 * 
	 * @param userConn
	 */
	public MenteesDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "mentees";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Mentees fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Mentees dto = new Mentees();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Mentees[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Mentees dto = new Mentees();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Mentees ret[] = new Mentees[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Mentees dto, ResultSet rs) throws SQLException
	{
		dto.setMenteeId( rs.getInt( COLUMN_MENTEE_ID ) );
		dto.setFirstName( rs.getString( COLUMN_FIRST_NAME ) );
		dto.setLastName( rs.getString( COLUMN_LAST_NAME ) );
		dto.setSsn( rs.getString( COLUMN_SSN ) );
		dto.setSex( rs.getString( COLUMN_SEX ) );
		dto.setAge( rs.getInt( COLUMN_AGE ) );
		if (rs.wasNull()) {
			dto.setAgeNull( true );
		}
		
		dto.setMaritialStatus( rs.getString( COLUMN_MARITIAL_STATUS ) );
		dto.setAddress( rs.getString( COLUMN_ADDRESS ) );
		dto.setZipcode( rs.getString( COLUMN_ZIPCODE ) );
		dto.setHighestEducationLevel( rs.getString( COLUMN_HIGHEST_EDUCATION_LEVEL ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Mentees dto)
	{
	}

	/** 
	 * Returns all rows from the mentees table that match the specified arbitrary SQL statement
	 */
	public Mentees[] findByDynamicSelect(String sql, Object[] sqlParams) throws MenteesDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MenteesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the mentees table that match the specified arbitrary SQL statement
	 */
	public Mentees[] findByDynamicWhere(String sql, Object[] sqlParams) throws MenteesDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MenteesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}