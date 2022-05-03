package polymorphism;

import java.util.Scanner;

class hillstation {
	void location() {
		System.out.println("location is :");
	}
	
	void famousfor() {
		System.out.println("famousfor:");
	}
}

class manali extends hillstation {
	void location() {
		System.out.println("manali is in hp");
	}
	
	void famousfor() {
		System.out.println("hidimba temple and sports");
	}
}

class mussorie extends hillstation {
	void location() {
		System.out.println("mussorie is in uttarakhand");
	}
	
	void famousfor() {
		System.out.println("education");
	}
}

class gulmarg extends hillstation {
	void location() {
		System.out.println("in jammu&kashmir");
	}
	
	void famousfor() {
		System.out.println("skiing");
	}
}
public class runtime1 {
	

	public static void main(String[] args) {
        
		hillstation h=new hillstation();
		h.location();
		h.famousfor();
		System.out.println("**********************************");
		hillstation h1=new manali();
		h1.location();
		h1.famousfor();
		System.out.println("***********************************");
		hillstation h2=new mussorie();
		h2.famousfor();
		h2.location();
		System.out.println("***********************************");
		hillstation h3=new gulmarg();
		h3.famousfor();
		h3.location();
		
	}

}
