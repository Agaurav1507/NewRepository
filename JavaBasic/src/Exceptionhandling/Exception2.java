package Exceptionhandling;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
         
		System.out.println("program starts ");
		
		//1.abnormal statements
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter array size");
		int size=scn.nextInt();
		
		int[] empid=new int[size];
		
		try {
			System.out.println(empid[3]);  //arrayindexoutofboundexception
			
	}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception handled "+a);
			
	}
		System.out.println("program ends");
	}

}
