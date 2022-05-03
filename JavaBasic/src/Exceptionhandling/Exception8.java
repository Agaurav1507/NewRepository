package Exceptionhandling;

public class Exception8 {
	
	//throwing unchecked exception
	//function to chek if person is eligible to vote or not
	public static void validateage(int age) {
		  
		if(age<18) {
			//throws arithmetic exception exception if not eligible to vote
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("person is eligible to vote");
		}
	}

	public static void main(String[] args) {
           
	//calling the function 
    //validateage(3);  //wihout handling the exception
		
		try {
			Exception8.validateage(14);
		}
		catch(ArithmeticException a) {
			System.out.println("Exception handled");
		}
		System.out.println("program ends here......");
	}

}
