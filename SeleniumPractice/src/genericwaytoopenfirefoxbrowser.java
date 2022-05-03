import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class genericwaytoopenfirefoxbrowser {

	public static void main(String[] args) {
            
		//step 1: set executable path
		
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\geckodriver.exe";
	
	    System.setProperty("webdriver.gecko.driver", path);
	    
	    //step 2:create instance
	    
	    WebDriver wd=new FirefoxDriver();
	
	}
	

}
