package com.sclr.lld.constructor;

public class TestConstructor {

	public static void main(String[] args) {

		House mohit = new House("Mohit");
		mohit.typeOfHouse = "3-BHK";
		mohit.noOfRoom = 3;
		mohit.cp = 2000;
		mohit.sp = 3500;
		mohit.name = "Mohit";
		
		System.out.println("Name: "+mohit.name);
		House rishi = new House("rishi",3000,5500);
		rishi.typeOfHouse = "5-BHK";
		rishi.noOfRoom = 5;
		rishi.cp = 3000;
		rishi.sp = 5500;
		System.out.println("She got profit of "+rishi.profit);
		
		System.out.println("Mohit:" +mohit.typeOfHouse);
		
		//copy
//		House rishi = mohit;
//		
//		rishi.name = "rishi";
//		System.out.println("Mohit:"+mohit.name);
		
		House kshama = new House(mohit);
		kshama.name = "rishi";
		System.out.println("Mohit:"+mohit.name);
		
	}

}
