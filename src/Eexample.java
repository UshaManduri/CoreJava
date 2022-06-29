
public class Eexample {
	static int a = m1();
	static {
		System.out.println("Example SB");
	}
	int x = m2();
	{
		System.out.println("Example NSB");
	}
	Eexample(){
		System.out.println("Example C'r");
	}
	static int m1() {
		System.out.println("E SV is created");
		return 10;
	}
	int m2() {
		System.out.println("E NSV is created");
		return 20;
	}
	void abc() {
		System.out.println("E abc");
	}
	void bbc() {
		System.out.println("E bbc");		
	}
}