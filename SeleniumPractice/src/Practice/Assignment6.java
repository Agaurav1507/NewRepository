package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment6 {

	public static void main(String[] args) {
         
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
        System.setProperty("webdriver.chrome.driver", driverpath);
        
        WebDriver ch=new ChromeDriver();
        
        ch.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        ch.get("https://demo.actitime.com");
        
        ch.findElement(By.name("username")).sendKeys("admin");
        
        ch.findElement(By.name("pwd")).sendKeys("manager");
        
        ch.findElement(By.id("loginButton")).click();
        
        WebElement logoutbutton=ch.findElement(By.id("logoutLink"));
        
        WebDriverWait wait= new WebDriverWait(ch,20);
        
        wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
        
        String actualresult=ch.getTitle();
        String expectedresult="actiTIME - Enter Time-Track";
        
        if(actualresult.equals(expectedresult)) {
        	System.out.println("login success");
        }
        
        else {
        	System.out.println("login unseccess");
        }
        
        logoutbutton.click();
	}

}
