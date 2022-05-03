package String;

public class stringclass2 {

	public static void main(String[] args) {
         
		 String s1="pune";
		 String temp="";
		 //to print character 1 by 1
		 for(int i=0;i<s1.length();i++) {
			 System.out.println(s1.charAt(i));
		 }
		 
		 for(int i=s1.length()-1;i>=0;i--) {
			 temp=temp+s1.charAt(i);
		 }
		 System.out.println(s1);
		 System.out.println(temp);
		 
		
		 
		
	     }
	     
	     static String reverseString(String s1) {
	    	 String temp="";
	    	 for(int i=s1.length()-1;i>=0;i--) {
	    		 temp=temp+s1.charAt(i);
	    	 }
	    	 return temp;
	     }
	     
	     static void palinString(String s1) {
	    	 String s2=s1;
	    	 String temp="";
	    	 for(int i=s1.length()-1;i>=0;i--) {
	    		 temp=temp+s1.charAt(i);
	    	 }
	    	 if(temp.equals(s1)) {
	    		 System.out.println("given string is palindrome "+ s1);
	    		 
	         }
	    	 else {
	    		 System.out.println("given string is not palindrome "+ s1);
	    	 }
	    	 
	     }
	     
	  

}
