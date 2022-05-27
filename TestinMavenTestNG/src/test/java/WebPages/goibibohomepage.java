package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class goibibohomepage extends seleniumutility {
	
WebDriver driver;
	
        public goibibohomepage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//ul[@class='happy-nav']/li")
	
	private WebElement homemenu;
	
	@FindBy(xpath="//ul[@class='happy-nav']/li[1]/a")
	
	private WebElement flight;

	public WebElement getHomemenu() {
		return homemenu;
	}

	public WebElement getFlight() {
		return flight;
	}
	
	public void mousehoverhomemenu() {
		
		performmousehoveroperation(homemenu);
	}
	
	public void clickonflight() {
		
		clickonelement(flight);
	}


}
