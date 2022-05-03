package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentgsmarena2 {

	public static void main(String[] args) {
        
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.gsmarena.com/");
		
		chrome.findElement(By.cssSelector(".brandmenu-v2 ul li:nth-of-type(14)")).click();
		
		List<WebElement> realmephones=chrome.findElements(By.cssSelector(".makers>ul>li>a"));
		
		System.out.println("total realmephones are " +realmephones.size());
		
	    for(int i=0;i<realmephones.size();i++) {
			
			System.out.println(realmephones.get(i).getText());
		}
		
		System.out.println("1st page url =" +chrome.getCurrentUrl());
		
		WebElement page2=chrome.findElement(By.cssSelector(".nav-pages>a:nth-of-type(1)"));
		
		page2.click();
		
		List<WebElement> page2phones=chrome.findElements(By.cssSelector(".makers>ul>li>a"));
		
		System.out.println(page2phones.size());
		
		for(int i=0;i<page2phones.size();i++) {
			
			System.out.println(page2phones.get(i).getText());
		}
		
        chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("2nd page url = " +chrome.getCurrentUrl());
		
		WebElement page3=chrome.findElement(By.cssSelector(".nav-pages>a:nth-of-type(2)"));
		
		page3.click();
		
		List<WebElement> page3phones=chrome.findElements(By.cssSelector(".makers>ul>li>a"));
		
		System.out.println("Total realmephones on page3 = " +page3phones.size());
		
		for(int i=0;i<page3phones.size();i++) {
			
			System.out.println(page3phones.get(i).getText());
		}
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("3rd page url = "+chrome.getCurrentUrl());
		
		

	}

}
