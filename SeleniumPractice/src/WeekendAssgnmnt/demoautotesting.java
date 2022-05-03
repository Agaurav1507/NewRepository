package WeekendAssgnmnt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoautotesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver chrome = new ChromeDriver();

		chrome.get("http://demo.automationtesting.in/Register.html");
		
		

		// create instance for mouse ope

		Actions mouse = new Actions(chrome);

		// identify the main menu element

		List<WebElement> Home = chrome.findElements(By.cssSelector(".nav:nth-of-type(1)>li"));  

		System.out.println("Mainmenu count" + Home.size());

		// step 1-do mouse hover on all the mainmenu

		for (int i = 0; i < Home.size(); i++) {

			System.out.println("*********" + Home.get(i).getText() + "************");

			WebElement mainmenu = Home.get(i);

			mouse.moveToElement(mainmenu).perform();
			
			List<WebElement> submenu=chrome.findElements(By.cssSelector(".navbar-nav>li:nth-child("+(i+1)+")>ul>li>a"));  
			
			if(submenu.size()>0) {
				
				for(int j=0;j<submenu.size();j++) {
					
					System.out.println(submenu.get(j).getText());
				}
			}
			else {
				System.out.println("No submenu");
			}

		}
		
		//step 2-write full name
		
        WebElement firstname=chrome.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		System.out.println("is first name displayed = "+firstname.isDisplayed());
		System.out.println("is first name enabled = " +firstname.isEnabled());
		
		firstname.sendKeys("Gaurav");
		
        WebElement lastname=chrome.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		System.out.println("is last name displyed = "+lastname.isDisplayed());
		System.out.println("Is last name enabled = "+lastname.isEnabled());
		
		lastname.sendKeys("Agrawal");
		
		//identify address ans write the address
		
        WebElement address=chrome.findElement(By.cssSelector("div[class='form-group']:nth-of-type(2)>div>textarea"));
		
		System.out.println("is address displayed = "+address.isDisplayed());
		System.out.println("is address enabled = "+address.isEnabled());
		
		address.sendKeys("Sangamner");
		
		//identify email and write
		
        WebElement email=chrome.findElement(By.xpath("//input[@type='email']"));
		
		System.out.println("is email displayed = "+email.isDisplayed());
		System.out.println("is email enabled = "+email.isEnabled());
		
		email.sendKeys("gaurav.agrawal007@gmail.com");
		
		//identify phone number and write
		
        WebElement phone=chrome.findElement(By.xpath("//input[@type='tel']"));
		
		System.out.println("is email displayed = "+phone.isDisplayed());
		System.out.println("is email enabled = "+phone.isEnabled());
		
		phone.sendKeys("7020200444");
		
		//identify gender radiobox and click on male
		
        WebElement gender=chrome.findElement(By.xpath("//input[@value='Male']"));
		
		System.out.println("is male gender displayed = "+gender.isDisplayed());
		System.out.println("is male gender enabled = "+gender.isEnabled());
		System.out.println("is male gender selected = "+gender.isSelected());
		
		gender.click();
		
		//identify hobby radiobox and click on any 1
		
        WebElement hobby=chrome.findElement(By.xpath("//input[@value='Cricket']"));
		
		System.out.println("is hobby displayed = "+hobby.isDisplayed());
		System.out.println("is hobby enabled = "+hobby.isEnabled());
		System.out.println("is hobby selected = "+hobby.isSelected());
		
		hobby.click();
		
		//scroll down the page using keyboard
		
		for(int i=0;i<8;i++) {
			
			chrome.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		}
		
		
		
