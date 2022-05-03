package Collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
        
		Vector<Integer> v=new Vector<Integer>();
		
		//adding elements using add method of list
		
		v.add(54);
		v.add(78);
		v.add(789);
		System.out.println(v);
		
		//adding elements using addelement method of vector
		
		v.addElement(54);
		v.addElement(789);
		v.addElement(9896);
		
		System.out.println(v);
		
		//print elements using for each loop
		
		for(int i:v) {
			System.out.println(i);
		}
	}

}
 