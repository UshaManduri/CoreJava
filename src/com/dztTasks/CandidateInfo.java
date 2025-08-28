package com.dztTasks;

public class CandidateInfo {
	public static CandidateDetails candidateInfoSetUp(){
		
		CandidateDetails candidateDetails = new CandidateDetails();
		Applicant applicant = new Applicant();
		
		candidateDetails.setAddress("Royers");
		candidateDetails.setName("Junnu");
		candidateDetails.setAge("15");
		
		applicant.setEmailAddress("abc123@xyz.com");
		applicant.setIpAddress("123.456.789.00");
		applicant.setPhoneNumber("9876543210");
		
		candidateDetails.setApplicant(applicant);
		
		return candidateDetails;
	}
}
