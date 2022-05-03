package WeekendAssgnmnt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricinfo {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.espncricinfo.com/");
		
		
		Actions mouse=new Actions(chrome);
		
		//identify mainmenu
		
		List<WebElement> mainmenu=chrome.findElements(By.cssSelector(".ds-bg-fill-navbar>div>div>div:nth-child(2)>div>div>a"));
		
		
		for(int i=0;i<mainmenu.size();i++) {
			
			  try {
			    	chrome.findElement(By.xpath("//button[text()='Not Now']")).click();
			    	
			    }
			    catch(Throwable e) {
			    	
			    }
			    
			    try {
			    	chrome.findElement(By.cssSelector(".icon-close-filled")).click();
			    }
			    
			    catch(Throwable a) {
			    	
			    }
			    
			System.out.println("*******************"+mainmenu.get(i).getText()+"*******************");
			
			mouse.moveToElement(mainmenu.get(i)).perform();
			
			Thread.sleep(1000);
			
			List<WebElement> submenu=chrome.findElements(By.cssSelector(".tippy-content>div>div>div>ul>li>a"));
			
			
			if(submenu.size()>0) {
				
				for(int j=0;j<submenu.size();j++) {
					
					submenu=chrome.findElements(By.cssSelector(".tippy-content>div>div>div>ul>li>a"));
					
					try {
					
					System.out.println(submenu.get(j).getText());
					
				}
					catch(Throwable a) {
						
						chrome.navigate().refresh();
						
						mouse.moveToElement(mainmenu.get(i)).perform();
						
						Thread.sleep(1000);
						
						submenu=chrome.findElements(By.cssSelector(".tippy-content>div>div>div>ul>li>a"));
						
						System.out.println(submenu.get(j).getText());
						
						
						
					}
			
				}
			}
			
			else {
				System.out.println("No submenu");
			}
		}
	}

}
