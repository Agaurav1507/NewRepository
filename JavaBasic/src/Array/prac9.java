package Array;

public class prac9 {

	public static void main(String[] args) {
             
		int[] num= {58,87,98,2232,565,5745,78,65};
		
		System.out.println("print largest number");
		int max=num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>max) {
			max = num[i];	
			}
		}
		System.out.println(max);
	}

}
