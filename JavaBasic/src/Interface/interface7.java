package Interface;

interface animal12 {
	int age=25;
	void animalsound();
	void sleep();
}

interface reptile {
	void colour();
	
}

class pig5 implements animal12 {
	public void animalsound() {
		System.out.println("wee wee");
	}
	
	public void sleep() {
		System.out.println("zzzz");
	}
}

class dog extends pig5 implements reptile {
	public void animalsound() {
		System.out.println("bhow bhow");
	}
	
	public void colour() {
		System.out.println("black");
	}
}



public class interface7 {

	public static void main(String[] args) {
         
		dog d=new dog();
		d.animalsound();
		d.colour();
		d.sleep();
		System.out.println("*******************************");
		pig5 p=new pig5();
		p.animalsound();
		p.sleep();
		System.out.println("*******************************");
		
		p=d;
		p.animalsound();
		p.sleep();
		
	}

}
