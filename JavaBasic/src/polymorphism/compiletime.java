package polymorphism;

public class compiletime {

	static void display() {
		System.out.println("1st method");
	}
	
	static double display(int num) {
		return num;
	}
	
	static char display(char c) {
		return c;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(compiletime.display(500));
		System.out.println(compiletime.display('x'));
		compiletime.display();

	}

}
