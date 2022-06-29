
public class Bike {
	String engNum;
	String color;
	String ownerName;
	String bikeNum;
	Bike(String engNum, String color){
		this.engNum = engNum;
		this.color = color;
	}
	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	void setBikeNum(String bikeNum) {
		this.bikeNum = bikeNum;
	}
	void start() {
		System.out.println(ownerName + " started bike");
	}
	void move() {
		System.out.println(ownerName + " moving on bike");
	}
	void stop() {
		System.out.println(ownerName + " stopped bike");
	}
	public static void main(String[] args) {
		Bike b = new Bike("AP2455", "Blue");
		b.setOwnerName("Usha");
		b.setBikeNum("AP2334");
		b.start();
		b.move();
		b.stop();
	}
}
