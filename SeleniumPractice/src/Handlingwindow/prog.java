package Handlingwindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog {

	public static void main(String[] args) {
         
        WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://etrain.info/in");
		
		// get current window unique id
		
		String homewinpageid=chrome.getWindowHandle();
		
		System.out.println("Home page menu id = "+homewinpageid);
		
		// performing click operation to open Linkedin page in new tab
		
		chrome.findElement(By.cssSelector(".icon-youtube")).click();
		
		// get all windows unique IDs which are opened by selenium current instance
		
		Set<String> allwindowsID=chrome.getWindowHandles();
		
		System.out.println("All windows id are = "+allwindowsID);
		
		// remove home window id from all window id dn you will get child window id
		
		allwindowsID.remove(homewinpageid);
		
		System.out.println("After removin homepageid,child window id is = "+allwindowsID);
		
		// get child window id using iterator
		
		Iterator<String> itr=allwindowsID.iterator();
		
		String childwinid = itr.next();
		
		// switch control to child window
		
		chrome.switchTo().window(childwinid);
		
		// now you are allow to identify any element from child window
		
		System.out.println("Child window page title = "+chrome.getTitle());
		
		System.out.println("child window url = "+chrome.getCurrentUrl());
		
		// close current instance of browser
		
		chrome.close();
		
		// switch back to home page window in order to perform any required operation on that
		
		chrome.switchTo().window(homewinpageid);
		
		System.out.println(chrome.getCurrentUrl());
		System.out.println(chrome.getTitle());
		
		chrome.quit();
		
	}

}
