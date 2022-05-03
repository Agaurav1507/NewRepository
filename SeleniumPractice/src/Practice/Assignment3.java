package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
           
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver cd=new ChromeDriver();
		
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		cd.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement usernameelement=cd.findElement(By.name("username"));
		
		usernameelement.clear();
		
		usernameelement.sendKeys("admin");
		
		WebElement passwrdelement=cd.findElement(By.id("password"));
		
		passwrdelement.clear();
		
		passwrdelement.sendKeys("Test@123");
		
		WebElement loginbutton=cd.findElement(By.className("buttonBlue"));
		
		loginbutton.click();
	
		cd.findElement(By.className("fa-user")).click();
        		
		WebElement logoutbutton=cd.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));

		WebDriverWait wait=new WebDriverWait(cd,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
		
		String actualresult=cd.getTitle();
		String expectedresult="Tableau de bord";
		
		if(actualresult.equals(expectedresult)) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("login unsuccessfull");
		}
		
		logoutbutton.click();
		
		
	}

}
