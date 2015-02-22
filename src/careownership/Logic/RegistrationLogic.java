package careownership.Logic;

import javax.servlet.http.HttpServletRequest;

import careownership.DB.MySqlConnOverSSH;
import careownership.Utils.Messages;
import careownership.dao.FormsDao;
import careownership.dto.Forms;
import careownership.dto.FormsPk;
import careownership.factory.FormsDaoFactory;

public class RegistrationLogic extends MySqlConnOverSSH {
	
	public Messages doSaveRegistration(HttpServletRequest request, int mentorID)
	{
		
		return null;
	}


}
