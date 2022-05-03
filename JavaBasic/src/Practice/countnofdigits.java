package Practice;

public class countnofdigits {
	
	static void display() {
		
		int num=123456789;
		
		int count=0;
		
		
		
		
		for(int i=1;i<=num;i++) {
			num=num%10;
			if(num!=0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	    public static void main(String[] args) {
	    	countnofdigits.display();
		

	}

}
