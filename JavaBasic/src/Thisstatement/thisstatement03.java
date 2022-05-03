package Thisstatement;

public class thisstatement03 {
         
	thisstatement03(){
		
		System.out.println("zero para");
	}
	
	
	thisstatement03(int age){
		
		System.out.println("int para");
	}
	
	thisstatement03(char c,double d){
		this(35);
		
		System.out.println("char double para");
	}
	
	
	
	
	public static void main(String[] args) {
		 
		thisstatement03 z=new thisstatement03('c',25.36);

	}

}
