package Array;

import java.util.Arrays;

public class practice1 {

	public static void main(String[] args) {
          
		 int[] a= {33,55,44,22,88,99};
		 System.out.println(a.length);
		 System.out.println("**************************");
		 
		 for(int i:a) {
			 System.out.println(i);
		 }
		 
		 int[] b=a.clone();
		 System.out.println("**************************");
		 System.out.println(b.length);
		 System.out.println("***************************");
		 
		 for(int u:b) {
			 System.out.println(u);
			
		 }
		 System.out.println("****************************");
		 
		 int[] v=Arrays.copyOf(a,a.length);
		 for(int n:v) {
			 System.out.println(n);
		 }
		 System.out.println("********************");
		 System.out.println(Arrays.equals(a, b));
	}

}
