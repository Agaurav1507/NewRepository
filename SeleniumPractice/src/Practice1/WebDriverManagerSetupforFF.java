package Practice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSetupforFF {

	public static void main(String[] args) {

		// Use WebDriverManager to manager chrome browser executable based on system requirement
		//use setup method of WebDriverManager  
		
		WebDriverManager.firefoxdriver().setup();
		
		//step2: create an instance of firefix browser
		
		WebDriver ff=new FirefoxDriver();
		
		ff.manage().window().maximize();
		
		ff.manage().window().setSize(new Dimension(800,800));
		
		ff.get("https://www.facebook.com/");
	}

}
