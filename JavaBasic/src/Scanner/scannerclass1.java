package Scanner;

import java.util.Scanner;

public class scannerclass1 {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		
		int num1 ;
		int num2;
		char s;
		
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
		System.out.println("give a character");
		s=sc.next().charAt(0);																																		
		
		char op;
		
		System.out.println("enter op");
		op=sc.next().charAt(0);
		System.out.println(addnumber(op,num1,num2));
		
	}

	private static int addnumber(char op, int num1, int num2) {
		return num1+num2;
		// TODO Auto-generated method stub
		
	}

}
