package Conditions;

public class primenumbers {

	public static void main(String[] args) {
		
		int i;
		int primect=0;
		for( i=1; i<=100; i++) {
			
		int counter=0;
		for(int num=i; num>=1; num--) {
			
		if(i % num==0) {
		
		counter=counter+1;
			
		}
		}
		
		if(counter==2) {
			
		System.out.println(i);
		primect++;
		}
		}
		
		System.out.println(primect);

	}

}
