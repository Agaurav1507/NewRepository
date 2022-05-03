package Abstract;

abstract class Animal {
	
public abstract void animalsound();

public void sleep() {
	System.out.println("zzzzzz");
}
}


class pig extends Animal {
	public void animalsound() {
		System.out.println("wee-wee");
	}
}


class dog extends Animal {
	public void animalsound() {
		System.out.println("bow-bow");
		
	}
}



public class abstract1 {

	public static void main(String[] args) {
		pig p=new pig();
        p.animalsound();
        p.sleep();
        
        System.out.println("****************");
        
        dog d=new dog();
        d.animalsound();
       
	}

}
