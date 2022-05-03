package xpathprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Moneycontrol {

	public static void main(String[] args) {
           
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.manage().window().maximize();
		
		chrome.manage().window().setSize(new Dimension(800,800));
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		chrome.get("https://www.moneycontrol.com/");
		
		//find mutual fund option and click on it
		chrome.findElement(By.xpath("//ul[@class='clearfix main_nav']/li[8]")).click();
		
		WebElement scroll=chrome.findElement(By.cssSelector("body"));
		
		for(int i=0;i<=28;i++) {
			
			scroll.sendKeys(Keys.ARROW_DOWN);
		}
		
		System.out.println(chrome.findElement(By.xpath("//a[text()='Large Cap Fund »']")).getText());
		
		
	}

}
