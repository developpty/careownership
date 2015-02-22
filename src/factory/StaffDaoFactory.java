/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package factory;

import java.sql.Connection;
import dao.*;
import jdbc.*;

public class StaffDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return StaffDao
	 */
	public static StaffDao create()
	{
		return new StaffDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return StaffDao
	 */
	public static StaffDao create(Connection conn)
	{
		return new StaffDaoImpl( conn );
	}

}
