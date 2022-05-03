package Assignment1;

public class checkforprime {
	
	
	static void display() {
		
		
		int num=5;
		int count=0;
		
		
		for(int i=1;i<=5;i++) {
			
			if(num%i==0) {
			 count++;
			}
			
		}
		
		
		if(count==2) {
			System.out.println("the number is a prime number");
		}
		
		else {
			System.out.println("the number is not a prime number ");
			
		}
		
		}
	
	
        public static void main(String[] args) {
        	checkforprime.display();
		

	}

}
