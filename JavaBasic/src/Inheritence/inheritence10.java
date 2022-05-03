package Inheritence;

class company {
	
	static int a=25;
	       int c=30;
	       
	static void display1(double d) {
		System.out.println("i am company static global variable");
		
	}
	
	void display1(int c) {
		
		System.out.println(c);
		
		System.out.println(this.c);
		this.c=c;
		System.out.println(this.c);
		
	}
	
	company () {
		System.out.println("i am constructor company");
		
	}
	
	company(float b) {
		this();
		System.out.println("i am float company constructor");
	}
	
}

class employee extends company {
	static int a=84;
	       double m=85;
	       
	void display(int a) {
		System.out.println("i am employee nontstatic global variable");
		
	}
	
	void display(double m) {
		
		System.out.println(this.m);
		System.out.println("i am gaurav agrawal");
		this.m=m;
		System.out.println(this.m);
		
	}
	
	void display(int c,double d) {
		super.display1(10.5);
		System.out.println("i am deepali");
	}
	
	
	
	employee(int b) {
		this(25,25.25);
		System.out.println("i am employee constructor");
	}
	
	employee(int a,double v) {
		this(2.25,25);
		System.out.println("i am employee contructor overloading");
	}
	
	employee(double x,int n){
		super();
		System.out.println("i am something overloading");
	}
	
}


class total extends employee {
           total(float f,double r){
        	   super(54,54.54);
        	   System.out.println(f + "=" + r);
     }
           
           public double method(double num1,double num2) {
        	   double f=num1+num2;
        	   return f;
           }
	
}


public class inheritence10 {

	public static void main(String[] args) {
		
		company.display1(25.25);
		System.out.println("*****************************");
		
		company c=new company(2.25f);
		c.display1(25);
		
		
		
		System.out.println("******************************");
		
	   employee e=new employee(50);
	   
	   e.display(10);
	   e.display(21.2);
	   e.display(25, 25.31);
	   
	   
	   System.out.println("*********************************");
	   
	   
	   company t=e;
	   t.display1(50);
	   
	   
	   
	   System.out.println("*********************************");
	   
	   
	   total k=new total(24.5f,25.65);
	   
	   System.out.println(k.method(50, 120));
	   
	   
		

	}

}
