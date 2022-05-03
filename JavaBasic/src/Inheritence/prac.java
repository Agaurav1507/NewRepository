package Inheritence;

class maharashtra {
	
	
	
	public void display() {
		System.out.println("i am maha display");
	}
}

class pune extends maharashtra {
	
	
	
	public void display() {
		System.out.println("i am pune method");
	}
}



public class prac {

	public static void main(String[] args) {
		
       pune p=new pune();
       p.display();
		
	
		
	
		

	}

}
