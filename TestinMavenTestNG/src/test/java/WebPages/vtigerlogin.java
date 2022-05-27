package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class vtigerlogin extends seleniumutility {
 
	WebDriver driver;

	public vtigerlogin(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")

	private WebElement userinputfield;

	@FindBy(id = "password")

	private WebElement passwordinputfield;

	@FindBy(xpath = " //button[text()='Sign in']")

	private WebElement signin;

	public WebElement getUsername() {
		return userinputfield;
	}

	public WebElement getPassword() {
		return passwordinputfield;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
	public void login(String username,String password) {
		
		typeinput(userinputfield,username);
		typeinput(passwordinputfield,password);
		
		signin.click();
		
	}

}
