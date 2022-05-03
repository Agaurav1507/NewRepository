package Interface;

interface printable2 {
	void print();
}

interface showable2 extends printable2 {
	void show();
}


public class interface5 implements showable2 {
	public void print() {
		System.out.println("hello");
	}
	
	public void show() {
		System.out.println("hii");
	}
	

	public static void main(String[] args) {
         
		interface5 i=new interface5();
		i.print();
		i.show();
		
		showable2 s=i;
		s.show();
		s.print();
		
		printable2 p=s;
		p.print();
		
	}

}
