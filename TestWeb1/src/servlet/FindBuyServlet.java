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

public class FindBuyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//String userid=req.getParameter("userid");
		String username = req.getParameter("username");
		BuyDao b = new BuyDao();
		Vector<Buy> v =null;
		v=b.getAllBuy(username);
	    HttpSession session=req.getSession();
	    session.setAttribute("justbuy", v);	
	    resp.sendRedirect("justbuy.jsp");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
