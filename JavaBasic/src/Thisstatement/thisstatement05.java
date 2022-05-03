package Thisstatement;

public class thisstatement05 {
        
	  int rollno;
	  float fee;
	  
	  thisstatement05(int rollno){
		  
		  this.rollno=rollno;
	  }
	  
	  thisstatement05(int rollno,float fee){
		  
		  this.fee=fee;
	  }
	  
	  void display() {
		  
		  System.out.println(rollno + ',' + fee);
	  }
	
	
	
	
	   public static void main(String[] args) {
		
		   thisstatement05 s1=new thisstatement05(111);
		   thisstatement05 s2=new thisstatement05(112,6000f);
		  
		   s1.display();
		   s2.display();

	}

}
