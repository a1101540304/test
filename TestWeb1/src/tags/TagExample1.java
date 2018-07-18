package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class TagExample1 extends TagSupport {
	
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().println("hahaha Hello TAG!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
