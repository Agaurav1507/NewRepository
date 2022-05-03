package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentActitime {

	public static void main(String[] args) {
        
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		chrome.get("https://demo.actitime.com");
		
		String actualtitle=chrome.getTitle();
		String expectedtitle="actiTIME - Login";
		
		System.out.println(actualtitle.equals(expectedtitle));
		
		WebElement useranamevalidation=chrome.findElement(By.className("textField"));
		
		System.out.println(useranamevalidation.isDisplayed());
		System.out.println(useranamevalidation.isEnabled());
		
		useranamevalidation.sendKeys("admin");
		
		WebElement passwrdvalidation=chrome.findElement(By.name("pwd"));
		
		System.out.println(passwrdvalidation.isDisplayed());
		System.out.println(passwrdvalidation.isEnabled());
		
		passwrdvalidation.sendKeys("manager");
		
		WebElement loginbutton=chrome.findElement(By.id("loginButton"));
		
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		
		loginbutton.click();
		
		WebElement logoutbutton=chrome.findElement(By.className("logout"));
		
		WebDriverWait wait=new WebDriverWait(chrome,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
		
		String homepagetitle="actiTIME - Enter Time-Track";
		String actualtitle2=chrome.getTitle();
		
		System.out.println(actualtitle2.equals(homepagetitle));
		
		WebElement tasktab=chrome.findElement(By.cssSelector(".navItem:nth-of-type(4)"));
		
		tasktab.click();
		
		chrome.findElement(By.className("downIcon")).click();
		
		chrome.findElement(By.className("createNewTasks")).click();
		
  
		chrome.findElement(By.xpath("//tr[@class='selectCustomerRow'][1]/td/div/div/div //div[@class='dropdownButton']")).click();
		
		chrome.findElement(By.cssSelector(".customerProjectSelectorPlaceholder>div>table>tbody>tr>td>div>div")).click();
		
		chrome.findElement(By.cssSelector(".selectCustomerRow>td div:nth-of-type(3)")).click();
		
		//enter task name
		
		WebElement entertask=chrome.findElement(By.cssSelector(".nameCell >input"));
		
		entertask.click();
		entertask.sendKeys("Vishal");
		
		chrome.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr td:nth-of-type(5)>div:nth-child(2)")).click();
		
	    chrome.findElement(By.cssSelector(".commitButtonPlaceHolder")).click();
		
		
		
		
		
		
		
		
		
		
	     
		
	}

}
