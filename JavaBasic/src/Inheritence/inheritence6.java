package Inheritence;

class fruitA {
	int fruitage;
	fruitA() {
		System.out.println("fruitA class constructor");
		fruitage=7;
	}
	
	public void taste() {
		System.out.println("sweet");
	}
}

class mango extends fruitA {
	int fruitage;
	mango(){
		System.out.println("mango class constructor");
		fruitage=5;
		
	}
	
	public void taste() {
		
		System.out.println("mango are tart in taste");
		super.taste();
	}
	
	public void shape() {
		System.out.println("round");
	}
}



public class inheritence6 {

	public static void main(String[] args) {
        
		mango m1=new mango();
		System.out.println("******************************");
		m1.taste();
		m1.shape();
		
		System.out.println(m1.fruitage);
		System.out.println("******************************");
		
		fruitA f1=m1;
		f1.taste();
		
		fruitA f2=m1;
		f2.taste();
		
		
	}

}
