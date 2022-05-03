package Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception11 {
	
	//defining a method
	
	public static int dividenum(int  m,int n) throws ArithmeticException {
		 
		int div=m/n;
		return div;
	}

	public static void main(String[] args) throws FileNotFoundException {
          
		Exception a=new Exception();
		try {
			System.out.println(a.dividenum(45, 5));
		}
		catch(ArithmeticException e) {
			System.out.println("num cannot be divide by 0");
		}
		
		FileInputStream fis=new FileInputStream("filelocation");
		System.out.println("program ends.....");
		
	}

}
