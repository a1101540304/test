package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.User;

public class deleteallbuyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��ȡҳ�����
		String merchID=req.getParameter("merchID");
		//���ú�̨��ҵ���߼��ദ��ҳ�洫�����Ĳ�������������ֵ
		UserDao dd = new UserDao();
		User d = new User();
		boolean flag =dd.deleteallbuy(merchID);
		//���ݷ���ֵȥ����Ӧ��ҳ��
			resp.sendRedirect("allbuy.jsp");
	
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}


