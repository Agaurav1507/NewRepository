package Object;

class print  {
	int a=10;
	public int hashcode() {
		return 101;
	}
	
	public String tostring() {
		return "i am print class tostring";
	}
	
	public boolean equals(Object obj) {
		print p=(print) obj;
		
		return(this.a==p.a);
	}
}

public class objectclass4 {
	
	static int lastroll=100;
	int rollno;
	objectclass4(){
		rollno=lastroll;
		lastroll++;
	}

	public static void main(String[] args) {
             
		Object obj;
		
		objectclass4 s=new objectclass4();
		System.out.println(s);
		
		System.out.println(s.hashCode());
		
		objectclass4 s1=new objectclass4();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(s.equals(s1));
		
		print p1=new print();
		System.out.println(p1);
		System.out.println(p1.hashCode());
		
		print p2=new print();
		
		System.out.println(p1.equals(p2));
	}

}
