package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagersetup {

	public static void main(String[] args) {
        
		//Use WebDriverManager to manager chrome browser executable based on system requirement
		//use setup method of WebDriverManager
		WebDriverManager.chromedriver().setup();
		
		//step2: create an instance of Chrome Browser
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.facebook.com/");
		
		
	}

}
