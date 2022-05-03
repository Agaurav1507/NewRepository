package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebook {

	public static void main(String[] args) throws InterruptedException {
          
        String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.facebook.com/");
		
		String actualtitle=chrome.getTitle();
		String expectedresult="Facebook – log in or sign up";
		
		System.out.println(actualtitle.equals(expectedresult));
		
		chrome.findElement(By.cssSelector("._6ltg>a")).click();
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement entername=chrome.findElement(By.name("firstname"));
		
		System.out.println("check weather displayed or not = " +entername.isDisplayed());
		System.out.println("check weather editable or not = " +entername.isEnabled());
		
		entername.sendKeys("gaurav");
		
		WebElement lastname=chrome.findElement(By.name("lastname"));
		
		System.out.println("check weather displayed or not = " +lastname.isDisplayed());
		System.out.println("check weather editable or not = " +lastname.isEnabled());
		
		lastname.sendKeys("agrawal");
		
		WebElement email=chrome.findElement(By.name("reg_email__"));
		
		System.out.println("check weather displayed or not = " +email.isDisplayed());
		System.out.println("check weather editable or not = " +email.isEnabled());
		
		email.sendKeys("gaurav.agrawal0072@gmail.com");
		
		WebElement passwrd=chrome.findElement(By.name("reg_passwd__"));
		
		System.out.println("check weather displayed or not = " +passwrd.isDisplayed());
		System.out.println("check weather editable or not = " +passwrd.isEnabled());
		
		passwrd.sendKeys("DeepaliGau");
		//for dates
		WebElement dates=chrome.findElement(By.id("day"));
		
		dates.click();
		
		System.out.println("is displayed = " +dates.isDisplayed());
		
		System.out.println("is enabled = " +dates.isEnabled());
		
		Select newdates=new Select(dates);
		
		System.out.println("is multiselectable = " +newdates.isMultiple());
		
		System.out.println("default selected = " + newdates.getFirstSelectedOption());
		
		List<WebElement> dateoptions=newdates.getOptions();
		
		System.out.println("Total date option counts are = " +dateoptions.size());
		
		System.out.println("These are all date options ");
		
		for(int i=0;i<dateoptions.size();i++ ) {
			
			System.out.println(dateoptions.get(i).getText());
		}
		
		//select any value for dates
		
		newdates.selectByIndex(5);
	              //or
	    //newdates.selectByValue(""));
	             //or
	    //newdates.selectByVisibleText("");
		
		dates.click();
		
		//System.out.println(newdates.getFirstSelectedOption());
	
	    //for month
		
		WebElement month=chrome.findElement(By.id("month"));
		
		month.click();
		
		System.out.println("is diplayed or not = " +month.isDisplayed());
		
		System.out.println("is enabled or not = " +month.isEnabled());
		
		Select monthoption=new Select(month);
		
		System.out.println(monthoption.isMultiple());
		
		List<WebElement> monthlist=monthoption.getOptions();
		
		System.out.println("total months cont = "+monthlist.size());
		
		System.out.println("All months are");
		for(int i=0;i<monthlist.size();i++) {
			
			System.out.println(monthlist.get(i).getText());
		}
		
		//select month
		
		monthoption.selectByValue("3");
		
		month.click();
		
		//System.out.println(monthoption.getFirstSelectedOption());
		
		//for year
		
		WebElement year=chrome.findElement(By.id("year"));
		
		year.click();
		
		System.out.println("is displayed or not = "+year.isDisplayed());
		
		System.out.println("is enabled or not = " +year.isEnabled());
		
		Select yearoptions=new Select(year);
		
		System.out.println("is multi selectable or not = " +yearoptions.isMultiple());
		
		List<WebElement> yearlist=yearoptions.getOptions();
		
		System.out.println("total year counts are = " +yearlist.size());
		
		System.out.println("all years list : ");
		for(int i=0;i<yearlist.size();i++) {
			
			System.out.println(yearlist.get(i).getText());
		}
		
		yearoptions.selectByVisibleText("2006");
		
		year.click();
		
		yearoptions.getFirstSelectedOption();
		
		Thread.sleep(2000);
		
		//System.out.println(yearoptions.getFirstSelectedOption());
	    
	    
	}

}
