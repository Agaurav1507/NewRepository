package Assignment1;

public class quorem {
	
	
	static void modulus(int num1,int num2) {
		
		int quo=num1/num2;
		int rem=num1%num2;
		
		System.out.println("the quotient is " + quo);
		System.out.println("the remainder is " + rem);
		
		
	}
	
	    public static void main(String[] args) {
	    	
	    	quorem.modulus(10, 5);
		

	}

}
