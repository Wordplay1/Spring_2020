package CarlysMotto;

public abstract class Employee {
	private String employeeID;
	private String lastName;
	private String firstName;
	protected double payRate;
	protected String jobTitle;
	
	
	public abstract void setPayRate(double p);

	public abstract void setJobTitle();

	public void setEmployeeID(String empID) {
		employeeID = empID;
	}

	public void setLastName(String lName) {
		lastName = lName;
	}

	public void setFirstName(String fName) {
		firstName = fName;
	}

	public double getPayRate() {
		return payRate;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}
}
