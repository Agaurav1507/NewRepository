package Assignment2;

public class globalvariable {
	
	
	static double display(int num1,int num2) {
		double res=num1*num2;
		return res;
		
		
		}
	
	double display1(int num1,int num2) {
		double res1=num1-num2;
		return res1;
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(globalvariable.display(54, 5));
		
		globalvariable sub=new globalvariable();
		
		System.out.println(sub.display1(500, 100));
		

	}

}
