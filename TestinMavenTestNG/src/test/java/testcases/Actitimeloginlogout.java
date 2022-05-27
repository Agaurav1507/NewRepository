package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitimeloginlogout {

	@BeforeTest

	public void precondition() {

		WebDriverManager.chromedriver().setup();

		WebDriver chrome = new ChromeDriver();

		chrome.get("https://demo.actitime.com/user/submit_tt.do");

	}

	@Test

	public void testloginfunctionality() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver chrome = new ChromeDriver();

		chrome.get("https://demo.actitime.com/user/submit_tt.do");
		
		chrome.findElement(By.id("username")).sendKeys("admin");
		
		chrome.findElement(By.name("pwd")).sendKeys("manager");
		
		chrome.findElement(By.id("loginButton")).click();
		
		Thread.sleep(1000);
		
		Assert.assertEquals(chrome.getTitle(),"actiTIME - Enter Time-Track",
				"Either page title got changed or login was failed");

	}
	
	@Test
	
	public void testlogoutfunctionality() {
		
		WebDriverManager.chromedriver().setup();

		WebDriver chrome = new ChromeDriver();

		chrome.get("https://demo.actitime.com/user/submit_tt.do");
		
		chrome.findElement(By.id("username")).sendKeys("admin");
		
		chrome.findElement(By.name("pwd")).sendKeys("manager");
		
		chrome.findElement(By.id("loginButton")).click();
		
		chrome.findElement(By.className("logout")).click();
		
		Assert.assertEquals(chrome.getTitle(), "actiTIME - Login",
				"Either logout button is not functional or present");
		
	 }
	
	@AfterTest
	
	public void postcondition() {
		
		WebDriverManager.chromedriver().setup();

		WebDriver chrome = new ChromeDriver();

		chrome.get("https://demo.actitime.com/user/submit_tt.do");
		
		chrome.findElement(By.id("username")).sendKeys("admin");
		
		chrome.findElement(By.name("pwd")).sendKeys("manager");
		
		chrome.findElement(By.id("loginButton")).click();
		
		chrome.findElement(By.className("logout")).click();
		
		chrome.close();
		
	}

}
