package Trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Etrain {

	public static void main(String[] args) throws InterruptedException {
              
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://etrain.info/in");
		
		chrome.findElement(By.id("cbafi1")).sendKeys("pune");
		
		chrome.findElement(By.id("suggest_row1")).click();
		
		chrome.findElement(By.id("cbafi2")).sendKeys("ltt");
		
		chrome.findElement(By.id("suggest_row1")).click();
		
		WebElement getavailability=chrome.findElement(By.cssSelector("#cbasbmtbtn"));
		
		getavailability.click();
		
		Thread.sleep(2000);
		
		List<WebElement> traindetails=chrome.findElements(By.xpath("//div[@id='lowerdata']/table/tbody/tr"));
		
		for(int i=4;i<traindetails.size()-1;i++) {
			
			WebElement trainname=chrome.findElement(By.xpath("//div[@id='lowerdata']/table/tbody/tr["+(i)+"]/td/div/table/tbody/tr/td[1]/span"));
			
			System.out.println(trainname.getText());
			
			WebElement trainarrival=chrome.findElement(By.xpath("//div[@id='lowerdata']/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[3]"));
			
			System.out.println(trainarrival.getText());
			
			WebElement traindeparture=chrome.findElement(By.xpath("//div[@id='lowerdata']/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[2]"));
			
			System.out.println(traindeparture.getText());
		}

		
		
	}

}
