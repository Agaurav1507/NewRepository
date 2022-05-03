package polymorphism;

class bank {
	float getroi() {
		return 0;
	}
}

class sbi extends bank {
	float getroi() {
		return 8.4f;
	}
}

class icici extends bank {
	float getroi() {
		return 7.3f;
	}
}

class axis extends bank {
	float getroi() {
		return 9.7f;
	}
}

public class runtime2 {

	public static void main(String[] args) {
           bank b=new sbi();
           System.out.println(b.getroi());
           
           b=new icici();
           System.out.println(b.getroi());
           
           b=new axis();
           System.out.println(b.getroi());
		
	}

}
