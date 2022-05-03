package Singleton;

class demo123 {
	private demo123() {
		System.out.println("i am zeroparam");
	}
	
	static demo123 d1=new demo123();
	String name="pune";
	
	static demo123 getinstance() {
		return d1;
	}
	
	void print() {
		System.out.println("i am print of demo123 ");
	}
}


public class singletonclass2 {

	public static void main(String[] args) {
        
		demo123 d1=demo123.getinstance();
		d1.print();
		//or
		
		d1.getinstance().print();
		
		System.out.println(d1.name);
		d1.name="bangalore";
		System.out.println(d1.name);
		
	}

}
