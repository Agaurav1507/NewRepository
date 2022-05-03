package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
                 
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		chrome.manage().window().maximize();
		
		chrome.manage().window().setSize(new Dimension(800,800));
		
		chrome.get("https://www.redbus.in/");
		
		//get home page title on console
		System.out.println(chrome.getTitle());
		
		//validate home page
		String actualtitle=chrome.getTitle();
		String expectedtitle="Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";
		
		System.out.println("Homepage is = " +actualtitle.equals(expectedtitle));
		
		//enter source place
		
		WebElement source=chrome.findElement(By.id("src"));
		
		System.out.println("is source box displayed or not = "+source.isDisplayed());
		System.out.println("is source box enabled or not = "+source.isEnabled());
		source.sendKeys("Pune");
		
		//select one place from source 
		chrome.findElement(By.cssSelector(".autoFill >li:nth-of-type(18)")).click();
		
		//enter destination place
		
		WebElement destination=chrome.findElement(By.id("dest"));
		
		System.out.println("is destination box diplayed or not = " +destination.isDisplayed());
		System.out.println("is destination box enabled or not = "+destination.isEnabled());
		destination.sendKeys("Goa");
		
		//select one place at destination
		
		chrome.findElement(By.cssSelector(".autoFill>li:nth-of-type(4)")).click();
		
		//Select date of travel
		
		chrome.findElement(By.cssSelector(".rb-monthHeader>td:last-child")).click();
		
		chrome.findElement(By.cssSelector(".rb-monthTable tr:nth-of-type(6) td[class='wd day']:nth-of-type(3)")).click();
		
		//click on search button
		
		WebElement search=chrome.findElement(By.id("search_btn"));
		
		System.out.println("is search button diplayed or not = "+search.isDisplayed());
		System.out.println("is search button enabled or not = "+search.isEnabled());
		search.click();
		
		//identify filter for after 6 pm
		
		WebElement filter=chrome.findElement(By.cssSelector(".dept-time>li:last-child label[class='custom-checkbox']:nth-of-type(1)"));
		
		System.out.println("is after 6 pm filter displayed or not = " +filter.isDisplayed());
		System.out.println("is after 6pm enabled or not = " +filter.isEnabled());
		System.out.println("is after 6 pm selected or not = " +filter.isSelected());
		
		filter.click();
		
		
		//identify filter for A/C
		
		for(int i=0;i<6;i++) {
			
		chrome.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		
		}
		WebElement acbox=chrome.findElement(By.cssSelector(".list-chkbox>li:nth-of-type(3)>label:nth-child(2)"));
		
		acbox.click();
		
		WebElement busname=chrome.findElement(By.cssSelector(".bus-items>div:nth-of-type(5) div>div>div>div>div:nth-of-type(1)"));
		
		System.out.println("Name of bus is = " +busname.getText());
		
		WebElement busfare=chrome.findElement(By.cssSelector(".bus-items>div:nth-of-type(5) div >div>div>div>div:last-child>div>span"));
		
		System.out.println("Bus fare is = " +busfare.getText());
	}

}
