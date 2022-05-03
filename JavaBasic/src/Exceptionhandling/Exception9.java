package Exceptionhandling;

public class Exception9 {

	//function to check if person is eligible to vote or not
	
	public static void validateage(int age) {
		if(age<18) {
			//throw arithmetic exception if not eligible to vote
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("person is elligible to vote");
		}
	}
	public static void main(String[] args) {
       
		//calling function
		Exception9.validateage(14);
		System.out.println("program ends here......");
	}

}
