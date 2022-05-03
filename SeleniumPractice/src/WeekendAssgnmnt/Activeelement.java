package WeekendAssgnmnt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activeelement {

	public static void main(String[] args) {
          
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.opencart.com/");
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		WebElement activeobject=chrome.switchTo().activeElement();
//		
//		String activeobjplaceholder=activeobject.getAttribute("placeholder");
//		String expectedactiveobject="Username";
//		
//		if(activeobjplaceholder.equals(expectedactiveobject)) {
//			
//			System.out.println("cursor validation is successfull");
//		}
//		else {
//			System.out.println("cursor validation is failed");
//		}
		
		
		WebElement username=chrome.findElement(By.name("username"));
		
		username.sendKeys("Gaurav");
		
		username.sendKeys(Keys.TAB);
		
	}

}
