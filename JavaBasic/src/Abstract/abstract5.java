package Abstract;

abstract class rbibank {
	abstract double getroiforhomeloan();
	
	final void loan() {
		System.out.println("as per rbi loan");
	}
}


class sbi extends rbibank {
	double getroiforhomeloan() {
		return 6.45;
	}
}


class pnb extends rbibank {
	double getroiforhomeloan() {
		return 7.45;
	}
}




public class abstract5 {

	public static void main(String[] args) {
       
		pnb p=new pnb();
		System.out.println(p.getroiforhomeloan());
		p.loan();
		
		System.out.println("***************************");
		
		sbi s=new sbi();
		System.out.println(s.getroiforhomeloan());
		s.loan();
		
		System.out.println("****************************");
		
		rbibank r=s;
		System.out.println(r.getroiforhomeloan());
		
		System.out.println("*****************************");
		
		rbibank r1=p;
		System.out.println(r1.getroiforhomeloan());
		r1.loan();
	}

}
