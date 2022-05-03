package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
          //creating and adding elements
		
		TreeSet<String> t=new TreeSet<String>();
		System.out.println(t);
		
		t.add("Gaurav");
		t.add("Deepali");
		t.add("nimo");
		t.add("tush");
		t.add("Gaurav");
		System.out.println(t);
		
		//traversing elements using for each loop
		for(String s:t) {
			System.out.println(s);
		}
		
		//traversing elements using iterator
		
		Iterator itr=t.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("traversing elements using iteraor in descending order");
		
		Iterator itr1=t.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		TreeSet<Integer> t1=new TreeSet<Integer>();
		
		t1.add(545);
		t1.add(753);
		t1.add(34);
		t1.add(485);
		t1.add(651);
		t1.add(654);
		t1.add(323);
		
		System.out.println(t1);
		System.out.println(t1.pollFirst());  //removes top most element
		System.out.println(t1);
		System.out.println(t1.pollLast()); //removes last element
		System.out.println(t1);
		
		
		TreeSet<String> t2=new TreeSet<String>();
		
		t2.add("A");
		t2.add("m");
		t2.add("e");
		t2.add("f");
		t2.add("d");
		t2.add("c");
		t2.add("b");
		
		System.out.println(t2);
		
		System.out.println(t2.descendingSet());  //high to low
		System.out.println(t2.headSet("f")); //above elements
		System.out.println(t2.headSet("d", true)); //including d
		
		System.out.println(t2.subSet("A", "d"));
		System.out.println(t2.subSet("A", true, "d", false));
		
		System.out.println(t2.tailSet("f"));
		System.out.println(t2.tailSet("f", true));
		
		
		
		
		
	}

}
