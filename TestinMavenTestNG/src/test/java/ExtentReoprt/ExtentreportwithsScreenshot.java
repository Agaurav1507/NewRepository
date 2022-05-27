package ExtentReoprt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentreportwithsScreenshot {

	WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass

	public static void starttest() {

		report = new ExtentReports(".\\ExtenReports\\extentreports.html");

		test = report.startTest("GoooglePageReport");
	}

	@Test

	public void extentreportdemo() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		if (driver.getTitle().equals("Google1")) {

			test.log(LogStatus.PASS, "Navigated to the specified URL successfully and page tile is also validated");
		}

		else {
			test.log(LogStatus.FAIL, test.addScreenCapture(takescreenshot(driver)),"google page validation failed");
		}
		
		driver.close();
	}

	@AfterClass

	public static void endtest() {

		report.endTest(test);
		report.flush();
	}

	public String takescreenshot(WebDriver driver) throws IOException {

	    File srcfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
	    File dest=new File(".\\Screenshots\\googlepage.jpg");
	    
	    String path=dest.getAbsolutePath();
	    
	    FileUtils.copyFile(srcfile, dest);
	    
	    return path;
	}

}
