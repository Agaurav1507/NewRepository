import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class genericwaytoopenchrome {

	public static void main(String[] args) {
            
		//step 1: set driver executable path
		
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//step 2: create instance
		
		WebDriver wd=new ChromeDriver();
	}

}
