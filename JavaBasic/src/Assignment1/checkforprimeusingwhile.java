package Assignment1;

public class checkforprimeusingwhile {

	static void display() {
		
		int num=11;
		int i=1;
		int count=0;
		
		
		while(i<=num) {
			
			
			if(num%i==0) {
			    
				count++;
			}
			
			i++;
			
	       }
		
			if(count==2) {

				
			System.out.println("the number is prime");
				
			}
			
			else {
			System.out.println("the number is not prime");
			}
				
				
			}
			
			
			
		 public static void main(String[] args) {
        	   checkforprimeusingwhile.display();
		

	}

}
