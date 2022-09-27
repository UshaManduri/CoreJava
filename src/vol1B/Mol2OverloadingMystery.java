package vol1B;

public class Mol2OverloadingMystery {
	public static void main(String[] args) {
		Call cl = new Call();
		Object ob1 = new Object();
		Object ob2 = "Usha";
		Object ob3 = new Integer(983);
		
//		cl.foo(ob1);
//		cl.foo(ob2);
//		cl.foo(ob3);
//		
//		System.out.println();
//		cl.foo("Kk");
//		cl.foo(983);
		
		System.out.println();
		cl.foo((String)ob2);
		cl.foo((Integer)ob3);
		
		System.out.println();
//		cl.foo((String)ob1);
//		cl.foo((Integer)ob1);
		cl.foo((String)ob3);
		cl.foo((Integer)ob2);
	}
}
