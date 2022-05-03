package String;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello "); 
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		sb.insert(5, "pune");
		System.out.println(sb);
	    sb.replace(1, 3, "xxx");
	    System.out.println(sb);
	    sb.delete(1, 4);
	    System.out.println(sb);
	    
	    StringBuffer s1=new StringBuffer("Banagalore is known as it hub");
	    s1.reverse();
	    System.out.println(s1);
	    System.out.println("*************************************************");
	    StringBuffer s2=new StringBuffer();
	    System.out.println(s2.capacity());
	    s2.append("hello");
	    System.out.println(s2);
	    s2.append(" java is my favourite language");
	    System.out.println(s2);
	    System.out.println(s2.capacity());
	    s2.append("i am from automation area");
	    System.out.println(s2);
	    System.out.println(s2.capacity());
	    
	    
	}

}
