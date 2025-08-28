package com.dztTasks;

public class TriggerCandidateInfo {

	public static void main(String[] args) {
		
		CandidateDetails candiInfo = CandidateInfo.candidateInfoSetUp();
		
		String candiInfoEmail = candiInfo.getApplicant().getEmailAddress().split("@")[1];
		
		// get.email/ split email / print domain name
		
		String getEmail = candiInfo.getApplicant().getEmailAddress();
		String[] splitEmail = getEmail.split("@");
		String emailDomain = splitEmail[1];
		
		WrapPojo warpPojo = new WrapPojo();
		
		Integer ageInt = Integer.parseInt(candiInfo.getAge());
		warpPojo.setIdNo(ageInt);
	
	}
	
	public static int m1() {
		
		return 10;
	}
	
}
