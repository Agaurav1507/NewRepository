package assignment;

public class primenumbersfrom1to100 {

	public static void main(String[] args) {
                 
		
		
		for(int num=1;num<=100;num++) {
		
			int count=0;
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				count++;
				
			}
			
		}
		
		if(count==0) {
			System.out.println(num);
		}
		
	}
	}

}
