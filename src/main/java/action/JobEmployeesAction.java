package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class JobEmployeesAction extends ActionSupport {

	private ArrayList<Job> jobs = new ArrayList<Job>();
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public ArrayList<Job> getJobs() {
		return jobs;
	}

	public void setJobs(ArrayList<Job> jobs) {
		this.jobs = jobs;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		return SUCCESS;
	}

	public List<Employee> getEmployees() {
		if (job == null)
			return null;

		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			OracleCachedRowSet rs = new OracleCachedRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			rs.setUsername("hr");
			rs.setPassword("hr");
			rs.setCommand("select * from employees where job_id = ?");
			rs.setString(1, job);
			rs.execute();
			while (rs.next()) {
				employees.add(
						new Employee(rs.getString("employee_id"), rs.getString("first_name"), rs.getString("salary")));
			}
			rs.close();
			return employees;
		} catch (Exception ex) {
			return employees;
		}

	}

	public JobEmployeesAction() {
		try {
			OracleCachedRowSet rs = new OracleCachedRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			rs.setUsername("hr");
			rs.setPassword("hr");
			rs.setCommand("select * from jobs");
			rs.execute();
			while (rs.next()) {
				jobs.add(new Job(rs.getString("job_id"), rs.getString("job_title")));
			}
			rs.close();
		} catch (Exception ex) {
		}
	}

}
