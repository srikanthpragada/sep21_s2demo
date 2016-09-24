package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class CoursesAction extends ActionSupport {
   
	List<Course> courses = new ArrayList<Course>();
	
	public CoursesAction() {
		courses.add( new Course("Java SE", 40,3500));
		courses.add( new Course("Java EE", 40,4000));
		courses.add( new Course("Oracle Database 12c", 40,3500));
	}
	
	public List<Course> getCourses() {
		return courses; 
	}
	
	public String load() {
		return SUCCESS;
	}
			
	
}
