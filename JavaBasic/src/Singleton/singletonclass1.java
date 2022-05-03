package Singleton;

class singleton {
	
	private singleton() {
		
		
	}
	
	static singleton s1=new singleton();
	String s="pune";
	
	
	static singleton getinstance() {
		return s1;
	}
	
	void display() {
		System.out.println("i am display method");
	}
	
	
}


public class singletonclass1 {

	public static void main(String[] args) {
	     
		singleton s1=singleton.getinstance();
		s1.display();
		//or
		
		s1.getinstance().display();
		System.out.println(s1.s);
		
		
		
	}

}
