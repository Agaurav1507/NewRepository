package Exceptionhandling;

public class Exception3 {

	public static void main(String[] args) {
       
		try {
			int[] a=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic exception occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Arrayindexoutofbounds Exception occurs");
		}
		catch(Throwable e) {
			System.out.println("parent exception occurs");
		}
		
		try {
			int[] a=new int[5];
			a[5]=30/2;
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println("arrayindexoutofboounds exception occurs");
		}
		catch(Throwable e) {
			System.out.println("parent exception occurs");
		}
		System.out.println("program ends......");
	}

}
