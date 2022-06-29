
public class Ssample extends Eexample{
	static int b = m3();
	static {
		System.out.println("S SB");
	}
	int y = m4();
	{
		System.out.println("S NSB");
	}
	Ssample(){
		System.out.println("S C'r");
	}
	static int m3() {
		System.out.println("S SV is created");
		return 30;
	}
	int m4() {
		System.out.println("S NSV is created");
		return 40;
	}
	void abc() {
		System.out.println("S abc");
	}
	public static void main(String[] args) {
		System.out.println("S main");
		Ssample s = new Ssample();
		s.abc();
		s.bbc();
	}
}
