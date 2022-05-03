import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class genericwaytoopenanybrowser {
	
	static String chromepath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	static String firefoxpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\geckodriver.exe";
	
	static void openbrowser(String driverpath,String browsername ) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			//step 1:set executable path
			
		System.setProperty("webdriver.chrome.driver",chromepath);
		
		   //step 2: create instance
		
		ChromeDriver wd=new ChromeDriver();
		
		wd.get("https://www.google.com");
		
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getTitle());
		}
		
		
		else if(browsername.equalsIgnoreCase("firefox")) {
		    
		 System.setProperty("webdriver.gecko.driver",firefoxpath);
		
		FirefoxDriver wd=new FirefoxDriver();
		
		wd.get("https://www.google.com");
		
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getTitle());
		 
		}
	}

	public static void main(String[] args) {
             
		
		genericwaytoopenanybrowser.openbrowser(chromepath,"chrome"); 	
		
	    genericwaytoopenanybrowser.openbrowser(firefoxpath, "firefox");
	}

}
