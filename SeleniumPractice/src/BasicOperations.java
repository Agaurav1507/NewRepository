import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) throws InterruptedException {
           
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    
	    WebDriver ch=new ChromeDriver();
	    
	    Thread.sleep(2000);
	    
	    //maximize the window
	    
	    ch.manage().window().maximize();
	    
	    //set window size based on our requirement
	    
	    ch.manage().window().setSize(new Dimension(500,700));
	    
	    ch.manage().window().maximize();
	    
	    ch.get("https://demo.actitime.com");
	    
	    ch.findElement(By.id("username")).sendKeys("admin");
	    
	    ch.findElement(By.name("pwd")).sendKeys("manager");
	    
	    ch.findElement(By.id("loginButton")).click();
	    
	    Thread.sleep(2000);
	    
	    //navigation in browser
	    //go to previous page
	    
	    ch.navigate().back();
	    
	    //go to next page
	    
	    ch.navigate().forward();
	    
	    //refresh page
	    
	    Thread.sleep(2000);
	    
	    ch.navigate().refresh();
	    
	    //jump from current paget to another page url
	    
	    ch.navigate().to("https://www.amazon.in/");
	    
	    ch.close();
	   
	}

}
