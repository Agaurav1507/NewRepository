package WebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.seleniumutility;

public class Vtigerleads1 extends seleniumutility {

	WebDriver driver;

	public Vtigerleads1(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' Create']")

	private WebElement createlead;

	@FindBy(xpath = "//div[contains(@name,'editContent')]/div[1]/table/tbody/tr//td[@class='fieldValue']/div[1]/a[1]/span")

	private WebElement title;

	@FindBy(xpath = "//div[contains(@name,'editContent')]/div[1]/table/tbody/tr[1]/td[2]/div//following::select[1]/option[2]")

	private WebElement selecttitle;

	@FindBy(name = "firstname")

	private WebElement firstnamefield;

	@FindBy(name = "lastname")

	private WebElement lastnamefield;

	@FindBy(xpath = "//span[contains(text() , 'Select an Option')]")

	private WebElement leadsourceDD;

	@FindBy(xpath = "//table[contains(@class , 'table table-borderless')]/tbody/tr[4]/td[4]/div/a//span[2]/b//following::select[1]/option")

	private List<WebElement> leadsourcealloptions;

	@FindBy(xpath = "//table[contains(@class , 'table table-borderless')]/tbody/tr[4]/td[4]/div/a//span[2]/b//following::select[1]/option[11]")

	private WebElement selectleadsource;

	@FindBy(xpath = "//table[contains(@class , 'table table-borderless')]/tbody/tr[5]/td[4]/div/a/span[2]")

	private WebElement industryDD;

	@FindBy(xpath = "//table[contains(@class , 'table table-borderless')]/tbody/tr[4]/td[4]/div/a//span[2]/b//following::select[2]/option")

	private List<WebElement> industryalloptions;

	@FindBy(xpath = "//table[contains(@class , 'table table-borderless')]/tbody/tr[4]/td[4]/div/a//span[2]/b//following::select[2]/option[28]")

	private WebElement selectindustry;

	@FindBy(xpath = "//button[text()='Save']")

	private WebElement savelead;

	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr[7]/td[2]/div/a/span[2]")

	private WebElement leadstatusDD;

	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr[7]/td[2]/div//following::select[1]/option[6]")

	private WebElement selectleadstatus;

	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr[8]/td[2]/div/a/span[2]")

	private WebElement ratingDD;
	
	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr[8]/td[2]/div//following::select[1]/option[3]")

	private WebElement selectrating;
	
	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr[9]/td[2]/div/a/span[2]")

	private WebElement assignedtoDD;
	
	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr[9]/td[2]/div//following::select/optgroup[2]/option[2]")

	private WebElement selectassignedto;
	
	@FindBy(xpath="//div[@class='detailview-header']/div/div[1]//div[@class='info-row'][1]/h4/span")
	
	private WebElement checklead;
	

	// ***************************************************************************************************************************************

	public WebElement getCreatelead() {
		return createlead;
	}

	public WebElement getSelecttitle() {
		return title;
	}

	public WebElement getselecttitle() {
		return selecttitle;
	}

	public WebElement getFirstnamefield() {
		return firstnamefield;
	}

	public WebElement getLastnamefield() {
		return lastnamefield;
	}

	public WebElement getLeadsourceDD() {
		return leadsourceDD;
	}

	public List<WebElement> getLeadsourcealloptions() {
		return leadsourcealloptions;
	}

	public WebElement getSelectleadsource() {
		return selectleadsource;
	}

	public WebElement getIndustryDD() {
		return industryDD;
	}

	public List<WebElement> getIndustryalloptions() {
		return industryalloptions;
	}

	public WebElement getSelectindustry() {
		return selectindustry;
	}

	public WebElement getsavelead() {
		return savelead;
	}
	
	public WebElement getLeadstatusDD() {
		return leadstatusDD;
	}

	public WebElement getSelectleadstatus() {
		return selectleadstatus;
	}

	public WebElement getRatingDD() {
		return ratingDD;
	}

	public WebElement getSelectrating() {
		return selectrating;
	}

	public WebElement getAssignedtoDD() {
		return assignedtoDD;
	}

	public WebElement getSelectassignedto() {
		return selectassignedto;
	}
	
	public WebElement getchecklead() {
		return checklead;
	}
	
	// ****************************************************************************************************************************************

	public void clickoncreatelead() {

		clickonelement(createlead);
	}

	public void giveleaddetails(String firstname, String lastname) {

		clickonelement(title);
		clickonelement(selecttitle);
		typeinput(firstnamefield, firstname);
		typeinput(lastnamefield, lastname);

	}

	public void leadsource() {

		clickonelement(leadsourceDD);

		System.out.println("All lead source options are :- ");

		for (int i = 0; i < leadsourcealloptions.size(); i++) {

			System.out.println(leadsourcealloptions.get(i).getText());
		}

		clickonelement(selectleadsource);
	}

	public void industry() {

		clickonelement(industryDD);

		System.out.println("All industry options are :- ");

		for (int i = 0; i < industryalloptions.size(); i++) {

			System.out.println(industryalloptions.get(i).getText());
		}

		clickonelement(selectindustry);
	}
	
	public void allotherformalities() {
		
		for(int i=0;i<8;i++) {
			
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		}
		
		clickonelement(leadstatusDD);
		clickonelement(selectleadstatus);
		//clickonelement(ratingDD);
		//clickonelement(selectrating);
		//clickonelement(assignedtoDD);
	    //clickonelement(selectassignedto);
		clickonelement(savelead);
	}
	
	public boolean checkleadcreation() {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOf(checklead));
		
		System.out.println(checklead.getText());
		
		return checklead.isEnabled();
	}

}
