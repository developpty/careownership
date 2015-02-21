package careownership.Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jcraft.jsch.JSchException;

import careownership.DB.MySqlConnOverSSH;
import careownership.Utils.Messages;

public class LoginLogic extends MySqlConnOverSSH {
	public LoginLogic()
	{

	}
	
	public Messages dologinStaff(String username, String password)
	{
		
		try {
		    Statement stmt = openConnection().createStatement();
		    ResultSet rs = stmt.executeQuery( "SELECT password FROM staff WHERE login_name = '"+username+"'" );
		    String dbpwd = "";
		    while ( rs.next() ) {
		    	//int numColumns = rs.getMetaData().getColumnCount();
		    	dbpwd = rs.getString("password");
		    }
		    rs.close();
		    stmt.close(); 
		    
		    if(dbpwd.equalsIgnoreCase(password))
		    {
		    	return new Messages("Everything OK", true, null);
		    }else
		    {
		    	return new Messages("Username or Password is incorrect", false, null);
		    }
		
		} catch (Exception e) {
			e.printStackTrace();
			return new Messages("Breakdown", false, e);
		}finally {
		    try {
		    	
				closeConnection();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return new Messages("Breakdown", false, e);
			}
		}
	}

	public Messages dologinMentors(String username, String password)
	{
		
		try {
		    Statement stmt = openConnection().createStatement();
		    ResultSet rs = stmt.executeQuery( "SELECT password FROM mentors WHERE login_name = '"+username+"'" );
		    String dbpwd = "";
		    while ( rs.next() ) {
		    	//int numColumns = rs.getMetaData().getColumnCount();
		    	dbpwd = rs.getString("password");
		    }
		    rs.close();
		    stmt.close(); 
		    
		    if(dbpwd.equalsIgnoreCase(password))
		    {
		    	return new Messages("Everything OK", true, null);
		    }else
		    {
		    	return new Messages("Username or Password is incorrect", false, null);
		    }
		
		} catch (Exception e) {
			e.printStackTrace();
			return new Messages("Breakdown", false, e);
		}finally {
		    try {
		    	
				closeConnection();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return new Messages("Breakdown", false, e);
			}
		}
	}

	
}
