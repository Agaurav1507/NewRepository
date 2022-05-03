package Thisstatement;

public class thisstatement01 {
    
	thisstatement01(){
		this(255);
		System.out.println("zero para");
		
	}
	
	thisstatement01(int age){
		System.out.println("int para");
	}
	
	thisstatement01(char c,double d){
		this();
		System.out.println("char double para");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//thisstatement01 t1=new thisstatement01();
		//thisstatement01 t2 =new thisstatement01(255);
		thisstatement01 t3=new thisstatement01('z',36.360);
					

	}

}
