package Array;

public class Sample2 {

	public static void main(String[] args) {
        
		int[][] i= {{5,1,12,11},{51,1,12,5}};
		
		System.out.println(i);
		System.out.println(i.length);
		
		for(int a=0;a<i.length;a++) {
			for(int j=0;j<i[a].length;j++) {
				System.out.println(i[a][j] + " ");
			}
			System.out.println();
		}
		System.out.println("************************************************");
		
		char[][] c= {{'a','c','s','d'},{'d','d','e'},{'w','r','u'},{'c','q','d'}};
		
		for(int i1=0;i1<c.length;i1++) {
			for(int j1=0;j1<c[i1].length;j1++) {
				
				System.out.println(c[i1][j1]);
				
			}
		}
	}

}
