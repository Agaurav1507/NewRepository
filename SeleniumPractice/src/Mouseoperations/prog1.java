package Mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog1 {

	public static void main(String[] args) {
           
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("http://demo.automationtesting.in/Register.html");
		
		//to perform mouse ope create instance of actions class
		
		Actions mouse=new Actions(chrome);
		
		WebElement firstname=chrome.findElement(By.cssSelector("input[placeholder='First Name']"));
		
		firstname.sendKeys("Gaurav");
		
		mouse.moveToElement(firstname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement lastname=chrome.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		mouse.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	   
		
	}

}
