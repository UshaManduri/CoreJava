package com.ObjectMethods;

public class College_39 {
	private int sno;
	private String sname;
	private String course;
	
	public College_39(int sno, String sname, String course) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else {
			if(obj instanceof College_39) {
				College_39 c = (College_39)obj;
				
				return(this.sno == c.sno) &&
						this.sname.equals(c.sname)&&
						this.course.equals(c.course);
			} else {
				return false;
			}
		}
	}
	@Override
	public String toString() {
		return "sno: " + sno+"\n" +
				"name: " +sname+"\n" +
				"course: " +course +"\n";
	}
}

