package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog2 {

  @Test
  
  public void takescreenshot() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver chrome=new ChromeDriver();
	  
	  chrome.get("https://www.facebook.com/");
	  
	  TakesScreenshot ss=(TakesScreenshot) chrome;
	  
	  File file=ss.getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(file, new File("F:\\AUTOMATIONCLASSES\\ScreenShots\\facebook.jpg"));
  }
  
 
}
