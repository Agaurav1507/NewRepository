package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) {
           
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driverpath);
		
		WebDriver ff=new FirefoxDriver();
		
		ff.get("https://demosite.executeautomation.com/Login.html");
		
		String str=ff.getTitle();
		
		System.out.println(str);
		System.out.println(str.length());
		
		System.out.println(ff.getCurrentUrl());
		
		String expectedresult="https://demosite.executeautomation.com/Login.html";
		String actualresult=ff.getCurrentUrl();
		
		if(expectedresult.equals(actualresult)) {
			System.out.println("url is right");
		}
		
		else {
			System.out.println("url is wrong");
		}
		
		//find element
		
		WebElement usernameelement=ff.findElement(By.name("UserName"));
		
		//take action on identified element
		
		usernameelement.sendKeys("execution");
		
		//find element
		
		WebElement passwrdelement=ff.findElement(By.name("Password"));
		
		//take action on identified element
		
		passwrdelement.sendKeys("admin");
		
		//find element
		
		WebElement loginbutton=ff.findElement(By.name("Login"));
		
		//take action
		
		loginbutton.click();
	}

}
