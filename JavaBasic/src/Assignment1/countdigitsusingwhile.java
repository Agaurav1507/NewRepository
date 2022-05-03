package Assignment1;

public class countdigitsusingwhile {
	
	
	static void display() {
		
		
		double num=543212125;
		int i=1;
		while(i<num) {
			
			num=num/10;
			i++;
			
			
		}
		
		System.out.println("number of digits are = " + i);
		
		
		
		}
	
	
           public static void main(String[] args) {
        	   countdigitsusingwhile.display();
        	   
		
	}

}
