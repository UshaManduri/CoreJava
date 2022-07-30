package vol1B;

public class Sample extends Example {
	void m1(Example e) {
		System.out.println("I am in sample class");
	}
	public static void main(String[] args) {
//		byte b = 10;
//		short s = 15;
//		char ch = 'a';
//		int i = 20;
//		
		Sample e = new Sample();
//		e.m1(b); e.m1(s); e.m1(ch); e.m1(i);
//		e.m1(10); e.m1(15); e.m1('a'); e.m1(20);
//		e.m1((byte)10); e.m1(15); e.m1('a'); e.m1(20);
		e.m1(new Example());
		e.m1(new Sample());
//		e.m1(new Test());
//		e.m1("abc");
		e.m1(null);
	}
}
