package Exceptionhandling;

public class Exception12 {

	//defining a user-defined method which throws ArithmeticException
	
	static void method() throws ArithmeticException
	{
		System.out.println("inside the method()");
		
		throw new ArithmeticException("throwing ArithmeticException");
	}
	public static void main(String[] args) {
		
		try {
			method();
		}
		
		catch (ArithmeticException e){
			System.out.println("caught in main method()");
		}
   
	}

}
