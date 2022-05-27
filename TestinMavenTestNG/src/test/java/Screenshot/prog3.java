package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog3 {
	
	@Test
	
	public void takescreenshot() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ss=(TakesScreenshot) chrome;
		
		File file=ss.getScreenshotAs(OutputType.FILE);
		
		try {
		
		FileUtils.copyFile(file, new File("F:\\AUTOMATIONCLASSES\\ScreenShots\\actitime.jpg"));
	
		}
		catch(Throwable e) {
			
		}
	}

}
