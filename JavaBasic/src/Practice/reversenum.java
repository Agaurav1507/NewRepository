package Practice;

public class reversenum {

	public static void main(String[] args) {
		
		int num=12345;
		
		int rev=0;
		
		
		
		for( int i=1;num>0;i++) {
			
			int r=num%10;
			rev=rev*10 + r;
			num=num/10;
			
	}
		System.out.println(rev);
		
		
		
	}

}
