package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentgsmarena {

	public static void main(String[] args) {
          
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.gsmarena.com/");
		
		List<WebElement> allphones=chrome.findElements(By.cssSelector(".brandmenu-v2 ul"));
		
		System.out.println("***************************************");
		
		System.out.println(allphones.size());
		
		System.out.println("***************************************");
		
		for(int i=0;i<allphones.size();i++) {
			
			System.out.println(allphones.get(i).getText());
		}
		
		
	}

}
