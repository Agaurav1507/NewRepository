import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeloginlogout {

	public static void main(String[] args) {
            
	  String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
      System.setProperty("webdriver.chrome.driver", driverpath);
      
      WebDriver cd = new ChromeDriver();
      
      //implicit wait
      
      cd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      cd.get("https://demo.actitime.com");
      
      String expectedtitle="actiTIME - Login";
      
      String actualtitle=cd.getTitle();
      
      if(actualtitle.equals(expectedtitle)) {
    	  System.out.println("login page open successfully");
      }
      
      else {
    	  System.out.println("login page not open successfully");
      }
      
      //identify the req element from the UI and perform required action 0-30
      
     cd.findElement(By.id("username")).sendKeys("admin");
     
     cd.findElement(By.name("pwd")).sendKeys("manager");
     
     cd.findElement(By.id("loginButton")).click();
     
     cd.findElement(By.className("logout")).click();
	}

}
