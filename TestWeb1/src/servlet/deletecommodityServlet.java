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

public class deletecommodityServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	String merchID = req.getParameter("merchID");
    	String username = req.getParameter("username");
    	BuyDao dd = new BuyDao();
    	Buy d = new Buy();
    	boolean flag = dd.deletecommodity(merchID);

	    resp.sendRedirect("deletefinish.html");
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("GBK");
		resp.setCharacterEncoding("GBK");
		resp.setContentType("text/html;GBK");
		doGet(req, resp);
	}
}
