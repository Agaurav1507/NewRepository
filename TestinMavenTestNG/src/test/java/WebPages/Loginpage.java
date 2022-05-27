package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class Loginpage extends seleniumutility {

	
	WebDriver driver;
	
	//Initialization of Login page 
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	
	private WebElement userinputfield;
	
	@FindBy(name="pwd")
	
	private WebElement passwordinputfield;
	
	@FindBy(id="loginButton")
	
	private WebElement loginbutton;

	public WebElement getUserinpufield() {
		return userinputfield;
	}

	public WebElement getPasswordinputfield() {
		return passwordinputfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void login(String username,String password) {
		
		typeinput(userinputfield,username);
		typeinput(passwordinputfield,password);
		clickonelement(loginbutton);
		
	}

}
