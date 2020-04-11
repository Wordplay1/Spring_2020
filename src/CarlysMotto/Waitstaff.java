package CarlysMotto;

/* @Author: Donald Mears
 * Title: Waitstaff.java
 * Description: Class to build Waitstaff object extended from Employee class.
 *
 */
public class Waitstaff extends Employee {

	// Waitstaff constructor
	public Waitstaff() {
		setJobTitle();
	}

	// method to set job title overridden from employee class
	@Override
	public void setJobTitle() {
		this.jobTitle = "Waitstaff";
	}

	// method to set pay rate overridden from employee class
	@Override
	public void setPayRate(double pRate) {
		
		if (pRate > 10.00) {
			this.payRate = 10.00;
		} else {
			this.payRate = pRate;
		}
	}
}
