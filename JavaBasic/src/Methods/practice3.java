package Methods;

public class practice3 {
	
	static double getaddresult(int num1,int num2) {
	    double res=num1+num2;
	    		return res;
	}
	public static void main(String[] args) {
	double sum=getaddresult(25,45);
	System.out.println(sum);
		
	sum=getaddresult(245,455);
	System.out.println(sum);
	sum=getaddresult(2545,45);
	System.out.println(sum);
	sum=getaddresult(25,4685);
	System.out.println(sum);
	sum=getaddresult(24555,45);
	System.out.println(sum);
	}

}
