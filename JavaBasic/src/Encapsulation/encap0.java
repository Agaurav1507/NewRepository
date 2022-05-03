package Encapsulation;

class demo0 {
	private int id=1000;
	private double salary=50000;
	
	//getter method
	public int getid() {
		return id;
	}
	
	public double getsalary() {
		return salary;
	}
	
	//setter method
	public void setid(int a) {
		id=a;
		System.out.println(a);
	}
	
	public void setsalary(double d) {
		salary=d;
		System.out.println(d);
	}
}



public class encap0 {

	public static void main(String[] args) {
          
		   demo0 d0=new demo0();
		   System.out.println(d0.getid());
		   System.out.println(d0.getsalary());
		   d0.setid(2000);
		   d0.setsalary(25000);
		  
		 
	}

}
