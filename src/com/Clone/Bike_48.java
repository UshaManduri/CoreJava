package com.Clone;

public class Bike_48 implements Cloneable{
	private int engNo;
	private int modNo;
	private String type;
	private int bikeNo;
	
	public Bike_48(int engNo, int modNo, String type) {
		this.engNo = engNo;
		this.modNo = modNo;
		this.type = type;
	}
	public void setbikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}
	public Bike_48 clone() throws CloneNotSupportedException{
		Bike_48 newBike_48 = (Bike_48)super.clone();
		newBike_48.engNo = this.engNo + 10;
		return newBike_48;
	}
	public String toString() {
		return"bikeNo: "+bikeNo +"\n"+
				"engNo: "+engNo+"\n"+
				"modNo: "+modNo+"\n"+
				"type: " +type;
	}
}
