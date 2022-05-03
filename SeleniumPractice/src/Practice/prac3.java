package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class prac3 {

	public static void main(String[] args) {
            
		String chromepath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromepath );
	
	    ChromeDriver cd=new ChromeDriver();
	    
	    cd.get("https://www.google.com/search?q=google+homepage&oq=google+home+page&aqs=chrome.1.69i57j0i10i433i512j0i10i512j0i512l2j0i10i512l2j0i512j0i10i512l2.5987j0j15&sourceid=chrome&ie=UTF-8");
	
	    cd.get("https://www.facebook.com");
	    
	    
	   
	   String str=cd.getPageSource();
	    
	     
	    
	    System.out.println(str);
	    
	    System.out.println(cd.getCurrentUrl());
	    System.out.println(str.length());
	    System.out.println(cd.getTitle());
	    
	   
	   
	}

}
