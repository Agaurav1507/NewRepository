package Assignment1;

public class simplecalculator {
	
	
	void display(int num1,int num2) {
		
		
		int ope='/';
		int result=0;
		
		switch (ope) {
		
		case '*':
			result=num1*num2;
			System.out.println(result);
		break;
		
		case '-':
			result=num1-num2;
			System.out.println(result);
		break;
		
		case '+':
			result=num1+num2;
			System.out.println(result);
		break;
		
		case '/':
			result=num1/num2;
			System.out.println(result);
		break;
		
		default:
			System.out.println("NO RESULT");
		break;
		
		}
		
		
		
	}

	
	     public static void main(String[] args) {
	    	 simplecalculator calculator=new simplecalculator();
	    	 
	    	calculator.display(15, 100);
		

	}

}
