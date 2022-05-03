package Inheritence;

class vehicle {
	public void wheels() {
		System.out.println("wheels");
	}
}
class bike extends vehicle {
	public void countwl() {
		System.out.println("bike with 2 wheels");
	}
}

class car extends vehicle{
	public void countwlc() {
		System.out.println("car with 4 wheels");
	}
}

class scooter extends vehicle {
	public void countwls() {
		System.out.println("scooter with 2 wheels");
	}
}


public class inheritence3 {

	public static void main(String[] args) {
       
		scooter sc=new scooter();
		sc.countwls();
		sc.wheels();
	
		
	}

}
