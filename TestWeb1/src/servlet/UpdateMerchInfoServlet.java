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
		//获取页面参数
		String merchid=req.getParameter("merchid");
		//System.out.println(merchid+req.getParameter("merchprice"));
		int merchprice=Integer.parseInt(req.getParameter("merchprice"));
		
		//调用后台的业务逻辑类处理页面传过来的参数，给出返回值
		MerchInfoDao dd = new MerchInfoDao();
		MerchInfo d = new MerchInfo();
		d.setMerchID(merchid);
		d.setMerchPrice(merchprice);
		boolean flag =dd.updataMerchInfo(merchid, d);
		//依据返回值去到相应的页面
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
