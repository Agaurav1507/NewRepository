package String;

public class stringmethods {

	public static void main(String[] args) {
           
		String s1="CoreJavaBasics";
		//or
		// String s1=new String("CoreJavaBasics");
		
		//returns no of char in string
		System.out.println("no of char are: " +s1.length());
		
		//return char at ith index
		System.out.println("char at 3rd position : " +s1.charAt(2));
		
		//return substring from ith index chracter to end of string
		
		System.out.println("substring from index 4th : " + s1.substring(4));
		
		//returns substring from i to j-1 index
		
		System.out.println("Substring from 4 to 8 : " + s1.substring(4, 8));
		
		//cocatenates string2 to end of string1
		
		String s2="core";
		String s3="JavaBasic";
		
		System.out.println("first value of s2 : "+s2);
		System.out.println("first value of s3 : " +s3);
		System.out.println("cocatenated String : " + s2.concat(s3));  //concat method can have only 
		                                                               //string value
		
		String s4="print"+25;   // + operator can add digits as well as string
		System.out.println(s4);
		
		//return the index within the string of the first occurence of specified string
		
		String s5="Learn Share Learn Share";
		System.out.println(s5.length());
		System.out.println("index of 'share' starts from :" +s5.indexOf("Share"));
		
		//return the index within the string of the first occurence of the specified string,
		//starting at specified index
		System.out.println("index of a =" +s5.indexOf('a', 3));
		System.out.println("index of e =" + s5.lastIndexOf('a', 19));
		
		//check equality of strings
		
		String s6="Selenium";
		String s7="selenium";
		String s8="Selenium";
		
		System.out.println("check equality of s6 & s7 :" + s6.equals(s7)); //false-first letter case is difff
		System.out.println("check equality of s6 & s8 :" +s6.equals(s8)); //true
		System.out.println("chechk equality of s6 & s7 with ignore case :"+ s6.equalsIgnoreCase(s7));
		
		//converting cases
		String word1="CoreJava";
		
		System.out.println("convert to lower case :" + word1.toLowerCase()); //convert to lower case
		System.out.println("convert to upper case : " + word1.toUpperCase());//to upper case
		
		//trimming the word
		String word2="           Learn Share Learn               ";
		System.out.println("trim the word :"+ word2.trim());
		
		//replacing characters
		String str1="CoreJavaBasic";
		System.out.println("original String: "+str1);
		System.out.println("replace a character :" +str1.replace('a', 'x'));
		
		System.out.println("replace a word : " +str1.replace("Java", "net"));
		
		String str2=" my name is gaurav my";
		System.out.println("replace any word : " + str2.replaceFirst("my","myself"));
		
		System.out.println("replace all lettrers or word : "+str2.replaceAll("a", "d"));
		
		String str3=" ";
		System.out.println(str3.isEmpty());
		
		String str4=new String();
		System.out.println(str4.isEmpty());
	}

}
