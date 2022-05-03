package Practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
          
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    
	    WebDriver cd=new ChromeDriver();
	    
	    cd.get("https://www.facebook.com/");
	    
	    WebElement emailaddress=cd.findElement(By.name("email"));
	    
	    emailaddress.sendKeys("gaurav.agrawal0072@gmail.com");
	    
	    
	    WebElement passwrd1=cd.findElement(By.id("pass"));
	    
	    passwrd1.sendKeys("passwrd");
	    
	    WebElement login=cd.findElement(By.name("login"));
	    
	    login.click();
	}

}
