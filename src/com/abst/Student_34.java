package com.abst;

public class Student_34 {
	private int sno;
	private String sname;
	private String course;
	
	public Student_34(int sno, String sname, String course) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		else {
			if(obj instanceof Student_34) {
				Student_34 s = (Student_34)obj;
				
				return (this.sno==s.sno)&&
						this.sname.equals(s.sname)&&
						this.course.equals(s.course);
			}
			else {
				return false;
			}
		}
	}
}
