package Exceptionhandling;

public class Exception6 {

	public static void main(String[] args) {
       
		try {
			System.out.println("inside the try block");
			
			//below code throws divide by zero exception
			int data=25/0;
			System.out.println(data);
		}
		//cannot handle Arithmetic type Exception
		//can only accept null pointer type Exception
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		//Executes irrespective of Exception occurs or not
		finally {
			System.out.println("i am inside finally block");
			int k=10/0;
			System.out.println("finally block is always executed");
		}
		
		System.out.println("program ends here.........");
	}

}
