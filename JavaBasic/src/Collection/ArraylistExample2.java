package Collection;

import java.util.ArrayList;

public class ArraylistExample2 {

	public static void main(String[] args) {
        
		ArrayList<Integer> l1=new ArrayList<Integer>(); //Generic
		l1.add(12);
		System.out.println(l1);
		ArrayList<Boolean> l2=new ArrayList<Boolean>();//Generic
		l2.add(true);
		System.out.println(l2);
		ArrayList<Character> l3=new ArrayList<Character>();//Generic
		l3.add('D');
		System.out.println(l3);
		
		ArrayList<String> l4=new ArrayList<String>(); //Generic
		l4.add("deeps luv");
		l4.add("gau");
		l4.add("charul");
		l4.add("papa");
		System.out.println(l4);
		
		//to remove specific element from arralist
		
		System.out.println(l4.remove("deeps luv")); //using string
		System.out.println(l4);
		System.out.println(l4.remove(1)); //using index
		System.out.println(l4);
		
		System.out.println("****************************");
		
		//creating another arraylist
		
		ArrayList<String> l5=new ArrayList<String>();
		l5.add("family");
		l5.add("vishal");
		
		//adding new elements to arraylist
		
		l4.addAll(l5);
		System.out.println(l4);
		
		//remove all new elements from arraylist
		
		l4.removeAll(l5);
		System.out.println(l4);
		
		//removing elelments on the basis of specified condition
		
		l4.removeIf(str ->str.contains("gau")); //here we are using lambda expression
		System.out.println(l4);
		
		//to remove all the elements in the list
		
		l4.clear();
		System.out.println(l4);
		System.out.println(l4.isEmpty());
		
		
	}

}
