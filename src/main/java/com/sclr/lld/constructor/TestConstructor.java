package com.sclr.lld.constructor;

import java.awt.DisplayMode;

public class TestConstructor {

	public static void main(String[] args) {

		House mohit = new House("Mohit");
		mohit.typeOfHouse = "3-BHK";
		mohit.noOfRoom = 3;
		mohit.cp = 2000;
		mohit.sp = 3500;
		mohit.name = "Mohit";
		
		mohit.Display(mohit);
		
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
		
	}

}
