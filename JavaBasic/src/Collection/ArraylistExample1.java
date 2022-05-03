package Collection;

import java.util.ArrayList;

public class ArraylistExample1 {

	public static void main(String[] args) {
         
		ArrayList al=new ArrayList();
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		//adding elements 
		al.add("gaurav");
		al.add("deepali");
		al.add("tush");
		al.add("nimo");
		System.out.println(al);
		
		//adding element at specific position
		
		al.add(1, "change");
		System.out.println(al);
		
		
		ArrayList al2=new ArrayList();
		
		al2.add("charul");
		al2.add("papa");
		
		//adding 2nd list elements to 1st list
		System.out.println(al);
		al.addAll(al2);
		System.out.println(al);
		
		//adding 2nd list elements to 1st list at specific positon
		System.out.println(al);
		al.addAll(1, al2);
		System.out.println(al);
		
	}

}
