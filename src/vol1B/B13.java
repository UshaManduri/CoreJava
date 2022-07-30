package vol1B;

public class B13 extends A13{
	void m1() {
		System.out.println("S m1");
	}
	void m2() {
		super.m2();
		System.out.println("S m2");
	}
	public static void main(String[] args) {
		B13 b = new B13();
		b.m1(); b.m2(); b.m3();
	}
}
