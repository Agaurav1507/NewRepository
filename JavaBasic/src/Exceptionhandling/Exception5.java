package Exceptionhandling;

public class Exception5 {

	public static void main(String[] args) {
       
		try {
			//below code do not throw any exception
			int data=25/0;
			System.out.println(data);
		}
		//catch won't be executed
		catch(ArithmeticException a) {
			System.out.println("Exception handled");
		}
		
		//irrespective of exception occured or not,finally block will always execute
		
		finally {
			System.out.println("finally block is always executed");
		}
		
		System.out.println("program ends.........");
	}

}
