package Assignment1;

public class checkforpalindromeusingwhile {
	
	static void display() {
		
		int num=121;
		int temp=num;
		int rev=0;
		int rem;
		
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(num==rev) {
			System.out.println("number is palindrome");
		}
		
		else {
			System.out.println("number is not a palindrome");
		}
		
	}
	
	
	public static void main(String[] args) {
		       
		checkforpalindromeusingwhile.display();
	}

}
