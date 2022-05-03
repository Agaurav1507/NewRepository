package Handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver chrome = new ChromeDriver();

		chrome.get("https://jqueryui.com/droppable/");

		chrome.findElement(By.xpath("//a[text()='Sortable']")).click();

		for (int i = 0; i < 7; i++) {

			chrome.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);

		}

		WebElement frame = chrome.findElement(By.cssSelector(".demo-frame"));

		// switch your control to frame using WebElement

		chrome.switchTo().frame(frame);

		Actions mouse = new Actions(chrome);

		// change in descending

		for (int i = 0; i < 7; i++) {

			WebElement src = chrome.findElement(By.cssSelector(".ui-sortable>li:nth-of-type(7)"));

			WebElement dest = chrome.findElement(By.cssSelector(".ui-sortable>li:nth-of-type(" + (i + 1) + ")"));

			mouse.dragAndDrop(src, dest).build().perform();

		}

	}

}
