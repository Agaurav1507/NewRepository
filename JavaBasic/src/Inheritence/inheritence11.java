package Inheritence;

class world {
	world(int a){
		System.out.println("i am constructor world");
	}
	
	 void display() {
		System.out.println("i am method world");
	}
}


class country extends world {
	country(int b,double d){
		super(25);
		System.out.println("i am consructor country");
		super.display();
	}
	
	void display() {
		System.out.println("i am country method");
		super.display();
		
	}
}


class india extends country {
	india(boolean b){
		super(50,50.54);
		System.out.println(b);
	}
	
	static void method() {
		System.out.println("i am static methdod");
		
	}
}




public class inheritence11 {

	public static void main(String[] args) {
		
		india i=new india(false);
		i.display();
		i.display();
		
		System.out.println("*********************************");
		
		
		world w=new country(54,54.55);
		
		w.display();

	}

}
