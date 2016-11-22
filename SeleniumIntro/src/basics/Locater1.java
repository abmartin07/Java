package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locater1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","B:\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://amazon.com");
		dr.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();
	}

}
