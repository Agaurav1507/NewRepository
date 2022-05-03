package casting;

class parent100 {
	void myhome() {
		System.out.println("parent home");
	}
}

class child100 extends parent100   {
	void mycar() {
		System.out.println("child car");
	}
}



public class nonprimitive1 {

	public static void main(String[] args) {
           
		child100 c=new child100();
		c.mycar();
		c.myhome();
		
		System.out.println("********************");
		
		//implicit upcasting
		parent100 p=c;    //or parent100 p=new child100();
		p.myhome();
		
		System.out.println("********************");
		
		parent100 p2=new parent100();
		p2.myhome();
	}

}
