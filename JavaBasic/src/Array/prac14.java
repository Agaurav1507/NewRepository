package Array;

public class prac14 {

	public static void main(String[] args) {
         
		int[] a= {5,8,9,7,9,1,6,4,2,1};
		
		int store;
		for(int i=0;i<a.length;i++) {
			
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				
				store=a[i];
				a[i]=a[j];
				a[j]=store;			
		}
		
		}
		}
		System.out.println("*****usingforloop*********");
		for(int b=0;b<a.length;b++) {
			System.out.println(a[b]);
			
		}
		
		System.out.println("*****using for each loop");
		for(int n:a) {
			System.out.println(n);
		}
	
	}

}
