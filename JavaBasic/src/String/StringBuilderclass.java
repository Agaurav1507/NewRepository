package String;

public class StringBuilderclass {

	public static void main(String[] args) {
         
		 StringBuilder sb=new StringBuilder("hello");
		 sb.append("java");
		 System.out.println(sb);
		 sb.reverse();
		 System.out.println(sb);
		 
		 StringBuilder sb1=new StringBuilder("hello java");
		 System.out.println(sb1);
		 
		 StringBuilder sb2=new StringBuilder("hello java");
		 System.out.println(sb2);
		 
		 System.out.println(sb1.equals(sb2)); //address base comparison
		 System.out.println(sb1==sb2); //address base comparison
		 
		 //we dont have any method in stringbuffer and stringbuilder to compare object value,
		 //so to overcome that,
		 // first convert stringbuffer /stringbuilder to stringclass using tostring()
		 // then use equal() of string class
		 
		 System.out.println(sb1.toString().equals(sb2.toString()));
		 
	}

}
