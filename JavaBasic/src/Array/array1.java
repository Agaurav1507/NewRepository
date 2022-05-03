package Array;

public class array1 {

	public static void main(String[] args) {
          
		int[] age= {12,26,25,57,78};
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		System.out.println(age.length);
		System.out.println("******for-each loop");
		
		for(int num:age) {
			System.out.println(num);
			if(num==25) {
				System.out.println(num);
			}
			else {
				System.out.println("age is not 25");
			}
		}
	}

}
