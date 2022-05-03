package Handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingalertpopup {

	public static void main(String[] args) {
           
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		//as the required element is present inside the frame, so need to switch our control inside frame first
				
		chrome.switchTo().frame(0);
		
		chrome.findElement(By.xpath("//button[text()='Try it']")).click();
		
		System.out.println(chrome.switchTo().alert().getText());
		
		chrome.switchTo().alert().accept();
		
		/**
		In order to handle any JavaScirpt Pop-up we need use driver.switchTo().alert()
		because java script popup doesn't contain HTML code
		we use predefined functions of Alert to perform any operation on it
		after every action control comes back to the main page


		*/
	}

}
