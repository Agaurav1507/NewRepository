package Trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check1 {

	public static void main(String[] args) {
            
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("http://demo.automationtesting.in/Register.html");
		
		Actions mouse=new Actions(chrome);
		
		List<WebElement> menu=chrome.findElements(By.cssSelector(".navbar-collapse:nth-of-type(2)>ul>li>a"));
		
		
		System.out.println("total menu ");
		
	}

}
