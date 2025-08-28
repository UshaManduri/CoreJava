package multithread;

public class ThreadTest1 {

	public static void main(String[] args) {

		MyThreadOne mt = new MyThreadOne();
		
		mt.start();
		for(int i=20; i<=1; i--) {
			System.out.println("main: "+i);
		}
	}

}
