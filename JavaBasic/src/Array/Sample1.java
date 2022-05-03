package Array;

public class Sample1 {

	public static void main(String[] args) {
            
		int[] i= {1,51,51,161,1,11,1,1,11,1};
		double sum=0;
		double avg;
		
		System.out.println("print using for each loop");
		
		for(int a:i) {
		
			sum=sum+a;
			
		}
		
		System.out.println(sum);
		
		int i2=i.length;
		avg=sum/i2;
		System.out.println(avg);
		
		
	}

}
