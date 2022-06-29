
public class Employee {
	int eid;
	String ename;
	String company;
	
	// overriding toString() method to print obj data
	public String toString() {
		return "eid: " + eid + "\n"+
				"ename: " + ename + "\n"
				"company " + company + "\n";
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eid = 8788;
		e1.ename = "Usha";
		e1.company = "Srisha";
		System.out.println(e1);
	}
}
