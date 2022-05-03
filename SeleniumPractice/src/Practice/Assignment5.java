package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) {
            
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\geckodriver.exe";
	
	    System.setProperty("webdriver.gecko.driver", driverpath);

	    WebDriver ff=new FirefoxDriver();
	    
	    ff.get("https://demo.vtiger.com/vtigercrm/index.php");
	    
	  
	}

}
