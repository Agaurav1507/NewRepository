package Interface;

interface drawable23 {
	void draw();
	default void msg() {
		System.out.println("default method");
	}
	
	static int cube(int x) {
		return x*x*x;
	}
   
}

class rectangle23 implements drawable23 {
	public void draw() {
		System.out.println("draw rectngle");
	}
	
	
}



public class interface8 {

	public static void main(String[] args) {
         
		drawable23 d=new rectangle23();
		d.draw();
		d.msg();
		System.out.println("*********************");
		System.out.println(drawable23.cube(24));
	}

}
