package action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

@Result ( name="success", location="/visitcount.jsp")
public class VisitCountAction implements SessionAware {
    Map<String, Object> session;
    
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String execute() {
		Object vcount = session.get("visitcount");
		if ( vcount == null)
			 session.put("visitcount", 1);
		else
		{
			Integer count = (Integer) vcount;
			session.put("visitcount", count + 1);
		}
		
		return "success";
	}

}
