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

import careownership.Logic.LoginLogic;
import careownership.Utils.Messages;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginLogic logic; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
        logic =  new LoginLogic();
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
		// Set response content type
	      response.setContentType("text/html");
	      // Actual logic goes here.
	      
	      String action = request.getParameter("action");

	      if (action.equals("mentor")){ 
	          loginMentor(request, response);
	      }

	      else if (action.equals("staff")){ 
	          loginStaff(request, response);
	      }

	}
	
	private void loginMentor(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
	      String uname=request.getParameter("txtusername");  
	      String pwd=request.getParameter("txtpassword");  
	      Messages message = logic.dologinMentors(uname, pwd);
	      
	      if(message.isStatus())
	      {
	    	  // Create a session object if it is already not  created.
	          HttpSession session = request.getSession(true);
	          session.setAttribute("SessionMentor", (int)message.getReturnData());
	          
	          Messages msg = logic.getMentees((int)message.getReturnData());
	          
	          if(msg.isStatus())
	          {
	        	  System.out.println(msg.getReturnData());
	        	  session.setAttribute("SessionMentorMentees", (String)msg.getReturnData());  
	          }
	          String url="mettingsummaryform.jsp"; //relative url for display jsp page		      
	          response.sendRedirect(url);
	          
	      }else
	      {
	          request.setAttribute("erroMessage", message.getMessage() );
	          String url="/index.jsp";
	          ServletContext sc = getServletContext();
		      RequestDispatcher rd = sc.getRequestDispatcher(url);
		      rd.forward(request, response);
	          /*
	    	  String url="/mettingsummaryform.jsp"; //relative url for display jsp page
		      ServletContext sc = getServletContext();
		      RequestDispatcher rd = sc.getRequestDispatcher(url);
		      request.setAttribute("accountList", message );
		      rd.forward(request, response);*/
	      }
	}
	
	private void loginStaff(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String uname=request.getParameter("txtusername");  
	      String pwd=request.getParameter("txtpassword");  
	      Messages message = logic.dologinStaff(uname, pwd);
	      
	      if(message.isStatus())
	      {
	    	  // Create a session object if it is already not  created.
	          HttpSession session = request.getSession(true);
	          session.setAttribute("SessionStaff", (int)message.getReturnData());
	          String url="viewreceivedummary.jsp"; //relative url for display jsp page		      
	          response.sendRedirect(url);
	          
	      }else
	      {
	          request.setAttribute("erroMessage", message.getMessage() );
	          String url="/stafflogin.jsp";
	          ServletContext sc = getServletContext();
		      RequestDispatcher rd = sc.getRequestDispatcher(url);
		      rd.forward(request, response);
	      }
		
	}

}
