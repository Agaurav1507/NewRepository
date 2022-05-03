package Exceptionhandling;

public class Exception7 {

	public static void main(String[] args) {
         
		try {
			System.out.println("inside try block");
			//below code thows divide by zero exception
			int data=25/0;
			System.out.println(data);
		}
		
		//handles the arithmetic excepton
		catch(ArithmeticException a) {
			System.out.println("Exception handled");
		}
		
		finally {
			System.out.println("finally block alwayss executed");
		}
		System.out.println("program ends here");
	}

}
