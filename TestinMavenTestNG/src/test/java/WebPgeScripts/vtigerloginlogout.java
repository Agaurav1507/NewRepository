package WebPgeScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.seleniumutility;
import WebPages.Loginpage;
import WebPages.vtigerhome;
import WebPages.vtigerlogin;

public class vtigerloginlogout extends seleniumutility {
	
	WebDriver driver=null;
	vtigerlogin getloginpage=null;
	vtigerhome gethomepage=null;
	
	
	@BeforeTest
	
	public void precondition() {
		
		driver=setup("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		
		getloginpage=new vtigerlogin(driver);
		
		gethomepage=new vtigerhome(driver);
		
		getloginpage.login("admin","Test@123" );
		
	}
	
	@Test
	
	public void testloginfunctionality() {
		
		setsleeptime(2000);
		
		String actualtitle=driver.getTitle();
		
		Assert.assertEquals(actualtitle, "Dashboard", "Either page title got changed or login was failed");
	}
	
	@Test
	
	public void testlogoutfunctionality() {
		
		gethomepage.clickprofile();
		
		gethomepage.logoutfromapp();
		
		String actualtitle=driver.getTitle();
		
		Assert.assertEquals(actualtitle, "vtiger", "Either logout button is not functional or present");
	}

}
