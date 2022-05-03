package Inheritence;

class friends {
	
	friends(int a){

		System.out.println("constructor friends");
	}
	
	public void display() {
		System.out.println("display method of class friendns");
	}
	
	friends(int a,double d){
		this(55);
		System.out.println("2nd construc friends");
	}
	
	 void display(int a) {
		System.out.println(a);
	}
	 
	 friends(boolean b) {
		 System.out.println(b);
	 }
	 
	 void display(double d) {
		 d=100.100;
		 System.out.println(d);
	 }
}

class deepali extends friends {
	deepali(long l) {
		super(100);
		System.out.println("constructor deepali");
	}
	
	public void display() {
		System.out.println("display mthod of class deepali");
		super.display();
		super.display(455);
		super.display(1121);
	}
}


public class inheritncepractice {

	public static void main(String[] args) {
           
		deepali d=new deepali(500); //
		d.display();
		d.display(53.213);
		d.display(489);
		
	}

}
