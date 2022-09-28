package com.FundamentalClasses;

public class Student_30 {
	private int sno;
	private String sname;
	private String course;
	
	public Student_30(int sno, String sname, String course) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return sno;
	}
}
