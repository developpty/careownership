package careownership.Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.jcraft.jsch.JSchException;

import careownership.DB.MySqlConnOverSSH;
import careownership.Utils.Messages;
import careownership.dao.ApplicationDao;
import careownership.dao.FormsDao;
import careownership.dao.InitialDebtDao;
import careownership.dao.InitialEmploymentDao;
import careownership.dto.Application;
import careownership.dto.ApplicationPk;
import careownership.dto.Forms;
import careownership.dto.FormsPk;
import careownership.dto.InitialDebt;
import careownership.dto.InitialDebtPk;
import careownership.dto.InitialEmployment;
import careownership.dto.InitialEmploymentPk;
import careownership.factory.ApplicationDaoFactory;
import careownership.factory.FormsDaoFactory;
import careownership.factory.InitialDebtDaoFactory;
import careownership.factory.InitialEmploymentDaoFactory;

public class ApplicationLogic extends MySqlConnOverSSH {
	public ApplicationLogic()
	{

	}
	
	private Application parseApplication(HttpServletRequest request, int menteeId) throws ParseException{
		Application appl = new Application();
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
		
		appl.setMenteeId(menteeId);
		appl.setContactType(request.getParameter("txtcontacttype"));
		appl.setInitialContactMade(request.getParameter("txtinitialcontactmade"));
		appl.setApplicationHighestEducationLevel(request.getParameter("txtapplicationhighesteducationlevel"));
		appl.setDrugAbuseHistory(request.getParameter("txtdrugabusehistory"));
		appl.setDrugAbuseHistoryDescription(request.getParameter("txtdrugabusehistorydescription"));
		appl.setHomelessHistory(request.getParameter("txthomelesshistory"));
		appl.setHomelessHistoryDescription(request.getParameter("txthomelesshistorydescription"));
		appl.setAlcoholAbuseHistory(request.getParameter("txtalcoholabusehistory"));
		appl.setAlcoholAbuseHistoryDescription("txtalcoholabusehistorydescription");
		appl.setReligiousBackground(request.getParameter("txtreligiousbackground"));
		appl.setMentalIllnessHistory(request.getParameter("txtmentalillnesshistory"));
		appl.setMentalIllnessHistoryDescription(request.getParameter("txtmentalillnesshistorydescription"));
		appl.setCriminalHistory(request.getParameter("txtcriminalhistory"));
		appl.setCriminalHistoryDescription(request.getParameter("txtcriminalhistorydescription"));
		appl.setDateOfMostRecentCriminalOffence(format.parse(request.getParameter("txtdateofmostrecentcriminaloffece")));
		appl.setProbationEndDate(format.parse(request.getParameter("txtprobationenddate")));
		appl.setOtherInitialConditions(request.getParameter("txtotherinitialconditions"));
		appl.setApplicationNotes(request.getParameter("txtapplicationnotes"));
		appl.setApplicationReceivedDate(format.parse(request.getParameter("txtapplicationreceiveddate")));
		appl.setApplicationRecievedMethod(request.getParameter("txtapplicationreceivedmethod"));
		appl.setPreviousHomeOwnership(request.getParameter("txtprevioushomeownership"));
		appl.setApplicationStatus(request.getParameter("txtapplicationstatus"));
		appl.setInterviewDescription(request.getParameter("txtinterviewdescription"));
		appl.setApplicationApprovedDate(format.parse(request.getParameter("txtapplicationapproveddate")));
		appl.setDateBeginsProgram(format.parse(request.getParameter("txtdatebeginsprogram")));
		appl.setApplicationReference(request.getParameter("txtapplicationreference"));
		appl.setApplicationReferenceAffliation(request.getParameter("txtapplicationreferenceaffliation"));
		appl.setApplicationReferenceContactInfo(request.getParameter("txtapplicationreferencecontactinfo"));
		
		return appl;
	}
	
	private InitialDebt parseInitialDebt(HttpServletRequest request, int menteeId) throws ParseException{
		InitialDebt debt = new InitialDebt();
		
		debt.setInitialDebtTotal(Integer.parseInt(request.getParameter("txtinitialdebttotal")));
		debt.setInitialDebtType(request.getParameter("txtinitialdebttype"));
		debt.setInitialDebtAmount(Integer.parseInt(request.getParameter("txtinitialdebtamount")));
		debt.setInitialDebtDescription(request.getParameter("txtinitialdebtdescription"));
		debt.setMenteeId(menteeId);
		
		
		return debt;
	}
	
	private InitialEmployment parseInitialEmployment(HttpServletRequest request, int menteeId) throws ParseException{
		InitialEmployment emp = new InitialEmployment();
		
		emp.setInitialEmploymentPosition(request.getParameter("txtinitialemploymentposition"));
		emp.setInitialEmployer(request.getParameter("txtinitialemployer"));
		emp.setInitialEmploymentEarnings(Integer.parseInt(request.getParameter("txtinitialemploymentearnings")));
		emp.setInitialEmploymentContactPerson(request.getParameter("txtinitialemploymentcontactperson"));
		emp.setInitialEmploymenContactPersonContactInfo(request.getParameter("txtinitialemploymentcontactpersoncontactinfo"));
		emp.setInitialEmploymentContactPersonContactPermission(request.getParameter("txtinitialemploymentcontactpersoncontactpermission"));
		emp.setInitialEmploymentDescription(request.getParameter("txtinitialemploymentdescription"));
		emp.setInitialEmploymentDurationMonths(Integer.parseInt(request.getParameter("txtinitialemploymentdurationmonths")));
		emp.setMenteeId(menteeId);
		
		return emp;
	}
	
	public Messages doSaveApplicationForm(HttpServletRequest request, int menteeID)
	{
		
		try {
			ApplicationDao daoappl = ApplicationDaoFactory.create(openConnection());
			Application appl = parseApplication(request,menteeID);
			ApplicationPk pkAppl = daoappl.insert(appl);
			
			InitialDebtDao daodebt = InitialDebtDaoFactory.create(openConnection());
			InitialDebt debt = parseInitialDebt(request,menteeID);
			InitialDebtPk pkDebt = daodebt.insert(debt);
			
			InitialEmploymentDao daoemp = InitialEmploymentDaoFactory.create(openConnection());
			InitialEmployment emp = parseInitialEmployment(request,menteeID);
			InitialEmploymentPk pkEmp = daoemp.insert(emp);
			
			if(pkAppl.getMenteeId() > 0 && pkDebt.getInitialDebtId() > 0 && pkEmp.getInitialEmploymentId()>0)
				return new Messages("Succesful Save",true, null);
			else
				return new Messages("Unsuccesful Attemp",true, null);
		
		} catch (Exception e) {
			e.printStackTrace();
			return new Messages("Breakdown", false, e);
		}
	}
	
	

}
