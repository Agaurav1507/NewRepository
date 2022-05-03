package Thiskeyword;

public class thiskeyword7 {
	
	int rollno;
	float fee;
	
	thiskeyword7(int rollno,float fee){
		
		System.out.println(rollno);
		System.out.println(fee);
		System.out.println(this.rollno);
		System.out.println(this.fee);
		
		this.rollno=rollno;
		this.fee=fee;
		System.out.println(this.rollno);
		System.out.println(this.fee);
	}
	
	void display() {
		
		System.out.println(rollno + "," +fee);
	}
	
	
	
	public static void main(String[] args) { 
		thiskeyword7 s1=new thiskeyword7(101,5000f);
		s1.display();
		thiskeyword7 s2=new thiskeyword7(102,6000f);
		s2.display();

	}

}
