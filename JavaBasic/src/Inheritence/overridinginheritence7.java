package Inheritence;

class company202 {
	void display() {
		System.out.println("i am companyy class display");
	}
}

class employee202 extends company202 {
	void display() {
		System.out.println("i am employee class display");
	}
	
	void callme() {
		System.out.println("i am employee class callme");
		
	}
}


public class overridinginheritence7 {

	public static void main(String[] args) {
           
		employee202 e1=new employee202();
		e1.display();
		e1.callme();
		
		System.out.println("*********************************");
		
		company202 c1=new company202();
		c1.display();
		
		System.out.println("*********************************");
		
		company202 e2=e1;
		e2.display();
		
	}

}
