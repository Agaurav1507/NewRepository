import org.openqa.selenium.chrome.ChromeDriver;

public class openchromebrowser {

	public static void main(String[] args) {
		
	//	String driverpath1="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		                 //or
		
		String driverpath2=".\\Executables\\chromedriver.exe";

		                //or
		
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		  
		
		
		//step 1 : set driver executable path by using system.setproperty(key,value);
		
	    System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe");
	     
		                 //or
		
	 //   System.setProperty("webdriver.chrome.driver", driverpath2 );
		
		//step 2: create an instance of chrome browser;
		
		ChromeDriver chr=new ChromeDriver();
		
	}
	

}
