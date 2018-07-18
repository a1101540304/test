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
		//因为客户端没有参数传过来，所以可以直接调用后台的业务逻辑来处理
		BuyDao bd = new BuyDao();
		Vector<Buy> c =bd.findAllBuy();
		//把后台得到的数据写入session，以便页面可以获取
		HttpSession session = req.getSession();
		session.setAttribute("allbuy", c);
		//跳转页面
		resp.sendRedirect(req.getContextPath()+"admin/allbuy.jsp");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
