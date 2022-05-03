package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
            
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	
	    System.setProperty("webdriver.chrome.driver", path);
	    
	    WebDriver ch=new ChromeDriver();
	    
	    ch.get("https://demo.actitime.com");
	    
	   
	    
	    WebElement usernameelement=ch.findElement(By.name("username"));
	    System.out.println(usernameelement.isDisplayed());
	    System.out.println(usernameelement.isEnabled());
	    
	    String actualplaceholdername=usernameelement.getAttribute("placeholder");
	    System.out.println(actualplaceholdername);
	    
        
	    System.out.println("*************************************************");
	    WebElement pwdinputfield=ch.findElement(By.name("pwd"));
	    System.out.println(pwdinputfield.isDisplayed());
	    System.out.println(pwdinputfield.isEnabled());
	    
	    String actualname=pwdinputfield.getAttribute("placeholder");
	    System.out.println(actualname);
	    
	    
	    
	    System.out.println("*************************************************");
	    WebElement checkbox=ch.findElement(By.name("remember"));
	    System.out.println(checkbox.isDisplayed());
	    System.out.println(checkbox.isEnabled());
	    System.out.println(checkbox.isSelected());
	    
	    System.out.println("*************************************************");
	    WebElement loginbutton=ch.findElement(By.id("loginButton"));
	    System.out.println(loginbutton.isDisplayed());
	    System.out.println(loginbutton.isEnabled());
	    
	    loginbutton.getText();
	    loginbutton.click();
	    
	    ch.close();
	    
	   
	}

}
