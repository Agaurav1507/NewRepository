import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {

	public static void main(String[] args) {
          
		//1st open chrome browser
		//step 1: select executable path
		
		
		String driverpath="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		//step 2:create instance of chrome browser
		
		ChromeDriver cd=new ChromeDriver();
		
		//enter google url
		cd.get("https://www.google.com");
		
		String sourcecode=cd.getPageSource();
		System.out.println(sourcecode);
		System.out.println(sourcecode.length());
		
		System.out.println(cd.getCurrentUrl());
		System.out.println(cd.getTitle());
		cd.close();
	}

}
