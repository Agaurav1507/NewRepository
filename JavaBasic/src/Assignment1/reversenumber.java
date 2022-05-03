package Assignment1;

public class reversenumber {

	static void reverse() {
		
		int n=12345;
		int sum=0;
		
		
		for(  ;n!=0;  ) {
			
		
	        int r=n%10;
			sum=sum*10+r;
			n=n/10;
			
	}
		
		System.out.println(sum);
		
		
		
		
		
	}
	
	
	    public static void main(String[] args) {
	    	
	    	reversenumber.reverse();
	

	}

}
