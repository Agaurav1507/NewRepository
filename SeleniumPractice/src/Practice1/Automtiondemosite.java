package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automtiondemosite {

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.manage().window().maximize();
		
		chrome.manage().window().setSize(new Dimension(800,800));
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get the url
		chrome.get("http://demo.automationtesting.in/Register.html");
		
		//for mouse ope make instace of actions class
		
		Actions mouse=new Actions(chrome);
		
		//check page title
		String actualtitle=chrome.getTitle();
		String expectedtitle="Register";
		
		System.out.println("is home page right = "+actualtitle.equals(expectedtitle));
		
		//identify first name
		
		WebElement firstname=chrome.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		System.out.println("is first name displayed = "+firstname.isDisplayed());
		System.out.println("is first name enabled = " +firstname.isEnabled());
		
		firstname.sendKeys("Gaurav");
		
		//identify last name
		
		WebElement lastname=chrome.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		System.out.println("is last name displyed = "+lastname.isDisplayed());
		System.out.println("Is last name enabled = "+lastname.isEnabled());
		
		lastname.sendKeys("Agrawal");
		
		//identify address
		
		WebElement address=chrome.findElement(By.cssSelector("div[class='form-group']:nth-of-type(2)>div>textarea"));
		
		System.out.println("is address displayed = "+address.isDisplayed());
		System.out.println("is address enabled = "+address.isEnabled());
		
		address.sendKeys("Sangamner");
		
		//identify email
		
		WebElement email=chrome.findElement(By.xpath("//input[@type='email']"));
		
		System.out.println("is email displayed = "+email.isDisplayed());
		System.out.println("is email enabled = "+email.isEnabled());
		
		email.sendKeys("gaurav.agrawal007@gmail.com");
		
		//identify phone number
		
		WebElement phone=chrome.findElement(By.xpath("//input[@type='tel']"));
		
		System.out.println("is email displayed = "+phone.isDisplayed());
		System.out.println("is email enabled = "+phone.isEnabled());
		
		phone.sendKeys("7020200444");
		
		//identify male gender and click on it
		
		WebElement gender=chrome.findElement(By.xpath("//input[@value='Male']"));
		
		System.out.println("is male gender displayed = "+gender.isDisplayed());
		System.out.println("is male gender enabled = "+gender.isEnabled());
		System.out.println("is male gender selected = "+gender.isSelected());
		
		gender.click();
		
		//identify hobby and click on favourite hobby
		
		WebElement hobby=chrome.findElement(By.xpath("//input[@value='Cricket']"));
		
		System.out.println("is hobby displayed = "+hobby.isDisplayed());
		System.out.println("is hobby enabled = "+hobby.isEnabled());
		System.out.println("is hobby selected = "+hobby.isSelected());
		
		hobby.click();
		
		//identify language
		
		WebElement language=chrome.findElement(By.xpath("//div[@class='form-group'][7]/div/multi-select/div"));
		
		language.click();
		
		System.out.println("is language displayed = "+language.isDisplayed());
		System.out.println("is language enbled = "+language.isEnabled());
		
		language.findElement(By.xpath("//a[text()='English']")).click();
		
		
		//move the cursor somewehere and click
		
		WebElement move=chrome.findElement(By.cssSelector("#basicBootstrapForm"));
		
		mouse.moveToElement(move).click().perform();		
		//identify skills
		
//		WebElement skills=chrome.findElement(By.id("Skills"));
//		
//		System.out.println("is skills displayed = "+skills.isDisplayed());
//		System.out.println("is skills enabled = "+skills.isEnabled());
//		System.out.println("is skills selected = "+skills.isSelected());
//		
//		skills.click();
//		skills.findElement(By.cssSelector("#Skills>option:nth-of-type(74)")).click();
//		
//		Select dropdown=new Select(skills);
//		
//		System.out.println("default selected = "+dropdown.getFirstSelectedOption());
//		System.out.println("is multi selected = "+dropdown.isMultiple());
//		
//		List<WebElement> options=chrome.findElements(By.cssSelector("#Skills>option"));
//		
//		System.out.println("Total options count are = "+options.size());
//		System.out.println("Skills options are as follows :-");
//		
//		for(int i=0;i<options.size();i++) {
//			
//			System.out.println(options.get(i).getText());
//		}
//		
//		System.out.println("selected skill is = "+dropdown.getFirstSelectedOption());
//		
//		//scroll down using keyboard
//		
//		for(int i=0;i<8;i++) {
//			
//			chrome.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
//		}
//		
//		//identify countries
//		
//		WebElement country=chrome.findElement(By.id("countries"));
//		
//		System.out.println("is country displayed = "+country.isDisplayed());
//		System.out.println("is coountry enabled = " +country.isEnabled());
//		
//		//identify select country
//		
//		WebElement countries=chrome.findElement(By.xpath("//span[@class='selection']/span"));
//		
//		System.out.println("is select country displayed = "+countries.isDisplayed());
//		System.out.println("is select country enabled = "+countries.isEnabled());
//		
//		countries.click();
//		countries.findElement(By.xpath("//option[text()='India']"));
//		
//        Select dropdown1=new Select(countries);	
//        
//        
//        System.out.println("is select country dropdown multiselectable = " +dropdown1.isMultiple());
//        System.out.println("default value in select country is = "+dropdown1.getFirstSelectedOption());
//        
//        List<WebElement> options1=chrome.findElements(By.xpath("//select[@id='country']/option"));
//        
//        System.out.println("total count of countries are = "+options1.size());
//        System.out.println("All countries are :-");
//        
//        for(int i=0;i<options.size();i++) {
//        	
//        	System.out.println(options1.get(i).getText());
//        }
//       
		
	}
	
}
