import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdownlist {

	public static void main(String[] args) {
             
		
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
	 
	    System.setProperty("webdriver.chrome.driver", path);
	    
	    WebDriver chrome=new ChromeDriver();
	    
	    chrome.manage().window().maximize();
	    
	    chrome.manage().window().setSize(new Dimension(800,800));
	    
	    chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    chrome.get("http://demo.automationtesting.in/Register.html");
	    
	  //**** Idetify dropdown list
	    
	    WebElement skills=chrome.findElement(By.id("Skills"));
	    
	    skills.click();
	    
	  //**** Create an instance of Select class and pass above element into its constructor
	    
	    Select skillist=new Select(skills);
	    
	  //**** check whether dropdown is multiselect dropdown or not
	    
	    System.out.println(skillist.isMultiple());
	    
	  //**** get default or already select option
	    
	    System.out.println(skillist.getFirstSelectedOption()); //gives default selected
	    
	    //get option count
	    
	    List<WebElement> size=skillist.getOptions();
	    
	    System.out.println(size.size());
	    
	  //Get dropdown option names
	    
	    for(int i=0;i<size.size();i++) {
	    	
	    	System.out.println(size.get(i).getText());
	    	
	    }
	    
	    skillist.selectByIndex(6);
	    
	    System.out.println(skillist.getFirstSelectedOption());
	    
	  
	    
	   
	    
}

}
