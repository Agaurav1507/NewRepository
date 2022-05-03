package Inheritence;

class grandfather {
	grandfather(){
		System.out.println("im a class of grandfather constructor");
	}
	
	void myhome() {
		System.out.println("home of grandfather");
	}
}

class father extends grandfather  {
	father(double d){
		super();
		System.out.println("class of father constructor");
	}
	
	void mycar() {
		System.out.println("car of father");
	}
}

class child extends father {
	child(int i){
		super(12.43);
		System.out.println("class of child constructor");
		
	}
	
	void mybike() {
		System.out.println("bike of child");
	}
}


public class inheritence4 {

	public static void main(String[] args) {
           child c1=new child(25);
           c1.mybike();
           c1.mycar();
           c1.myhome();
           
           System.out.println("******************************************");
           
           father f1=c1;
           f1.mycar();
           f1.myhome();
           
           System.out.println("******************************************");
           
           grandfather g1=c1;
           g1.myhome();
           
           System.out.println("******************************************");
           
           grandfather g2=c1;
           g2.myhome();
	}

}
