package Wrapperclass;

public class wrapperclass {

	public static void main(String[] args) {
         
		int i=20;
		//converting int to Integer
		Integer k=new Integer(i); //converting explicitly(boxing)
		Integer m=new Integer(20); //converting explicitly(boxing)
		Integer n=i; //autoboxing or converting explicitely(boxing)
		
		System.out.println(i +"=" + k +"=" + m+ "=" +n);
		System.out.println("unboxing of boxed object");
		//converting Integer to int
		
		Integer a1=new Integer(3);
		int i1=a1.intValue(); //converting Integer to int explicitly
		System.out.println(a1 + "=" + i1);
		
		System.out.println(a1==i1);
		System.out.println(a1.equals(i1));
		
	}

}
