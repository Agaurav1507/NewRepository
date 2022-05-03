package casting;

class A {
	void test1() {
		System.out.println("running test1");
	}
}

class B extends A {
	void test2() {
		System.out.println("running test2");
	}
}

class C extends B {
	void test3() {
		System.out.println("running test3");
	}
}


public class nonprimitive {

	public static void main(String[] args) {
          
		C c=new C();
		c.test1();
		c.test2();
		c.test3();
		System.out.println("*********************");
		
		// implicit upcasting
		
		B b=c;
		b.test1();
		b.test2();
		
		// explicit upcasting
		
		A a=(A) b;
		a.test1();
		
		System.out.println("*******************");
		
		A a1=(A) c;
		a1.test1();
		
		
		
		
	}

}
