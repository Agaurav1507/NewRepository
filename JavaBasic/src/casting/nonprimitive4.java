package casting;

class jd {
	void printme1() {
		System.out.println("jd print method");
	}
	
	void disp() {
		System.out.println("jd display method");
	}
}

class java extends jd {
	void printme2() {
		System.out.println("java print method");
	}
	
	void disp() {
		System.out.println("java display method");
	}
}

class android extends java {
	void printme3() {
		System.out.println("android print method");
	}
	
	void disp() {
		System.out.println("android disp method");
	}
}



public class nonprimitive4 {

	public static void main(String[] args) {
           
		jd j1=new android();
		j1.disp();
		j1.printme1();
		System.out.println("**********************");
		
		java j2=(java) j1;
		j2.disp();
		j2.printme1();
		j2.printme2();
		
		System.out.println("***********************");
		
		android a=(android) j1;
		a.printme1();
		a.printme2();
		a.printme3();
		a.disp();
		
		
		
	}

}
