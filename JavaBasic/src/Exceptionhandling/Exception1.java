package Exceptionhandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
        
		 System.out.println("program starts");
		 
		 //1.Abnormal statements
		 
		 int i,j,k;
		 Scanner scn = new Scanner(System.in);
		 
		 try {
			 System.out.println("enter num1");
			 i=scn.nextInt();
			 System.out.println("enter num2");
			 j=scn.nextInt();
			 k=i/j;
			 System.out.println("result "+k);
	} 
		 catch(Throwable a) {
			 System.out.println("exception handled " +a);
			// a.printStackTrace();  gives detail information of error
	}
		 
		 System.out.println("program ends here");
		 
	}

}
