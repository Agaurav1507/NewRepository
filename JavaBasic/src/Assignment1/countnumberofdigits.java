package Assignment1;

public class countnumberofdigits {
	
	static void count() {
		
	  int i=1;
	  double num=54548121;
	  int count=0;
	  
	  
	  for(i=1;i<=num;i++) {
		  num=num/10;
		  
		  if(num!=0) {
		 ++count;
			  
		  }	  System.out.println("Number of digits are= " + count);
			  
		 
		  
		  }
	 
	      }
		  
	
		  
		  
		  
	  public static void main(String[] args) {
		
		 countnumberofdigits.count();

	}

}
