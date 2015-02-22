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
		
		frm.setMenteeId(1);
		frm.setMentorId(1);
		
		frm.setMeetingPlace(request.getParameter("txtmeetingplace"));
		frm.setNextMeetingGoals(request.getParameter("txtnextgoals"));
		frm.setTopicCovered(request.getParameter("txttopics"));
		frm.setTopicCoveredOther(request.getParameter("txtobservations"));
				
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
	
}
