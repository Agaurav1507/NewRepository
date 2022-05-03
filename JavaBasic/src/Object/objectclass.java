package Object;

class demo {
	void display() {
		System.out.println("i m display");
	}
}


public class objectclass extends demo {
	
	static int last_roll=100;
	int roll_no;
	
	objectclass(){
		roll_no=last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
         
		 objectclass s=new objectclass();
		 System.out.println(s); //or system.out.println(s.tostring());-->string representation of an object
		 
		 //representation of an object
		 
		 demo d=new demo();
		 System.out.println(d);
		 
		 demo d2=new demo();
		 System.out.println(d2);
	}

}
