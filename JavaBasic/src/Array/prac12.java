package Array;

public class prac12 {

	public static void main(String[] args) {
          
		int[] p= {5,5,10,20,30};
		
		int s = 0;
		
		for(int i=0;i<p.length;i++) {
			
			s=p[i]+s;
			
		}
		System.out.println(s);
	}

}
