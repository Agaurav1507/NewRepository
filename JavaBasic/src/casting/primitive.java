package casting;


public class primitive {

	public static void main(String[] args) {
            
		int i=0;
		short s=20;
		long l=200000;
		
		//implicit widening
		
		double d=i;
		double d1=s;
		double d2=l;
		
		//explicite widening
		
		double d3=(double) i;
		double d4=(double) s;
		double d5=(double) l;
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println("*********************");
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("**********************");
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
	}

}
