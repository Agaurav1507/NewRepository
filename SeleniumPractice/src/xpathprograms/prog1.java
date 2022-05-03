package xpathprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog1 {

	public static void main(String[] args) {
         
		WebDriverManager.chromedriver().setup();
		
        WebDriver chrome=new ChromeDriver();
        
        chrome.get("https://www.amazon.in/");
        
        List<WebElement> homepage=chrome.findElements(By.xpath("//div[@id='nav-xshop-container']"));
        
        System.out.println("homepage element counts are " +homepage.size());
        
        for(int i=0;i<homepage.size();i++) {
        	System.out.println(homepage.get(i).getText());
        }
        
        chrome.findElement(By.xpath("//div[@class='nav-search-field ']")).sendKeys("iphones");
        
        chrome.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[3] /div")).click();
	}

}
