package Conditions;

public class ifnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=19;
		int wt=50;
				
		if(age>18) {
		if(wt<50)   {
			
	    System.out.println("you are eligib to donate blood");
		}
	    
	    else {
	    	System.out.println("your are not eligible,your age is below 18");
	    }
	    
		} else {
	    	System.out.println("you are not eligible ,your wt is below 50");
	    	
	    }
			
		}
			
			
		
	

	}


