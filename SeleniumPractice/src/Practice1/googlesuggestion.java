package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesuggestion {

	public static void main(String[] args) {
          
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", path);
	    
	    WebDriver chrome=new ChromeDriver();
	    
	    chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    chrome.manage().window().maximize();
	    
	    chrome.manage().window().setSize(new Dimension(800,800));
	    
	    chrome.get("https://www.google.com/");
	    
        WebElement write=chrome.findElement(By.className("gLFyf"));
	    
	    write.sendKeys("selenium interview questions");
	    
	    List<WebElement> list=chrome.findElements(By.cssSelector(".G43f7e>li"));
	
	    System.out.println(list.size());
	    
	    for(int i=0;i<list.size();i++) {
	    	
	    	WebElement printsuggestions=list.get(i);
	    	
	    	System.out.println(printsuggestions.getText());
	    }
	    
	   
	    }
	}


