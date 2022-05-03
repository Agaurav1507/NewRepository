package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample3 {

	public static void main(String[] args) {
           
		ArrayList<String> a1=new ArrayList<String>();
		
		System.out.println(a1.isEmpty());
		a1.add("Deeps");
		a1.add("Gau");
		a1.add("tush");
		a1.add("frnds");
		
		ArrayList<String> a2=new ArrayList<String>();
		
		a2.add("papa");
		a2.add("mummy");
		a2.add("sangamner");
		
		System.out.println(a1);
        System.out.println(a2);
        
        a2.retainAll(a1);
        System.out.println(a2);
        System.out.println("iterating the elemets after retaining the elements of a2");
        
        Iterator itr=a1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	
        }
        
        System.out.println("******************************************************");
        
        ArrayList l1=new ArrayList();
        l1.add("pune");
        l1.add("pune");
        l1.add(123);
        l1.add("pune");
        l1.add(null);
        System.out.println(l1);
        
	}

}
