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
		//因为客户端没有参数传过来，所以可以直接调用后台的业务逻辑来处理
		MerchInfoDao bd = new MerchInfoDao();
		Vector<MerchInfo> c =bd.getAllMerchInfo();
		//把后台得到的数据写入session，以便页面可以获取
		HttpSession session = req.getSession();
		session.setAttribute("allmerch", c);
		//跳转页面
		resp.sendRedirect(req.getContextPath()+"admin/allmerch.jsp");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
