package com.sclr.lld.constructor;

public class TestConstructor {

	static {
		System.out.println("I'm static Block in main class");
	}
	public static void main(String[] args) {
		
		
		House.country = "INDIA";
		House hs = new House();
		System.out.println("I'm start of main method:");
		House mohit = new House("Mohit");
		mohit.typeOfHouse = "3-BHK";
		mohit.noOfRoom = 3;
		mohit.cp = 2000;
		mohit.sp = 3500;
		mohit.name = "Mohit";
		mohit.country = "France";
		mohit.Display(mohit);
		System.out.println("Mohit Ka Country: "+mohit.country);
		
		
		House rishi = new House("rishi",3000,5500);
		rishi.typeOfHouse = "5-BHK";
		rishi.noOfRoom = 5;
		rishi.cp = 3000;
		rishi.sp = 5500;
//copy
//		House rishi = mohit;
//		rishi.name = "rishi";
		
		
		House kshama = new House(mohit,"Kshama");// smae for other family members
		kshama.Display(kshama);
		kshama.country = "USA";
		System.out.println("Kshama Ka Country: "+kshama.country);
		System.out.println("House Ka Country: "+House.country);
		System.out.println("Mohit Ka Country: "+mohit.country);
		
	}

}
