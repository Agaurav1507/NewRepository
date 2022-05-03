package Methods;

public class nonstaticmethod1 {

	public double display(float f,int l) {
		double d=f/l;
		return d;
	}
	
	public void display1(char Z) {
		int a=Z;
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
           
		nonstaticmethod1 n=new nonstaticmethod1();
		System.out.println(n.display(45.245f,10));
		
		n.display1('Z');
		
		
	}

}
