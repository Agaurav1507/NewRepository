package Array;

public class prac10 {

	public static void main(String[] args) {
        
		int[] num= {54,52,12,32,545,87,326,32,54,87,54};
		
		System.out.println("print smallest number");
		
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]<min) {
				min=num[i];
			}
		}
		
		System.out.println(min);
	}

}
