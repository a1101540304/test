package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import dto.User;

public class UpdateuserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��ȡҳ�����
		String userid=req.getParameter("userid");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		//���ú�̨��ҵ���߼��ദ��ҳ�洫�����Ĳ�������������ֵ
		UserDao dd = new UserDao();
		User d = new User();
		d.setUserID(userid);
		d.setUserName(username);
		d.setPassword(password);
		boolean flag =dd.updataUser(userid, d);
		//���ݷ���ֵȥ����Ӧ��ҳ��
		if(flag)
			resp.sendRedirect("login.jsp");
		else
			resp.sendRedirect("error.html");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("GBK");
		resp.setCharacterEncoding("GBK");
		resp.setContentType("text/html;GBK");
		doGet(req, resp);
	}
}
