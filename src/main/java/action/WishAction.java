package action;

import org.apache.struts2.convention.annotation.Result;

@Result(name="success", location="wish.jsp")
public class WishAction {
	
	public String getMessage() {
		return "Wishing you good luck with Annotations!";
	}
	
	public String execute() {
		return "success";
	}

}
