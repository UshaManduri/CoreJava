package multithread;

public class MyRunnable implements Runnable{

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		System.out.println("Main executed");
	}

	@Override
	public void run() {
		System.out.println("run execution");
		
		String strLength = calculateLenght("Java Training");
		int length = convertStrLenght(strLength);
	}

	private int convertStrLenght(String strL) {
		int val = Integer.parseInt(strL);
		System.out.println(val);
		return val;
	}

	private String calculateLenght(String string) {
		
		int len = string.length();
		String val = String.valueOf(len);
		

		System.out.println(val);
		
		return val;
		
	}

}
