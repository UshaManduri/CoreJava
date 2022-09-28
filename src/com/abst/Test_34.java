package com.abst;

public class Test_34 {
	public static void main(String[] args) {
		Student_34 s1 = new Student_34(1, "a", "b");
		Student_34 s2 = new Student_34(2,"c","d");
		Student_34 s3 = new Student_34(3,"e", "f");
		Student_34 s4 = s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println();
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		
		Address_34 add = new Address_34();
		System.out.println(s1.equals(add));
		System.out.println(add.equals(s1));
		System.out.println(null == null);
		
		Address_34 a1 = null;
		Address_34 a2 = null;
		
		System.out.println(a1==a2);
		Address_34 a3 = new Address_34();
		System.out.println(a3==a2);
		System.out.println(a3.equals(a2));
		System.out.println(s2.equals(a2));
	}
}
