package System;

public class systemclass {

	public static void main(String[] args) {
        
		//for checking specific property
		System.out.println("system user directory :" + System.getProperty("user.home"));
		System.out.println("current working dectory :" + System.getProperty("user.dir"));
		
		//for clearing property
		System.out.println(System.clearProperty("user.home"));
		System.out.println(System.getProperty("user.home"));
	}

}
