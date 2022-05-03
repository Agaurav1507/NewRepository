

class construc10 {
	 int age=15;
	 construc10(double d){
		 System.out.println("call costruc");
		 System.out.println(this.age);
		 this.age=200;
		 
	 }
	 
	 void display(int age) {
		 System.out.println(age);
		 System.out.println(this.age);
		
		 System.out.println(this.age);
	 }
	 
	 construc10(int i){
		 this(123.321);

		 System.out.println("constr call");
	 }
 }
	
	
 public class controverloading {	
	
	public static void main(String[] args) {
           construc10 c10= new construc10(55);
           c10.display(87);
           
	}

}
