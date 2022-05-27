package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog1 {

	@Test
	public void takescreenshot() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.google.com/");
		
		// downcast the driver to access TakesScreenshot method
		
		TakesScreenshot ss=(TakesScreenshot) chrome;
		
		// capture screenshot as output type FILE
		
		File file=ss.getScreenshotAs(OutputType.FILE);
		
		try {
			// save the screenshot taken in destination path
			
			FileUtils.copyFile(file, new File("F:\\AUTOMATIONCLASSES\\ScreenShots\\googlesearchpage2.jpg"));
		}
		catch(Throwable e) {
			
		}
		
	
		
	}
}
