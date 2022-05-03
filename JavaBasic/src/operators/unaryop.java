package operators;

public class unaryop {

	public static void main(String[] args) {
		
		int a=10;
		int b=a;
		
		System.out.println(a);//10
		System.out.println(b);//10
		
		int k=++a;
		
		System.out.println(k);//11
		System.out.println(a);//11
		
		int j=k++;
		System.out.println(k);//12
		System.out.println(j);//11
		
	    int r=21;
	    System.out.println(r++);//21
	    System.out.println(r);//22
	    System.out.println(++r);//23
	    System.out.println(r);//23
	    
	    int x=105;
	    System.out.println(--x);//104
	    System.out.println(x);//104
	    System.out.println(x--);//104
	    System.out.println(x);//103
		

	}

}
