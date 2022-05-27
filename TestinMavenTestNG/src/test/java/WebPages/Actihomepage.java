package WebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.seleniumutility;

public class Actihomepage extends seleniumutility {

	WebDriver driver;

	public Actihomepage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Tasks']//following::div[1]")

	private WebElement taskbutton;

	@FindBy(xpath = "//div[text()='Add New']//following::div[1]")

	private WebElement addnew;

	@FindBy(xpath = "//div[@class='dropdownContainer addNewMenu']/div[3]")

	private WebElement newtask;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][1]//div[3]")

	public WebElement dropbutton1;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][1]//div[@class='searchItemList']/div")

	public List<WebElement> dropdown1alloptions;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][1]//div[@class='searchItemList']/div[2]")

	public WebElement selectdropdown1;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][2]/td/div[2]//following::td//div[@class='dropdownButton']")

	public WebElement dropbutton2;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][2]//div[2]//following::div//div//div/div[@class='searchItemList']/div")

	public List<WebElement> dropdown2alloptions;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][2]//div[2]//following::div//div//div/div[@class='searchItemList']/div[8]")

	public WebElement selectdropdown2;

	@FindBy(css = "#logoutLink")

	public WebElement logoutbutton;
	
	@FindBy(xpath="//input[@placeholder='Enter task name'][1]")
	
	public WebElement addnewtask;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	
	public WebElement createtask;

	public WebElement getTaskbutton() {
		return taskbutton;
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewtask() {
		return newtask;
	}

	public WebElement getDropbutton1() {
		return dropbutton1;
	}

	public List<WebElement> getDropdown1alloptions() {
		return dropdown1alloptions;
	}

	public WebElement getSelectdropdown1() {
		return selectdropdown1;
	}

	public WebElement getDropbutton2() {
		return dropbutton2;
	}

	public List<WebElement> getDropdown2alloptions() {
		return dropdown2alloptions;
	}

	public WebElement getSelectdropdown2() {
		return selectdropdown2;
	}
	
	public WebElement getAddnewtask() {
		return addnewtask;
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	public WebElement getCreatetask() {
		return createtask;
	}

	public void clicktaskbutton() {
		clickonelement(taskbutton);
	}

	public void clickaddnew() {
		clickonelement(addnew);
	}

	public void clicknewtask() {
		clickonelement(newtask);
	}

	public void clickdropbutton1() {
		clickonelement(dropbutton1);
	}

	public void DD1alloptions() {
		dropdown1alloptions.size();

		System.out.println("Dropdown1 all options are :-");

		for (int i = 0; i < dropdown1alloptions.size(); i++) {

			System.out.println(dropdown1alloptions.get(i).getText());
		}
	}

	public void clickselectdropdown1() {
		clickonelement(selectdropdown1);
	}

	public void clickdropbutton2() {
		clickonelement(dropbutton2);
	}

	public void DD2alloptions() {

		System.out.println("******************************************");
		System.out.println("Dropdown2 all options are:-");

		for (int i = 0; i < dropdown2alloptions.size(); i++) {

			System.out.println(dropdown2alloptions.get(i).getText());
		}
	}

	public void clickselectdropdown2() {
		clickonelement(selectdropdown2);
	}
	
	
	public void clicklogoutbutton() {
		clickonelement(logoutbutton);
	}
	
	public void makegetAddnewtask(String taskname) {
		
		clickonelement(addnewtask);
		
	   typeinput(addnewtask,taskname);
	   
	   driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
	}
	
	public void clickcreatetask() {
		
		clickonelement(createtask);
	}
	
	public void takess() {
		
		takescreenshot("F:\\AUTOMATIONCLASSES\\ScreenShots\\actitime-createtask.jpg");
	}
	
	public void chechlogouttitle() {
		
		setsleeptime(2000);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "either logout was not succesfull or title got change");
		
		System.out.println(driver.getTitle());
	}

}
