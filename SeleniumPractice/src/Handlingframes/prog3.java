package Handlingframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog3 {

	public static void main(String[] args) throws InterruptedException { 
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.manage().window().maximize();
		
		chrome.manage().window().setSize(new Dimension(800,800));
		
		chrome.get("https://etrain.info/in");
		
		//enter source
		
		WebElement src=chrome.findElement(By.id("cbafi1"));
		
		src.sendKeys("pune");
		
		chrome.findElement(By.cssSelector("#suggest_row1>a")).click();
		
		Thread.sleep(2000);
		
		//enter destination
		
		WebElement dest=chrome.findElement(By.id("cbafi2"));
		
		dest.sendKeys("LOKMANYATILAK T");
		
		chrome.findElement(By.cssSelector("#suggest_row1>a")).click();
		
		WebElement button=chrome.findElement(By.cssSelector("#cbasbmtbtn>i"));
		
		button.click();
		
		Thread.sleep(2000);
		
		//List<WebElement> traindetails=chrome.findElements(By.xpath("//div[@id='lowerdata']/table/tbody/tr"));
		
		List<WebElement> traindetails=chrome.findElements(By.xpath("//div[@id='lowerdata']/table/tbody/tr"));
		
		System.out.println(traindetails.size());
		
		
		
		for(int i=4;i<=traindetails.size()-1;i++) {
			
			WebElement trainname=chrome.findElement(By.xpath("//div[@id='lowerdata']/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[1]/span"));
			                                                          
			System.out.println("train name is = "+trainname.getText());
			
			WebElement departuretime=chrome.findElement(By.xpath("//div[@id='lowerdata']/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[2]"));
			
			System.out.println("departure time is = "+departuretime.getText());
			
			WebElement Arrivaltime=chrome.findElement(By.xpath("//div[@id='lowerdata']/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[3]"));
			
			System.out.println("Arrival time is = "+Arrivaltime.getText());
		}
	}

}
