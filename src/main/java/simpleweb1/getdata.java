package simpleweb1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/getsampledata")
public class getdata  extends HttpServlet{
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		ArrayList<String> namelist=new ArrayList<String>();
		System.out.println("In data");
		namelist.add("rushabh");
		namelist.add("Jinit");
		namelist.add("Monil");
		namelist.add("Nilima");
		namelist.add("Hema");
		namelist.add("shashank");
//		request.getSession().setAttribute("serveletnamelist",namelist);
		studentmodel s3=new studentmodel();
		s3.setName("rushabh");
		s3.setId(1);
		studentmodel s1=new studentmodel();
		s1.setName("Jinit");
		s1.setId(2);
		studentmodel s2=new studentmodel();
		s2.setName("Nilima");
		s2.setId(3);
		studentmodel s4=new studentmodel();
		s4.setName("Hema");
		s4.setId(4);
		studentmodel s5=new studentmodel();
		s5.setName("Monil");
		s5.setId(1);
		studentmodel s6=new studentmodel();
		s6.setName("Shashank");
		s6.setId(1);
		ArrayList<studentmodel> std = new ArrayList<studentmodel>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		std.add(s6);
		String a="hi i am rushabh";
		request.setAttribute("data", std);
		
	RequestDispatcher rd = 
             request.getRequestDispatcher("GetData.jsp");
		rd.forward(request, response);
      
		response.sendRedirect("GetData.jsp");
		   }
}
