package com.sclr.lld.constructor;

import java.awt.DisplayMode;

public class House {

	int noOfRoom;
	String name;
	int cp;
	int sp;
	String typeOfHouse;
	int profit;

	// default constructor
	public House() {
		System.out.println("You are inside default House");
	}

	public House(String name) {
		// this.name = name;
		System.out.println("You are inside " + this.name + " House: " + name);
	}

	// Parameterized constructor
	public House(String name, int cp, int sp) {
		System.out.println("You are inside " + name + " House");
		this.profit = sp - cp;
	}

	// copy constructor
	public House(House mohit, String name) {
		this.name = name;
		noOfRoom = mohit.noOfRoom;
		cp = mohit.cp;
		sp = mohit.sp;
		typeOfHouse = mohit.typeOfHouse;
		profit = mohit.profit;

	}

	public void Display(House obj) {
		System.out.println("name: " + obj.name);
		System.out.println("cp: " + obj.cp);
		System.out.println("sp: " + obj.sp);
		obj.profit = obj.sp - obj.cp;
		System.out.println("profit: " + obj.profit);
		System.out.println("typeOfHouse: " + obj.typeOfHouse);
		System.out.println("noOfRoom: " + obj.noOfRoom);
	}

}
