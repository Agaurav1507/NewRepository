package Assignment1;

public class checkforpalindrome {

	
        static void display() {
		
        	
		int n=121;
		int temp=n;
		int sum=0;
		
		for(  ;temp>0;  ) {
			
		
	        int rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
			
		}
		
		System.out.println(sum);
		
		if(sum==n) {
			System.out.println("number is palindrome");
		}
		
		else {
			System.out.println("number is not palindrome");
		}
		
		}
	
         public static void main(String[] args) {
        	 checkforpalindrome.display();
	    	

	}

}
