package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionHandlerss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "B://geckodriver.exe");
		WebDriver dr = new ChromeDriver();
		//WebDriver dr = new FirefoxDriver(); //actions not working in firefox.
		dr.get("http://www.amazon.in/");
		Actions act = new Actions(dr);
		WebElement ele = dr.findElement(By.xpath("//*[@id='nav-link-yourAccount']"));
		dr.manage().window().maximize();
		act.moveToElement(ele).build().perform(); //hovers the mouse over to that element
		act.contextClick(ele).build().perform(); //right clicks on that element
		dr.get("https://www.google.com");
		WebElement search = dr.findElement(By.xpath("//*[@id='lst-ib']"));
		act.keyDown(Keys.SHIFT).moveToElement(search).sendKeys("hello").build().perform();//caps on
	}

}
