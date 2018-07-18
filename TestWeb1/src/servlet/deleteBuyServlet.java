package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BuyDao;
import dto.Buy;

public class deleteBuyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取页面参数
		String userid=req.getParameter("userid");
		//调用后台的业务逻辑类处理页面传过来的参数，给出返回值
		BuyDao dd = new BuyDao();
		Buy d = new Buy();
		d.setUserID(userid);
		boolean flag =dd.deletebuy(userid);
		//依据返回值去到相应的页面
		if(flag)
			resp.sendRedirect("sussessbuy.jsp");
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
