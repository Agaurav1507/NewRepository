package Encapsulation;

class encapdemo{
	private int ssn;
	private String empname;
	private double empage;
	
	//getter
	public int getssn() {
		return ssn;
	}
	
	public String getempname() {
		return empname;
	}
	
	public double getempage() {
		return empage;
	
	}
	// setter
	public void setssn(int a) {
		ssn=a;
		System.out.println(a);
	}
	
	public void setempname(String newvalue) {
		empname=newvalue;
		System.out.println(newvalue);
	}
	
	public void setempage(double d) {
		empage=d;
		System.out.println(d);
	}
	
}


public class encap1 {

	public static void main(String[] args) {
          
		encapdemo e=new encapdemo();
		System.out.println(e.getempname());
		System.out.println(e.getempage());
		System.out.println(e.getssn());
		System.out.println("******************************");
		e.setempage(45000);
		e.setempname("gaurav");
		e.setssn(112233);
	}

}
