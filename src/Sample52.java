
public class Sample52 extends Example52{
	int x = 30;
	int y = 40;
	void m2() {
		System.out.println("x: "+x);
		System.out.println("y: "+ y);
		System.out.println("x: " + super.x);
		System.out.println("y: "+ super.y);
	}
	void m3() {
		int x = 50;
		int y = 60;
		System.out.println(x);
		System.out.println(y);
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(super.x);
		System.out.println(super.y);
	}
	public static void main(String[] args) {
		Sample52 s = new Sample52();
		s.m2();
		s.m3();
	}
}
