package Exceptionhandling;

public class Exception4 {

	public static void main(String[] args) {
         
		try {
			int[] a=new int[5];
			a[5]=30/0;
	}
		catch(Exception e) {
			System.out.println("common task completed");
			
		}
		catch(ArithmeticException a) {
			System.out.println("task 1 is completed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 is completed");
		}
		
		System.out.println("program ends........");
		
	}

}
