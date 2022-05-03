package Array;

class testreturnarray {
	//creating method which returns an array
	
	static int[] getarray() {
		
		return new int[] {10,30,50,90,60};
	}
}




public class array4 {

	public static void main(String[] args) {
         
		int arr[]=testreturnarray.getarray();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	

}
