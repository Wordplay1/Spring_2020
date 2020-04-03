package CarlysMotto;

public class Bartender extends Employee{
	
	public Bartender() {
		setJobTitle();
	}
	
	@Override
	public void setJobTitle() {
		this.jobTitle = "Bartender";
	}
	@Override
	public void setPayRate(double pRate) {
		
		if(pRate > 14.00) {
			this.payRate = 14.00;
		}else {
			this.payRate = pRate;
		}
	}
}
