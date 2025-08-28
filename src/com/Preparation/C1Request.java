package com.Preparation;

import java.util.List;

public class C1Request {
	
	public String name;
	public int age;
	public List<Applicant> applicant;
	
	@Override
	public String toString() {
		return "C1Request [name=" + name + ", age=" + age + ", applicant=" + applicant + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Applicant> getApplicant() {
		return applicant;
	}
	public void setApplicant(List<Applicant> applicant) {
		this.applicant = applicant;
	}
	
}
