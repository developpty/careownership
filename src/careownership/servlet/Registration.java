package careownership.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import careownership.Logic.ApplicationLogic;
import careownership.Logic.MentorLogic;
import careownership.Logic.RegistrationLogic;
import careownership.Logic.StaffLogic;
import careownership.Utils.Messages;
import careownership.dto.Staff;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter w = response.getWriter();
				w.write("xxxxxx");
				w.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// parse parameters
			// create the DAO class
			RegistrationLogic logic = new RegistrationLogic();
			HttpSession session=request.getSession(false);  
			
			int staffID = 0;
			if(session!=null)
				staffID=(int)session.getAttribute("SessionStaff");  
		    	
			Messages message = logic.doSaveRegistration(request, staffID);		
		      if(message.isStatus())
		      {
		    	  String url="/trainee_registration.jsp"; //relative url for display jsp page
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
		          String url="/trainee_registration.jsp";
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
