package Assignment2;

public class demo {
	
	static int age=25;
	double empid=123;
	
	static {
		
		System.out.println("Block method starts");
	}
	
	{
		System.out.println("Block method ends");
		
	}
	
	
	static void display(int num1,double num2) {
		double result=num1*num2;
		
	    System.out.println(result);	
		
	}
	
	
	void display1(int num1,int num2) {
		int res=num1/num2;
		
		System.out.println(res);
		
	}
	
	
	
	
	static void display2() {
		int res=100;
		
		System.out.println(res);
		
	}
	
	
	void display2(int num1,int num2) {
		double res1=num1+num2;
		
		System.out.println(res1);
		
		
	}
	
	
	static double display2(int num1,int num2,int num3) {
		double res2=num1*num2/num3;
		return res2;
		
	}
	
	char display2(char ch) {
		char res3=ch;
		return res3;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Main () starts");
		
		
		
		demo gaurav=new demo();
		System.out.println(gaurav.empid);
		
		System.out.println(demo.age);
		
		demo.display(5,5.5);
		
		gaurav.display1(10, 5);
		
		
		System.out.println("*******************************************");
		
		System.out.println("Method overloading starts");
		
		
		demo.display2();
		
		gaurav.display2(50, 100);
		
		
		System.out.println(demo.display2(100, 2000, 500));
		
		System.out.println(gaurav.display2('A'));
		
		

	}

}
