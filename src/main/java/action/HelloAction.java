package action;

public class HelloAction {
	String name = "Srikanth"; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return "Hello, " + name  + " is learning Struts2";
	}

	public String execute() {
		return "success";
	}
}
