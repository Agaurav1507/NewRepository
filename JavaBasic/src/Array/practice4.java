package Array;

public class practice4 {

	public static void main(String[] args) {
          
		int[] k= {1,1,2,3,4,4,5,6,6,7,7,8,9,9};
		
		for(int i=0;i<k.length;i++) {
			
			for(int j=i+1;j<k.length;j++) {
				
				if(k[i]==k[j] ) {
					
					System.out.println(k[j]);
					
				}
				
			}
			
		}
		
		
	}

}
