package Assignment2;

public class methodoverloading {
	
	static void display(int num1,int num2) {
		double res=num1+num2;
		System.out.println(res);
		
	}
	
	static void display(double num1,double num2) {
		double res=num1*num2;
		System.out.println(res);
		
	}
	
	void display() {
		char ch='A';
		int i=ch;
		System.out.println(i);
		
	}
	
	static double display(int num1,int num2,int num3) {
		double res5=num1+num2*num3;
		return res5;
		
		
	}
	
	double display(int num1,float num2) {
		double multiply=num1*num2;
		return multiply;
	
		
	}
	
	
	 public static void main(String[] args) {
		methodoverloading.display(100, 2000);
        methodoverloading.display(1500, 1500);
        methodoverloading result=new methodoverloading();
            result.display();
            
           double result1= methodoverloading.display(150, 50, 10); 
           System.out.println(result1);
           
          result.display(50, 10.5);
           
            
	}

}
