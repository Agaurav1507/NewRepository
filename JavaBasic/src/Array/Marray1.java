package Array;

public class Marray1 {

	public static void main(String[] args) {
        
		int[][] arr= {{1,2,3},{4,5},{6,7,8,9}};
		
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]);
		}
		System.out.println();
		}
		
		char [][] chararr= {{'a','b'},{'c','d','e'},{'x','y','z'}};
		
		
		for(int i=0;i<chararr.length;i++) {
		for(int j=0;j<chararr[i].length;j++) {
			System.out.println(chararr[i][j]);
		}
		System.out.println();
		}
	}

}
