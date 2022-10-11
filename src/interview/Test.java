package interview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1 = new String();
//		
//		System.out.println(s1.isEmpty());
//		
//		String s2 = "abc";
//		
//		System.out.println(s2.length());
//		System.out.println(s2.hashCode());
//		
//		String s3 = "A";
//		String s4 = "a";
//
//		System.out.println(s3 == s4);
//		System.out.println("compare to values "+ s3.compareToIgnoreCase(s4));
//		
		
		String s1 = new String("a");
		String s2 = new String("a");
		StringBuffer sb1 = new StringBuffer("a");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));
	}

}
