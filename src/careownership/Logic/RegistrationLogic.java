package careownership.Logic;

import javax.servlet.http.HttpServletRequest;

import careownership.DB.MySqlConnOverSSH;
import careownership.Utils.Messages;
import careownership.dao.ApplicationDao;
import careownership.dao.FormsDao;
import careownership.dao.MenteesDao;
import careownership.dto.Application;
import careownership.dto.ApplicationPk;
import careownership.dto.Forms;
import careownership.dto.FormsPk;
import careownership.dto.Mentees;
import careownership.dto.MenteesPk;
import careownership.exceptions.MenteesDaoException;
import careownership.factory.ApplicationDaoFactory;
import careownership.factory.FormsDaoFactory;
import careownership.factory.MenteesDaoFactory;

public class RegistrationLogic extends MySqlConnOverSSH {
	
	public Messages doSaveRegistration(HttpServletRequest request, int staffID)
	{
		try {
		Mentees mentee = new Mentees();
		
		mentee.setFirstName(request.getParameter("first_name"));
		mentee.setLastName(request.getParameter("last_name"));
		mentee.setPretrainingCompleted(request.getParameter("pre_graduate"));
		mentee.setMiddleInitial("");
		mentee.setAge(0);
		mentee.setAddress("");
		mentee.setApt("");
		mentee.setCity("");
		mentee.setState("");
		mentee.setZipcode("");
		mentee.setMaritalStatus("");
		mentee.setSex("");
		mentee.setHighestEducationLevel("");
		mentee.setNotes("");
		mentee.setBirthDate(null);
		mentee.setEmergencyContact("");
		mentee.setEmergencyContactDescription("");
		mentee.setEmergencyContactInfo("");
		
		mentee.setPretrainingCompleted("n");
		mentee.setLtp1Completed("n");
		mentee.setLtp2Completed("n");
		mentee.setLtp3Completed("n");
		mentee.setLtp4Completed("n");
		mentee.setLtp1DateComplete(null);
		mentee.setLtp2DateComplete(null);
		mentee.setLtp3DateComplete(null);
		mentee.setLtp4DateComplete(null);
		mentee.setCurrentSaving(0);
		
		MenteesDao daomentee = MenteesDaoFactory.create(openConnection());
		MenteesPk pkMentee = daomentee.insert(mentee);
		return new Messages("Succesful Save",true, null);
		/*
		
		if(pkMentee.getMenteeId() > 0)
			
		else
			return new Messages("Unsuccesful Attemp",true, null);
		*/
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Messages("Breakdown", false, e);
		}
	}


}
