package Inheritence;

class fruits {
	int fruitage;
	fruits(){
		System.out.println("fruit class constrctor");
		fruitage=7;
	}
	
	public void taste() {
		System.out.println("sweet");
	}
}

class orange extends fruits {
	int fruitage;
	orange(){
		System.out.println("orange class constructor");
		fruitage=5;
	}
	
	public void taste() {
		System.out.println("orange are sweet");
	}
	
	public void shape() {
		System.out.println("round");
		System.out.println(fruitage);
		taste();
		super.taste();
		System.out.println(super.fruitage);
	}
}



public class inheritence5 {

	public static void main(String[] args) {
		
		orange o1=new orange();
		System.out.println("*******************************");
		o1.shape();
		System.out.println("******************************");
		o1.taste();
		System.out.println("*******************************");
		
		fruits f1=o1;
		f1.taste();

	}

}
