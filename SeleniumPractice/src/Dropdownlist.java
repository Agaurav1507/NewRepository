import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {
         
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", path);
	    
	    WebDriver chrome=new ChromeDriver();
	    
	    chrome.manage().window().maximize();
	    
	    chrome.manage().window().setSize(new Dimension(800,800));
	    
	    chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    chrome.get("https://demosite.executeautomation.com/Login.html");
	    
	    chrome.findElement(By.name("UserName")).sendKeys("execution");
	    
	    chrome.findElement(By.name("Password")).sendKeys("admin");
	    
	    WebElement loginbutton=chrome.findElement(By.cssSelector("input[name='Login']"));
	    
	    loginbutton.click();
	    
	    //1. Identify the dropdown list and store it into WebElement
	    
	    WebElement dropdownlist=chrome.findElement(By.name("TitleId"));
	    
	    dropdownlist.click();
	    
	    /*2. Create an instance of Select class(predined class in Selenium) and pass dropdown list 
		   WebElement as a parameter in its constructor  */
	    
	    Select s1=new Select(dropdownlist);
	    
	    System.out.println("is it multiple dropdown list - " + s1.isMultiple());
	    
	  //Operation1: count the options present in dropdown
	    
	    List<WebElement> sizecount=s1.getOptions();
	    
	    System.out.println(sizecount.size());
	    
	  //op2: print all the option name
	    
	    for(int i=0;i<sizecount.size();i++) {
	    	
	    	System.out.println(sizecount.get(i).getText());
	    	
	     }
	    
	  //op3: get already selected option
	    
	    System.out.println(s1.getFirstSelectedOption().getText());
	    
	  //op4: select required value from dropdown
	    
	    //s1.selectByIndex(1);
	    
	         //or
	    
	    //s1.selectByValue("1");
	    
	          //or
	    
	   s1.selectByVisibleText("Ms.");
	   
	   dropdownlist.click();
	   
	   System.out.println(s1.getFirstSelectedOption().getText());
	   
	   WebElement logoutbutton=chrome.findElement(By.cssSelector("#cssmenu>ul>li>a:nth-of-type(1)"));
	   
	   chrome.manage().window().maximize();
	   
	   logoutbutton.click();
	   
	   chrome.close();
	    
	  
   }

}
