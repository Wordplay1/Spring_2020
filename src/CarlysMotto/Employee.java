package CarlysMotto;

/* @Author: Donald Mears
 * Title: Employee.java
 * Description: Abstract class to build Employee objects
 *
 */

public abstract class Employee {

	// Declare variables
	private String employeeID;
	private String lastName;
	private String firstName;
	protected double payRate;
	protected String jobTitle;

	// abstract method to set pay rate, must be declared in child class
	public abstract void setPayRate(double p);

	// abstract method to set job title, must be declared in child class
	public abstract void setJobTitle();

	// method to set employee ID
	public void setEmployeeID(String empID) {
		employeeID = empID;
	}

	// method to set last name
	public void setLastName(String lName) {
		lastName = lName;
	}

	// method to set first name
	public void setFirstName(String fName) {
		firstName = fName;
	}

	// method to get pay rate
	public double getPayRate() {
		return payRate;
	}

	// method to get job title
	public String getJobTitle() {
		return jobTitle;
	}

	// method to get employee ID
	public String getEmployeeID() {
		return employeeID;
	}

	// method to get last name
	public String getLastName() {
		return lastName;
	}

	// method to get first name
	public String getFirstName() {
		return firstName;
	}
}
