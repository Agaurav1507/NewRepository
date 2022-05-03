package Practice;

public class armstrongnum {
	
	static boolean test(int num) {
		int temp=num;
		int ct=0;
		int rem=0;
		double sum=0;
		
		while(temp>0) {
			temp=temp/10;
			ct++;
		}
		
		temp=num;
		while(temp>0) {
		rem=temp%10;
		sum=sum+Math.pow(rem, ct);
		temp=temp/10;
		
		}
		
        if(sum==num) {
		   return true;
	   }
	   else {
		   return false;
	   }
	
	}   
	
	
	public static void main(String[] args) {
		  System.out.println(armstrongnum.test(123));

	}

}
