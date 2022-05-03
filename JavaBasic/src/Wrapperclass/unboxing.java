package Wrapperclass;

public class unboxing {

	public static void main(String[] args) {
            
		Double d=20.24;  //autoboxing
		
		System.out.println(d);
		
		//only boxed object can be unboxed
		
		double salary=d.doubleValue();
		
		System.out.println(salary);
		System.out.println(salary==d);
		System.out.println(d.equals(salary));
		
	}

}
