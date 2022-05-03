package Methods;

public class practice4 {
	
	static double display(double d) {
		return d;
	}
	
	int display(int a) {
		return a;
		
	}
	
	static void display(boolean b) {
		System.out.println(b);
	}
	
	void display(double v,int b) {
		
		System.out.println(v + b);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(practice4.display(50.50));
		practice4.display(true);
		
		practice4 d1=new practice4();
		System.out.println(d1.display(45));
		d1.display(5, 4);
		

	}

}
