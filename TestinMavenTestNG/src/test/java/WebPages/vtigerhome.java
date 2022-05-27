package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class vtigerhome extends seleniumutility {

	WebDriver driver;

	public vtigerhome(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".fa-user")

	private WebElement profile;

	@FindBy(id ="menubar_item_right_LBL_SIGN_OUT")

	private WebElement logout;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogout() {
		return logout;
	}

	public String homepagetitle() {

		waitforelementtobeclickable(logout);

		return getcurrenttitleofapp();

	}

	public void clickprofile() {

		profile.click();
	}

	public void logoutfromapp() {

		logout.click();
	}

}
