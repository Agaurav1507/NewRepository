package Methods;

public class staticmethod1 {

	public static double display(double d1,double d2) {
		double d=d1*d2;
		return d;
	}
	
	public static void display1(int num1,int num2) {
		int num=num1+num2;
		System.out.println(num);
	}
	
		

	
	public static void main(String[] args) {
		
		System.out.println(staticmethod1.display(45, 100));
		staticmethod1.display1(54, 100);

	}

}
