package com.sclr.lld.constructor;

public class Floor extends House {

	int noOfRoom = 3;
	static String country = "USA";

	Floor() {
		System.out.println("I'm inside Floor Default Constructor:");
	}

	public Floor(String name) {
		// this.name = name;
		System.out.println("You are inside Floor House: " + name);
	}
	
	public Floor(String name, int cp, int sp) {
		super(name,cp,sp);
	}
	
	
	//Super for Variable
	int getNumberOfRooms() {
		return super.noOfRoom;

	}

	//Super for Method
	String getCountry() {
		System.out.println("Country From Floor:");
		return super.getCountry();
	}
	
	//Super for Constructor:
	

}
