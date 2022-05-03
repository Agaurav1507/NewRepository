import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleElements {

	public static void main(String[] args) {
            
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", path);
	    
	    WebDriver chrome=new ChromeDriver();
	    
	    chrome.manage().window().maximize();
	    
	    chrome.manage().window().setSize(new Dimension(800,800));
	    
	    chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    chrome.get("https://www.demoblaze.com/#");
	    
	    //to find list of multiple elements
	    
	    List<WebElement> categories=chrome.findElements(By.cssSelector(".list-group>a"));
	    
	    System.out.println(categories.size());
	    
	    //creating expected result list
	    
	    ArrayList<String> l1=new ArrayList<String>();
	    l1.add("CATEGORIES");
	    l1.add("Phones");
	    l1.add("Laptops");
	    l1.add("Monitors");
	    
	  //Logic to get one by one element from the list and performing validation on that
	    
	    for(int i=0;i<categories.size();i++) {
	    	
	    	WebElement cat=categories.get(i);
	    	
	    	System.out.println(cat.getText());
	    	System.out.println(cat.isDisplayed());
	    	System.out.println(cat.isEnabled());
	    	System.out.println(cat.getText().equals(l1.get(i)));
	    	
	    }
	}

}
