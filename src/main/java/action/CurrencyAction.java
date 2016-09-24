package action;

import com.opensymphony.xwork2.ActionSupport;

public class CurrencyAction  extends ActionSupport {
	double usd, inr;

	public double getUsd() {
		return usd;
	}

	public void setUsd(double usd) {
		this.usd = usd;
	}

	public double getInr() {
		return inr;
	}

	public void setInr(double inr) {
		this.inr = inr;
	}

	// programmatic validation 
	@Override
	public void validate() {
		super.validate();
		if (usd <= 0) 
			this.addFieldError("usd", "Invalid Amount For USD");
	}

	public String execute() {
		inr = usd * 68.5;
		return "success";
	}
}
