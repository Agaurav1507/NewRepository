package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
             
	   String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	   System.setProperty("webdriver.chrome.driver", path);
	    
	   WebDriver chrome=new ChromeDriver();
	    
	   chrome.manage().window().maximize();
	    
	   chrome.manage().window().setSize(new Dimension(800,800));
	    
	   chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	   chrome.get("https://www.demoblaze.com/#");
	    
	   List<WebElement> names=chrome.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
	   
	   System.out.println(names.size());
	   
	   for(int i=0;i<names.size();i++) {
		   
		   WebElement print=names.get(i);
		   
		   System.out.println(print.getText());
		   
	   }
	    
   }

}
