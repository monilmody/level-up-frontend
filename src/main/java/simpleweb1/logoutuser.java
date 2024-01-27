package simpleweb1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class logoutuser extends HttpServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 session.removeAttribute("username");
		 session.invalidate();
		 System.out.println("in logout");
		 response.sendRedirect("Login.jsp");
	     
		   }

}
