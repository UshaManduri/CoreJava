
public class A2 {
	static int a = 10;
	static {
		System.out.println("in a SB");
		System.out.println(("a: " + a));
		
		System.out.println("b: "+ B2.b);
		System.out.println("b: " + B2.getB());
	}
}
