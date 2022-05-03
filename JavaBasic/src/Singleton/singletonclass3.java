package Singleton;

class Maharashtra {
	
     private Maharashtra() {
    	 System.out.println("i am private maha constructor");
     }
     
     static Maharashtra m=new Maharashtra() ;
     
     static Maharashtra display(double d ) {
    	 return m;
     }
     
     void disp() {
    	 System.out.println("print void");
     }
}



public class singletonclass3 {

	public static void main(String[] args) {
		
		Maharashtra m1=Maharashtra.display(50.00);
		m1.disp();
		
		//or
		System.out.println("***********************");
		m1.display(50.0).disp();
		
		}

}
