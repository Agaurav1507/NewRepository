import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin {

	public static void main(String[] args) {
         
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver cd=new ChromeDriver();
		
		cd.get("https://demo.actitime.com");
		
		String expectedresult="actiTIME - Login";
		String actualresult=cd.getTitle();
		
		if(expectedresult.equals(actualresult)) {
			System.out.println("login page opened succesfully");
		}
		
		else  {
			System.out.println("login page failed");
		}
		
		/**
		 * In order to identify any object/element from the application UI we use findElement(By)
		 * this method returns WebElement
		 * 
		 * By is predefined class in selenium and all its method are static which are also known as "locator"
		 * Selenium support following locator:
		 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
		 * 
		 * Action: all the below actions will be performed on the webelement
		 * 			if you want to type any input on the field use--> sendKeys("");
		 * 		   if you want to click on any element use---> click();
		 * 		   clearing existing value from the field ---> clear();
		 */
		
		//identify the required element from UI
		
		WebElement usernameinputfield=cd.findElement(By.id("username"));
		
		//perform appropriate action on identified element
		
		usernameinputfield.sendKeys("admin");
		
		//remove existing text from the input field
		
		usernameinputfield.clear();
		usernameinputfield.sendKeys("admin");
		
		
		//identify the required element from UI
		
		WebElement passwrdinputfield=cd.findElement(By.name("pwd"));
		
		//perform appropriate action on identified element
		
		passwrdinputfield.sendKeys("manager");
		
		//identify the required element from UI
		
		WebElement clickloginbutton=cd.findElement(By.id("loginButton"));
		
		//perform appropriate action on identified element
		
		clickloginbutton.click();
		
		//close driver
		
		cd.close();
	}

}
