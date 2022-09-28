package com.FundamentalClasses;

public class Test_30 {
	public static void main(String[] args) {
		Student_30 s1 = new Student_30(101, "Usha", "Java");
		Student_30 s2 = new Student_30(102, "Srinath garu", "Java");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}