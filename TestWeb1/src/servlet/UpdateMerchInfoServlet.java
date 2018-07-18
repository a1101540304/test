package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MerchInfoDao;
import dto.MerchInfo;

public class UpdateMerchInfoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��ȡҳ�����
		String merchid=req.getParameter("merchid");
		//System.out.println(merchid+req.getParameter("merchprice"));
		int merchprice=Integer.parseInt(req.getParameter("merchprice"));
		
		//���ú�̨��ҵ���߼��ദ��ҳ�洫�����Ĳ�������������ֵ
		MerchInfoDao dd = new MerchInfoDao();
		MerchInfo d = new MerchInfo();
		d.setMerchID(merchid);
		d.setMerchPrice(merchprice);
		boolean flag =dd.updataMerchInfo(merchid, d);
		//���ݷ���ֵȥ����Ӧ��ҳ��
		if(flag)
			resp.sendRedirect("admin/allmerch.jsp");
		else
			resp.sendRedirect("error.html");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
