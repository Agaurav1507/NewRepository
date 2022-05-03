package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String[] args) {
          
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("deepali");
		list.add("gaurav");
		list.add("vishal");
		list.add("gaurav");
		System.out.println(list);
		
		HashSet<String> set=new HashSet(list);
		
		set.add("mummy");
		set.add("papa");
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**************************************");
		
		set.forEach(s1 ->{
		System.out.println(s1);
	});
		
		System.out.println("***************************************");
		
		set.removeIf(s1 ->s1.contains("vishal"));
		System.out.println(set);

	}
}
