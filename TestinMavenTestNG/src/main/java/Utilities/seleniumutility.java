package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumutility {

	public static WebDriver driver;
	protected static Properties properties;
	protected static Actions action;
	protected static FileInputStream fis;
	protected String filePath;
	protected static WebDriverWait wait;

	/**
	 * using this method we can load our property and also open desired browser
	 */

	{
		filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testData\\testAppData.properties";

	}

	public WebDriver setup(String browsername, String appurl) {

	    properties =new Properties();
	    
	    try {
			fis=new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    if (browsername.equalsIgnoreCase("chrome")) {
	    	
			WebDriverManager.chromedriver().setup();
			
			//System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browsername.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		
		} else if (browsername.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			
			driver = new InternetExplorerDriver();
		}
	    
		driver.manage().window().maximize();
	//	driver.manage().window().setSize(new Dimension(800, 800));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appurl);
		wait = new WebDriverWait(driver, 20);
		action = new Actions(driver);
		return driver;
	}

	public static WebDriver getdriver() {
		return driver;

	}

	public void typeinput(WebElement element, String input) {
		waitforelementdisplayed(element);
		element.clear();
		element.sendKeys(input);
	}

	public WebElement getactiveelement() {
		return driver.switchTo().activeElement();

	}

	public void clickonelement(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));

		element.click();
	}

	public void performmousehoveroperation(WebElement element) {

		action.moveToElement(element).perform();
	}

	public void performrightclickoperation(WebElement element) {

		action.moveToElement(element).contextClick().build().perform();
	}

	public void performdraganddrop(WebElement source, WebElement target) {

		action.dragAndDrop(source, target).build().perform();
	}

	public void takescreenshot(String location) {

		TakesScreenshot ss = (TakesScreenshot) driver;

		File file = ss.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getcurrenturlofapp() {

		return driver.getCurrentUrl();
	}

	public String getcurrenttitleofapp() {
		
		setsleeptime(2000);
		
		String actualtitle=driver.getTitle();
		return actualtitle;
	}

	public boolean iselementexist(WebElement element) {

		waitforelementdisplayed(element);

		return element.isDisplayed();
	}

	public boolean ischeckboxselected(WebElement element) {

		waitforelementdisplayed(element);

		return element.isSelected();
	}

	protected void handlehtmldropdownlistwithvisibletext(WebElement element, String visibletext) {

		waitforelementdisplayed(element);

		Select select = new Select(element);

		select.selectByVisibleText(visibletext);
	}

	protected void handleHtmlDropdownListWithIndex(WebElement element, int index) {
		waitforelementdisplayed(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	protected List<WebElement> gethtmldropdownlistsize(WebElement element) {

		waitforelementdisplayed(element);

		Select select = new Select(element);

		return select.getOptions();
	}

	protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element) {
		waitforelementdisplayed(element);
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

	protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) {
		waitforelementdisplayed(element);
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	protected void switchtoiframewithwebelement(WebElement element) {
		waitforelementdisplayed(element);

		driver.switchTo().frame(element);
	}

	protected void switchToIFrameWithIndex(int index) {
		driver.switchTo().frame(index);
	}

	protected void switchfromiframetomainpage() {

		driver.switchTo().defaultContent();
	}

	protected void setsleeptime(long millis) {

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	protected void refreshpage() {

		driver.navigate().refresh();
	}

	public void waitforelementdisplayed(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitforelementtobeclickable(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void cleanup() {

		driver.close();
	}
	
	
}
