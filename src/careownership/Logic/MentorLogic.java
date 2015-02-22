package careownership.Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.jcraft.jsch.JSchException;

import careownership.DB.MySqlConnOverSSH;
import careownership.Utils.Messages;
import careownership.dao.FormsDao;
import careownership.dto.Forms;
import careownership.dto.FormsPk;
import careownership.factory.FormsDaoFactory;

public class MentorLogic extends MySqlConnOverSSH {
	public MentorLogic()
	{

	}
	
	
	private Forms parse(HttpServletRequest request, int mentorID) throws ParseException
	{		
		Forms frm = new Forms();
		
		frm.setMenteeId(Integer.parseInt(request.getParameter("select_apprentice")));
		frm.setMentorId( mentorID);

	    String myTime = request.getParameter("text_time");
	    SimpleDateFormat sdf = new SimpleDateFormat("hh:mma");
	    Date date = null;
	    date = sdf.parse(myTime);
	    frm.setMeetingTime(date);
	    
	    String formattedTime = sdf.format(date);
	    System.out.println(formattedTime);
	    
	    
		//text_time
		
		frm.setMeetingNotes(request.getParameter("text_notes"));
		frm.setMeetingPlace(request.getParameter("text_place"));
		frm.setNextMeetingGoals(request.getParameter("text_nextgoals"));
		frm.setTopicCovered(request.getParameter("text_topics_covered"));
		frm.setTopicCoveredOther(request.getParameter("text_observations"));
				
		return frm;
		
	}
	
	
	public Messages doSaveMeetingSummary(HttpServletRequest request, int mentorID)
	{
		
		try {
			FormsDao dao = FormsDaoFactory.create(openConnection());
			Forms form = parse(request,mentorID);
			FormsPk pk = dao.insert(form);
			
			if(pk.getFormId() > 0)
				return new Messages("Succesful Save",true, null);
			else
				return new Messages("Unsuccesful Attemp",true, null);
		
		} catch (Exception e) {
			e.printStackTrace();
			return new Messages("Breakdown", false, e);
		}
	}


	public Messages getAllMeetings(int mentorID)
	{
		
		try {
			
			FormsDao dao = FormsDaoFactory.create(openConnection());
			Forms[] lista = dao.findByMentors(mentorID);
			String outputTable = "";
			for(Forms valor:lista)
			{
				outputTable+="<tr><td>"+valor.getFormId()+"</td>";
				outputTable+="<td>"+valor.getMeetingPlace()+"</td>";
				outputTable+="<td>"+valor.getMeetingNotes()+"</td>";
				outputTable+="<td>"+valor.getNextMeetingGoals()+"</td></tr>";
			}
			
			return new Messages("Succesful Retrieva;",true,outputTable,null);
		
		
		} catch (Exception e) {
			e.printStackTrace();
			return new Messages("Breakdown", false, e);
		}
	}

}
