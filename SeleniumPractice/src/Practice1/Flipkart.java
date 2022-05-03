package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
             
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", path);
	    
	    WebDriver chrome=new ChromeDriver();
	    
	    chrome.get("https://www.flipkart.com/");
	    
	    WebElement blankspace=chrome.findElement(By.className("_3704LK"));
	    
	    System.out.println(blankspace.getAttribute("title"));
	    
	    List<WebElement> categories= chrome.findElements(By.cssSelector("._37M3Pb>div"));
	    
	    System.out.println(categories.size());
	    
	    //logic to get elements 1 by 1
	    
	    for(int i=0;i<categories.size();i++) {
	    	
	    	WebElement cat=categories.get(i);
	    	
	    	System.out.println(cat.getText());
	    	
	    }
	    
	    
}

}
