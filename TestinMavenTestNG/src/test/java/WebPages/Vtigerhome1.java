package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class Vtigerhome1 extends seleniumutility {
	
	WebDriver driver;
	
	public Vtigerhome1(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='appnavigator']/div/span")
	
	private WebElement threelines;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	
	private WebElement marketing;
	
	@FindBy(xpath="//div[@class='app-list row']/div[2]//span[text()=' Leads']")
	
	private WebElement leads;

	public WebElement getThreelines() {
		return threelines;
	}

	public WebElement getMarketing() {
		return marketing;
	}

	public WebElement getLeads() {
		return leads;
	}
	
	public void clickonthreelines() {
		
		clickonelement(threelines);
	}
	
	public void reachtocreateleads() {
		
		clickonelement(marketing);
		clickonelement(leads);
		
	}

}
