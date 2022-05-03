 class constructor3 {

	
		 double i=10.23;
		 constructor3(double j){
			 System.out.println("running  constructor3");
			 i=j;
		 }

	
	
	    public static void main(String[] args) {
		System.out.println("main method starts");
		constructor3 b1=new constructor3(15);
		System.out.println(b1.i);
		
		System.out.println("=======================");
		
		constructor3 b2=new constructor3(0.32);
		System.out.println(b2.i);
		
		

	}

}
