package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.seleniumutility;

public class Actiloginpage extends seleniumutility {
	
	WebDriver driver;
	
	public Actiloginpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="username")
	
	public WebElement userinputfield;
	
	@FindBy(name="pwd")
	
	public WebElement passwordinputfield;

	@FindBy(css="#keepLoggedInCheckBox")
	
	public WebElement checkboxfield;
	
	@FindBy(css="#loginButton")
	
	public WebElement loginbutton;

	public WebElement getUsername() {
		return userinputfield;
	}

	public WebElement getPassword() {
		return passwordinputfield;
	}

	public WebElement getCheckbox() {
		return checkboxfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void login(String username,String password) {
		
		typeinput(userinputfield,username);
		
		typeinput(passwordinputfield,password);
		
		clickonelement(loginbutton);
	
	}
	
	public void checkbox() {
		
		System.out.println(checkboxfield.isDisplayed());
		System.out.println(checkboxfield.isEnabled());
	}
	
	public void checklogintitle() {
		
		setsleeptime(2000);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME -  Enter Time-Track", "either login was not successfull or title got change");
		
		System.out.println(driver.getTitle());
	}

}
