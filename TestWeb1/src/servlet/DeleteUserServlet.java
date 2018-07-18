package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.User;

public class DeleteUserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取页面参数
		String userid=req.getParameter("userid");
		//调用后台的业务逻辑类处理页面传过来的参数，给出返回值
		UserDao dd = new UserDao();
		User d = new User();
		boolean flag =dd.deleteuser(userid);
		//依据返回值去到相应的页面
			resp.sendRedirect("searchuser.jsp");
	
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
