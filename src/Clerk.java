
public class Clerk {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.setBal(500);
		System.out.println(acc.getBalance());
		acc.setBal(-500);
		System.out.println(acc.getBalance());
		acc.setTotal(100);
		System.out.println("Total: " + acc.getTotal());
	}
}
