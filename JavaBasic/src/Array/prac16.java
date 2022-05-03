package Array;

import java.util.Arrays;

public class prac16 {

	public static void main(String[] args) {
          
		int[] array= {44,88,66,77,44,55,22,33,99};
	
	   Arrays.sort(array);
	   for(int i:array) {
		   System.out.println(i);
	 }
	   
	   System.out.println("third largest number is " + array[array.length-3]);
	  
	   
     }

}
