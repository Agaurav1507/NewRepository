package Array;

public class practice2 {

	public static void main(String[] args) {
           
		int[] d= {8,7,8,7,9,5,5,4,3,3,4,5,8,9};
		
		for(int i=0;i<d.length;i++) {
		
		int count=0;
		
		for(int j=0;j<d.length;j++) {
			if(d[i]==d[j]) {
				count=count+1;
			}
		}
		System.out.println(count);
		}
		   
	}

}
