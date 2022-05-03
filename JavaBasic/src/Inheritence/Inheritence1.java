package Inheritence;


	
class A {
	static int a=10;
	int b=20;
	double c=13.45;
	
	
}

class b extends A {
	static int x=30;
	int y=40;
	double z=53.45;
}

class c1 extends b{
	static int p=50;
	int q=60;
	double r=66.45;
}

public class Inheritence1 {


	public static void main(String[] args) {
		c1 gau=new c1();
		System.out.println(gau.b);
		System.out.println(gau.c);
		System.out.println(gau.y);
		System.out.println(gau.z);
		System.out.println(gau.q);
		System.out.println(gau.r);
}

}
