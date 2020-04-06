package CarlysMotto;

/* @Author: Donald Mears
 * Title: Coordinator.java
 * Description: Class to build Coordinator object extended from Employee class.
 *
 */
public class Coordinator extends Employee {

	// default constructor
	public Coordinator() {
		setJobTitle();
	}

	// method to set job title, overridden from Employee class
	@Override
	public void setJobTitle() {
		this.jobTitle = "Coordinator";
	}

	// method to set pay rate, overridden from Employee class
	@Override
	public void setPayRate(double pRate) {

		if (pRate > 20.00) {
			this.payRate = 20.00;
		} else {
			this.payRate = pRate;
		}
	}
}
