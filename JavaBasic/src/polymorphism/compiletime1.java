package polymorphism;

public class compiletime1 {
	
	static void sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	static void sum(int a,int b,int e) {
		int c=a+b-e;
		System.out.println(c);
	}

	public static void main(String[] args) {
           
		compiletime1.sum(500, 100);
		compiletime1.sum(500, 100, 300);
	}

}
