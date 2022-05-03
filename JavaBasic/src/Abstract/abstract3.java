package Abstract;

abstract class bike {
	abstract void run();
	
	void speed(int speed) {
		System.out.println(speed);
	}
}


class honda extends bike {
	void run() {
		System.out.println("running safely");
	}
	
	void speed(int speed) {
		super.speed(140);
		System.out.println(speed);
	}
	
	void colour() {
		
		System.out.println("blue clolour");
	}
}

public class abstract3 {

	public static void main(String[] args) {
            
		    honda h=new honda();
		    h.run();
		    h.speed(120);
		    h.colour();
		    System.out.println("*********************************");
		    bike b=h;
		    b.run();
		    b.speed(160);
	}

}
