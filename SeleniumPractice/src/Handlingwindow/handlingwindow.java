package Handlingwindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingwindow {

	public static void main(String[] args) {
           
        WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://etrain.info/in");
		
		
		//get current window unique id
		
		String homepagewinID=chrome.getWindowHandle();
		
		System.out.println("homepage window id is = "+homepagewinID);
		
		System.out.println("****************************************************");
		
		// performing click operation to open Linkedin page in new tab
		
		chrome.findElement(By.cssSelector(".icon-linkedin")).click();
		
		// get all windows unique IDs which are opened by selenium current instance
		
		Set<String> allwindowsID=chrome.getWindowHandles();
		
		System.out.println("all window ids are = "+allwindowsID);
		
		System.out.println("******************************************************");
		
		// remove home window id from all window id dn you will get child window id
		
		allwindowsID.remove(homepagewinID);
		
		System.out.println("after removing homepagewindowid = "+allwindowsID);
		
		System.out.println("******************************************************");
		
		// get child window id using iterator
		
		Iterator<String> itr=allwindowsID.iterator();
		
		String childwindow=itr.next();
		
		System.out.println("child window id = "+childwindow);
		System.out.println("is next id present or not = "+itr.hasNext());
		
		System.out.println("*********************************************************");
		
		//switch control to child window
		
		chrome.switchTo().window(allwindowsID.iterator().next());
		              //or
		chrome.switchTo().window(childwindow);   
		
		// now you are allow to identify any element from child window
		
		System.out.println(chrome.getTitle());
		System.out.println(chrome.getCurrentUrl());
		
		System.out.println("*********************************************************");
		
		// close current instance of browser
	    
		 chrome.close();
		
		// switch back to home page window in order to perform any required operation on that
		
		chrome.switchTo().window(homepagewinID);
		
		// now you are allow to identify any element from home window
		
		System.out.println(chrome.getTitle());
		System.out.println(chrome.getCurrentUrl());
		
		// close current instance of browser
		chrome.close();
		
		// close all the driver instances opened by webdriver
		//chrome.quit();
		
		
		
		
	}

}
