package String;

public class stringclass3 {

	public static void main(String[] args) {
         
		String s1="i am from up";
		System.out.println(s1);
		
		String[] strarray=s1.split(" ");
		for(String s:strarray) {
			System.out.println(s);
		}
		
		System.out.println("**********************");
		String s2="i am from up";
		System.out.println(s2);
		String[] strarray2=s2.split(" ", 4);
		for(String s:strarray2) {
			System.out.println(s);
		}
		
		System.out.println("***********************");
		
		String s3="i am from pune";
		System.out.println(s3);
		String[] strarray3=s3.split(" ");
		String temp="";
		for(String s:strarray3) {
			System.out.println(s);
		}
		
		for(int i=strarray3.length-1;i>0;i--) {
			temp=temp+" "+strarray[i];
		}
		System.out.println(temp);
		
		System.out.println("***************************");
		
		String s4="       I am deepali         ";
		System.out.println("actual string with spaces: " +s4);
		System.out.println("actual string with length: "+s4.length());
		System.out.println("actual string without spaces: "+s4.trim());
		System.out.println("actual string length without spaces: "+s4.trim().length());
		
		System.out.println("****************************");
		
		String s5="I   am            deepali";
		System.out.println("actual string with spaces : "+s5);
		System.out.println("actual string length : " +s5.length());
		
		
		
		
		
		
	}

}
