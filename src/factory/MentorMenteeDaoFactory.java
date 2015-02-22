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

public class MentorMenteeDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return MentorMenteeDao
	 */
	public static MentorMenteeDao create()
	{
		return new MentorMenteeDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return MentorMenteeDao
	 */
	public static MentorMenteeDao create(Connection conn)
	{
		return new MentorMenteeDaoImpl( conn );
	}

}
