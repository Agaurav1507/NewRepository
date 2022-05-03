package operators;

public class unaryop1 {

	public static void main(String[] args) {
		
		int a=47;
		int b=a++;
		
		System.out.println(a);//48
		System.out.println(b);//47
		
		int x=a;
		int y;
		System.out.println(x);//48
		y=++x;
		
		System.out.println(x);//49
		System.out.println(y);//49
		
		int p= -15, q=25;
		int result=p++ + --q;
		
		System.out.println(result);//9
		System.out.println(p);//-14
		System.out.println(q);//24
		
		int result1=++p + ++q;
		System.out.println(result1);//12
		System.out.println(p);//-13
		System.out.println(q);//25

	}

}
