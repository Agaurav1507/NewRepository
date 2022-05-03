package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
         
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver cd=new ChromeDriver();
		
		cd.get("https://demo.actitime.com");
		
		
		String str1="actiTIME - Login";
		String str=cd.getTitle();
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str1.equals(str));
		
		
		//check page url and verify if it is correct
		String expectedresult="https://demo.actitime.com/login.do";
		String actualresult=cd.getCurrentUrl();
		
		if(expectedresult.equals(actualresult)) {
			System.out.println("login page open successfully");
		}
		else {
			System.out.println("login page failed");
		}
		
		
		WebElement usernameelement=cd.findElement(By.name("username"));
		
		usernameelement.sendKeys("trainee");
		
		WebElement passwrdelement=cd.findElement(By.name("pwd"));
		
		passwrdelement.sendKeys("trainee");
		
		WebElement loginbutton=cd.findElement(By.id("loginButton"));
		
		loginbutton.click();
		
		System.out.println(cd.getTitle());
		System.out.println(cd.getCurrentUrl());
		
		
	}

}
