package Exceptionhandling;

public class Exception10 {

	public static void main(String[] args) throws InterruptedException,UserDefinedException {
        
		System.out.println("program starts");
		
		setsleep(5000);
		checknumber(0);
		System.out.println("hello geeks");
	}
	    static void setsleep(long time) throws InterruptedException {
	    	Thread.sleep(time);
	    }
	    
	    static void checknumber(int num) throws UserDefinedException {
	    	if(num<0) {
	    		throw new UserDefinedException("number less than zero");
	    	}
	    	else {
	    		System.out.println("num is :"+num);
	    	}
	    	
	}

}
