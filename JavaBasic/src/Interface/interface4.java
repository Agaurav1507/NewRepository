package Interface;

interface printable1 {
	void print();
}

interface showable1 {
	void print();
}



public class interface4 implements printable1,showable1 {
	public void print() {
		System.out.println("hello");
		System.out.println("hii");
	}
	


	public static void main(String[] args) {
		
		interface4 i=new interface4();
		i.print();
		
		showable1 s=i;
		s.print();
		
		printable1 p=i;
		p.print();

	}

}
