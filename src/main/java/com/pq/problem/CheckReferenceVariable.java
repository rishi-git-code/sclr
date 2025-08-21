package com.pq.problem;

public class CheckReferenceVariable {

	public static void main(String[] args) {
		
		
//		int a = 10;
//		int b= 20;
//		swap(a,b);
//		System.out.println("Inside main:");
//		System.out.println("a=" +a+"\tb="+b);
		ObjReference obj = new ObjReference();
		obj.a = 10;
		obj.b = 20;
		swap(obj);
		
		System.out.println("a=" +obj.a+"\tb="+obj.b);
	}

	private static void swap(ObjReference obj) {

		int temp = obj.a;
		obj.a=obj.b;
		obj.b=temp;
		System.out.println("Inside swap:");
		System.out.println("a=" +obj.a+"\tb="+obj.b);
	}

}
