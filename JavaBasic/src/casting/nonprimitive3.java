package casting;


class member {
	long phone;
	
	void chat() {
		System.out.println("chatting " + phone);
	}
}


class admin extends member {
	void addnum() {
		System.out.println("adding new num");
	}
}



public class nonprimitive3 {

	public static void main(String[] args) {
         
		member m=new admin();
		m.phone=702020043;
		m.chat();
		m.phone=749886671;
		//explicit upcasting
		
		admin a=(admin) m;     //or admin a=(admin) new member();  
		a.addnum();
		a.chat();
	}

}
