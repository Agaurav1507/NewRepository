package Array;

public class Marray2 {

	public static void main(String[] args) {
        
		char[] copyfrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		
		char[] copyto = new char[7];
		
		System.arraycopy(copyfrom, 2, copyto, 0, copyto.length );
		
		for(int i=0;i<copyto.length;i++) {
			System.out.println(copyto[i]);
		}
	}
	
}
