package action;

public class CurrencyAction {
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

	public String execute() {
		inr = usd * 68.5;
		return "success";
	}
}
