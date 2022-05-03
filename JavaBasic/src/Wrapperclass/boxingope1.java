package Wrapperclass;

public class boxingope1 {

	public static void main(String[] args) {
         
		char c1='a';
		
		Character c=new Character(c1); //explicit boxing
		System.out.println(c);
		
	
		
		Character c2=new Character('z'); //explicit boxing
		System.out.println(c2);
		
		Character c3='v'; //autoboxing 
		System.out.println(c3);
		
		char t=c3.charValue(); //explicit unboxing
		System.out.println(t);
		
		System.out.println(c2==c3);
		System.out.println(c3.equals(c1));
		
		Boolean b=true; //autoboxing
		System.out.println(b);
		
		Boolean b1=new Boolean(b);
		System.out.println(b1);
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
		
		boolean n=b1.booleanValue();
		System.out.println(n);
		
		
	}

}
