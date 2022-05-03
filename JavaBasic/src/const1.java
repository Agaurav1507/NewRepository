

class constructor10 {
	constructor10(int num1) {

		System.out.println(num1);
	}
	
	public static void disp() {
		System.out.println("disp contr1 method");
	}
}

class constructor20 {
	constructor20(double age){
	    age=50;
	    System.out.println(age);
	}
	
	void disp() {
		System.out.println("disp contr2 method");
	}
	
}


public class const1 {

	public static void main(String[] args) {
		
		constructor10 c1=new constructor10(50);
		c1.disp();
		
		constructor20 c2=new constructor20(50.54);
		c2.disp();

	}

}
