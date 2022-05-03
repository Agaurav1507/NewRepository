package Singleton;

class sampleton {
	//Rules for singleton class are-
	//1)constructor should be privte
	//2)create static ref variabe of the calss
	//3)create static method which return current class object
	
	private sampleton() {
		System.out.println("sampleton class constructor");
	}
	
	static sampleton obj=new sampleton();
	
	public static sampleton getsampletonobj() {
		return obj;
	}
	
	void display() {
		System.out.println("i am display");
	}
    	 
     }


public class singletonclass {

	public static void main(String[] args) {
		
		//to access static method
		sampleton.getsampletonobj().display(); 
		           //or
		sampleton.getsampletonobj();
		sampleton s2=sampleton.getsampletonobj();
		s2.display();
		
		

	}

}
