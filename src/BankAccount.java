
public class BankAccount {
	private double balance;
	public void setBalance(double balance) {
		if(balance <= 0) {
			System.out.println("do not enter -ve amount");
		}else {
			this.balance = balance;
		}
	}
	public double getBalance() {
		return balance;
	}
}
/*private double balance;
private int total;
public void setBal(double balance) {
	if(balance <= 0) {
		System.out.println("Do not enter -ve amount");
	}else {
		this.balance = balance;
	}
}
public double getBalance() {
	return balance;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
