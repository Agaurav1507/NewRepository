package String;

public class stringclass1 {

	public static void main(String[] args) {
          
		  stringclass1 C1=new stringclass1();
		  System.out.println(C1); //string representation
		  
		  
		  //string class object creation-
		  //1. Using literal
		  
		  String s1="mumbai";//object will create in sttring contant pool
		  String s2="mumbai";//no object will createas its a duplicate object
		  String s3="bangalore";//new objectbwill create in string constant pool
		  
		  System.out.println(s1); //object value becoz tostring() is overrided in string class
		  System.out.println(s2);
		  System.out.println(s3);
		  System.out.println("***************************");
		  System.out.println(s1.length());//char count
		  System.out.println(s2.length());
		  System.out.println(s3.length());
		  System.out.println("***************************");
		  //to compare the values
		  System.out.println(s1.equals(s2)); //based on value
		  System.out.println(s1==s2); //based on addrress
		  System.out.println(s2.equals(s3)); //based on value
		  System.out.println(s2==s3);  //based on address
		  System.out.println(s1.equals(s3)); //based on value
		  System.out.println(s1==s3);  //based on address
		  
		  
		  String s4=new String("mumbai"); // two objecs-->1 in constant pool , 1 in non constant pool
		                                  // and ref variable will point the object in non constant pool
		  
		  System.out.println(s4);
		  System.out.println(s1.equals(s4)); //based on value
		  System.out.println(s1==s4); // based on address
		  System.out.println("******************************");
		  String s5=new String("mumbai");
		  System.out.println(s5);
		  System.out.println(s4.equals(s5)); //based on value
		  System.out.println(s4==s5); // based on address
		  
		  System.out.println("*******************************");
		  
		  String s6=new String("hyderabad");
		  System.out.println(s6);
		  System.out.println(s1.equals(s6)); //based on value
		  System.out.println(s1==s6); //based on address
		  
}

}
