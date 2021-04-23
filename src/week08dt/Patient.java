package week08dt;
/*
 Create a class: Patient
     *Create 3 instance variables String firstName; String lastName;
     *Case caseOptions; using encapsulation
     *And create getters and setters
     *Go to CaseRunner class
     *Set your first and last name
     *And print your current case using the Case class objects
 */
public class Patient {

	private String firstName;
	private String lastName;
	private Case caseOptions;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Case getCaseOptions() {
		return caseOptions;
	}
	public void setCaseOptions(Case caseOptions) {
		this.caseOptions = caseOptions;
	}
	
	
}
