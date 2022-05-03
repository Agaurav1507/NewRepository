package Assignment1;

public class factorsofnegativeinteger {
	
	
	static void display() {
		
		int num= -6;
		int i;
		
		for(i=-1;i>=num;i--) {
			
			if(num % i==0) {
				
				System.out.println(i);
			}
			
			
		}
				
		
		
		}
	
	
	
	    public static void main(String[] args) {
	    	factorsofnegativeinteger.display();

	}

}
