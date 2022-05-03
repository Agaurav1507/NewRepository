package casting;

public class primitive2 {
	
	static int salary=30000;
	static short ht=5;
	
	//implicit widwning
	static double d=salary;
	static double d1=ht;
	
	//explicit widening
	static double d2=(double) salary;
	static double d3=(double) ht;
	
	
	
	
	public static void main(String[] args) {
	     
		System.out.println(primitive2.salary);
		System.out.println(primitive2.ht);
		System.out.println("*******************");
		System.out.println(primitive2.d);
		System.out.println(d1);
		System.out.println("*******************");
		System.out.println(primitive2.d2);
		System.out.println(primitive2.d3);
                
	}

}
