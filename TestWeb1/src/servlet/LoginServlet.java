package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import dto.User;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException
		    {
		        String UserID = request.getParameter("username");
		        String UserName = request.getParameter("password");
		        UserDao ud = new UserDao();
		        
		        HttpSession session = request.getSession();
		        String superuser = ud.login(UserID, UserName);
		        //System.out.println("superuser value in LoginServlet is "+superuser);
		        session.setAttribute("superuser", superuser);
		        String id = ud.idid(UserID, UserName);
		        session.setAttribute("userid", id);
		        String uu = ud.name(UserID);
		        session.setAttribute("username", uu);
		        
		      
		        if(superuser.equals("3"))
		        	response.sendRedirect("admin/admin.jsp");
		        else
		        	response.sendRedirect("ok.jsp");
		    }
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
	{
		doGet(request,response);
	}

}