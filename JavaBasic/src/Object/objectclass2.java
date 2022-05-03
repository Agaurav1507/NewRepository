package Object;

public class objectclass2 {
	
	static int lastroll=100;
	int rollno;
	
	objectclass2(){
		
		rollno=lastroll;
		lastroll++;
	}
	
	public int hashcode() {
		return rollno;
	}

	public static void main(String[] args) {
       
		objectclass2 s2= new objectclass2();
		System.out.println(s2);
		
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
	}

}
