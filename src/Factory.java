
public class Factory {
	public static void main(String[] args) {
		//creating 2 bike obj /instances
		Bike access = new Bike("dl232", "white");
		Bike mastero = new Bike("df3434", "Blue");
		//seting remaining prop
		access.setOwnerName("Usha");
		access.setBikeNum("df234");
		mastero.setOwnerName("Buffy");
		mastero.setBikeNum("djf344");
		//performing operations on bike obj
		access.start();
		mastero.stop();
	}
}
