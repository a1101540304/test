package servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import dto.User;

public class FindAllUserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��Ϊ�ͻ���û�в��������������Կ���ֱ�ӵ��ú�̨��ҵ���߼�������
		UserDao bd = new UserDao();
		Vector<User> c =bd.getAllUser();
		//�Ѻ�̨�õ�������д��session���Ա�ҳ����Ի�ȡ
		HttpSession session = req.getSession();
		session.setAttribute("alluser", c);
		//��תҳ��
		resp.sendRedirect(req.getContextPath()+"admin/alluser.jsp");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
