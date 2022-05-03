package Assignment1;

public class ifelse3 {
	
	
	static void largestnum(int num1,int num2,int num3) {
		
		int a=num1;
		int b=num2;
		int c=num3;
		
		
		if(a>b && a>c) {
			System.out.println("value of a is largest");
			
			
		}
		
		
		else if(b>a && b>c) {
			
			System.out.println("value of b is largest");
			
		}
		else {
			System.out.println("value of c is largest");
		}
		
	
	
	}
	
	
	
	 public static void main(String[] args) {
	    	
	    	ifelse3.largestnum(125,20,87);
	

	}

}
