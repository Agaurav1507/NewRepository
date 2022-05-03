package Methods;

public class methodoverloading {

	public static double disp(double f) {
		return f;
	}
	
	public double disp(int i,double d) {
		double r=i+d;
		return r;
	}
	
	public static void disp(int x,int l) {
		double g=x-l;
		System.out.println(g);
	}
	
	public void disp(float f,int b,long d) {
		double r=f+b-d;
		double t=r*d;
		System.out.println(r);
		System.out.println(t);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(methodoverloading.disp(5.5689));
		methodoverloading.disp(5454, 500);
		
		methodoverloading m=new methodoverloading();
		System.out.println(m.disp(5454, 87841212.699));
		m.disp(8512.14f, 45151, 11215);

		
	}

}
