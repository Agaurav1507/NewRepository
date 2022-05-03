package Interface;

interface animal {
	int age=20;
	void animalsound();
	void sleep();
}

class pig implements animal {
	public void animalsound() {
		System.out.println("wee wee");
	}
	
	public void sleep() {
		System.out.println("zzzzz");
	}
}



public class interface6 {

	public static void main(String[] args) {
        
		pig p=new pig();
		p.animalsound();
		p.sleep();
		
		System.out.println(animal.age);
		
	}

}
