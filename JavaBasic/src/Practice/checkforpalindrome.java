package Practice;

public class checkforpalindrome {
	
	static void display(int num) {
	
	int temp=num;
	int rev=0;
	
	while(temp!=0) {
		
		int rem=temp%10;
		    rev=rev*10+rem;
		    temp=temp/10;
	}
	
	if(rev==num) {
		System.out.println("number is palindrome");
	}
	else {
		System.out.println("number is not palindrome");
	}
	
	}
	
	
	public static void main(String[] args) {
		
		checkforpalindrome.display(122);
	}

}
