package Thiskeyword;

public class thiskeyword5 {
	
	int variable=5;
	int age=10;
	
	 thiskeyword5(int id){
		 System.out.println("hello");
	
	 }
	

	
	void method(int variable) {
		
		System.out.println(variable);
		System.out.println(this.variable);
		this.variable=variable;
		System.out.println(variable);
		System.out.println(this.variable);
	}
	
	void method() {
		int variable=40;
		System.out.println(variable);
	}
	
	
	
	
	
	   public static void main(String[] args) {
		
		   thiskeyword5 B=new thiskeyword5(25);
		   B.method(20);
		   B.method();
		   System.out.println(B.variable);
		   thiskeyword5 B2=new thiskeyword5(35);
		   System.out.println(B2.variable);

	}

}
