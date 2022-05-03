package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class prac2 {

	public static void main(String[] args) {
        
		String firefoxpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", firefoxpath);
		
		
		FirefoxDriver ff=new FirefoxDriver();
		
		ff.get("https://www.facebook.com/");
		
		System.out.println(ff.getTitle());
		
		ff.close();
		
	}

}
