package careownership.Logic;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import careownership.DB.MySqlConnOverSSH;
import careownership.dao.FormsDao;
import careownership.dao.MenteesDao;
import careownership.dao.MentorsDao;
import careownership.dto.Forms;
import careownership.dto.Mentees;
import careownership.dto.Mentors;
import careownership.dto.MentorsPk;
import careownership.factory.FormsDaoFactory;
import careownership.factory.MenteesDaoFactory;
import careownership.factory.MentorsDaoFactory;

public class ReportLogic extends MySqlConnOverSSH{
	
	public void genCSVfile(int menteeID) throws IOException{
		FileWriter writer = new FileWriter("./output.csv");
		writer.append("Mentee");
		writer.append(',');
		writer.append("Mentor");
		writer.append(',');
		writer.append("Meeting Date");
		writer.append(',');
		writer.append("Meeting Location");
		writer.append(',');
		writer.append("Meeting Notes");
		writer.append(',');
		writer.append("Next Meeting Goals");
		writer.append(',');
		writer.append("Topics Covered");
		writer.append(',');
		writer.append("Topics Covered Other");
		writer.append('\n');
				
		try{
			Connection conn = openConnection();
            Statement stmt = conn.createStatement();

			FormsDao dao = FormsDaoFactory.create(conn);
			MentorsDao daomentor = MentorsDaoFactory.create(conn);
			MenteesDao daomentee = MenteesDaoFactory.create(conn);
			Forms[] listf = dao.findByMentees(menteeID);
			
			for(Forms value: listf){
				int mentorID = value.getMentorId();
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	            String sql = "select first_name, last_name from mentors where mentor_id = "+mentorID;
	            ResultSet rs = stmt.executeQuery(sql);
	            String first_name=null;
	            String last_name=null;
	            while (rs.next()){
	                first_name = rs.getString("first_name");
	                last_name = rs.getString("last_name");
	            }
	            String sql1 = "select first_name, last_name from mentees where mentee_id ="+menteeID;
	            ResultSet rs1 = stmt.executeQuery(sql1);
	            String first_name1=null;
	            String last_name1=null;
	            while (rs1.next()){
	                first_name1 = rs1.getString("first_name");
	                last_name1 = rs1.getString("last_name");
	            }
				writer.append(first_name1+ " " + last_name1);
				writer.append(',');
				writer.append(first_name+ " " + last_name);
				writer.append(',');
				writer.append(df.format(value.getMeetingTime()));
				writer.append(',');
				writer.append(value.getMeetingPlace());
				writer.append(',');
				writer.append(value.getMeetingNotes());
				writer.append(',');
				writer.append(value.getNextMeetingGoals());
				writer.append(',');
				writer.append(value.getTopicCovered());
				writer.append(',');
				writer.append(value.getTopicCoveredOther());
				writer.append('\n');
			}
		    writer.flush();
		    writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}
