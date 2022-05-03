package Thiskeyword;

public class thiskeyword {
	
	int rollno;
    float fee;
    
    thiskeyword(int rollno,float fee){
    	rollno=rollno;
    	fee=fee;
   
    	
    }
	
	void display() {
		
		System.out.println(rollno + "," +fee);
	}


	public static void main(String[] args) {
		thiskeyword t1=new thiskeyword(101,5000f);
		thiskeyword t2=new thiskeyword(102,6000f);
		
		t1.display();
		t2.display();
	       

	}

}
