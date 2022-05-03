
 
class constroverloading {
	
	constroverloading(int a){
		System.out.println(a);
	}
	
	void disp1(int a) {
		System.out.println("methd 1");
	}
	
	constroverloading(double d,int b){
		this(55);
		double r=d*b;
		System.out.println(r);
	}
	
	void disp1() {
		System.out.println("method 2 disp");
	}
	
	constroverloading(int b,float f){
		System.out.println("third method");
	}
	
	void disp1(float z) {
		System.out.println("third method");
	}
	
}




public class constructoroverloading {

	public static void main(String[] args) {
          
		constroverloading c3=new constroverloading(544,55.25f);
	}

}
