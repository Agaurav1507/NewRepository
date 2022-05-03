package xpathprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog2actitime {

	public static void main(String[] args) throws InterruptedException {
         
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter url
		chrome.get("https://demo.actitime.com");
		
		//enter username
		chrome.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		//enter password
		chrome.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//click login button
		chrome.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		
		//click add task
		chrome.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		//click add new
		chrome.findElement(By.xpath("//div[text()='Add New']")).click();
		
		
		//click on new task
		chrome.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		
		//click on dropdown
		chrome.findElement(By.xpath("//div[@class='comboboxButton'][1]")).click();
		
		//choose galaxy corporation
		
		chrome.findElement(By.xpath("//tr[@class='selectCustomerRow']/td/div/div/div/div/div/div /div[4]")).click();
		
		//click on dropdown
		
		chrome.findElement(By.xpath("//div[@class='customerProjectSelectorPlaceholder']/div/table/tbody/tr[3]/td/div/div/div/div[1]/div[1]")).click();
		
		//select android testing
		
		chrome.findElement(By.xpath("//div[text()='- New Project -']//following-sibling::div[4]")).click();
		
		//enter task name
		
		chrome.findElement(By.xpath("//input[@placeholder='Enter task name'][1]")).sendKeys("Autotest");
		
		chrome.findElement(By.xpath("//td[@class='billingTypeCell']/div[@title='engineering']/div")).click();
		
		chrome.findElement(By.xpath("//td[@class='billingTypeCell']/div/div/div/div/div/div[2]/div[1]//following::div[17]")).click();
		
		//create task
		
		chrome.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		
		//click on project checkbox
		
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		chrome.findElement(By.xpath("//div[@class='innerScrollableContainer']/div//div[@class='img']")).click();
		
		//delete the task
		
		chrome.findElement(By.xpath("//div[text()='Delete']")).click();
		
		chrome.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		
		//search the task
		
		chrome.findElement(By.xpath("//div[@class='rightContainer']/div/div/table/tbody/tr/td/div/input")).sendKeys("Autotest");
		
		//check for the task
		
		
		System.out.println(chrome.findElement(By.xpath("//div[@class='tasksNotFoundMessage']/p']")).getText());
		
		
	}

}
