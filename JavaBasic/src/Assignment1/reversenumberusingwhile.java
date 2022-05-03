package Assignment1;

public class reversenumberusingwhile {
	
	
	static void display() {
		
	int num=12345;
	int rev=0;
	
	while(num!=0) {
		
		rev=rev*10 + num%10;
		num=num/10;
	}
		
	System.out.println(rev);	
		
		
		
		
		
	}
	
	
	    public static void main(String[] args) {
	    	
	    	reversenumberusingwhile.display();

	}

}
