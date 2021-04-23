package week08;

public class Runner {
	/*
     * Create CaseRunner class
     * actualCase=Covid 19
     * isTested=true
     * conclusion=Tested Negative
     *
     * if conclusion contains "negative" print "You can go to work"
     * otherwise print "15 days quarantine"
     */
	public static void main(String[] args) {
		
		Case caseObj = new Case();
		
		caseObj.setActualCase("Covid 19");
		caseObj.setTested(true);
		caseObj.setCoclusion("Tested Negative");
		
		if(caseObj.getCoclusion().toLowerCase().contains("negative")) {
			System.out.println("You can go to work");
		}else {
			System.out.println("15 days quarantine");
		}
		
		Patient patient = new Patient();
		
		patient.setFirstName("Cemal");
		patient.setLastName("Senel");
		System.out.println("Firstname : "+patient.getFirstName());
		
		
		patient.setCaseOptions(caseObj);
		
		System.out.println(patient.getCaseOptions().getActualCase());
		System.out.println(patient.getCaseOptions().getCoclusion());
		System.out.println(patient.getCaseOptions().isTested());
		
		
		
		
		
		
		
		
		

	}

}
