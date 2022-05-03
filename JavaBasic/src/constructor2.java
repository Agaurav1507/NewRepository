
public class constructor2 {
	
	constructor2(){
		System.out.println("zero para");
	}
	
	
	constructor2 (char c){
		System.out.println("single para");
	}
	
	constructor2(int num1,int num2){
		System.out.println("int-int para");
	}
	
	constructor2(double num1,int num2){
		System.out.println("double-int para");
	}
	
	constructor2(int num1,double num2){
		System.out.println("int-double para");
	}
	
	constructor2(boolean num1,boolean num2,char a){
		System.out.println("boolean-boolean-char para");
	}
	
	
	
	
	public static void main(String[] args) {
		constructor2 b1=new constructor2();
		constructor2 b2=new constructor2('A');
		constructor2 b3=new constructor2(24,25);
		constructor2 b4=new constructor2(25.25,25);
		constructor2 b5=new constructor2(50,2.256);
		constructor2 b6=new constructor2(false,true,'Z');
	}

}
