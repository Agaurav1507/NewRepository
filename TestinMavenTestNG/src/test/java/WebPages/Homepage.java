package WebPages;

import org.apache.log4j.net.SyslogAppender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.seleniumutility;

public class Homepage extends seleniumutility {

	WebDriver driver;

	public Homepage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#logoutLink")

	public WebElement logoutbutton;

	@FindBy(css = "#container_tasks")

	public WebElement taskbutton;

	@FindBy(className = "downIcon")

	public WebElement addnew;

	@FindBy(xpath = "//div[@class='dropdownContainer addNewMenu']/div[3]")

	public WebElement newtask;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][1]//div[3]")

	public WebElement dropbutton1;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][1]//div[@class='searchItemList']/div[2]")

	public WebElement selectdropdown1;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][2]/td/div[2]//following::td//div[@class='dropdownButton']")

	public WebElement dropbutton2;

	@FindBy(xpath = "//tr[@class='selectCustomerRow'][2]//div[2]//following::div//div//div/div[@class='searchItemList']/div[8]")

	public WebElement selectdropdown2;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	public WebElement getTaskbutton() {
		return taskbutton;
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewtask() {
		return newtask;
	}

	public WebElement getdropbutton1() {
		return dropbutton1;
	}

	public WebElement getSelectdropdown1() {
		return selectdropdown1;
	}

	public WebElement getDropbutton2() {
		return dropbutton2;
	}

	public WebElement getSelectdropdown2() {
		return selectdropdown2;
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

	public void clickSelectdropdown1() {

		clickonelement(selectdropdown1);
	}

	public void clickdropbutton2() {

		clickonelement(dropbutton2);
	}

	public void clickselectdropdown2() {

		clickonelement(selectdropdown2);
	}

	public void logoutfromapp() {

		clickonelement(logoutbutton);
	}

	public String gethomepagetitle() {

		waitforelementtobeclickable(logoutbutton);

		return getcurrenttitleofapp();

	}

	

}
