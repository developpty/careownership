package careownership.Logic;

import careownership.DB.MySqlConnOverSSH;
import careownership.Utils.Messages;
import careownership.dao.FormsDao;
import careownership.dto.Forms;
import careownership.factory.FormsDaoFactory;

public class StaffLogic extends MySqlConnOverSSH {
	
	
	public Messages getAllMeetings()
	{
		
		try {
			
			FormsDao dao = FormsDaoFactory.create(openConnection());
			Forms[] lista = dao.findAllOrderBy("meeting_time DESC");
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
