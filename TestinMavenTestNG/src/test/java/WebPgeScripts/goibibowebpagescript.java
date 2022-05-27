package WebPgeScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.seleniumutility;
import WebPages.goibibohomepage;

public class goibibowebpagescript extends seleniumutility {
	
	WebDriver driver=null;
	
	goibibohomepage getgoibibohomepage=null;
	
	@BeforeTest
	
	public void precondition() {
		
		driver=setup("chrome","https://www.goibibo.com/");
		
		getgoibibohomepage=new goibibohomepage(driver);
	}
	
	@Test
	
	public void check() {
		
		getgoibibohomepage.mousehoverhomemenu();
		
		getgoibibohomepage.clickonflight();
	}
	
	@AfterTest
	
	public void postcondition() {
		
		cleanup();
	}

}
