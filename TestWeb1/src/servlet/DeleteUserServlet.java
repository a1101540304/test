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
		//��ȡҳ�����
		String userid=req.getParameter("userid");
		//���ú�̨��ҵ���߼��ദ��ҳ�洫�����Ĳ�������������ֵ
		UserDao dd = new UserDao();
		User d = new User();
		boolean flag =dd.deleteuser(userid);
		//���ݷ���ֵȥ����Ӧ��ҳ��
			resp.sendRedirect("searchuser.jsp");
	
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
