package Thiskeyword;

public class thiskeyword2 {
	
	void m() {
	System.out.println("hello m");
}
	
	void n() {
		
		System.out.println("hello n");
		this.m();
		
		
	}
}
class thiskeyword3{	
	
	void m1() {
		System.out.println("inside m1");
	}
	
	void m2() {
		System.out.println("inside m2");
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		thiskeyword3 v=new thiskeyword3();
		 v.m2();
		 
		 thiskeyword2 v2=new thiskeyword2();
		 v2.n();
		 
		 
		 

	}

}
