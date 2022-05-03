package assignment;

public class methodoverloading1 {
	
	
	static int addnumbers(int num1,int num2) {
	   int result=num1+num2;
	   return result=num1+num2;
	}
	    
	    
	 static double addnumbers1(int num1,int num2) {
		 double sum=num1+num2;
		 return sum;
		 
     }
	 
	 static double addnumbers2(int num1,int num2,int num3) {
		 double result=num1+num2+num3;
		 return result;
	 }
	 
	 static void addnumbers3(int num1,int num2) {
		 double sum=num1+num2;
		 System.out.println(sum);
	 }
	 
	
		
	
	
	public static void main(String[] args) {
		
		methodoverloading1.addnumbers3(45, 55);
		double result= addnumbers(55,45);
		double sum=addnumbers1(500,400);
		double add=addnumbers2(455,452,500);
		
		System.out.println(result);
		System.out.println(sum);
		System.out.println(add);
		
		
		

	}

}
