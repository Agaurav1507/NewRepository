package Handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog1 {

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://jqueryui.com/droppable/");
		
		WebElement frame=chrome.findElement(By.cssSelector(".demo-frame"));
		
		//switch your control to frame using WebElement
		
		chrome.switchTo().frame(frame);
		
		    //or
		
	//	chrome.switchTo().frame(chrome.findElement(By.cssSelector(".demo-frame")));
		
		   //or
		//Switch your control to frame using  index
		
	//   chrome.switchTo().frame(0);
		
		Actions mouse=new Actions(chrome);
		
		WebElement src=chrome.findElement(By.id("draggable"));
		
		WebElement destination=chrome.findElement(By.id("droppable"));
		
		mouse.dragAndDrop(src, destination).build().perform();
		
		chrome.switchTo().defaultContent();
		
		chrome.findElement(By.cssSelector(".logo>a")).click();
		
	}

}
