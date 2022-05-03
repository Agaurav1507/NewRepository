package Inheritence;

class civil {
	public void see() {
		System.out.println("see method of civil");
	}
	
	public void look() {
		System.out.println("look method of civil");
	}
}

class deepali1 extends civil {
	public void see() {
		System.out.println("see method of deep");
	}
	
	public void look() {
		System.out.println("look methd of deep");
	}
}

class gaurav extends civil {
	public void see() {
		System.out.println("see method of gaurav");
	}
	
	public void look() {
		System.out.println("look method of gaurav");
		super.look();
	}
}



public class pracinher {

	public static void main(String[] args) {
         
		gaurav g=new gaurav();
		g.look();
		g.see();
		System.out.println("***************************");
		civil c=new civil();
		c.look();
		c.see();
	}

}
