package polymorphism;

class animal {
	
	animal(){
		System.out.println("animal constructor");
	}
	
	void eat() {
		System.out.println("animals eat");
	}
}

class herbivores extends animal {
	void eat() {
		System.out.println("herbivores eat plants");
	}
}

class omnivores extends animal {
	void eat() {
		System.out.println("omnivores etats plants n meat");
	}
}

class carnivores extends animal {
	void eat() {
		System.out.println("carnivores eat meat");
	}
}


public class runtime {

	public static void main(String[] args) {
         
		animal a=new animal();
		a.eat();
		
		animal a1=new herbivores();
		a1.eat();
		
		animal a2=new omnivores();
		a2.eat();
		
		animal a3=new carnivores();
		a3.eat();
		
		//explicit downcasting
		carnivores c1=(carnivores) a3;
		c1.eat();
		
		omnivores o1=(omnivores) a2;
		o1.eat();
		
	}

}
