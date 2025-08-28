package com.Preparation;

public class Applicant {

	public String address;
	public String lastseen;
	public String firstseen;
	
	@Override
	public String toString() {
		return "Applicant [address=" + address + ", lastseen=" + lastseen + ", firstseen=" + firstseen + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLastseen() {
		return lastseen;
	}
	public void setLastseen(String lastseen) {
		this.lastseen = lastseen;
	}
	public String getFirstseen() {
		return firstseen;
	}
	public void setFirstseen(String firstseen) {
		this.firstseen = firstseen;
	}
	
}
