import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitimeloginlogoutwithhomepagevalidation {

	public static void main(String[] args) {
          
	  String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  
	  WebDriver cd=new ChromeDriver();
	  
	  cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  cd.get("https://demo.actitime.com");
	  
	  String expectedtitle="actiTIME - Login";
	  String actualtitle=cd.getTitle();
	  
	  if(actualtitle.equals(expectedtitle)) {
		  System.out.println("login success");
	  }
	  else {
		  System.out.println("login unsuccess");
	  }
	  
	  cd.findElement(By.id("username")).sendKeys("admin");
	  
	  cd.findElement(By.name("pwd")).sendKeys("manager");
	  
	  cd.findElement(By.id("loginButton")).click();
	  
	  WebElement logoutbutton=cd.findElement(By.id("logoutLink"));
	  
	   //explicit wait
	  
	  WebDriverWait wait=new WebDriverWait(cd,20);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
	  
	  String actualhomepagetitle=cd.getTitle();
	  
	  String expectedhomepagetitle="actiTIME - Enter Time-Track";
	
	  if(actualhomepagetitle.equals(expectedhomepagetitle)) {
		  System.out.println("login success");
	  }
	  else {
		  
		  System.out.println("login unsuccess");
	  }
	  
	 logoutbutton.click();
	  
	  
	  
	}

}
