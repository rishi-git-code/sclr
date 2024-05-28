package com.sclr.lld.constructor;

public class House {

	int noOfRoom;
	String name;
	int cp;
	int sp;
	String typeOfHouse;
	int profit;

	//default constructor
	public House() {
		System.out.println("You are inside default House");
	}

	public House(String name) {
		//this.name = name;
		System.out.println("You are inside " + this.name + " House: "+name);
	}

	//Parameterized constructor
	public House(String name, int cp, int sp) {
		System.out.println("You are inside " + name + " House");
		this.profit = sp - cp;
	}

	//copy constructor
	public House(House mohit) {
		
	}

	

}
