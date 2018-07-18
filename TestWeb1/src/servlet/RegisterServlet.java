package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.User;

public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
		{
		//1.获取页面参数
		String UserID = request.getParameter("UserID");
        String UserName = request.getParameter("UserName");
        int superuser = Integer.parseInt(request.getParameter("superuser"));
        String password = request.getParameter("password");
        //System.out.println(UserID+UserName);
        //2.调用后台的业务逻辑类处理页面传过来的参数，给出返回值
        UserDao ud = new UserDao();
        User u = new User();
        u.setUserID(UserID);
        u.setUserName(UserName);
        u.setSuperuser(superuser);
        u.setPassword(password);
        //ud.register(u);
        boolean flag = ud.register(u);
        //3.依据返回值去到相应的页面
        if(flag)
        	response.sendRedirect("register sussess.html");
        else
        	response.sendRedirect("error2.html");
		}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
	{
		doGet(request,response);
	}

}
