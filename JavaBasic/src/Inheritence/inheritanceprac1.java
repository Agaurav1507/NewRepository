package Inheritence;

class vehicle15 {
	public void display() {
		System.out.println("call disp method");
	}
}

class scooter10 extends vehicle15 {
	public void display() {
		System.out.println("call disp method of scooter");
	}
	
	public void horn() {
		System.out.println("horn of scooter");
	}
}


class bike20 extends scooter10 {
	public void display() {
		System.out.println("call disp method of bike");
	
	}
	
	public void horn() {
		System.out.println("horn of bike");
	}
}



public class inheritanceprac1 {
	
	public static void main(String [] args) {
          
		bike20 b=new bike20();
		b.display();
		b.horn();
		System.out.println("***************************");
		scooter10 s=new scooter10();
		s.display();
		s.horn();
		System.out.println("****************************");
		vehicle15 v=b;
		v.display();
		System.out.println("****************************");
		
		
	}

}
