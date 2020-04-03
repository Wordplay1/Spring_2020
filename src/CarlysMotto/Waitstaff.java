package CarlysMotto;

public class Waitstaff extends Employee {
	
	public Waitstaff() {
		setJobTitle();
	}
	
	@Override
	public void setJobTitle() {
		this.jobTitle = "Waitstaff";
	}
	@Override
	public void setPayRate(double pRate) {
		
		if(pRate > 10.00) {
			this.payRate = 10.00;
		}else {
			this.payRate = pRate;
		}
	}
}
