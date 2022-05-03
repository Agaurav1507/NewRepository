package Switchbreak;

public class prog4 {

	public static void main(String[] args) {
		
		int a=10,b=2;
		int ope='#';
		switch(ope) {
		
		case '+':
			System.out.println(a+b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;
			
		case '-':
			System.out.println(a-b);
			break;
			
		case '%':
			System.out.println(a%b);
			break;
			
		default:
			System.out.println("no result");
			break;
		}
		

	}

}
