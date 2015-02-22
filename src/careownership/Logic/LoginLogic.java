package careownership.Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.jcraft.jsch.JSchException;

import careownership.DB.MySqlConnOverSSH;
import careownership.Utils.Messages;
import careownership.dao.FormsDao;
import careownership.dao.MenteesDao;
import careownership.dto.Forms;
import careownership.dto.Mentees;
import careownership.exceptions.MenteesDaoException;
import careownership.factory.FormsDaoFactory;
import careownership.factory.MenteesDaoFactory;

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

	
	public Messages getMentees(int mentorID)
	{
		
		try {
			MenteesDao dao = MenteesDaoFactory.create(openConnection());
			ArrayList<HashMap<String, String>> lista= dao.findMentorMentees(mentorID);
			String combo = "";
			for(HashMap<String, String> valor: lista)
			{
				Map.Entry pair = valor.entrySet().iterator().next();
				combo+="<option value='"+pair.getValue()+"'>"+pair.getKey()+"</option>";
			}
			
			
			return new Messages("Succesful Save",true,combo, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Messages("Breakdown", false, e);
		}
	}
	
	public Messages dologinMentors(String username, String password)
	{
		
		try {
		    Statement stmt = openConnection().createStatement();
		    ResultSet rs = stmt.executeQuery( "SELECT mentor_id , password FROM mentors WHERE login_name = '"+username+"'" );
		    String dbpwd = "";
		    int mentorID= 0;
		    while ( rs.next() ) {
		    	//int numColumns = rs.getMetaData().getColumnCount();
		    	dbpwd = rs.getString("password");
		    	mentorID = rs.getInt("mentor_id");
		    }
		    rs.close();
		    stmt.close(); 
		    
		    if(dbpwd.equalsIgnoreCase(password))
		    {
		    	return new Messages("Everything OK", true,mentorID, null);
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
