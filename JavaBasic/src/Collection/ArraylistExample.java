package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
             
		ArrayList list=new ArrayList(); //creating arraylist
		
		list.add("mango"); //auto-upcasting from string to object class object
		list.add(1234); // first boxing to integer class object--->upcasting to object class
		list.add("banana");
		list.add('c'); //first boxing to character class object--->upcasting to object class
		list.add(15.26); // first boxing to double class object--->upcasting to object class
		list.add(true); //first boxing to boolean class object--->upcasting to object class
		list.add(new ArraylistExample()); //ArraylistExample class object will be upcasted
		                                  //to object class object
		
		//printing the arraylist object
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("traversing through for loop");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("traversing through for ech loop");
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		//accessing the element
		
		System.out.println(list.get(1)); //it will retunrn 2nfd element
		
		//change/update existing object
		
		list.set(1, "apple");
		System.out.println(list.size());
		System.out.println(list);
		
		
		
		Collections.sort(list); //bydefault it will sort the passed collection elements in
		//ascending order and store it in same collection
		System.out.println(list.size());
		System.out.println(list);
		
		
		
		
		System.out.println("traversing list through for each() method:");
		//The for each method is a new feature introduced in java 8.
		list.forEach(a -> {  //here we are using lambda expression
			System.out.println(a);
			
		});
		
		
		System.out.println("traversing list through iterator interface");
		Iterator itr=list.iterator();
		
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		while(itr.hasNext()) {
			
		}
		System.out.println(itr.hasNext());
	}

}
