
class constructor123 {
	 
	int i=10;
	constructor123(){
		System.out.println("constructor call");
	}
		
	
	
	  static void display() {
		  
		  System.out.println("contructor method");
	  }
}




public class practice1 {

	public static void main(String[] args) {
          
		constructor123 c=new constructor123();
		System.out.println(c.i);
		c.display();
		
	}

}