//		//click on language
//		
//		WebElement lang=chrome.findElement(By.cssSelector(".ui-autocomplete-multiselect:nth-child(1)"));
//		
//		lang.click();
//		
//		
//		//print all the language option
//		
//		List<WebElement> option=chrome.findElements(By.xpath(".ui-autocomplete:nth-of-type(1)>li"));
//		
//		System.out.println("total language counts are = "+option.size());
//		
//		System.out.println("languages are :-");
//		for(int i=0;i<option.size();i++) {
//			
//			System.out.println(option.get(i).getText());
//		}
//		
//		option.get(7).click();
//		
		
		//identify skills
		
		WebElement skills=chrome.findElement(By.id("Skills"));
		
		skills.click();
		
		System.out.println("is displayed = "+skills.isDisplayed());
		System.out.println("is enabled = "  +skills.isEnabled());
		
		Select options=new Select(skills);
		
		System.out.println("is miltiselectable = "+options.isMultiple());
		System.out.println("Default selected = " +options.getFirstSelectedOption());
		
		List<WebElement> skillsoptions=options.getOptions();
		
		System.out.println("total skills counts are = "+skillsoptions.size());
		
		//print all the skill options
		
		for(int i=0;i<skillsoptions.size();i++) {
			
			System.out.println(skillsoptions.get(i).getText());
		}
		
		
		options.selectByVisibleText("Backup Management");
		skills.click();
		
		//identify country
		
		WebElement count=chrome.findElement(By.xpath("//span[@class='selection']/span"));
		
		count.click();
		
		
		List<WebElement> coutryoptions=chrome.findElements(By.cssSelector("select[id='country']>option"));
		
		
		System.out.println("Total country counts are = "+coutryoptions.size());
		System.out.println("The countries are :- ");
		
		for(int i=0;i<coutryoptions.size();i++) {
			
			System.out.println(coutryoptions.get(i).getText());
		}
		
		count.findElement(By.xpath("//option[text()='India']")).click();
		count.click();
		
		//identify dob and select
		
		// for year
		System.out.println("**************YEAR*****************");
		WebElement year=chrome.findElement(By.cssSelector("select[placeholder='Year']"));
		
		year.click();
		
		System.out.println("is displayed = "+year.isDisplayed());
		System.out.println("is enabled = "+year.isEnabled());
		
		Select yearsel=new Select(year);
		
		System.out.println("is multiselectable = "+yearsel.isMultiple());
		System.out.println("default selected =" +yearsel.getFirstSelectedOption());
		
		List<WebElement> yearoptions=yearsel.getOptions();
		
		System.out.println("total year counts are = "+yearoptions.size());
		
		for(int i=0;i<yearoptions.size();i++) {
			
			System.out.println(yearoptions.get(i).getText());
		}
		
		yearsel.selectByVisibleText("1995");
		year.click();
		
		System.out.println("selected year is = "+yearsel.getFirstSelectedOption());
		System.out.println("*******************Month********************");
		
        //for month
		System.out.println("***************Month********************");
		
		WebElement month=chrome.findElement(By.xpath("//select[@placeholder='Month']"));
		
		month.click();
		
		System.out.println("is displayed = "+month.isDisplayed());
		System.out.println("is enabled = "+month.isEnabled());
		
		Select monthsel=new Select(month);
		
		System.out.println("is multiselectable = "+monthsel.isMultiple());
		System.out.println("Default selected =" +monthsel.getFirstSelectedOption());
		
		List<WebElement> monthoptions=monthsel.getOptions();
		
		System.out.println("Total couont of months = "+monthoptions.size());
		System.out.println("Months are :-");
		
		for(int i=0;i<monthoptions.size();i++) {
			
			System.out.println(monthoptions.get(i).getText());
		}
		
		monthsel.selectByVisibleText("July");
		month.click();
		
		//for day
		System.out.println("******************Day*********************");
		
		WebElement day=chrome.findElement(By.xpath("//select[@placeholder='Day']"));
		
		day.click();
		
		System.out.println("is day displayed = "+day.isDisplayed());
		System.out.println("is day enabled = "+day.isEnabled());
		
		Select daysel=new Select(day);
		
		System.out.println("is multiselectable = "+daysel.isMultiple());
		System.out.println("Default selected = "+daysel.getFirstSelectedOption());
		
		List<WebElement> dayoption=daysel.getOptions();
		
		System.out.println("total day counts are = "+dayoption.size());
		
		for(int i=0;i<dayoption.size();i++) {
			
			System.out.println(dayoption.get(i).getText());
		}
		
		daysel.selectByValue("15");
		day.click();
		
	}

}
