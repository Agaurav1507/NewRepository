package operators;

public class unaryop2 {

	public static void main(String[] args) {
		
		int a=0;
		int b= a++ + ++a + ++a + a;//0 + 2 + 3 + 3 
		
		System.out.println(a);//3
		System.out.println(b);//8
		
		a=-5;
		b= a-- + --a + --a + a;//-5 + -7 + -8 + -8
		
		System.out.println(a);//-8
		System.out.println(b);//-28
		
		a=21;
		b= --a + --a + --a + a + ++a + a++;//20 + 19 +18 + 18 + 19 + 19
		
		System.out.println(a);//20
		System.out.println(b);
		
		a=-2;
		b= a-- + a + ++a + a++ + ++a;//-2 + -3 + -2 + -2 + 0
		
		System.out.println(a);//0
		System.out.println(b);//-9

	}

}
