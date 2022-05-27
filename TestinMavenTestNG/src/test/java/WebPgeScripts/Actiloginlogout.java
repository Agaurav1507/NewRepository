package WebPgeScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.seleniumutility;
import WebPages.Homepage;
import WebPages.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actiloginlogout extends seleniumutility {

	WebDriver driver = null;
	Loginpage getloginpage = null;
	Homepage gethomepage = null;

	@BeforeTest

	public void precondition() {

		driver = setup("chrome", "https://demo.actitime.com/login.do");

		getloginpage = new Loginpage(driver);

		gethomepage = new Homepage(driver);

	    getloginpage.login("admin", "manager");

	}

	@Test

	public void testloginfunctionality() throws InterruptedException {

		Thread.sleep(2000);

		String actualhomepagetitle = driver.getTitle();

		Assert.assertEquals(actualhomepagetitle, "actiTIME - Enter Time-Track",
				"Either page title got changed or login was failed");

		gethomepage.clicktaskbutton();

		gethomepage.clickaddnew();

		gethomepage.clicknewtask();

		gethomepage.clickdropbutton1();

		gethomepage.clickSelectdropdown1();

		gethomepage.clickdropbutton2();

		gethomepage.clickselectdropdown2();
	}

	@Test

	public void testlogoutfunctionality() {

		gethomepage.logoutfromapp();

		setsleeptime(2000);

		String actualhomepagetitle = driver.getTitle();

		Assert.assertEquals(actualhomepagetitle, "actiTIME - Login",
				"Either logout button is not functional or present");

	}

	@AfterTest

	public void postcondition() {

		// cleanup();

	}

}
