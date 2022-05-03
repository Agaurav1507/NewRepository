package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
         
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    
	    WebDriver cr=new ChromeDriver();
	    
	    cr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    cr.manage().window().maximize();
	    
	    cr.manage().window().setSize(new Dimension(800,800));
	    
	    cr.get("https://www.demoblaze.com/");
	    
	   WebElement categories=cr.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
	   System.out.println(categories.isDisplayed());
	   System.out.println(categories.isEnabled());
	   System.out.println(categories.getText().equals("CATEGORIES"));
	   
	   WebElement phones=cr.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
	   System.out.println(phones.isDisplayed());
	   System.out.println(phones.isEnabled());
	   System.out.println(phones.getText().equals("Phones"));
	   
	   WebElement laptops=cr.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
	   System.out.println(laptops.isDisplayed());
	   System.out.println(laptops.isEnabled());
	   System.out.println(laptops.getText().equals("Laptops"));
	   
	   WebElement monitors=cr.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
	   System.out.println(monitors.isDisplayed());
	   System.out.println(monitors.isEnabled());
	   System.out.println(monitors.getText().equals("Monitors"));
	   
	   cr.close();
	}

}
