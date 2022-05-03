package Mouseoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehoverprog {

	public static void main(String[] args) throws InterruptedException {
         
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		//chrome.get("https://www.globalsqa.com/demo-site/");
		
		//for mouse operation create instance of class actions
		
		Actions mouse=new Actions(chrome);
		
//		List<WebElement> home=chrome.findElements(By.cssSelector("div[id='menu']>ul>li>a"));
//		
//		System.out.println(home.size());
//		
//		for(int i=0;i<home.size();i++) {
//			
//			WebElement mainmenu=home.get(i);
//			
//			mouse.moveToElement(mainmenu).perform();
//			Thread.sleep(2000);
//		}
//		
		chrome.get("https://www.amazon.in/");
		
		List<WebElement> home1=chrome.findElements(By.xpath("//div[@id='nav-shop']//following::div/div/div/script//following::a"));
		
		
		System.out.println(home1.size());
		
		for(int i=0;i<home1.size();i++) {
			
			WebElement mainmenu1=home1.get(i);
			
			mouse.moveToElement(mainmenu1).perform();
			
			Thread.sleep(1000);
		}
		
	}

}
