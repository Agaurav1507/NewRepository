package Scanner;

import java.util.Scanner;

public class scannerclass {


	public static void main(String[] args) {
             
		//object creation of scanner class 
		
		Scanner sc=new Scanner(System.in);
		
		int age;
		double salary;
		boolean valid;
		String name;
		
		
		//initialization using scanner class
		System.out.println("get age value from console");
		age=sc.nextInt();
		System.out.println("get salary from console");
		salary=sc.nextDouble();
		System.out.println("get name from console");
		name=sc.next();
		System.out.println("get true or false from console");
		valid=sc.nextBoolean();
		
		
		System.out.println("**************************************");
		
		int num1,num2;
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
		char op;
		System.out.println("enter op");
		op=sc.next().charAt(0);
		System.out.println(addnumber(op,num1,num2));
		
		
		
		
		
	}
	
	static int addnumber(char op,int num1,int num2) {
		if(op=='+') {
			return num1+num2;
			
		} return 0;
	}

}
