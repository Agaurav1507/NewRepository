package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
        
		HashMap<Integer , String> map=new HashMap<Integer , String>(); //creating hashmap
		
		//to add elements here is put() method
		map.put(1, "mango");
		map.put(2, "banana");
		map.put(3, "apple");
		map.put(1, "mango");  //trying duplicate key(where duplicate is not allowed but dup value is allowed)
		System.out.println(map);
		
		//iterating hashmap
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue());
		}
		
		HashMap<Integer , String> map1=new HashMap<Integer , String>();
		
		map1.put(100, "amit");
		map1.put(101, "rahul");
		map1.put(102, "vijay");
	    System.out.println(map1);
	    
	    for(Map.Entry m : map1.entrySet()) {
	    	System.out.println(m.getValue());
	    }
	    
	    map1.putIfAbsent(103, "gaurav"); //put the key nd value if not present
	    System.out.println(map1);
	    
	    for(Map.Entry m : map1.entrySet()) {
	    	System.out.println(m.getValue());
	    }
	    
	    HashMap<Integer , String> map2=new HashMap<Integer , String>();
	    
	    map2.put(104, "ravi");
	    map2.putAll(map1);
	    System.out.println(map2);
	    
	    for(Map.Entry m : map2.entrySet()) {
	    	System.out.println(m.getValue());
	    }
	    
	    //initial elements of map2
	    System.out.println(map2);
	    
	    //key based removal
	    map2.remove(104);
	    System.out.println(map2);
	    
	    //key value pair based removal
	    map2.remove(103, "gaurav");
	    System.out.println(map2);
	    
	    
	    //replace 
	    map2.replace(102, "gaurav");
	    System.out.println(map2);
	    for(Map.Entry m : map2.entrySet()) {
	    	System.out.println(m.getValue());
	    }
	    
	    map2.replace(100, "amit", "gaurav");
	    System.out.println(map2);
	    for(Map.Entry m : map2.entrySet()) {
	    	System.out.println(m.getValue());
	    }
	    
	}

}
