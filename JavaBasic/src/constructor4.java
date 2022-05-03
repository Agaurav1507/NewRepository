
public class constructor4 {
    
	int i=10;
	
	constructor4(){
		System.out.println("running constructor4");
		i=23;
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("main () started");
		constructor4 b1=new constructor4();
		System.out.println(b1.i);
		
		System.out.println("============================");
		
		constructor4 b2=new constructor4();
		System.out.println(b2.i);
		
		

	}

}
