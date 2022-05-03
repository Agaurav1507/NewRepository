package Array;

import java.util.Arrays;

public class Marray3 {

	public static void main(String[] args) {
          //java prog to clone the array
		
		int[] arr= {33,3,4,5};
		System.out.println("print original array");
		System.out.println(arr.length);
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		System.out.println("printing clone of the array");
		
		int[] carr=arr.clone();
		for(int i:carr) {
			System.out.println(i);
		}
			System.out.println("check are both equal");
			System.out.println(Arrays.equals(arr, carr));
			System.out.println("*****************************");
			
			int[] copyarr=Arrays.copyOf(arr, arr.length);
			for(int i1 : copyarr) {
				System.out.println(i1);
			}
			System.out.println("******************************");
			Arrays.sort(arr);
			System.out.println("after sorting original array");
			for (int i2:arr) {
				System.out.println(i2);
			
		}
	}

}
