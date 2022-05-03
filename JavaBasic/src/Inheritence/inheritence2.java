package Inheritence;

class fruit{
	fruit(){
		System.out.println("fruit class");
	}
	public void taste() {
		System.out.println("sweet");
	}
}

class apple extends fruit{
	apple(){
		System.out.println("apple class");
	}
	public void shape() {
		super.taste();
		
	}
}




public class inheritence2 {

	
		public static void main(String[] args) {
             apple fr=new apple();
             fr.shape();
            
             
	}

}
