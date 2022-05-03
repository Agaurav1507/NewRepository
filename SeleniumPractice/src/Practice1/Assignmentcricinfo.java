package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentcricinfo {

	public static void main(String[] args) {
            
		String path="F:\\AUTOMATIONCLASSES\\WORKSPACE\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver ch=new ChromeDriver();
		
		ch.get("https://www.espncricinfo.com/");
		
		System.out.println(ch.getTitle());
		
		String actualtitle=ch.getTitle();
		String expectedtitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
		
		System.out.println(actualtitle.equals(expectedtitle));
		
		System.out.println("********************************************************************************");
		
		WebElement matches=ch.findElement(By.className("ds-cursor-pointer"));
		System.out.println(matches.isDisplayed());
		System.out.println(matches.isEnabled());
		System.out.println(matches.isSelected());
		
		WebElement livescores=ch.findElement(By.cssSelector(".ds-popper-wrapper:nth-of-type(1)"));
		System.out.println(livescores.isDisplayed());
		System.out.println(livescores.isEnabled());
		System.out.println(livescores.isSelected());
		
	    WebElement search=ch.findElement(By.className("ds-flex-row"));
		System.out.println(search.isDisplayed());
		System.out.println(search.isEnabled());
		
		
		
		List<WebElement> optioncount=ch.findElements(By.cssSelector(".ds-flex >div>div>div>span>span"));
		
		System.out.println(optioncount.size());
		
		for(int i=0;i<optioncount.size();i++) {
			
			System.out.println(optioncount.get(i).getText());
		}
		
	    System.out.println("*********************************************************************************");
		
		
		
	}

}
