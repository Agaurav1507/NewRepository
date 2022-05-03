package Array;

public class Sample0 {

	public static void main(String[] args) {
             double [] d= {54,64,65,21,6,6,166,66,6666};
             
             System.out.println(d);
             System.out.println(d.toString());
             System.out.println(d.hashCode());
             System.out.println(d[5]);
             System.out.println(d.length);
             
             System.out.println("print elements using for loop");
             for(int i=0;i<d.length;i++) {
            	 
             System.out.println(d[i]);
  
             }
             
             System.out.println("print elements using for each loop");
             
             for(double c:d) {
            	 System.out.println(c);
             }
             
             
             
             
             
		
	}

}
