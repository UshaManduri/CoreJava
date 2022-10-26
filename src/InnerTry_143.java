
public class InnerTry_143 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			System.out.println("a: "+a);
			try {
				int[] x = new int[a];
				System.out.println("array size: "+x.length);
			}
			catch(NegativeArraySizeException nas) {
				int[] x = new int[3];
				System.out.println("array size: "+x.length);
			}
			int b=a+20;System.out.println("b: "+b);
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("pass only int val");
		}
		catch(NumberFormatException nfe) {
			System.out.println("pass only int val");
		}

	}

}
