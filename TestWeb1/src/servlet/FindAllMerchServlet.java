package servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MerchInfoDao;
import dto.MerchInfo;

public class FindAllMerchServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��Ϊ�ͻ���û�в��������������Կ���ֱ�ӵ��ú�̨��ҵ���߼�������
		MerchInfoDao bd = new MerchInfoDao();
		Vector<MerchInfo> c =bd.getAllMerchInfo();
		//�Ѻ�̨�õ�������д��session���Ա�ҳ����Ի�ȡ
		HttpSession session = req.getSession();
		session.setAttribute("allmerch", c);
		//��תҳ��
		resp.sendRedirect(req.getContextPath()+"admin/allmerch.jsp");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
