import org.openqa.selenium.firefox.FirefoxDriver;

public class openmozillabrowser1 {

	public static void main(String[] args) {
		
		String driverpath1="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\executables\\geckodriver.exe";
		
                              //or
		
		String driverpath2=".\\Executables\\geckodriver.exe";
		
		                    //or
		
		String driverpath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		
		//step 1: set driver executable path by using system.setproperty
		
		System.setProperty(" webdriver.gecko.driver",driverpath1 );
		
	
        //step 2: create instance of firefox browser
		
		FirefoxDriver fd=new FirefoxDriver();
	}

}
