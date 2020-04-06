package CarlysMotto;

/* @Author: Donald Mears
 * Title: Bartender.java
 * Description: Class to build Bartender object extended from Employee class.
 *
 */
public class Bartender extends Employee {

	// default constructor
	public Bartender() {
		setJobTitle();
	}

	// method to set job title, overridden from Employee class
	@Override
	public void setJobTitle() {
		this.jobTitle = "Bartender";
	}

	// method to set job pay rate, overridden from Employee class
	@Override
	public void setPayRate(double pRate) {

		if (pRate > 14.00) {
			this.payRate = 14.00;
		} else {
			this.payRate = pRate;
		}
	}
}
