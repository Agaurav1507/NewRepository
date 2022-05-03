package Array;

public class practice5 {

	public static void main(String[] args) {
         
		int[] d= {12,54,98,32,5,65,4,5,5,};
		System.out.println(d.length);
		System.out.println(d[5]);
		System.out.println("print all the elements");
		System.out.println("******using for loop*************");
		
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
			
		}
		System.out.println("*******using for each loop********");
		
		for(int k:d) {
			System.out.println(k);
			System.out.println();
		}
		
		
	}

}
