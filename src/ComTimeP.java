
public class ComTimeP extends RuntimeP{
	static void m1() {
		System.out.println("S m1");
	}
	void m2() {
		System.out.println("S m2");
	}
	void m4(String s) {
		System.out.println("S m4 1-param");
	}
	public static void main(String[] args) {
		ComTimeP s = new ComTimeP();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m4("abc");
		
		RuntimeP e = new ComTimeP();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		
	}
}
