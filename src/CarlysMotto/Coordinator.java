package CarlysMotto;

public class Coordinator extends Employee {
	
	public Coordinator() {
		setJobTitle();
	}
	
	@Override
	public void setJobTitle() {
		this.jobTitle = "Coordinator";
	}
	@Override
	public void setPayRate(double pRate) {
		
		if(pRate > 20.00) {
			this.payRate = 20.00;
		}else {
			this.payRate = pRate;
		}
	}
}
