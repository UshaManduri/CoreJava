package vol1B;

public class D16 extends C16{
	static void m1() {
		System.out.println("D m1");
	}
	static void m2() {
		System.out.println("D m2");
	}
	static void m4() {
		System.out.println("D m4");
	}
	public static void main(String[] args) {
		D16 d = new D16();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}
