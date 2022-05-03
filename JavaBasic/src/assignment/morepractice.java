package assignment;

public class morepractice {
	
	
	public void subnumbers(int num1,int num2) {
		
		double result=num1-num2;
		
		System.out.println(result);
		
	}
	
	public double multiply(int num1,int num2,int num3) {
		double result=num1*num2*num3;
		return result;
	}
	

	public static void main(String[] args) {
		
		morepractice subtract=new morepractice ();
		subtract.subnumbers(100, 50);
		
		System.out.println(subtract.multiply(55, 54, 55));
		
		
		

	}

}
