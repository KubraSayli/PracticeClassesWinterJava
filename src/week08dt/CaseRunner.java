package week08dt;

public class CaseRunner {

	public static void main(String[] args) {
		
		Case caseObj = new Case();
		
		caseObj.setActualCase("Covid 19");
		caseObj.setTested(true);
		caseObj.setConclusion("Tested Negative");
		
		if(caseObj.getConclusion().toLowerCase().contains("negative")) {
			System.out.println("You can go to work");
		}else {
			System.out.println("15 days quarantina");
		}
		
		Patient patient = new Patient();
		 patient.setFirstName("Ali");
		 patient.setLastName("Can");
		 System.out.println("Firstname: " + patient.getFirstName());
		 System.out.println("Lastname: "+patient.getLastName());
		 
		 patient.setCaseOptions(caseObj);
		 System.out.println(patient.getCaseOptions().getActualCase());
		 System.out.println(patient.getCaseOptions().getConclusion());
		 System.out.println(patient.getCaseOptions().isTested());
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
