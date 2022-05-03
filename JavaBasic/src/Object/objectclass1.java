package Object;

public class objectclass1 extends demo {
       
	static int lastroll=100;
	int rollno;
	
	//constructor
	objectclass1(){
		rollno=lastroll;
		lastroll++;
	}
	public static void main(String[] args) {
          
		objectclass1 s1=new objectclass1();
		System.out.println(s1);  //string representation
		
		System.out.println(s1.hashCode());
		
		demo d1=new demo();
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
		
		
	}

}
