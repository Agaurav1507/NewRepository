package Scanner;

import java.util.Scanner;

public class scannerclass4 {

	public static void main(String[] args) {
            
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
		int s=num1+num2;
		System.out.println("the result is= " +s);
		
		
		
	}

}
