package Thiskeyword;

public class thiskeyword4 {
	
	void m() {
		
		System.out.println(this);
	}
	
	
	
	
	

	public static void main(String[] args) {
		thiskeyword4 A=new thiskeyword4();
		System.out.println(A);
		A.m();

	}

}
