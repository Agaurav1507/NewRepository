package Array;

class testarray2 {
	//creating a method which recieves an array as parameter
	static void min(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
			  min=a[i];
				
			}
		}
		System.out.println(min);
		
	}
	
	
	static void max(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}


public class array3 {

	public static void main(String[] args) {
          
	     int[] a= {33,13,4,50,15,1};
	   
	     testarray2.min(a);
	     testarray2.max(a);
	     
	}

}
