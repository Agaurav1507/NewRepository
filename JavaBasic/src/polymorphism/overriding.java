package polymorphism;


class vehicle {
	
	//defining  method
	void run() {
		System.out.println("vehicle is moving");
	}
}
	
class car extends vehicle {
		
		void run() {
			System.out.println("car is running safely");
		}
	}






public class overriding {

	public static void main(String[] args) {
       
        car c=new car();
        c.run();
        
        vehicle v=c;
        v.run();
        
        v=new vehicle();
        v.run();
        
        
	}

}
