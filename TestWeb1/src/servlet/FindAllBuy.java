package servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BuyDao;
import dto.Buy;

public class FindAllBuy extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��Ϊ�ͻ���û�в��������������Կ���ֱ�ӵ��ú�̨��ҵ���߼�������
		BuyDao bd = new BuyDao();
		Vector<Buy> c =bd.findAllBuy();
		//�Ѻ�̨�õ�������д��session���Ա�ҳ����Ի�ȡ
		HttpSession session = req.getSession();
		session.setAttribute("allbuy", c);
		//��תҳ��
		resp.sendRedirect(req.getContextPath()+"admin/allbuy.jsp");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
