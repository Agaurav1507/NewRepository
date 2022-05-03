package Practice;

public class primenumber {
    
	void display() {
		
		int num=13;
		int i=1;
		int count=0;
		
		
		for(i=1;i<=num;i++) {
			if(num%i==0) {
			   count++;
			}
			 
			
		}
		if(count==2) {
			
			System.out.println("num is prime");
		}
		else {
			System.out.println("not a prime");
		}
		
		
	}
	
	
	
	
	
	   public static void main(String[] args) {
		   primenumber b=new primenumber();
		   b.display();
	}

}
