package Thiskeyword;

public class thiskeyword6 {
	
	int variable=51;
	
	void method(int variable) {
		
		System.out.println(variable);
		variable=10;
		System.out.println(variable);
		System.out.println(this.variable);
		this.variable=variable;
		System.out.println(variable);
		System.out.println(this.variable);
		
		
 }
     
	void method() {
		
		int variable=40;
		System.out.println(this.variable);
		System.out.println(variable);
		this.variable=variable;
		System.out.println(variable);
		System.out.println(this.variable);
	}
	
	
	
	
	public static void main(String[] args) {
		thiskeyword6 n=new thiskeyword6();
		n.method(20);
		n.method();
		System.out.println(n.variable);

	}

}
