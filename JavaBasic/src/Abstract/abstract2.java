package Abstract;

abstract class demo3 {

abstract void print();
	
       void display() {
	   System.out.println("i am demo3 non-abstract method display ");
}
}


abstract class demo {
	    void display() {
	    	System.out.println("i am demo non-abstract method display ");
	    }
	    
	  static  void display2() {
	    	System.out.println("i am demo non-abstract method display2");
	    }
}


abstract class demo2 {
	     abstract void print();
	     abstract void print1();
	     abstract void print2();
}



 public class abstract2 {

	public static void main(String[] args) {
		demo.display2();
          
	}

}
