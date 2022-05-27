package WebPgeScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.seleniumutility;
import WebPages.Actihomepage;
import WebPages.Actiloginpage;

public class actitime2loginlogout extends seleniumutility  {
	
	WebDriver driver=null;
	Actiloginpage getloginpage=null;
	Actihomepage gethomepage=null;
	
   @BeforeTest
   
   public void precondition() {
	   
	   driver=setup("chrome","https://demo.actitime.com/login.do");
	   
	   getloginpage=new Actiloginpage(driver);
	   
	   gethomepage=new Actihomepage(driver);
	   
	   getloginpage.checkbox();
	   
	   getloginpage.login("admin", "manager");
	   
	  // getloginpage.checklogintitle();
	   
	  
   }
   
   @Test
   
   public void testlogin() {
	   
	  gethomepage.clicktaskbutton();
	  gethomepage.clickaddnew();
	  gethomepage.clicknewtask();
	  gethomepage.clickdropbutton1();
	  
	  gethomepage.DD1alloptions();
	  
	  gethomepage.clickselectdropdown1();
	  
	  gethomepage.clickdropbutton2();
	  
	  gethomepage.DD2alloptions();
	  
	  gethomepage.clickselectdropdown2();
	  
	  gethomepage.makegetAddnewtask("Mytask");
	  
	  gethomepage.clickcreatetask();
	  
	  gethomepage.takess();
	   
   }
   
   @Test
   
   public void testlogout() {
	   
	   gethomepage.clicklogoutbutton();
	   
	   gethomepage.chechlogouttitle();
   }
   
   @AfterTest
   
   public void closebrowser() {
	   
	   cleanup();
   }
   
   

}
