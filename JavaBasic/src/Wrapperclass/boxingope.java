package Wrapperclass;

public class boxingope {

	public static void main(String[] args) {
        
		double d=20;
		System.out.println(d);
		
		Double d1=new Double(d); //explicit boxing
	    System.out.println(d1);
	    System.out.println(d==d1);
	    System.out.println(d1.equals(d));
	    
	    double d4=d1.doubleValue(); //explicit unboxing
	    System.out.println(d4);
	    
	    Double d2=new Double(30); //explicit boxing
	    System.out.println(d2);
	    
	    double d6=d2.doubleValue();//explicit unboxing
	    System.out.println(d6);
	    
	    Double d3=40.00;
	    System.out.println(d3);
	    System.out.println(d2==d3);
	    System.out.println(d3.equals(d2));
	}

}
