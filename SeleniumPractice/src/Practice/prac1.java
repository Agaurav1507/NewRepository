package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {

	public static void main(String[] args) {
         
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver", path );
		
		ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://demo.actitime.com");
		
		String str=cd.getTitle();
		str.length();
		
		System.out.println(cd.getTitle());
		System.out.println(str.length());
		System.out.println(cd.getCurrentUrl());
		
		String str1=cd.getPageSource();
		
		System.out.println(str1.length());
		System.out.println(str1);
		
		cd.close();
		
		
	}

}
