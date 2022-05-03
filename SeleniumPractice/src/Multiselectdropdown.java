import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) {
           
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver gecko=new ChromeDriver();
		
		
		
		gecko.get("http://omayo.blogspot.com/");
		
		//1. Identify the dropdown list and store it into WebElement
		
		WebElement dropdown=gecko.findElement(By.id("multiselect1"));
		
		//**** Create an instance of Select class and pass above element into its constructor
		
		Select s1=new Select(dropdown);
		
		//**** check whether dropdown is multiselect dropdown or not
		
		System.out.println(s1.isMultiple());
		
		//**** get default or already select option
		
		//System.out.println(s1.getFirstSelectedOption().getText());
		
		//get option count 
		
		List<WebElement> dropbox=s1.getOptions();
		
		System.out.println(dropbox.size());
		
		//Get dropdown option names
		
		for(int i=0;i<dropbox.size();i++) {
			
			System.out.println(dropbox.get(i).getText());
		}
		
		//select options from dropdown
		
	   s1.selectByIndex(2);
	   s1.selectByValue("volvox");
	   s1.selectByVisibleText("Audi");
	   
	   //get all the selected options
	   
	   List<WebElement> latestselected=s1.getAllSelectedOptions();
	   
	   System.out.println( latestselected.size());
	   
	   System.out.println(latestselected.get(2).getText());
	   
	 //unselect already select options
	   
	   //s1.deselectByIndex(2);
	   //s1.deselectByValue("volvox");
	   //s1.deselectByVisibleText("Audi");
	            // or
	  s1.deselectAll();
	  
	  gecko.close();
	   
 }

}
