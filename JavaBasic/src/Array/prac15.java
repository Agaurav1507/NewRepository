package Array;

public class prac15 {

	public static void main(String[] args) {
          
		int[] m= {88,99,77,55,44,22,66,4,88,33,11,99,44,66,11};
		
		int store;
		for(int i=0;i<m.length;i++) {
			
			for(int j=i+1;j<m.length;j++) {
				
				if(m[i]<m[j]) {
					
					store=m[i];
					m[i]=m[j];
					m[j]=store;
				}
			}
		}
		
		System.out.println("******using for loop**********");
		
		for(int y=0;y<m.length;y++) {
			System.out.println(m[y]);
		}
		
		System.out.println("*******using for each loop******");
		for(int r:m) {
			System.out.println(r);
		}
	}

}
