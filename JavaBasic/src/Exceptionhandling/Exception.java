package Exceptionhandling;

public class Exception {

	public static void main(String[] args) {
          
		 System.out.println("program starts.....");
		 
		 //1.abnormal statement
		 
		 int i=10;
		 int j=i/0;
		 
		 System.out.println(j);
		 
		 //2.abnormal statment
		 
		 int[] empid=new int[3];
		 empid[3]=101; //ArrayindexoutofboundException
		 
		 //3. abnormal statment
		 
		 String str=null;
	     System.out.println(null.length); //null pointer exception
		 
		 //4.abnormal statement
		 
		 String s="abc";
		 int num=Integer.parseInt(s); //numberformat exception
		 System.out.println(num);
		 
		 System.out.println("program ends.....");
	}

	public char[] dividenum(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
