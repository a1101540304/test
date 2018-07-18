package filter;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnLineCountListener implements HttpSessionListener{

	private int count;
	public OnLineCountListener(){
		count = 0;
	}
	public void sessionCreated(HttpSessionEvent arg0) {
		count ++;
		arg0.getSession().getServletContext().setAttribute("online", new Integer(count));
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		count --;
		arg0.getSession().getServletContext().setAttribute("online", new Integer(count));
	}

}
