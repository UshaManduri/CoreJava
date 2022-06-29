
public class Samplea extends Examplea{
	Samplea(){
		System.out.println("S 0-param");
	}
	Samplea(int a){
		
		System.out.println("S int-param");
	}
	public static void main(String[] args) {
		Samplea s1 = new Samplea();
		Samplea s2 = new Samplea(10);
	}
}
