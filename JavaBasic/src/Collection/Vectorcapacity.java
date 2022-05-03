package Collection;

import java.util.Vector;

public class Vectorcapacity {

	public static void main(String[] args) {
       
		Vector<String> v=new Vector<String>();
		
		System.out.println(v.capacity()); //to check capacity(bydefault 10)
		System.out.println(v.size()); //size is 0 becozz no element added
		v.setSize(2);
		System.out.println(v.size());
		v.addElement("gaurav");
		v.addElement("deepali");
		System.out.println(v);
	}

}
