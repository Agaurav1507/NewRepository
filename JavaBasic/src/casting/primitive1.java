package casting;

public class primitive1 {

	public static void main(String[] args) {
          
		double d=20000000000000.000;
		float f=50000.000f;
		
		
		//narrowing can be done only explicitely
		//explicit narrowing
		
		long l=(long) d;
		int i=(int) f;
		
		System.out.println(d);
		System.out.println(f);
		System.out.println("********************");
		System.out.println(l);
		System.out.println(i);
	}

}
