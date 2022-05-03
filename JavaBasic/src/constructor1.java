
public class constructor1 {
	
	int roll;
	int salary;
	constructor1(int r,int s){
		roll=r;
		salary=s;
		System.out.println(r +  s);
		
	}
	
	 void display() {
		 System.out.println(roll + "=" + salary);
	 }
	
	
	
	 public static void main(String[] args) {
		 constructor1 c=new constructor1(50,50000);
		 c.display();
		 
		      
		

	}

}
