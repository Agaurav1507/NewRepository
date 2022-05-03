package Object;

public class objectclass3 {

	static int lastroll=100;
	int rollno;
	
	objectclass3(){
		rollno=lastroll;
		lastroll++;
	}
	
	public String tostring() {
		return "basiccorejava";
	}
	
	public String hashcode() {
		return "overrided hashcode";
	}
	
	
	public static void main(String[] args) {
	
            objectclass3 s=new objectclass3();
            System.out.println(s);
            
            System.out.println(s.tostring());  //tostring is overrided
            System.out.println(s.hashcode());  //hashcode is overrided
	}
	
	

}
