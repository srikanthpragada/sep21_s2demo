package action;

public class Course {

	private String title;
	private int duration, fee;
	
	

	public Course() {
		super();
	}

	public Course(String title, int duration, int fee) {
		super();
		this.title = title;
		this.duration = duration;
		this.fee = fee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}
