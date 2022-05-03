package casting;

class parent {
	void show() {
		System.out.println("parent show methodis called");
	}
	
	void callme() {
		System.out.println("parent callme method");
	}
}

class child extends parent {
		
	
	void readme() {
		System.out.println("child readme method");
	}
	
	void callme() {
		System.out.println("child class call mathod");
		super.callme();
	}
}




public class nonprimitive2 {

	public static void main(String[] args) {
           
		child c1=new child();
		c1.callme();
		c1.readme();
		c1.show();
		System.out.println("***********************");
		//implicit upcasting
		parent p1=c1;
		p1.callme();
		p1.show();
		System.out.println("************************");
		
		//explicit upcasting
		parent p2=(parent) c1;
		p2.callme();
		p2.show();
		
		
	}

}
