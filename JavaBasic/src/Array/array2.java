package Array;

public class array2 {

	public static void main(String[] args) {
          
		int[] num= {2,-9,0,5,12,-25,22,9,8,12};
		double sum=0;
		double average;
		
		for(double number:num) {
			
			sum=sum+number;
		}
		System.out.println(sum);
		
		int arraylength=num.length;
		average=sum/arraylength;
		System.out.println(average);
	}

}
