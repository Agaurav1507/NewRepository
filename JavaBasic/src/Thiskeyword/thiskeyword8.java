package Thiskeyword;

public class thiskeyword8 {
    
	int a=40;
	int b=50;
	
	thiskeyword8(int a,int b){
	
       System.out.println(a + "," + b);
	}
	
	void display() {
		
		System.out.println(a + "," + b);
	}
	
	
	
	
	 public static void main(String[] args) {
		 
		 thiskeyword8 x=new thiskeyword8(70,20);
		 x.display();
		 System.out.println(x.a + "," + x.b);
		 
		 thiskeyword8 x1=new thiskeyword8(12,201);
		 x1.display();
		 System.out.println(x1.a + "," + x1.b);
		

	}

}
