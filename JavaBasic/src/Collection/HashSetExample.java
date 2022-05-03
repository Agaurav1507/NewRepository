package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
         
		//creating hashset and adding elements
		
		HashSet <String> set=new HashSet<String>();
		
		//add elements in hashset,if u try to add duplicate elements it will neglect duplicate 
		//elements instead of throwing an error
		
		set.add("deepali");
		set.add("gaurav");
		set.add("tush");
		set.add("nimo");
		set.add("deepali");
		System.out.println(set);
		
		//traverse elements
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//to remove elements
		System.out.println(set.remove("tush"));
		System.out.println(set);
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("charul");
		set1.add("vishal");
		System.out.println(set1);
		
		//add set1 elements in set
		set.addAll(set1);
		System.out.println(set);
		
		//removing all the elements of set1 from set
		
	    set.removeAll(set1);
	    System.out.println(set);
	    
	    //remove eelements on the basis of specified conditions
	    
	    set.removeIf(str ->str.contains("nimo"));
	    System.out.println(set);
	    
	    //removing all the elements available in the set
	    
	    set.clear();
	    System.out.println(set);
	    System.out.println(set.size());
	   
	}

}
