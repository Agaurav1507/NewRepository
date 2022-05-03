package day3.allvariables;

public class Test1 {
	
	static int age=350;
	double number=200.02;
	static long salary=10000;
	short length=100;
	char grade='a';
	
    public static void main(String[] args) {
		int age=250;
		Test1 deepali=new Test1();
		System.out.println(age);
		System.out.println(Test1.age);
		System.out.println(deepali.number);
		System.out.println(Test1.salary);
		System.out.println(deepali.length);
		System.out.println(deepali.grade);
		
		Test1 gaurav=new Test1();
		     
		 System.out.println(gaurav.number);
		 System.out.println(gaurav.length);
	
		

	}

}
