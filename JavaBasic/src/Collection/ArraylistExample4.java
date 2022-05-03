package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistExample4 {

	public static void main(String[] args) {
        
		//Generic:with the help of generic we can force collection to store similar type of data
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(10);
		l1.add(63);
		l1.add(87);
		l1.add(45);
		l1.add(12);
		
		System.out.println(l1.size());
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
	}

}
