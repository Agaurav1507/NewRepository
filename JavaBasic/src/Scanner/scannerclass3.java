package Scanner;

import java.util.Scanner;

public class scannerclass3 {

	public static void main(String[] args) {
        
		
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
	    char op;
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
		System.out.println("enter the operation");
		op=sc.next().charAt(0);
		
		
	   
	    
	    switch(op) {
	    
	    case '+':
	    	System.out.println(num1+num2);
	    	break;
	    	
	    case '-':
	    	System.out.println((num1-num2));
	    	break;
	    	
	    case '*':
	    	System.out.println(num1*num2);
	    	break;
	    	
	    case '/':
	    	System.out.println(num1/num2);
	    	break;
	    	
	    default :
	    	System.out.println("invalid opertion");
	    	break;
	    	
	    }
		
		
	}

}
