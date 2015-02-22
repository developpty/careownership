package careownership.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import careownership.Logic.MentorLogic;
import careownership.Utils.Messages;
import careownership.dao.FormsDao;
import careownership.dto.Forms;
import careownership.factory.FormsDaoFactory;

/**
 * Servlet implementation class MentorServlet
 */
@WebServlet("/MentorServlet")
public class MentorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// parse parameters
			// create the DAO class
			MentorLogic logic = new MentorLogic();
			HttpSession session=request.getSession(false);  
			int mentorID = 0;
			if(session!=null)
		    	mentorID=(int)session.getAttribute("SessionMentor");  
		    	
			Messages message = logic.doSaveMeetingSummary(request,mentorID);			
		      if(message.isStatus())
		      {
		    	  String url="/mettingsummaryform.jsp"; //relative url for display jsp page
			      //ServletContext sc = getServletContext();
			      //RequestDispatcher rd = sc.getRequestDispatcher(url);
			      request.setAttribute("successMessage", message.getMessage());
			      //response.sendRedirect(url);
			      
			      //String url="/index.jsp";
		          ServletContext sc = getServletContext();
			      RequestDispatcher rd = sc.getRequestDispatcher(url);
			      rd.forward(request, response);
		      }else
		      {
		          request.setAttribute("erroMessage", message.getMessage() );
		          request.getRequestDispatcher("index.jsp").include(request, response); 
		          String url="/index.jsp";
		          ServletContext sc = getServletContext();
			      RequestDispatcher rd = sc.getRequestDispatcher(url);
			      rd.forward(request, response);
		      }
		}
		catch (Exception e) {
			throw new ServletException( "Failed to process request", e );
		}
	}

}
