package Interface;

interface bank {
	float roi();
}


class sbi implements bank {
	public float roi() {
		return 7.45f;
	
	}
}


class pnb implements bank {
	public float roi() {
		return 9.5f;
	}
}



public class interface2 {

	public static void main(String[] args) {
         
		pnb p=new pnb();
		System.out.println(p.roi());
		
		sbi s = new sbi();
		System.out.println(s.roi());
		
		bank b=s;
		System.out.println(b.roi());
		
		bank b1=p;
		System.out.println(b1.roi());
	}

}
