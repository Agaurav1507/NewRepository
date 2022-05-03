package Assignment1;

public class leapyear {

	
	     void display(int year) {
	    	 
	    	 int i=year;
	    	 
	    	 if((i%400==0) || (i%4==0 && i%100!=0)) {
	    		 
	    		 System.out.println("Its a leap year");
	    		 
	    		
	    	 }
	    	 else {
	    		 System.out.println("It is not a leap year ");
	    		 
	    		 
	    	 }
	    	 
	    	 
	    	 
	     }
	
	
	
	      public static void main(String[] args) {
	    	  
	    	  leapyear gaurav=new leapyear();
	    	  
	    	  gaurav.display(2024);
		

	}

}
