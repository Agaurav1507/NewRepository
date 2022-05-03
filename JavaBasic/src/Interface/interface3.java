package Interface;

interface printable {
	int age=30;
	void print();
}

interface showable {
	void show();
}

class interface3 implements printable,showable {
	public void print() {
		System.out.println("hello print");
	}
	
	public void show() {
		System.out.println("welcome show");
	}


	public static void main(String[] args) {
         
		interface3 i=new interface3();
        i.print();
        i.show();
        System.out.println(printable.age);
	}

}
