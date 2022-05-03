package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
             
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", path);
	    
	    WebDriver chrome=new ChromeDriver();
	    
	    chrome.get("https://www.amazon.in/");
	    
	    List<WebElement> title=chrome.findElements(By.cssSelector("#nav-main>div:nth-child(2)>div>div"));
	    
	    System.out.println(title.size());
	    
	    chrome.findElement(By.cssSelector("#nav-main>div:nth-child(2)>div>div>a:nth-child(3)")).click();
	    
	    chrome.findElement(By.cssSelector("#nav-search:nth-child(2)>form>div:nth-child(2)>div>input")).sendKeys("samsung phones");
	    
	    chrome.findElement(By.cssSelector("#nav-search:nth-child(2)>form>div:nth-child(2)>div>input")).click();
	    
	    chrome.findElement(By.id("nav-search-submit-text")).click();
	    
	    chrome.findElement(By.cssSelector(".a-checkbox>label>i")).click();
	    
	}

}
