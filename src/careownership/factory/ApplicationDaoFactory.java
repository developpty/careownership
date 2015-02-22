/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package careownership.factory;

import java.sql.Connection;
import careownership.dao.*;
import careownership.jdbc.*;

public class ApplicationDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ApplicationDao
	 */
	public static ApplicationDao create()
	{
		return new ApplicationDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ApplicationDao
	 */
	public static ApplicationDao create(Connection conn)
	{
		return new ApplicationDaoImpl( conn );
	}

}
