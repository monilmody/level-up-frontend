package simpleweb1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class Demoweb extends HttpServlet {

	  
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
			      throws ServletException, IOException {
		   System.out.println("post done");
		   String name= (String)request.getParameter("name");
		   String name1="rushabh";
		      String password= request.getParameter("password");
		      System.out.println(name +password);
		      HttpSession session = request.getSession();
		      session.setAttribute("username",name);
		      if(!name.equals("Techaer")) {
		      response.sendRedirect("StudentView.jsp");
		      }
		      else
		      {
		    	response.sendRedirect("Teacher.jsp");
		      }
		      }
}
